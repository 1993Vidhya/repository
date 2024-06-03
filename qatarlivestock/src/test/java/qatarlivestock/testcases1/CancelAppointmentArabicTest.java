package qatarlivestock.testcases1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qatarlivestock.pagefactory.utils.BaseTest;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.CancelAppointmentArabicPage;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android1.LogoutArabicPage;

public class CancelAppointmentArabicTest extends BaseTest{

	Class<CancelAppointmentArabicTest> classNameInstance = CancelAppointmentArabicTest.class;
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

	@Test(priority = 1, description = "1. login is clicked <br> 2.premise name is clicked <br> 3.permissions are clicked <br> 4.checked premises name <br>5. Appointment Module is verified  <br> 6.Appointment details page is verified  ")
	public void CancelAppointmentListingArabicPage() throws InterruptedException {
		System.out.println(ANSI_PURPLE + "Appointment Cancel Page Test" + ANSI_RESET);

		CancelAppointmentArabicPage cp = new CancelAppointmentArabicPage(driver);
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
		Assert.assertEquals(LogoutArabicPageVerification, true, ANSI_RED + "Hamberger page Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamberger  page is verified successfully" + ANSI_RESET);

		boolean LogoutArabicPageLanguagechangeVerification = lp.HamburgerLanguageChangeverification();
		Assert.assertEquals(LogoutArabicPageLanguagechangeVerification, true,
				ANSI_RED + "Language change Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Language change is verified successfully" + ANSI_RESET);

		boolean AppointmentListingArabicPageVerification = cp.appointmentlistingpageverification();
		Assert.assertEquals(AppointmentListingArabicPageVerification, true,
				ANSI_RED + "Listing page Verification failed" + ANSI_RESET);
		System.out.println(
				ANSI_GREEN + "Appointment title ,Appointment Listing page is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 2, description = "1. verifying the page contains Appointment Id, Status of the appointment , <br> 2.Swipe the Appointment for Cancelling<br> 3.Are you sure you want to cancel the appointment with ok and cancel button is displayed<br>4. Verified by clicking Ok and cancel button<br>5.Verified while clicking ok button the Request is canceling or not<br> 6.Verified if already cancelled request another message is showing or not")
	public void AppointmentArabicStatusVerification() throws InterruptedException {
		CancelAppointmentArabicPage cp = new CancelAppointmentArabicPage(driver);

		boolean AppointmentcancelVerification = cp.OkandCancelbuttonverification();
		Assert.assertEquals(AppointmentcancelVerification, true,
				ANSI_RED + "Appointmnet cancel button verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Appointment cancel button  verified sucessfully" + ANSI_RESET);

		boolean AppointmentArabiccancelingVerification = cp.CancelAppointmentVerification();
		Assert.assertEquals(AppointmentArabiccancelingVerification, true,
				ANSI_RED + "Appointmnet Ok button verifying failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Appointment ok button verified sucessfully" + ANSI_RESET);

	}
	
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  

}
