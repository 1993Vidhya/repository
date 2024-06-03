package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.ScheduleAppointmentListingPage;
import qatarlivestock.pagefactory.android.ScheduleAppointmentPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class ScheduleAppointmentListingPageTest extends BaseTest{
		
		Class<ScheduleAppointmentListingPageTest> classNameInstance = ScheduleAppointmentListingPageTest.class;
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

@Test(priority = 1 , description="1. login is clicked <br> 2.premise name is clicked <br> 3.permissions are clicked <br> 4.checked premises name <br>5. Appointment Module is verified  <br> 6.Add appointment button is verified ")
public void SchedulePageTest() throws Exception {
	Thread.sleep(5000);	

	System.out.println(ANSI_PURPLE + "Schedule Appointment Listing Page Test" + ANSI_RESET);
	
	ScheduleAppointmentPage sp = new ScheduleAppointmentPage(driver);
	
	LoginPage mm = new LoginPage(driver);
	
	SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
	ScheduleAppointmentListingPage Sap = new ScheduleAppointmentListingPage(driver);
	String premisename = prop.getProperty("premiseName"); 
	String premiseid = prop.getProperty("premiseId");
			
  	boolean val1 = login.clickloginbtn();
	Assert.assertEquals(val1, true, "Login button is not displayed");
	System.out.println("Login button is clicked");
	
	int result = login.clickpremisename(premisename, premiseid);
	Assert.assertEquals(result, 1 , "Premise name is not found");
	System.out.println(premisename + " with id "+ premiseid +" is clicked");
	
	mm.clicknotifications();
	Thread.sleep(5000);
	
	boolean AppointmentModuleVerification = sp.AppointmentModuleVerify();
	Assert.assertEquals(AppointmentModuleVerification, true,
			ANSI_RED + "Appointment Module  Verification failed" + ANSI_RESET);
	System.out.println(ANSI_GREEN + "Appointment Module  is verified successfully, Appointment title is displayed "
			+ ANSI_RESET);

	boolean AppointmentTagVerification = Sap. tagVerification();
	Assert.assertEquals(AppointmentModuleVerification, true,
			ANSI_RED + "Appointment Tag Verification failed" + ANSI_RESET);
	System.out.println(ANSI_GREEN + "Appointment tag  is verified successfully, Open and Close tag is present "
			+ ANSI_RESET);
}
}
