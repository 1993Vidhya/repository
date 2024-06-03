package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.ScheduleExportAppointmentPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class ScheduleExportAppointmentTest extends BaseTest{
	
	Class<ScheduleExportAppointmentTest> classNameInstance = ScheduleExportAppointmentTest.class;
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

	@Test(priority = 1, description = "1. login is clicked <br> 2.premise name is clicked <br> 3.permissions are clicked <br> 4.checked premises name <br>5. Appointment Module is verified  <br> 6.Add appointment button is verified ")
	public void ScheduleExportPageTest() throws Exception {

			System.out.println(ANSI_PURPLE + "Schedule Export Appointment Page Test" + ANSI_RESET);

		ScheduleExportAppointmentPage ep = new ScheduleExportAppointmentPage(driver);
		
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

		boolean AppointmentModuleVerification = ep.AppointmentModuleVerify();
		Assert.assertEquals(AppointmentModuleVerification, true,
				ANSI_RED + "Appointment Module  Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Appointment Module  is verified successfully, Appointment title is displayed "
				+ ANSI_RESET);

		boolean AddAppointmentVerification = ep.AddAppointmentVerification();
		Assert.assertEquals(AddAppointmentVerification, true,
				ANSI_RED + "Add Appointment Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Add Appointment button is clicked ,schedule Appointment title is displayed "
				+ ANSI_RESET);
	}

/*	@Test(priority = 2, description = "1. Add appointment is selected <br> 2. Exporting  is selected <br> 3.Verified the page elements while selecting Exporting from the list")
	public void ScheduleExportAppointmentPageTest() throws InterruptedException {
		ScheduleExportAppointmentPage ep = new ScheduleExportAppointmentPage(driver);
		boolean exportPurposeFieldsValidation = ep.exportpurposeValidation();
		Assert.assertEquals(exportPurposeFieldsValidation, true, ANSI_RED + "Export  Verification failed" + ANSI_RESET);
		System.out.println(
				ANSI_GREEN + "purpose dropdown  is clicked ,Export is  clicked and fields are displayed " + ANSI_RESET);
	}

*/	
	@Test(priority = 3, description = "1. Add appointment is selected <br> 2. Exporting is selected <br> 3. Created new Appointment for Health certificate for Exporting   for Individual  <br>  4. Booked an appointment for Health certificate for Exporting  <br>5.Confirmation page elements is verified <br>6 Verified Appointment page whether new appointment created is listing on the page <br> 7.Clicked new appointment created and verified the details that is compared with the data given while creating")
	public void ScheduleExportPurposeAppointmentTest() throws InterruptedException {

		ScheduleExportAppointmentPage ep = new ScheduleExportAppointmentPage(driver);
		boolean exportIndividualPurposeAppointment = ep.exportIndividualAppointment();
		Assert.assertEquals(exportIndividualPurposeAppointment, true,
				ANSI_RED + "Export Appointment  Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN
				+ "purpose dropdown  is clicked ,Export is  clicked and requested an appointment  are displayed "
				+ ANSI_RESET);		
		
		
		boolean ExportVerification = ep.exportpurposeIndividualdetails();
		Assert.assertEquals(ExportVerification, true,
				ANSI_RED + "Export Appointment details verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Export Appointment details  verified sucessfully" + ANSI_RESET);
		
	}
	
	

	@Test(priority = 4, description = "1. Add appointment is selected <br> 2. Health certificate for Exporting  is selected <br> 3. Created new Appointment for Health certificate for Exporting   for  Herd <br>  4. Booked an appointment for Exporting <br>5.Confirmation page elements is verified <br>6 Verified Appointment page whether new appointment created is listing on the page <br> 7.Clicked new appointment created and verified the details that is compared with the data given while creating")
	public void ExportPurposeTest() throws InterruptedException {
		ScheduleExportAppointmentPage ep = new ScheduleExportAppointmentPage(driver);
		boolean exportHerdPurposeAppointment = ep.exportHerdAppointment();
		Assert.assertEquals(exportHerdPurposeAppointment, true,
				ANSI_RED + "Export Appointment  Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN
				+ "purpose dropdown  is clicked ,Export is  clicked and requested an appointment  are displayed "
				+ ANSI_RESET);	
		
		boolean ExportVerification = ep.exportpurposeHerddetails();
		Assert.assertEquals(ExportVerification, true,
				ANSI_RED + "Export Appointment details verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Export Appointment details  verified sucessfully" + ANSI_RESET);
	}
	
	@AfterClass                                         // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
}


	
	

