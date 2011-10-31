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

import android.widget.TextView;
import com.jayway.android.robotium.solo.Solo;

import java.util.ArrayList;

/**
 * This is a wrapper for Robotium Solo used to expose selected methods in JavaScript.
 * It only expose the Solo methods which require String and/or primitive variables,
 * since those are the only things we will be able to call from JavaScript.
 * <p/>
 * Decided to make this a super-class because it is 400-some lines of redundant code.
 * This way, we can focus the sub-class on whatever it adds on top of the Solo
 * methods rather than mixing them up in a very muddled way.
 */
@SuppressWarnings({"UnusedDeclaration"})
public class SoloInterface {
	private final Solo solo;

	public SoloInterface(TechnetiumTestCase testCase) {
		this.solo = new Solo(testCase.getInstrumentation(), testCase.getActivity());
	}

	public Solo getSolo() {
		return solo;
	}

	public void assertCurrentActivity(String message, String name) {
		logMethod(message, name);
		solo.assertCurrentActivity(message, name);
	}

	public void assertCurrentActivity(String message, String name, boolean isNewInstance) {
		logMethod(message, name, isNewInstance);
		solo.assertCurrentActivity(message, name, isNewInstance);
	}

	public void assertMemoryNotLow() {
		logMethod();
		solo.assertMemoryNotLow();
	}

	public void clearEditText(int index) {
		logMethod(index);
		solo.clearEditText(index);
	}

	public ArrayList<TextView> clickInList(int line) {
		logMethod(line);
		return solo.clickInList(line);
	}

	public ArrayList<TextView> clickInList(int line, int index) {
		logMethod(line, index);
		return solo.clickInList(line, index);
	}

	public void clickLongOnScreen(float x, float y) {
		logMethod(x, y);
		solo.clickLongOnScreen(x, y);
	}

	public void clickLongOnScreen(float x, float y, int time) {
		logMethod(x, y, time);
		solo.clickLongOnScreen(x, y, time);
	}

	public void clickLongOnText(String text) {
		logMethod(text);
		solo.clickLongOnText(text);
	}

	public void clickLongOnText(String text, int match) {
		logMethod(text, match);
		solo.clickLongOnText(text, match);
	}

	public void clickLongOnText(String text, int match, boolean scroll) {
		logMethod(text, match, scroll);
		solo.clickLongOnText(text, match, scroll);
	}

	public void clickLongOnText(String text, int match, int time) {
		logMethod(text, match, time);
		solo.clickLongOnText(text, match, time);
	}

	public void clickLongOnTextAndPress(String text, int index) {
		logMethod(text, index);
		solo.clickLongOnTextAndPress(text, index);
	}

	public void clickOnButton(String name) {
		logMethod(name);
		solo.clickOnButton(name);
	}

	public void clickOnCheckBox(int index) {
		logMethod(index);
		solo.clickOnCheckBox(index);
	}

	public void clickOnEditText(int index) {
		logMethod(index);
		solo.clickOnEditText(index);
	}

	public void clickOnImage(int index) {
		logMethod(index);
		solo.clickOnImage(index);
	}

	public void clickOnImageButton(int index) {
		logMethod(index);
		solo.clickOnImageButton(index);
	}

	public void clickOnMenuItem(String text) {
		logMethod(text);
		solo.clickOnMenuItem(text);
	}

	public void clickOnMenuItem(String text, boolean subMenu) {
		logMethod(text, subMenu);
		solo.clickOnMenuItem(text, subMenu);
	}

	public void clickOnRadioButton(int index) {
		logMethod(index);
		solo.clickOnRadioButton(index);
	}

	public void clickOnScreen(float x, float y) {
		logMethod(x, y);
		solo.clickOnScreen(x, y);
	}

	public void clickOnButton(int index) {
		logMethod(index);
		solo.clickOnButton(index);
	}

	public void clickOnText(String text) {
		logMethod(text);
		solo.clickOnText(text);
	}

	public void clickOnText(String text, int match) {
		logMethod(text, match);
		solo.clickOnText(text, match);
	}

	public void clickOnText(String text, int match, boolean scroll) {
		logMethod(text, match, scroll);
		solo.clickOnText(text, match, scroll);
	}

	public void clickOnToggleButton(String name) {
		logMethod(name);
		solo.clickOnToggleButton(name);
	}

	public void drag(float fromX, float toX, float fromY, float toY, int stepCount) {
		logMethod(fromX, toX, fromY, toY, stepCount);
		solo.drag(fromX, toX, fromY, toY, stepCount);
	}

	public void enterText(int index, String text) {
		logMethod(index, text);
		solo.enterText(index, text);
	}

	public String getString(int resId) {
		logMethod(resId);
		return solo.getString(resId);
	}

	public void goBack() {
		logMethod();
		solo.goBack();
	}

	public void goBackToActivity(String name) {
		logMethod(name);
		solo.goBackToActivity(name);
	}

	public boolean isCheckBoxChecked(int index) {
		logMethod(index);
		return solo.isCheckBoxChecked(index);
	}

	public boolean isCheckBoxChecked(String text) {
		logMethod(text);
		return solo.isCheckBoxChecked(text);
	}

	public boolean isRadioButtonChecked(int index) {
		logMethod(index);
		return solo.isRadioButtonChecked(index);
	}

	public boolean isRadioButtonChecked(String text) {
		logMethod(text);
		return solo.isRadioButtonChecked(text);
	}

	public boolean isSpinnerTextSelected(int index, String text) {
		logMethod(index, text);
		return solo.isSpinnerTextSelected(index, text);
	}

