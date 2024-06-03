package qatarlivestock.testcases1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.HamBurgerMenuArabicPage;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android1.LogoutArabicPage;
import qatarlivestock.pagefactory.utils.BaseTest;


public class HamburgerMenuArabicTest extends BaseTest {
	
	Class<HamburgerMenuArabicTest> classNameInstance = HamburgerMenuArabicTest.class;
	String className = classNameInstance.getSimpleName();
	
	@BeforeClass                                             // annotated method placed in the beginning.  
	public void before_test()  
	{  
		System.out.println("\n\033[1m"+className+" started executing\033[0m\n"); 
	}  

	String ANSI_RED = "\u001B[31m";
	String ANSI_GREEN = "\u001B[32m";
	String ANSI_RESET = "\u001B[0m";
	String ANSI_PURPLE = "\u001B[35m";

	@Test(priority = 1, description = "1. login is clicked <br> 2.premise name is clicked <br> 3.permissions are clicked <br> 4.checked premises name <br>5. HambugerMenu is verified and clicked <br> 6. Veified whethre the page contains premise owner name, Conatct number , Address is displaying")
	public void HamburgerArabicVerification() throws InterruptedException {
		

		System.out.println(ANSI_PURPLE + "HamburgerMenu Arabic Page Test" + ANSI_RESET);

		
		LogoutArabicPage lp = new LogoutArabicPage(driver);	

		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		String premisename = prop.getProperty("premiseName"); 
		String premiseid = prop.getProperty("premiseId");
		String usernameNAS = prop.getProperty("emailNAS"); 
		String passwordNAS = prop.getProperty("passwordNAS");
		boolean logo = login.logoverification();
		Assert.assertEquals(logo, true,"Livestock logo not displayed");
		System.out.println("Livestock logo is displayed in the page");

		boolean val1 = login.clickloginbtn();
		Assert.assertEquals(val1, true, "Login button is not displayed");
		System.out.println("Login button is clicked");
		
		int result = login.clickpremisename(premisename, premiseid);
		Assert.assertEquals(result, 1 , "Premise name is not found");
		System.out.println(premisename + " with id "+ premiseid +" is clicked");
		
		
		boolean permission1 = login.clicklocationpermissionwhileusingapp();
		Assert.assertEquals(permission1, true, "Location permission is not displayed");
		System.out.println("Location permission is displayed and clicked");
	
		boolean permission2 = login.clickallowcallpermission();
		Assert.assertEquals(permission2, true, "Allow call permission is not displayed");
		System.out.println("Allow call permission is displayed and clicked");
	
		boolean permission3 = login.clickallowcallpermission();
		Assert.assertEquals(permission3, true, "Calender permission is not displayed");	
		System.out.println("Calender permission is displayed and clicked");
		
		boolean permission4 = login.clickallowcallpermission();
		Assert.assertEquals(permission4, true, "Notifications permission is not displayed");	
		System.out.println("Notifications permission is displayed and clicked");
		
		Thread.sleep(5000);

		boolean LogoutArabicPageVerification = lp.hamburgerverification();
		Assert.assertEquals(LogoutArabicPageVerification, true, ANSI_RED + "Logoutpage Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Logout page is verified successfully" + ANSI_RESET);

		boolean LogoutArabicPageLanguagechangeVerification = lp.HamburgerLanguageChangeverification();
		Assert.assertEquals(LogoutArabicPageLanguagechangeVerification, true,
				ANSI_RED + "Language change Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Language change is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 2, description = "1.verified the Hamburger menu contains premise owner Name , contact number, Address ")
	public void hamburgerArabicElementsVerification() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean HamburgerArabicElementsVerification = hm.Hamburgerelementsverification();
		Assert.assertEquals(HamburgerArabicElementsVerification, true,
				ANSI_RED + "Hamburger elements Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamburger elements is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 3, description = "1.verified the Hamburger menu contains Settings, notifications, Add nominee, FAQ, language switch, Contact us and Logout ")
	public void hamburgerArabicElementsListVerification() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean HamburgerArabicListVerification = hm.HamburgerListverification();
		Assert.assertEquals(HamburgerArabicListVerification, true,
				ANSI_RED + "Hamburger List Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamburger List is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 4, description = "1.verified the Hamburger menu contains Facebook twitter and linkdn icons ")
	public void hamburgerArabicSocialIconsVerification() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean HamburgerArabicSocialIconsVerification = hm.SocialIconsVerification();
		Assert.assertEquals(HamburgerArabicSocialIconsVerification, true,
				ANSI_RED + "Hamburger social icons Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamburger social icons is verified successfully" + ANSI_RESET);

	}

	
	@Test(priority = 5, description = "1.Verifying whether Add Nominee is present in the hamburger and it clicked,<br> 2. Veried Nominee Details title is present <br> 3 clicked Back button verified  Hamberger menu is present")
	public void hamurgerArabicAddNomineeVerification() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean AddNomineeArabicHamburger = hm.addnomineehamburger();
		Assert.assertEquals(AddNomineeArabicHamburger, true,
				ANSI_RED + "Add Nominee in Hamburger Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Add Nominee in Hamburger is verified successfully" + ANSI_RESET);
	}
	
	@Test(priority = 6, description = "1.Verified Hamburger menu is present <br> 2.Clicked Hamburger Menu <br> 3.clikced Add nominee in hamburger Menu <br> 4.Verified whethre nominee details are available in the page <br> 5.Verified Nominee name, qid number and mobile number and remove nominee button present or not <br>6. if No nominee details available  No nominee deatils available is displaying")
	public void hamburgerArabicNomineeDetailsVerification() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean NomineeDetailsArabicpageverification = hm.nomineedetailspageverification();
		Assert.assertEquals(NomineeDetailsArabicpageverification, true,
				ANSI_RED + "Nominee Details page Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Nominee Details page  is verified successfully" + ANSI_RESET);
	}

	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
	
}
