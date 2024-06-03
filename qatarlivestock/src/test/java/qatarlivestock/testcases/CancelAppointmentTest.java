package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import qatarlivestock.pagefactory.utils.BaseTest;
import qatarlivestock.pagefactory.android.CancelAppointmentPage;
import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;

public class CancelAppointmentTest extends BaseTest{
	
	Class<CancelAppointmentTest> classNameInstance = CancelAppointmentTest.class;
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
	public void CancelAppointmentListingPage() throws Exception {
		System.out.println(ANSI_PURPLE + "Appointment Cancel Page Test" + ANSI_RESET);

	//	SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		CancelAppointmentPage cp = new CancelAppointmentPage(driver);

		

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

		boolean AppointmentListingPageVerification = cp.appointmentlistingpageverification();
		Assert.assertEquals(AppointmentListingPageVerification, true,
				ANSI_RED + "Listing page Verification failed" + ANSI_RESET);
		System.out.println(
				ANSI_GREEN + "Appointment title ,Appointment Listing page is verified successfully" + ANSI_RESET);
	}

	@Test(priority = 2, description = "1. verifying the page contains Appointment Id, Status of the appointment , <br> 2.Swipe the Appointment for Cancelling<br> 3.Are you sure you want to cancel the appointment with ok and cancel button is displayed<br>4. Verified by clicking Ok and cancel button<br>5.Verified while clicking ok button the Request is canceling or not<br> 6.Verified if already cancelled request another message is showing or not")
	public void AppointmentStatusVerification() throws InterruptedException {
		CancelAppointmentPage cp = new CancelAppointmentPage(driver);
		boolean AppointmentcancelVerification = cp.OkandCancelbuttonverification();
		Assert.assertEquals(AppointmentcancelVerification, true,
				ANSI_RED + "Appointmnet cancel button verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Appointment cancel button  verified sucessfully" + ANSI_RESET);

		boolean AppointmentcancelingVerification = cp.CancelAppointmentVerification();
		Assert.assertEquals(AppointmentcancelingVerification, true,
				ANSI_RED + "Appointmnet Ok button verifying failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Appointment ok button verified sucessfully" + ANSI_RESET);

	}
	
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
	
	

}
