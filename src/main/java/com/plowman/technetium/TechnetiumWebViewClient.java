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

import android.graphics.Bitmap;
import android.os.Message;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * This is an inert wrapper of WebViewClient whose only purpose is to log any
 * errors, should they occur.
 */
public class TechnetiumWebViewClient extends WebViewClient {

	@Override
	public void onLoadResource(WebView view, String url) {
		System.err.printf("onLoadResource(): url=%s%n", url);
		super.onLoadResource(view, url);
	}

	@Override
	public void onPageFinished(WebView view, String url) {
		System.err.printf("onPageFinished(): url=%s%n", url);
		super.onPageFinished(view, url);
	}

	@Override
	public void onPageStarted(WebView view, String url, Bitmap favicon) {
		System.err.printf("onPageStarted(): url=%s%n", url);
		super.onPageStarted(view, url, favicon);
	}

	@Override
	public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
		System.err.printf("onReceivedError() url=%s, description=%s%n", failingUrl, description);
		super.onReceivedError(view, errorCode, description, failingUrl);
	}

	@Override
	public void onReceivedHttpAuthRequest(WebView view, HttpAuthHandler handler, String host, String realm) {
		System.err.printf("onReceivedHttpAuthRequest() host=%s, realm=%s%n", host, realm);
		super.onReceivedHttpAuthRequest(view, handler, host, realm);
	}

	@Override
	public void onTooManyRedirects(WebView view, Message cancelMsg, Message continueMsg) {
		System.err.println("onTooManyRedirects()");
		super.onTooManyRedirects(view, cancelMsg, continueMsg);
	}

}
