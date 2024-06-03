package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.HambugerMenuPage;
import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class HamburgerAddNomineeTest extends BaseTest{
	
	Class<HamburgerAddNomineeTest> classNameInstance = HamburgerAddNomineeTest.class;
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

	/*	boolean HamburgerVerification = hm.hamburgerverification();
		Assert.assertEquals(HamburgerVerification, true,
				ANSI_RED + "Hamburger button Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamburger is verified successfully" + ANSI_RESET);
		*/
	}

	
	@Test(priority = 2, description = "1. Verifying the nominee name is empty or not in add nominee ")
	public void NomineeNameEmptyValidation() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean NomineeNameempty = hm.NomineenameEmpty();
		Assert.assertEquals(NomineeNameempty, true, ANSI_RED + "Nominee Name empty Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Nominee Name empty is verified successfully" + ANSI_RESET);

	}

	@Test(priority = 3, description = "1. Verifying the nominee name is valid or not in add nominee ")
	public void NomineeNameInvalidValidation() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean NomineeNameInvalid = hm.InvalidNomineename();
		Assert.assertEquals(NomineeNameInvalid, true,
				ANSI_RED + "Nominee Name Invalid Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Nominee Name Invalid is verified successfully" + ANSI_RESET);

	}

	@Test(priority = 4, description = "1. Verifying the Qid number is empty or not in add nominee")
	public void QidNumberEmptyValidation() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean QidNumberEmpty = hm.QidNumberEmpty();
		Assert.assertEquals(QidNumberEmpty, true, ANSI_RED + "Qid Number Empty Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Qid Number Empty is verified successfully" + ANSI_RESET);

	}

	@Test(priority = 5, description = "1. Verifying the Qid number  is valid or not in add nominee")
	public void QidNumberInvalidValidation() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean QidNumberInvalid = hm.InvalidQidNumber();
		Assert.assertEquals(QidNumberInvalid, true, ANSI_RED + "Qid Number Invalid Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Qid Number Invalid is verified successfully" + ANSI_RESET);

	}

	@Test(priority = 6, description = "1. Verifying the Mobile number is empty  or not in add nominee")
	public void MobileNumberEmptyValidation() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean MobileNumberempty = hm.MobileNumberEmpty();
		Assert.assertEquals(MobileNumberempty, true, ANSI_RED + "Mobile Number emptyVerification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Mobile Number empty is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 7, description = "1. Verifying the Mobile number is valid or not in add nominee")
	public void MobileNumberInvalidValidation() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
		boolean MobileNumberInvalid = hm.InvalidMobileNumber();
		Assert.assertEquals(MobileNumberInvalid, true,
				ANSI_RED + "Mobile Number Invalid Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Mobile Number Invalid is verified successfully" + ANSI_RESET);

	}
	

	@Test(priority = 8, description = "	1. Verified Hamburger menu is present and clicked <br> 2. Add nominee in hamburger is clicked and navigate to Nominee details page <br> 3.If Nominee details are available no need to add nominee <br> 4.Add button is clicked if no nominee is available <br>\r\n"
			+ "	5. Added Nominee name, qid number and mobile number successfully <br>6. Verified nominee details page if newly added nominee is present")
	public void hamburgeAddingNomineeVerification() throws InterruptedException {
		HambugerMenuPage hm = new HambugerMenuPage(driver);
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
