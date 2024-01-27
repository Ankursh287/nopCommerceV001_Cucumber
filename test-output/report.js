$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/Customers.feature");
formatter.feature({
  "line": 1,
  "name": "Customers",
  "description": "",
  "id": "customers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add new Customer",
  "description": "",
  "id": "customers;add-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User click on Customers Menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "click on Customers Menu Item",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User can view Add new Customer Page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enter Customer information",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on Save Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 3723834200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "duration": 3211612200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "Steps.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 1027503400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_login()"
});
formatter.result({
  "duration": 131552200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@value\u003d\"Log in\"]\"}\n  (Session info: chrome\u003d90.0.4430.93)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027RADHEKRISHNALAP\u0027, ip: \u0027192.168.91.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 89.0.4389.23 (61b08ee2c5002..., userDataDir: C:\\Users\\ankur\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54000}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4cc10308369c7bb8d931191c850a7f2d\n*** Element info: {Using\u003dxpath, value\u003d//input[@value\u003d\"Log in\"]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat pageObjects.LoginPage.clickLogin(LoginPage.java:45)\r\n\tat stepDefinitions.Steps.click_on_login(Steps.java:36)\r\n\tat ✽.And Click on Login(./Features/Customers.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.user_can_view_Dashboard()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_click_on_Customers_Menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.click_on_Customers_Menu_Item()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.click_on_Add_new_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_can_view_Add_new_Customer_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_enter_Customer_information()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.click_on_Save_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully.",
      "offset": 36
    }
  ],
  "location": "Steps.user_can_view_confirmation_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});