package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class Steps extends BaseClass {

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
	}

	@When("User opens URL \"(.*)\"")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as \"(.*)\" and Password as \"(.*)\"")
	public void user_enters_email_as_and_password_as(String email, String password) {
//		email = "admin@yourstore.com";
//		password = "admin";
		lp.setUserName(email);
		lp.setUserPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clickLogin();
	}

	@Then("Page Title should be \"(.*)\"")
	public void page_title_should_be(String title) throws InterruptedException {
		Thread.sleep(3000);
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

	//////////////////////////////

	@Then("^User can view Dashboard$")
	public void user_can_view_Dashboard() throws Throwable {
		addCust = new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPagetitle());
	}

	@When("^User click on Customers Menu$")
	public void user_click_on_Customers_Menu() throws Throwable {
		Thread.sleep(3000);
		addCust.clickOnCustomersMenu();
	}

	@When("^click on Customers Menu Item$")
	public void click_on_Customers_Menu_Item() throws Throwable {
		addCust.clickOnCustomersMenuItem();
	}

	@When("^click on Add new button$")
	public void click_on_Add_new_button() throws Throwable {
		addCust.clickOnAddNew();
	}

	@Then("^User can view Add new Customer Page$")
	public void user_can_view_Add_new_Customer_Page() throws Throwable {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPagetitle());
	}

	@When("^User enter Customer information$")
	public void user_enter_Customer_information() throws Throwable {
		addCust.setEmail(randomString()+"@gmail.com");
		addCust.setPassword(randomString());
	}

	@When("^Click on Save Button$")
	public void click_on_Save_Button() throws Throwable {

	}

	@Then("^User can view confirmation message \"([^\"]*)\"$")
	public void user_can_view_confirmation_message(String arg1) throws Throwable {

	}

}
