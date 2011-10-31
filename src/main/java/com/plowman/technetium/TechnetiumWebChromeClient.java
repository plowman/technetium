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
import android.view.View;
import android.webkit.*;

/**
 * This is an inert wrapper of WebChromeClient whose only purpose is to log any
 * errors, should they occur.
 */
public class TechnetiumWebChromeClient extends WebChromeClient {
	@Override
	public Bitmap getDefaultVideoPoster() {
		return super.getDefaultVideoPoster();
	}

	@Override
	public View getVideoLoadingProgressView() {
		return super.getVideoLoadingProgressView();
	}

	@Override
	public void getVisitedHistory(ValueCallback<String[]> callback) {
		super.getVisitedHistory(callback);
	}

	@Override
	public void onCloseWindow(WebView window) {
		super.onCloseWindow(window);
	}

	@Override
	public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
		return super.onConsoleMessage(consoleMessage);
	}

	@Override
	public void onConsoleMessage(String message, int lineNumber, String sourceID) {
		System.err.printf("onConsoleMessage(): %s(line %s): %s %n", sourceID, lineNumber, message);
		super.onConsoleMessage(message, lineNumber, sourceID);
	}

	@Override
	public boolean onCreateWindow(WebView view, boolean dialog, boolean userGesture, Message resultMsg) {
		return super.onCreateWindow(view, dialog, userGesture, resultMsg);
	}

	@Override
	public void onExceededDatabaseQuota(String url, String databaseIdentifier, long currentQuota, long estimatedSize, long totalUsedQuota, WebStorage.QuotaUpdater quotaUpdater) {
		System.err.println("onExceededDatabaseQuota()");
		super.onExceededDatabaseQuota(url, databaseIdentifier, currentQuota, estimatedSize, totalUsedQuota, quotaUpdater);
	}

	@Override
	public void onGeolocationPermissionsHidePrompt() {
		super.onGeolocationPermissionsHidePrompt();
	}

	@Override
	public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
		super.onGeolocationPermissionsShowPrompt(origin, callback);
	}

	@Override
	public void onHideCustomView() {
		super.onHideCustomView();
	}

	@Override
	public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
		System.err.println("onJsAlert()");
		return super.onJsAlert(view, url, message, result);
	}

	@Override
	public boolean onJsBeforeUnload(WebView view, String url, String message, JsResult result) {
		System.err.println("onJsBeforeUnload()");
		return super.onJsBeforeUnload(view, url, message, result);
	}

	@Override
	public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
		System.err.println("onJsConfirm()");
		return super.onJsConfirm(view, url, message, result);
	}

	@Override
	public boolean onJsPrompt(WebView view, String url, String message, String defaultValue, JsPromptResult result) {
		System.err.println("onJsPrompt()");
		return super.onJsPrompt(view, url, message, defaultValue, result);
	}

	@Override
	public boolean onJsTimeout() {
		System.err.println("onJsTimeout()");
		return super.onJsTimeout();
	}

	@Override
	public void onProgressChanged(WebView view, int newProgress) {
		super.onProgressChanged(view, newProgress);
	}

	@Override
	public void onReachedMaxAppCacheSize(long spaceNeeded, long totalUsedQuota, WebStorage.QuotaUpdater quotaUpdater) {
		super.onReachedMaxAppCacheSize(spaceNeeded, totalUsedQuota, quotaUpdater);
	}

	@Override
	public void onReceivedIcon(WebView view, Bitmap icon) {
		super.onReceivedIcon(view, icon);
	}

	@Override
	public void onReceivedTitle(WebView view, String title) {
		super.onReceivedTitle(view, title);
	}

	@Override
	public void onReceivedTouchIconUrl(WebView view, String url, boolean precomposed) {
		super.onReceivedTouchIconUrl(view, url, precomposed);
	}

	@Override
	public void onRequestFocus(WebView view) {
		super.onRequestFocus(view);
	}

	@Override
	public void onShowCustomView(View view, CustomViewCallback callback) {
		super.onShowCustomView(view, callback);
	}
}
