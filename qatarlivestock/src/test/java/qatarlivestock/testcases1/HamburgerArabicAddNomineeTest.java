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

public class HamburgerArabicAddNomineeTest extends BaseTest {
	
	Class<HamburgerArabicAddNomineeTest> classNameInstance = HamburgerArabicAddNomineeTest.class;
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
	public void HamburgerVerification() throws InterruptedException {		

		System.out.println(ANSI_PURPLE + "HamburgerMenu Add Nominee Page Test" + ANSI_RESET);
	
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
		Assert.assertEquals(LogoutArabicPageVerification, true,
				ANSI_RED + "Logoutpage Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Logout page is verified successfully" + ANSI_RESET);

		boolean LogoutArabicPageLanguagechangeVerification = lp.HamburgerLanguageChangeverification();
		Assert.assertEquals(LogoutArabicPageLanguagechangeVerification, true,
				ANSI_RED + "Language change Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Language change is verified successfully" + ANSI_RESET);

		}

	@Test(priority = 2, description = "1. Verifying the nominee name is empty or not in add nominee ")
	public void NomineeNameEmptyValidation() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean NomineeNameempty = hm.NomineenameEmpty();
		Assert.assertEquals(NomineeNameempty, true, ANSI_RED + "Nominee Name empty Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Nominee Name empty is verified successfully" + ANSI_RESET);

	}

	@Test(priority = 3, description = "1. Verifying the nominee name is valid or not in add nominee ")
	public void NomineeNameInvalidValidation() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean NomineeNameInvalid = hm.InvalidNomineename();
		Assert.assertEquals(NomineeNameInvalid, true,
				ANSI_RED + "Nominee Name Invalid Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Nominee Name Invalid is verified successfully" + ANSI_RESET);

	}

	@Test(priority = 4, description = "1. Verifying the Qid number is empty or not in add nominee")
	public void QidNumberEmptyValidation() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean QidNumberEmpty = hm.QidNumberEmpty();
		Assert.assertEquals(QidNumberEmpty, true, ANSI_RED + "Qid Number Empty Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Qid Number Empty is verified successfully" + ANSI_RESET);

	}

	@Test(priority = 5, description = "1. Verifying the Qid number  is valid or not in add nominee")
	public void QidNumberInvalidValidation() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean QidNumberInvalid = hm.InvalidQidNumber();
		Assert.assertEquals(QidNumberInvalid, true, ANSI_RED + "Qid Number Invalid Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Qid Number Invalid is verified successfully" + ANSI_RESET);

	}

	@Test(priority = 6, description = "1. Verifying the Mobile number is empty  or not in add nominee")
	public void MobileNumberEmptyValidation() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean MobileNumberempty = hm.MobileNumberEmpty();
		Assert.assertEquals(MobileNumberempty, true, ANSI_RED + "Mobile Number emptyVerification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Mobile Number empty is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 7, description = "1. Verifying the Mobile number is valid or not in add nominee")
	public void MobileNumberInvalidValidation() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean MobileNumberInvalid = hm.InvalidMobileNumber();
		Assert.assertEquals(MobileNumberInvalid, true,
				ANSI_RED + "Mobile Number Invalid Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Mobile Number Invalid is verified successfully" + ANSI_RESET);

	}

	@Test(priority = 8, description = "	1. Verified Hamburger menu is present and clicked <br> 2. Add nominee in hamburger is clicked and navigate to Nominee details page <br> 3.If Nominee details are available no need to add nominee <br> 4.Add button is clicked if no nominee is available <br>\r\n"
			+ "	5. Added Nominee name, qid number and mobile number successfully <br>6. Verified nominee details page if newly added nominee is present")
	public void hamburgeAddingNomineeVerification() throws InterruptedException {
		HamBurgerMenuArabicPage hm = new HamBurgerMenuArabicPage(driver);
		boolean AddingNomineeverification = hm.AddingNomineeVerification();
		Assert.assertEquals(AddingNomineeverification, true,
				ANSI_RED + "Add Nominee Details Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Adding Nominee Details is verified successfully" + ANSI_RESET);
	}
	
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  

}
