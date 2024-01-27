package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.apache.commons.lang3.RandomStringUtils;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addCust;

	//Created for random string for unique email id
	public static String randomString() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return generatedString1;
	}
}
