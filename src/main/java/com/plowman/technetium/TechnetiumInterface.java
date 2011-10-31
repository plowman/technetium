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

import android.content.Context;
import android.content.SharedPreferences;
import junit.framework.Assert;

import java.util.Random;

@SuppressWarnings({"UnusedDeclaration"})
public class TechnetiumInterface extends SoloInterface {

	//the longest we'll let a test run, in milliseconds
	private static final long MAX_DURATION_MS = 30000;

	//name of the file where we save SharedPreferences
	private static final String SETTINGS_LOCATION = "tc_settings";

	//approximate time when the test began
	private final long startTime = System.currentTimeMillis();
	private final SharedPreferences settings;
	private final TechnetiumTestCase testCase;

	private boolean waitingForTestCase = true;

	public TechnetiumInterface(TechnetiumTestCase testCase) {
		super(testCase);
		this.testCase = testCase;
		this.settings = testCase.getActivity().getSharedPreferences(SETTINGS_LOCATION, Context.MODE_PRIVATE);
	}

	public void log(String message) {
		System.err.println(message);
	}

	public void assertTrue(final boolean condition) {
		logMethod(condition);
		Assert.assertTrue(condition);
	}

	public void assertTextPresent(final String text) {
		logMethod(text);
		Assert.assertTrue("Could not find text '" + text + "'", getSolo().searchText(text));
	}

	public void assertTextNotPresent(final String text) {
		logMethod(text);
		Assert.assertFalse("Found text that we shouldn't have: '" + text + "'", getSolo().searchText(text));
	}

	public void save(String key, String value) {
		logMethod(key, value);
		SharedPreferences.Editor editor = settings.edit();
		editor.putString(key, value);
		Assert.assertTrue(editor.commit());
	}

	public String fetch(String key) {
		logMethod(key);
		return settings.getString(key, null);
	}

	public void fail(String message) {
		logMethod(message);
		Assert.fail(message);
	}

	public String randomNumber(int lessThan, int digits) {
		logMethod(lessThan, digits);
		int rand = new Random().nextInt(lessThan);
		String randStr = String.valueOf(rand);
		while (randStr.length() < digits) {
			randStr = "0" + randStr;
		}
		return randStr;
	}

	public int getScreenWidth() {
		logMethod();
		return testCase.getActivity().getWindowManager().getDefaultDisplay().getWidth();
	}

	public int getScreenHeight() {
		logMethod();
		return testCase.getActivity().getWindowManager().getDefaultDisplay().getHeight();
	}

	public void testCaseCompleted() {
		logMethod();
		setWaitingForTestCase(false);
	}

	private synchronized void setWaitingForTestCase(boolean waiting) {
		System.err.printf("setWaitingForTestCase(%s)%n", waitingForTestCase);
		waitingForTestCase = waiting;
	}

	public synchronized boolean isWaitingForTestCase() {
		System.err.printf("isWaitingForTestCase returning %s%n", waitingForTestCase);
		return waitingForTestCase;
	}

	public boolean exceededTimeLimit() {
		return (System.currentTimeMillis() - startTime) > MAX_DURATION_MS;
	}
}
