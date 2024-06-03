package qatarlivestock.pagefactory.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;

public class LogoutPage extends AndroidActions {
	AndroidDriver driver;		
	 
	public LogoutPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	//	PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(className = "android.widget.ImageButton")
	public WebElement hambergerelmnt;

	@AndroidFindBy(id = "logout")
	public WebElement logoutelemnt;

	@AndroidFindBy(id = "alertMessage")
	public WebElement logoutalert;

	@AndroidFindBy(id = "alertOkButton")
	public WebElement okbtnpopup;

	@AndroidFindBy(id = "alertCancelButton")
	public WebElement cancelbtnpopup;

	@AndroidFindBy(id = "loginBtn")
	public WebElement loginbtn;

	@AndroidFindBy(id = "owner_contact_number_label")
	public WebElement contactLabel;

	// Verify Logout button from hamburger
	public Boolean hamburgerverification() {
		boolean val = false;
		if (hambergerelmnt.isDisplayed()) {
			hambergerelmnt.click();
			System.out.println("HambergerMenu is Displayed and clciked sucessfully");
			String ExpectedContact = "Contact Number";
			String ActualContact = contactLabel.getAttribute("text");
			if (contactLabel.isDisplayed() && ActualContact.equalsIgnoreCase(ExpectedContact)) {
				val = true;
				System.out.println("HambergerMenu is Displayed and contact number inside HambergerMenu is displayed successfully");
		//		test1 = extent.createTest("ebay Search Test", "test to validate search box ");
		//        test1.pass("maximize has done"); 
			}
		}
		return val;
	}

	public Boolean logoutuiverification() throws InterruptedException {
		boolean val = false;
		Thread.sleep(5000);
		if (logoutelemnt.isDisplayed()) {
			val = true;
			System.out.println("Logout menu is Displayed");
		} else {
			System.out.println("Logout menu is not Displayed");
		}

		logoutelemnt.click();
		Thread.sleep(5000);
		String ActuallogAlert = logoutalert.getAttribute("text");
		String ExpectedAlert = "Are you sure you want to logout?";
		/*
		 * System.out.println("Logout alert: " +ActuallogAlert); int size =
		 * ActuallogAlert.length(); System.out.println("Logout size: " +size); int size1
		 * = ExpectedAlert.length(); System.out.println("Logout size: " +size1);
		 * System.out.println("Expected Alert: " +ExpectedAlert);
		 */
		Assert.assertEquals(ExpectedAlert, ActuallogAlert);

		System.out.println("Logout alert is verified successfully");

		if (logoutalert.isDisplayed() && ActuallogAlert.equalsIgnoreCase(ExpectedAlert)) {
			System.out.println("Logout alert is Displayed");
		} else {
			System.out.println("Logout alert is not Displayed");
		}

		if (okbtnpopup.isDisplayed()&& okbtnpopup.getText().equals("Ok")) {
			System.out.println("Ok button  is Displayed");
		} else {
			System.out.println("Ok button  is not Displayed");
		}

		if (cancelbtnpopup.isDisplayed() && cancelbtnpopup.getText().equals("Cancel")) {

			System.out.println("Cancel button  is Displayed");

			cancelbtnpopup.click();
			if (hambergerelmnt.isDisplayed()) {
				System.out.println("Cancel button is clicked and moved back to hamburger menu");

			} else {
				System.out.println("Cancel button is not clicked and moved back to hamburger menu");
			}
		} else {
			System.out.println("Cancel button  is not isDisplayed()");
		}
			

		return val;

	}

	public Boolean logoutfuncverification() throws InterruptedException {
		boolean val = false;
		Thread.sleep(5000);
		hambergerelmnt.click();
		if (logoutelemnt.isDisplayed()) {
			logoutelemnt.click();
		}
		if (okbtnpopup.isDisplayed() && okbtnpopup.getText().equals("Ok")) {
			okbtnpopup.click();
			Thread.sleep(5000);

			String expectedLoginText = "Login / Authenticate";
			String ActualLogintext = loginbtn.getAttribute("text");
			System.out.println("Displayed login Page : " + ActualLogintext);
			Thread.sleep(5000);
			if (loginbtn.isDisplayed() && ActualLogintext.equalsIgnoreCase(expectedLoginText)) {
				val = true;
				Thread.sleep(5000);
				System.out.println("Ok button is verified and Clicked,login page is displayed");
			}

		else {
			System.out.println("Ok  button  is not verified");

		}
		}
		return val;
	}

}
