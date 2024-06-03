package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.NotificationsPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class NotificationTest extends BaseTest {
	
	Class<NotificationTest> classNameInstance = NotificationTest.class;
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
	public void NotificationPageTest() throws Exception {

		System.out.println(ANSI_PURPLE + "Notification Page Test" + ANSI_RESET);
		
		NotificationsPage hm = new NotificationsPage(driver);		
		
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
		
	
		boolean NotificationlistVerification = hm.verifyNotification();
		Assert.assertEquals(NotificationlistVerification, true,
				ANSI_RED + "notification Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "notification is verified successfully" + ANSI_RESET);

	}
	
	
	@Test(priority = 2, description="1.Clicked notifications from hamburger menu <br> 2. Verified  notifications and clicked each notifiactions <br>3. Verified notification details page contains title, description , premise name and location")
	public void NotificationdetailsPageTest() throws InterruptedException {
		NotificationsPage hm = new NotificationsPage(driver);
		boolean NotificationDetailspageVerification = hm.verifyNotificationDetailsPage();
		Assert.assertEquals(NotificationDetailspageVerification, true,
				ANSI_RED + "notification details page Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "notification details page is verified successfully" + ANSI_RESET);
	}
	

	@Test(priority = 3, description="1.Clicked notifications from hamburger menu <br> 2. Verified  notifications in the list contains title, date and premise")
	public void NotificationListPageTest() throws InterruptedException {

		NotificationsPage hm = new NotificationsPage(driver);
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
