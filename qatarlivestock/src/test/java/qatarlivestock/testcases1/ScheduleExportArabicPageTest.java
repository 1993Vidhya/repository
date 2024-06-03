package qatarlivestock.testcases1;

	import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android1.LogoutArabicPage;
import qatarlivestock.pagefactory.android1.ScheduleExportArabicPage;
import qatarlivestock.pagefactory.utils.BaseTest;


	public class  ScheduleExportArabicPageTest extends BaseTest {
		
		Class<ScheduleExportArabicPageTest> classNameInstance = ScheduleExportArabicPageTest.class;
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
			public void ScheduleExportArabicTest() throws InterruptedException {
			
			

			System.out.println(ANSI_PURPLE + "Schedule Export Appointment Page Test" + ANSI_RESET);

			SuccessfullLoginElements login = new SuccessfullLoginElements(driver); 
			 ScheduleExportArabicPage ep=new  ScheduleExportArabicPage(driver);
			LogoutArabicPage lp = new LogoutArabicPage(driver);
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
			
			
			boolean LogoutPageArabicLanguagechangeVerification = lp.HamburgerLanguageChangeverification();
			Assert.assertEquals(LogoutPageArabicLanguagechangeVerification, true, ANSI_RED + "Language change Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Language change is verified successfully" + ANSI_RESET);
			
			boolean AppointmentArabicModuleVerification = ep.AppointmentModuleVerify();
			Assert.assertEquals(AppointmentArabicModuleVerification, true,
					ANSI_RED + "Appointment Module  Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Appointment Module  is verified successfully, Appointment title is displayed "
					+ ANSI_RESET);

			boolean AddArabicAppointmentVerification = ep.AddAppointmentVerification();
			Assert.assertEquals(AddArabicAppointmentVerification, true,
					ANSI_RED + "Add Appointment Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Add Appointment button is clicked ,schedule Appointment title is displayed "
					+ ANSI_RESET);
			}
			
			
		@Test(priority = 2, description="1. Add appointment is selected <br> 2. Exporting  is selected <br> 3.Verified the page elements while selecting Exporting from the list")
			public void ScheduleappointmentExportArabicPageTest() throws InterruptedException {
			ScheduleExportArabicPage ep = new ScheduleExportArabicPage(driver);
			boolean exportArabicPurposeValidation = ep.exportpurposeValidation();
			Assert.assertEquals(exportArabicPurposeValidation, true, ANSI_RED + "Export  Verification failed" + ANSI_RESET);
			System.out.println(
					ANSI_GREEN + "purpose dropdown  is clicked ,Export is  clicked and fields are displayed " + ANSI_RESET);
					
			}

			
			
			@Test(priority = 3 , description="1. Add appointment is selected <br> 2. Exporting is selected <br> 3. Created new Appointment for Health certificate for Exporting   for Individual  <br>  4. Booked an appointment for Health certificate for Exporting  <br>5.Confirmation page elements is verified <br>6 Verified Appointment page whether new appointment created is listing on the page <br> 7.Clicked new appointment created and verified the details that is compared with the data given while creating")
			public void ScheduleExportPurposeAppointmentTest() throws InterruptedException {				
				ScheduleExportArabicPage ep = new ScheduleExportArabicPage(driver);				
			boolean exportArabicIndividualPurposeAppointment = ep.exportIndividualAppointment();
			Assert.assertEquals(exportArabicIndividualPurposeAppointment, true,
					ANSI_RED + "Export Appointment  Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN
					+ "purpose dropdown  is clicked ,Export is  clicked and requested an appointment  are displayed "
					+ ANSI_RESET);
			
			
			boolean ExportArabicIndividulaAnimalSVerification = ep.exportpurposeIndividualdetails();
			Assert.assertEquals(ExportArabicIndividulaAnimalSVerification, true,
					ANSI_RED + "Export Appointment details verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Export Appointment details  verified sucessfully" + ANSI_RESET);
			}
	
		
			@Test(priority = 4 , description="1. Add appointment is selected <br> 2. Health certificate for Exporting  is selected <br> 3. Created new Appointment for Health certificate for Exporting   for  Herd <br>  4. Booked an appointment for Exporting <br>5.Confirmation page elements is verified <br>6 Verified Appointment page whether new appointment created is listing on the page <br> 7.Clicked new appointment created and verified the details that is compared with the data given while creating")
			public void ExportArabicPurposeDetails() throws InterruptedException {
				ScheduleExportArabicPage ep = new ScheduleExportArabicPage (driver);
				boolean exportHerdArabicPurposeAppointment = ep.exportHerdAppointment();
			Assert.assertEquals(exportHerdArabicPurposeAppointment , true,
					ANSI_RED + "Export Appointment  Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN
					+ "purpose dropdown  is clicked ,Export is  clicked and requested an appointment  are displayed "
					+ ANSI_RESET);
			
			boolean ExportArabicHerdVerification = ep.exportpurposeHerddetails();
			Assert.assertEquals(ExportArabicHerdVerification, true,
					ANSI_RED + "Export Appointment details verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Export Appointment details  verified sucessfully" + ANSI_RESET);
			}
			
			@AfterClass                                        // annotated method placed in the beginning.  
			public void after_test()  
			{  
				System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
			}  
			
		}



