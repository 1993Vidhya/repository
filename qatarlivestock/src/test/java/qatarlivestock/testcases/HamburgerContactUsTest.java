package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.HambugerMenuPage;
import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class HamburgerContactUsTest extends BaseTest {

	Class<HamburgerContactUsTest> classNameInstance = HamburgerContactUsTest.class;
	String className = classNameInstance.getSimpleName();

	@BeforeClass // annotated method placed in the beginning.
	public void before_test() {
		System.out.println("\n\033[1m" + className + " started executing\033[0m\n");
	}

	String ANSI_RED = "\u001B[31m";
	String ANSI_GREEN = "\u001B[32m";
	String ANSI_RESET = "\u001B[0m";
	String ANSI_PURPLE = "\u001B[35m";

	@Test(priority = 1, description = "1. login is clicked <br> 2.premise name is clicked <br> 3.permissions are clicked <br> 4.checked premises name <br>5. HambugerMenu is verified and clicked <br> 6. Veified whethre the page contains premise owner name, Conatct number , Address is displaying")
	public void HamburgerVerification() throws Exception {

		System.out.println(ANSI_PURPLE + "HamburgerMenu Page Test" + ANSI_RESET);

		LoginPage mm = new LoginPage(driver);
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		String premisename = prop.getProperty("premiseName"); 
		String premiseid = prop.getProperty("premiseId");
				
	    boolean logo = login.logoverification();
		Assert.assertEquals(logo, true,"Livestock logo not displayed");
		System.out.println("Livestock logo is displayed in the page");
		
		boolean val1 = login.clickloginbtn();
		Assert.assertEquals(val1, true, "Login button is not displayed");
		System.out.println("Login button is clicked");
		
		int result = login.clickpremisename(premisename, premiseid);
		Assert.assertEquals(result, 1 , "Premise name is not found");
		System.out.println(premisename + " with id "+ premiseid +" is clicked");
		
		mm.clicknotifications();
		Thread.sleep(5000);

	}

	@Test(priority = 2, description = "1.verified contact us in the hamburger is Cliakable<br> 2. Navigates to next page ")
	public void hamurgerContactElementsVerification() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);

		boolean ContactHamburgerVerification = hm.contactushamburger();
		Assert.assertEquals(ContactHamburgerVerification, true,
				ANSI_RED + "Contact us in the hamburger Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + " Contact us in the hamburger   is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 3, description = "1. Verified the page conatins Unified call centre, Mail us and PO Box ")
	public void hamburgerContactUsElementsVerification() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);

		boolean ContactUsVerification = hm.contactusverification();
		Assert.assertEquals(ContactUsVerification, true, ANSI_RED + "Contact us page Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Contact us page  is verified successfully" + ANSI_RESET);
	}

	@AfterClass // annotated method placed in the beginning.
	public void after_test() {
		System.out.println("\n\033[1m" + className + " finished executing\033[0m\n");
	}
}
