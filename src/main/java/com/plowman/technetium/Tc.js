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

/* The only purpose of this class is to provide simple auto-completion from Technetium javascript files */
//noinspection JSUnusedGlobalSymbols
function Tc() {

	//BEGIN Technetium-specific methods
	this.assertTextPresent = function (text) {
	};

	this.assertTextNotPresent = function (text) {
	};

	this.log = function(text) {
	};

	this.getScreenHeight = function () {
	};
	//END Technetium-specific methods

	//BEGIN Robotium Solo Methods
	//public android.app.Instrumentation.ActivityMonitor getActivityMonitor()
	this.getActivityMonitor = function () {
	};

	//public void clearEditText(int index) 
	this.clearEditText = function (index) {
	};

	//public boolean waitForText(java.lang.String text) 
	this.waitForText = function (text) {
	};

	//public boolean waitForText(java.lang.String text, int minimumNumberOfMatches, long timeout) 
	this.waitForText = function (timeout) {
	};

	//public boolean waitForText(java.lang.String text, int minimumNumberOfMatches, long timeout, boolean scroll) 
	this.waitForText = function (text, minimumNumberOfMatches, timeout, scroll) {
	};

	//public boolean searchEditText(java.lang.String text) 
	this.searchEditText = function (text) {
	};

	//public boolean searchButton(java.lang.String text) 
	this.searchButton = function (text) {
	};

	//public boolean searchButton(java.lang.String text, boolean onlyVisible) 
	this.searchButton = function (text) {
	};

	//public boolean searchToggleButton(java.lang.String text) 
	this.searchToggleButton = function (text) {
	};

	//public boolean searchButton(java.lang.String text, int minimumNumberOfMatches) 
	this.searchButton = function (text) {
	};

	//public boolean searchButton(java.lang.String text, int minimumNumberOfMatches, boolean onlyVisible) 
	this.searchButton = function (text) {
	};

	//public boolean searchToggleButton(java.lang.String text, int minimumNumberOfMatches) 
	this.searchToggleButton = function (text) {
	};

	//public boolean searchText(java.lang.String text) 
	this.searchText = function (text) {
	};

	//public boolean searchText(java.lang.String text, boolean onlyVisible) 
	this.searchText = function (text) {
	};

	//public boolean searchText(java.lang.String text, int minimumNumberOfMatches) 
	this.searchText = function (text) {
	};

	//public boolean searchText(java.lang.String text, int minimumNumberOfMatches, boolean scroll) 
	this.searchText = function (text) {
	};

	//public boolean searchText(java.lang.String text, int minimumNumberOfMatches, boolean scroll, boolean onlyVisible) 
	this.searchText = function (text) {
	};

	//public void setActivityOrientation(int orientation) 
	this.setActivityOrientation = function (text) {
	};

	//public java.util.ArrayList<android.app.Activity> getAllOpenedActivities() 
	this.getAllOpenedActivities = function () {
	};

	//public android.app.Activity getCurrentActivity() 
	this.getCurrentActivity = function () {
	};

	//public void assertCurrentActivity(java.lang.String message, java.lang.String name) 
	this.assertCurrentActivity = function (message, name) {
	};

	//public void assertCurrentActivity(java.lang.String message, java.lang.Class expectedClass) 
	this.assertCurrentActivity = function (message, expectedClass) {
	};

	//public void assertCurrentActivity(java.lang.String message, java.lang.String name, boolean isNewInstance) 
	this.assertCurrentActivity = function (message, name, isNewInstance) {
	};

	//public void assertCurrentActivity(java.lang.String message, java.lang.Class expectedClass, boolean isNewInstance) 
	this.assertCurrentActivity = function (message, expectedClass, isNewInstance) {
	};

	//public void assertMemoryNotLow() 
	this.assertMemoryNotLow = function () {
	};

	//public boolean waitForDialogToClose(long timeout) 
	this.waitForDialogToClose = function (timeout) {
	};

	//public void goBack() 
	this.goBack = function () {
	};

	//public void clickOnScreen(float x, float y) 
	this.clickOnScreen = function (x, y) {
	};

	//public void clickLongOnScreen(float x, float y) 
	this.clickLongOnScreen = function (x, y) {
	};

	//public void clickLongOnScreen(float x, float y, int time) 
	this.clickLongOnScreen = function (x, y, time) {
	};

	//public void clickOnButton(java.lang.String name) 
	this.clickOnButton = function (name) {
	};

	//public void clickOnImageButton(int index) 
	this.clickOnImageButton = function (index) {
	};

	//public void clickOnToggleButton(java.lang.String name) 
	this.clickOnToggleButton = function (name) {
	};

	//public void clickOnMenuItem(java.lang.String text) 
	this.clickOnMenuItem = function (text) {
	};

	//public void clickOnMenuItem(java.lang.String text, boolean subMenu) 
	this.clickOnMenuItem = function (text, subMenu) {
	};

	//public void pressMenuItem(int index) 
	this.pressMenuItem = function (index) {
	};

	//public void pressMenuItem(int index, int itemsPerRow) 
	this.pressMenuItem = function (index, itemsPerRow) {
	};

	//public void pressSpinnerItem(int spinnerIndex, int itemIndex) 
	this.pressSpinnerItem = function (spinnerIndex, itemIndex) {
	};

	//public void clickOnView(android.view.View view) 
	this.clickOnView = function (view) {
	};

	//public void clickLongOnView(android.view.View view) 
	this.clickLongOnView = function (view) {
	};

	//public void clickLongOnView(android.view.View view, int time) 
	this.clickLongOnView = function (view, time) {
	};

	//public void clickOnText(java.lang.String text) 
	this.clickOnText = function (text) {
	};

	//public void clickOnText(java.lang.String text, int match) 
	this.clickOnText = function (text, match) {
	};

	//public void clickOnText(java.lang.String text, int match, boolean scroll) 
	this.clickOnText = function (text, match, scroll) {
	};

	//public void clickLongOnText(java.lang.String text) 
	this.clickLongOnText = function (text) {
	};

	//public void clickLongOnText(java.lang.String text, int match) 
	this.clickLongOnText = function (text, match) {
	};

	//public void clickLongOnText(java.lang.String text, int match, boolean scroll) 
	this.clickLongOnText = function (text, match, scroll) {
	};

	//public void clickLongOnText(java.lang.String text, int match, int time) 
	this.clickLongOnText = function (text, match, time) {
	};

	//public void clickLongOnTextAndPress(java.lang.String text, int index) 
	this.clickLongOnTextAndPress = function (text, index) {
	};

	//public void clickOnButton(int index) 
	this.clickOnButton = function (index) {
	};

	//public void clickOnRadioButton(int index) 
	this.clickOnRadioButton = function (index) {
	};

	//public void clickOnCheckBox(int index) 
	this.clickOnCheckBox = function (index) {
	};

	//public void clickOnEditText(int index) 
	this.clickOnEditText = function (index) {
	};

	//public java.util.ArrayList<android.widget.TextView> clickInList(int line) 
	this.clickInList = function (line) {
	};

	//public java.util.ArrayList<android.widget.TextView> clickInList(int line, int index) 
	this.clickInList = function (line, index) {
	};

	//public java.util.ArrayList<android.widget.TextView> clickLongInList(int line) 
	this.clickLongInList = function (line) {
	};

	//public java.util.ArrayList<android.widget.TextView> clickLongInList(int line, int index) 
	this.clickLongInList = function (line, index) {
	};

	//public java.util.ArrayList<android.widget.TextView> clickLongInList(int line, int index, int time) 
	this.clickLongInList = function (line, index, time) {
	};

	//public void drag(float fromX, float toX, float fromY, float toY, int stepCount) 
	this.drag = function (fromX, toX, fromY, toY, stepCount) {
	};

	//public boolean scrollDown() 
	this.scrollDown = function () {
	};

	//public boolean scrollUp() 
	this.scrollUp = function () {
	};

	//public boolean scrollDownList(int index) 
	this.scrollDownList = function (index) {
	};

	//public boolean scrollUpList(int index) 
	this.scrollUpList = function (index) {
	};

	//public void scrollToSide(int side) 
	this.scrollToSide = function (side) {
	};

	//public void setDatePicker(int index, int year, int monthOfYear, int dayOfMonth) 
	this.setDatePicker = function (index, year, monthOfYear, dayOfMonth) {
	};

	//public void setTimePicker(int index, int hour, int minute) 
	this.setTimePicker = function (index, hour, minute) {
	};

	//public void setProgressBar(int index, int progress) 
	this.setProgressBar = function (index, progress) {
	};

	//public void setSlidingDrawer(int index, int status) 
	this.setSlidingDrawer = function (index, status) {
	};

	//public void enterText(int index, java.lang.String text) 
	this.enterText = function (index, text) {
	};

	//public void clickOnImage(int index) 
	this.clickOnImage = function (index) {
	};

	//public android.view.View getView(int id) 
	this.getView = function (id) {
	};

	//public boolean isRadioButtonChecked(int index) 
	this.isRadioButtonChecked = function (index) {
	};

	//public boolean isRadioButtonChecked(java.lang.String text) 
	this.isRadioButtonChecked = function (text) {
	};

	//public boolean isCheckBoxChecked(int index) 
	this.isCheckBoxChecked = function (index) {
	};

	//public boolean isToggleButtonChecked(java.lang.String text) 
	this.isToggleButtonChecked = function (text) {
	};

	//public boolean isToggleButtonChecked(int index) 
	this.isToggleButtonChecked = function (index) {
	};

	//public boolean isCheckBoxChecked(java.lang.String text) 
	this.isCheckBoxChecked = function (text) {
	};

	//public boolean isTextChecked(java.lang.String text) 
	this.isTextChecked = function (text) {
	};

	//public boolean isSpinnerTextSelected(java.lang.String text) 
	this.isSpinnerTextSelected = function (text) {
	};

	//public boolean isSpinnerTextSelected(int index, java.lang.String text) 
	this.isSpinnerTextSelected = function (index, text) {
	};

	//public void sendKey(int key) 
	this.sendKey = function (key) {
	};

	//public void goBackToActivity(java.lang.String name) 
	this.goBackToActivity = function (name) {
	};

	//public boolean waitForActivity(java.lang.String name) 
	this.waitForActivity = function (name) {
	};

	//public boolean waitForActivity(java.lang.String name, int timeout) 
	this.waitForActivity = function (name, timeout) {
	};

	//public java.lang.String getString(int resId) 
	this.getString = function (resId) {
	};

	//public void sleep(int time) 
	this.sleep = function (time) {
	};

	//public void finalize() throws java.lang.Throwable 
	this.finalize = function () {
	};
	//END Robotium Solo Methods
}