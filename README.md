<b>To run </b>

mvn clean integration-test


<b>Before running.</b>

Make sure the following steps have been run.

C:\Projects\MobileAutomationTesting>adb devices
List of devices attached
c161fa07c18c660 device


C:\Projects\MobileAutomationTesting>adb -s c161fa07c18c660 shell am start -a android.intent.action.MAIN -n org.openqa.selenium.android.app/.
MainActivity
Starting: Intent { act=android.intent.action.MAIN cmp=org.openqa.selenium.android.app/.MainActivity }


adb -s c161fa07c18c660 forward tcp:8080 tcp:8080