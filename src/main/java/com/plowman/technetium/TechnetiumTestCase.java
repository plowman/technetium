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

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

public class TechnetiumTestCase<T extends Activity> extends ActivityInstrumentationTestCase2<T> {

	public TechnetiumTestCase(Class<T> activityClass) {
		super(activityClass);
		setActivityInitialTouchMode(true);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();

		System.err.println("setUp() for test " + getClass().getSimpleName() + "." + getName());

		TechnetiumTestRunner tcTestRunner = new TechnetiumTestRunner(this);
		beforeRunningTest(tcTestRunner);
		tcTestRunner.runTest(getName());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		System.err.println("tearDown() for test " + getClass().getSimpleName() + "." + getName());
	}

	protected void beforeRunningTest(TechnetiumTestRunner tcTestRunner) {
		//left blank so clients can override if they wish
	}

	public void test_everything() {
	}

}
