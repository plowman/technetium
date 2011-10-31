/*
 * Copyright (c) 2011 Ben Plowman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.plowman.technetium;

import android.webkit.WebView;

public class TechnetiumTestRunner extends WebView {

	private static final String INTERFACE_NAME = "Tc";
	private static final String SD_CARD_LOCATION = "file:///sdcard/";
	private static final String MIME_TYPE = "text/html";
	private static final String ENCODING = "utf-8";
	private static final String FAIL_URL = "";

	private final TechnetiumTestCase testCase;
	private final TechnetiumInterface technetiumInterface;

	public TechnetiumTestRunner(TechnetiumTestCase testCase) throws InterruptedException {
		super(testCase.getActivity());

		this.testCase = testCase;
		this.technetiumInterface = new TechnetiumInterface(testCase);

		setWebChromeClient(new TechnetiumWebChromeClient());
		setWebViewClient(new TechnetiumWebViewClient());

		getSettings().setJavaScriptEnabled(true);

		addJavascriptInterface(technetiumInterface, INTERFACE_NAME);
	}

	private void waitForTestsToComplete() throws InterruptedException {
		while (technetiumInterface.isWaitingForTestCase() && !technetiumInterface.exceededTimeLimit()) {
			Thread.sleep(50);
		}
		if (technetiumInterface.exceededTimeLimit()) {
			technetiumInterface.fail("Exceeded Time Limit");
		}
		System.err.flush();
	}

	public void runTest(String testName) throws Exception {
		String javascriptFileName = testCase.getClass().getSimpleName() + ".js";

		System.err.printf("Loading javascript file %s%n", javascriptFileName);

		String html = "<html>" +
			"<head>" +
			"<script type=\"text/javascript\" src=\"" + javascriptFileName + "\" ></script>" +
			"<script>" +
			"window[\"" + testName + "\"]();" +
			INTERFACE_NAME + ".testCaseCompleted();" +
			"</script>" +
			"</head>" +
			"</html>";

		loadDataWithBaseURL(SD_CARD_LOCATION, html, MIME_TYPE, ENCODING, FAIL_URL);

		waitForTestsToComplete();
	}
}
