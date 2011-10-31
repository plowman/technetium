# Technetium - Wicked Fast Android Testing
Technetium is an open-source Android testing tool written by Ben Plowman which lets you write and modify test cases without having to spend precious minutes re-compiling and deploying your whole Android project after every small change. 
## Highlights include:
* Built-in support for the awesome [Robotium](https://github.com/jayway/robotium) framework, allowing you to write Selenium-style tests which can interact with your application's UI in rich ways.
* The ability to write tests in JavaScript, allowing for creating simple tests which can be written and re-written without ever having to re-compile your app.
* Full integration with the existing Android testing paradigms, so you can still run Technetium tests using whatever method you used to run your Activity Instrumentation tests previously.
* Change and re-run a given test in less than a second.

## Quick Start Guide:
1) [Download the technetium jar file](https://github.com/plowman/technetium/downloads) and add it to your project's class path. Alternatively, you can build the file from scratch by downloading the source and running `mvn clean install`, which requires maven version 3.0 or greater.

2) In the test section of your Android project, create two files: MyTestSuite.java and MyTestSuite.js. The name does not matter, but both files must have the same name.

3) Set MyTestSuite.java to look like this:

```java
package my.package.name; //change to appropriate package

import android.content.Intent;
import my.package.name.MyActivity; /*Change to activity under test*/
import com.plowman.technetium.TechnetiumTestCase;
import com.plowman.technetium.TechnetiumTestRunner;
import com.mogwee.util.MogweeJSInterface;

public class MyTestSuite extends TechnetiumTestCase</*Change to activity under test*/ MyActivity> {

  public MyTestSuite() {
    super(/*Change to activity under test*/ MainActivity.class);
  }

  public void testSomeStuff() {
  }
  
}
```
4) Set MyTestSuite.js to look like this:

```javascript
function testSomeStuff() {
  Tc.log("It's working... It's working!!");
}
```
5) Compile your main and test project and push them to your phone. If you are new to testing in Android, then look [here](http://developer.android.com/resources/tutorials/testing/helloandroid_test.html) for a good overview of how to get started.

6) Upload MyTestSuite.js to the SD card of your android device or emulator. To do this from your terminal, run this:
`adb push ./MyTestSuite.js /sdcard/`

7) Run the test! If everything is setup correctly, you should see the message `It's working... It's working!!` in Logcat. If it doesn't work, be sure to [open an issue](https://github.com/plowman/technetium/issues) so I can fix it.

8) Change the test, upload the file, and run it again. The text changed but you didn't have to re-compile. Amazing!

9) Change the test to do something meaningful, like `Tc.clickOnText("text label");` will make the test click on any text on the screen labeled "text label". You can call any of the public methods in `TechnetiumInterface.java` and `SoloInterface.java` by calling Tc.methodName() from within JavaScript.