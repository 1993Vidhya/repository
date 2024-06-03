package qatarlivestock.testcases1;

   import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android1.LogoutArabicPage;
import qatarlivestock.pagefactory.utils.BaseTest;


	public class  LogoutArabicTest extends BaseTest {
		
		Class< LogoutArabicTest> classNameInstance =  LogoutArabicTest.class;
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

		@Test(priority = 1)
		public void LogoutArabicPageTest() throws InterruptedException {			

			System.out.println(ANSI_PURPLE + "Logout Arabic Page Test" + ANSI_RESET);				
			
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
		}
		
		
		@Test(priority = 2, description = " 1. Hamburger menu is displayed and clicked")
		public void hamburgerverificationTest() throws InterruptedException {			
			
			LogoutArabicPage lp = new LogoutArabicPage(driver);
			boolean LogoutArabicPageVerification = lp.hamburgerverification();
			Assert.assertEquals(LogoutArabicPageVerification, true, ANSI_RED + "Logoutpage Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Logout page is verified successfully" + ANSI_RESET);
			
			boolean LogoutArabicPageLanguagechangeVerification = lp.HamburgerLanguageChangeverification();
			Assert.assertEquals(LogoutArabicPageLanguagechangeVerification, true, ANSI_RED + "Language change Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Language change is verified successfully" + ANSI_RESET);
		}

		@Test(priority = 3, description = " 1.logout is displayed <br>2. logout is clicked <br> 3.Are you sure you want to logout is displayed with ok and cancel button <br> 4.Cancel button is clicked ")
		public void LogoutUiVerificationTest() throws InterruptedException {
			
			LogoutArabicPage lp = new LogoutArabicPage(driver);

			boolean LogoutArabicUiVerification = lp.logoutuiArabicverification();
			Assert.assertEquals(LogoutArabicUiVerification, true, ANSI_RED + "Logoutpage Ui Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Logout page  Ui is verified successfully" + ANSI_RESET);
		}
		
		@Test(priority = 4, description = "1.hamburger Menu is clicked  and logout is displayed and clicked<br>2. ok button is clicked <br> 3.User redirects to login page")

	    	public void LogoutFuctionVerificationTest() throws InterruptedException {
			LogoutArabicPage lp = new LogoutArabicPage(driver);
			boolean LogoutArabicfunVerification = lp.logoutfuncverification();
			Assert.assertEquals(LogoutArabicfunVerification, true,
					ANSI_RED + "Logoutpage functioning  Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Logout page is verified successfully" + ANSI_RESET);
		}
		
		@AfterClass                                        // annotated method placed in the beginning.  
		public void after_test()  
		{  
			System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
		}  
		
	}