	public boolean isSpinnerTextSelected(String text) {
		logMethod(text);
		return solo.isSpinnerTextSelected(text);
	}

	public boolean isTextChecked(String text) {
		logMethod(text);
		return solo.isTextChecked(text);
	}

	public boolean isToggleButtonChecked(int index) {
		logMethod(index);
		return solo.isToggleButtonChecked(index);
	}

	public boolean isToggleButtonChecked(String text) {
		logMethod(text);
		return solo.isToggleButtonChecked(text);
	}

	public void pressMenuItem(int index) {
		logMethod(index);
		solo.pressMenuItem(index);
	}

	public void pressSpinnerItem(int spinnerIndex, int itemIndex) {
		logMethod(spinnerIndex, itemIndex);
		solo.pressSpinnerItem(spinnerIndex, itemIndex);
	}

	public boolean scrollDown() {
		logMethod();
		return solo.scrollDown();
	}

	public boolean scrollDownList(int index) {
		logMethod(index);
		return solo.scrollDownList(index);
	}

	public void scrollToSide(int side) {
		logMethod(side);
		solo.scrollToSide(side);
	}

	public boolean scrollUp() {
		logMethod();
		return solo.scrollUp();
	}

	public boolean scrollUpList(int index) {
		logMethod(index);
		return solo.scrollUpList(index);
	}

	public boolean searchButton(String text) {
		logMethod(text);
		return solo.searchButton(text);
	}

	public boolean searchButton(String text, int minimumNumberOfMatches) {
		logMethod(text, minimumNumberOfMatches);
		return solo.searchButton(text, minimumNumberOfMatches);
	}

	public boolean searchButton(String text, int minimumNumberOfMatches, boolean onlyVisible) {
		logMethod(text, minimumNumberOfMatches, onlyVisible);
		return solo.searchButton(text, minimumNumberOfMatches, onlyVisible);
	}

	public boolean searchButton(String text, boolean onlyVisible) {
		logMethod(text, onlyVisible);
		return solo.searchButton(text, onlyVisible);
	}

	public boolean searchEditText(String text) {
		logMethod(text);
		return solo.searchEditText(text);
	}

	public boolean searchText(String text) {
		logMethod(text);
		return solo.searchText(text);
	}

	public boolean searchText(String text, int minimumNumberOfMatches) {
		logMethod(text, minimumNumberOfMatches);
		return solo.searchText(text, minimumNumberOfMatches);
	}

	public boolean searchText(String text, int minimumNumberOfMatches, boolean scroll) {
		logMethod(text, minimumNumberOfMatches, scroll);
		return solo.searchText(text, minimumNumberOfMatches, scroll);
	}

	public boolean searchText(String text, int minimumNumberOfMatches, boolean scroll, boolean onlyVisible) {
		logMethod(text, minimumNumberOfMatches, scroll, onlyVisible);
		return solo.searchText(text, minimumNumberOfMatches, scroll, onlyVisible);
	}

	public boolean searchText(String text, boolean onlyVisible) {
		logMethod(text, onlyVisible);
		return solo.searchText(text, onlyVisible);
	}

	public boolean searchToggleButton(String text) {
		logMethod(text);
		return solo.searchToggleButton(text);
	}

	public boolean searchToggleButton(String text, int minimumNumberOfMatches) {
		logMethod(text, minimumNumberOfMatches);
		return solo.searchToggleButton(text, minimumNumberOfMatches);
	}

	public void sendKey(int key) {
		logMethod(key);
		solo.sendKey(key);
	}

	public void setActivityOrientation(int orientation) {
		logMethod(orientation);
		solo.setActivityOrientation(orientation);
	}

	public void setDatePicker(int index, int year, int monthOfYear, int dayOfMonth) {
		logMethod(index, year, monthOfYear, dayOfMonth);
		solo.setDatePicker(index, year, monthOfYear, dayOfMonth);
	}

	public void setProgressBar(int index, int progress) {
		logMethod(index, progress);
		solo.setProgressBar(index, progress);
	}

	public void setTimePicker(int index, int hour, int minute) {
		logMethod(index, hour, minute);
		solo.setTimePicker(index, hour, minute);
	}

	public void sleep(int time) {
		logMethod(time);
		solo.sleep(time);
	}

	public boolean waitForActivity(String name, int timeout) {
		logMethod(name, timeout);
		return solo.waitForActivity(name, timeout);
	}

	public boolean waitForDialogToClose(long timeout) {
		logMethod(timeout);
		return solo.waitForDialogToClose(timeout);
	}

	public boolean waitForText(String text) {
		logMethod(text);
		return solo.waitForText(text);
	}

	public boolean waitForText(String text, int minimumNumberOfMatches, long timeout) {
		logMethod(text, minimumNumberOfMatches, timeout);
		return solo.waitForText(text, minimumNumberOfMatches, timeout);
	}

	public boolean waitForText(String text, int minimumNumberOfMatches, long timeout, boolean scroll) {
		logMethod(text, minimumNumberOfMatches, timeout, scroll);
		return solo.waitForText(text, minimumNumberOfMatches, timeout, scroll);
	}

	protected void logMethod(Object... args) {
		StackTraceElement element = Thread.currentThread().getStackTrace()[3];

		StringBuilder builder = new StringBuilder(element.getMethodName()).append("(");

		boolean firstArg = true;
		for (int i = 0; i < args.length; i++) {
			if (firstArg) {
				builder.append("%s");
				firstArg = false;
			}
			else {
				builder.append(", %s");
			}
		}

		builder.append(")");

		logf(builder.toString(), args);
	}

	public void logf(String message, Object[] args) {
		System.err.printf(message + "%n", args);
	}
}
