package qatarlivestock.testcases1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android1.NotificationsArabicPage;
import qatarlivestock.pagefactory.android1.LogoutArabicPage;
import qatarlivestock.pagefactory.utils.BaseTest;


public class NotificationArabicPageTest extends BaseTest{
	
	Class<NotificationArabicPageTest> classNameInstance = NotificationArabicPageTest.class;
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

	@Test(priority = 1, description="1.Login in to the app <br> 2.click Hamburger Menu <br> 3. Click notifications from Hamburger menu <br> 4 . Verified title as Notifications")
	public void NotificationsArabicPageTest() throws InterruptedException {
		

		System.out.println(ANSI_PURPLE + "Notification Page Test" + ANSI_RESET);
		
		NotificationsArabicPage hm = new NotificationsArabicPage(driver);
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
		Assert.assertEquals(LogoutArabicPageLanguagechangeVerification, true, ANSI_RED + "Language change Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Language change is verified successfully" + ANSI_RESET);
		
		boolean NotificationlistVerification = hm.verifyNotification();
		Assert.assertEquals(NotificationlistVerification, true,
				ANSI_RED + "notification Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "notification is verified successfully" + ANSI_RESET);

	}
	
	
	@Test(priority = 2, description="1.Clicked notifications from hamburger menu <br> 2. Verified  notifications and clicked each notifiactions <br>3. Verified notification details page contains title, description , premise name and location")
	public void NotificationdetailsPageTest() throws InterruptedException {
		NotificationsArabicPage  hm = new NotificationsArabicPage(driver);
		boolean NotificationDetailspageVerification = hm.verifyNotificationDetailsPage();
		Assert.assertEquals(NotificationDetailspageVerification, true,
				ANSI_RED + "notification details page Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "notification details page is verified successfully" + ANSI_RESET);
	}
	

	@Test(priority = 3, description="1.Clicked notifications from hamburger menu <br> 2. Verified  notifications in the list contains title, date and premise")
	public void NotificationListPageTest() throws InterruptedException {

		NotificationsArabicPage hm = new NotificationsArabicPage(driver);
		boolean NotificationlistpageVerification = hm.verifyNotificationPage();
		Assert.assertEquals(NotificationlistpageVerification, true,
				ANSI_RED + "notification listing page Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "notification listing page is verified successfully" + ANSI_RESET);
	}

	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
	
}
