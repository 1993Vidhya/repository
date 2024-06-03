package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.HambugerMenuPage;
import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;


public class HamburgerMenuTest extends BaseTest{
	
	Class<HamburgerMenuTest> classNameInstance = HamburgerMenuTest.class;
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
	public void HamburgerVerification() throws Exception {		

		System.out.println(ANSI_PURPLE + "HamburgerMenu Page Test" + ANSI_RESET);
	
		HambugerMenuPage hm = new HambugerMenuPage(driver);	

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

		boolean HamburgerVerification = hm.hamburgerverification();
		Assert.assertEquals(HamburgerVerification, true,
				ANSI_RED + "Hamburger button Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamburger is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 2, description = "1.verified the Hamburger menu contains premise owner Name , contact number, Address ")
	public void hamburgerElementsVerification() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean HamburgerElementsVerification = hm.Hamburgerelementsverification();
		Assert.assertEquals(HamburgerElementsVerification, true,
				ANSI_RED + "Hamburger elements Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamburger elements is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 3, description = "1.verified the Hamburger menu contains Settings, notifications, Add nominee, FAQ, language switch, Contact us and Logout ")
	public void hamburgerElementsListVerification() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean HamburgerListVerification = hm.HamburgerListverification();
		Assert.assertEquals(HamburgerListVerification, true,
				ANSI_RED + "Hamburger List Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamburger List is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 4, description = "1.verified the Hamburger menu contains Facebook twitter and linkdn icons ")
	public void hamburgerSocialIconsVerification() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean HamburgerSocialIconsVerification = hm.SocialIconsVerification();
		Assert.assertEquals(HamburgerSocialIconsVerification, true,
				ANSI_RED + "Hamburger social icons Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamburger social icons is verified successfully" + ANSI_RESET);
	}

	
	
	@Test(priority = 5, description = "1.Verifying whether Add Nominee is present in the hamburger and it clicked,<br> 2. Veried Nominee Details title is present <br> 3 clicked Back button verified  Hamberger menu is present")
	public void hamurgerAddNomineeVerification() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean AddNomineeHamburger = hm.addnomineehamburger();
		Assert.assertEquals(AddNomineeHamburger, true,
				ANSI_RED + "Add Nominee in Hamburger Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Add Nominee in Hamburger is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 6, description = "1.Verified Hamburger menu is present <br> 2.Clicked Hamburger Menu <br> 3.clikced Add nominee in hamburger Menu <br> 4.Verified whethre nominee details are available in the page <br> 5.Verified Nominee name, qid number and mobile number and remove nominee button present or not <br>6. if No nominee details available  No nominee deatils available is displaying")
	public void hamburgerNomineeDetailsVerification() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean NomineeDetailspageverification = hm.nomineedetailspageverification();
		Assert.assertEquals(NomineeDetailspageverification, true,
				ANSI_RED + "Nominee Details page Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Nominee Details page  is verified successfully" + ANSI_RESET);
	}
	
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
	
	
}
