package qatarlivestock.pagefactory.android1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;

public class LogoutArabicPage extends AndroidActions {
	AndroidDriver driver;

	public LogoutArabicPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// PageFactory.initElements(driver, this);
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

	@AndroidFindBy(id = "languageSwitch")
	private WebElement Languageswitch;

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
			if (contactLabel.isDisplayed()&& ActualContact.equalsIgnoreCase(ExpectedContact))
					{
				val = true;
				System.out.println(
						"HambergerMenu is Displayed and contact number inside HambergerMenu is displayed successfully");
			}
		}
		return val;
	}

	public Boolean logoutuiArabicverification() throws InterruptedException {
		boolean val = false;
		Thread.sleep(5000);
		hambergerelmnt.click();
		if (logoutelemnt.isDisplayed()) {
			Thread.sleep(5000);
			val = true;
			System.out.println("Logout menu is Displayed");
		} else {
			System.out.println("Logout menu is not Displayed");
		}

		logoutelemnt.click();
		Thread.sleep(5000);
		String ActuallogAlert = logoutalert.getAttribute("text");
		String ExpectedAlert = "هل أنت متأكد أنك تريد تسجيل الخروج؟";
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

		if (okbtnpopup.isDisplayed() && okbtnpopup.getText().equals("نعم")) {
			System.out.println("Ok button  is Displayed");
		} else {
			System.out.println("Ok button  is not Displayed");
		}

		if (cancelbtnpopup.isDisplayed() && cancelbtnpopup.getText().equals("يلغي")) {

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
		if (okbtnpopup.isDisplayed() && okbtnpopup.getText().equals("نعم")) {
			okbtnpopup.click();
 Thread.sleep(5000);
			String expectedLoginText = "تسجيل الدخول / المصادقة";
			String ActualLogintext = loginbtn.getAttribute("text");
			System.out.println("Displayed login Page : " + ActualLogintext);

			if (loginbtn.isDisplayed() && ActualLogintext.equalsIgnoreCase(expectedLoginText)) {
				val = true;
				System.out.println("Ok button is verified and Clicked,login page is displayed");
			}

		} else {
			System.out.println("Ok  button  is not verified");

		}
		return val;
	}

	public Boolean HamburgerLanguageChangeverification() {
		boolean val = false;
		if (Languageswitch.isDisplayed()) {
			val = true;
			System.out.println("Arabic language is present");

			Languageswitch.click();
			
			System.out.println("Arabic language is clicked and change to Arabic");
			
		} else {
			System.out.println(
					"languageSwitch  is not displayed ");
		}
		return val;
	}

}
