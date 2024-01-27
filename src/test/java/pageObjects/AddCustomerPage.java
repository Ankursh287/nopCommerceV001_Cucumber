package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {
	public WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	By lnkCustomers_menu = By.xpath("//a[@href=\"#\"]//span[contains(text(),\"Customers\")]");
	By lnkCustomer_menuitem = By.xpath(
			"//a[@href=\"/Admin/Customer/List\"]//span[contains(text(),\"Customers\") and @class = \"menu-item-title\"]");

	By btnAddnew = By.xpath("//a[@href=\"/Admin/Customer/Create\"]");

	By txtEmail = By.xpath("//input[@id=\"Email\"]");
	By txtPassword = By.xpath("//input[@id=\"Password\"]");

	By txtCustomerRoles = By.xpath("//ul[@id=\"SelectedCustomerRoleIds_taglist\"]");

	By lstItemAdministrators = By.xpath("//li[text()=\"Administrators\"]");
	By lstItemRegistered = By.xpath("//li[text()=\"Registered\"]");
	By lstItemGuests = By.xpath("//li[text()=\"Guests\"]");
	By lstItemVendors = By.xpath("//li[text()=\"Vendors\"]");
	By lstItemForumModerators = By.xpath("//li[text()=\"Forum Moderators\"]");

	By drpMgrofVendor = By.xpath("//select[@id=\"VendorId\"]");

	By rdMaleGender = By.xpath("//input[@id=\"Gender_Male\"]");
	By rdFemaleGender = By.xpath("//input[@id=\"Gender_Female\"]");

	By txtFirstName = By.xpath("//input[@id=\"FirstName\"]");
	By txtLastName = By.xpath("//input[@id=\"LastName\"]");

	By txtDOB = By.xpath("//input[@id=\"DateOfBirth\"]");

	By txtCompanyName = By.xpath("//input[@id=\"Company\"]");

	By txtAdminContent = By.xpath("//textarea[@id=\"AdminComment\"]");

	By btnSave = By.xpath("//button[@name=\"save\"]");

	// Action Methods

	public String getPagetitle() {
		return ldriver.getTitle();
	}

	public void clickOnCustomersMenu() {
		ldriver.findElement(lnkCustomers_menu).click();
	}

	public void clickOnCustomersMenuItem() {
		ldriver.findElement(lnkCustomer_menuitem).click();
	}

	public void clickOnAddNew() {
		ldriver.findElement(btnAddnew).click();
	}

	public void setEmail(String email) {
		ldriver.findElement(txtEmail).sendKeys(email);
	}

	public void setPassword(String password) {
		ldriver.findElement(txtPassword).sendKeys(password);
	}

	public void setCustomerRoles(String role) throws InterruptedException {
		if (!role.equals("Vendors")) { // If role is not vendor then clear Customer roles field
			ldriver.findElement(By.xpath("//ul[@id=\"SelectedCustomerRoleIds_taglist\"]")).clear();
		}
		ldriver.findElement(txtCustomerRoles).click();

		WebElement listItem;

		Thread.sleep(3000);

		if (role.equals("Administrators")) {
			listItem = ldriver.findElement(lstItemAdministrators);
		} else if (role.equals("Forum Moderators")) {
			listItem = ldriver.findElement(lstItemForumModerators);
		} else if (role.equals("Vendors")) {
			listItem = ldriver.findElement(lstItemVendors);
		} else if (role.equals("Registered")) {
			listItem = ldriver.findElement(lstItemRegistered);
		} else {
			listItem = ldriver.findElement(lstItemGuests);
		}
		listItem.click();

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click();", listItem);
	}

	public void setManagerOfVendor(String value) {
		Select drp = new Select(ldriver.findElement(drpMgrofVendor));
		drp.selectByVisibleText(value);
	}

	public void setGender(String gender) {
		if (gender.equals("Male")) {
			ldriver.findElement(rdMaleGender).click();
		} else if (gender.equals("Female")) {
			ldriver.findElement(rdFemaleGender).click();
		} else {
			ldriver.findElement(rdMaleGender).click(); // Default
		}
	}

	public void setFirstName(String fName) {
		ldriver.findElement(txtFirstName).sendKeys(fName);
	}

	public void setLastName(String lName) {
		ldriver.findElement(txtFirstName).sendKeys(lName);
	}

	public void setDOB(String dob) {
		ldriver.findElement(txtDOB).sendKeys(dob);
	}

	public void setCompanyName(String comName) {
		ldriver.findElement(txtCompanyName).sendKeys(comName);
	}

	public void setAdminContent(String content) {
		ldriver.findElement(txtAdminContent).sendKeys(content);
	}

	public void clickOnSave() {
		ldriver.findElement(btnSave).click();
	}

}
