package qatarlivestock.testcases1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android1.LogoutArabicPage;
import qatarlivestock.pagefactory.android1.ScheduleAppointmentArabicPage;
import qatarlivestock.pagefactory.utils.BaseTest;


public class ScheduleAppointmentArabicTest extends BaseTest {
	
	Class<ScheduleAppointmentArabicPage> classNameInstance = ScheduleAppointmentArabicPage.class;
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
	public void SchedulePageTest() throws InterruptedException {
		Thread.sleep(5000);		

		System.out.println(ANSI_PURPLE + "Schedule Appointment  Arabic Page Test" + ANSI_RESET);

	//	SuccessfullLoginArabicElements login = new SuccessfullLoginArabicElements(driver);
		ScheduleAppointmentArabicPage sp = new ScheduleAppointmentArabicPage(driver);
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

		
		boolean LogoutPageVerification = lp.hamburgerverification();
		Assert.assertEquals(LogoutPageVerification, true, ANSI_RED + "Logoutpage Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Logout page is verified successfully" + ANSI_RESET);
		
		
		boolean LogoutPageLanguagechangeVerification = lp.HamburgerLanguageChangeverification();
		Assert.assertEquals(LogoutPageLanguagechangeVerification, true, ANSI_RED + "Language change Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Language change is verified successfully" + ANSI_RESET);

		boolean AppointmentModuleVerification = sp.AppointmentModuleVerify();
		Assert.assertEquals(AppointmentModuleVerification, true,
				ANSI_RED + "Appointment Module  Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Appointment Module  is verified successfully, Appointment title is displayed "
				+ ANSI_RESET);

		boolean AddAppointmentVerification = sp.AddAppointmentVerification();
		Assert.assertEquals(AddAppointmentVerification, true,
				ANSI_RED + "Add Appointment Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Add Appointment button is clicked ,schedule Appointment title is displayed "
				+ ANSI_RESET);
	}

	@Test(priority = 2 , description="1. Add appointment is selected <br> 2. Breeding is selected <br> 3. Created new Appointment for Breeding  for Individual and Herd <br>  4. Booked an appointment for Breeding <br>5.Confirmation page elements is verified <br>6 Verified Appointment page whether new appointment created is listing on the page <br> 7.Clicked new appointment created and verified the details that is compared with the data given while creating")
	public void ScheduleArabicBreedingAppointmentTest() throws InterruptedException {
		ScheduleAppointmentArabicPage sp = new ScheduleAppointmentArabicPage(driver);

		boolean breedingArabicIndividualVerification = sp.BreedingIndividualVerification();
		Assert.assertEquals(breedingArabicIndividualVerification, true,
				ANSI_RED + "Breeding Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN
				+ "purposedropdown is clicked, breeding is selected and verified fields successfully if individual animal is selected "
				+ ANSI_RESET);

		boolean breedingArabicHerdVerification = sp.BreedingHerdVerification();
		Assert.assertEquals(breedingArabicHerdVerification, true, ANSI_RED + "Breeding Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN
				+ "purposedropdown is clicked, breeding is selected and verified fields successfully if herd is selected "
				+ ANSI_RESET);
	}

	@Test(priority = 3 , description="1. Add appointment is selected <br> 2. Pestcontrol  is selected <br> 3. Created new Appointment for pestControl  for Individual and Herd <br>  4. Booked an appointment for pestcontrol <br>5.Confirmation page elements is verified <br>6 Verified Appointment page whether new appointment created is listing on the page <br> 7.Clicked new appointment created and verified the details that is compared with the data given while creating")
	public void ScheduleArabicPestControlAppointmentTest() throws InterruptedException {
		ScheduleAppointmentArabicPage sp = new ScheduleAppointmentArabicPage(driver);
		boolean pestcontrolArabicIndividualVerification = sp.pestControlIndividualVerification();
		Assert.assertEquals(pestcontrolArabicIndividualVerification, true,
				ANSI_RED + "Add Appointment Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN
				+ "purposedropdown is clicked, pestcontrol is selected and verified fields successfully if individual animal is selected"
				+ ANSI_RESET);

		boolean pestcontrolArabicHerdVerification = sp.pestControlHerdVerification();
		Assert.assertEquals(pestcontrolArabicHerdVerification, true,
				ANSI_RED + "Add Appointment Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN
				+ "purposedropdown is clicked, pestcontrol is selected and verified fields successfully if herd is selected  "
				+ ANSI_RESET);
	}

	
	@Test(priority= 4, description="1. Add appointment is selected <br> 2. Vaccination  is selected <br> 3. Created new Appointment for Vaccination  for Individual and Herd <br>  4. Booked an appointment for Vaccination <br>5.Confirmation page elements is verified <br>6 Verified Appointment page whether new appointment created is listing on the page <br> 7.Clicked new appointment created and verified the details that is compared with the data given while creating")
	public void ScheduleVaccinationArabicAppointmentPageTest() throws InterruptedException {
		ScheduleAppointmentArabicPage sp = new ScheduleAppointmentArabicPage(driver);
		boolean vaccinationArabicIndividualVerification = sp.VaccinationIndividualVerification();
		Assert.assertEquals(vaccinationArabicIndividualVerification, true,
				ANSI_RED + "Add Appointment Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN
				+ "purposedropdown is clicked, Vaccination is selected and verified fields successfully if individual animal is selected"
				+ ANSI_RESET);

		boolean vaccinationArabicHerdVerification = sp.VaccinationHerdVerification();
		Assert.assertEquals(vaccinationArabicHerdVerification, true,
				ANSI_RED + "Add Appointment Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN
				+ "purposedropdown is clicked, Vaccination is selected and verified fields successfully if herd is selected "
				+ ANSI_RESET);
	}

	
	@Test(priority= 5, description="1. Add appointment is selected <br> 2. Doctor- Farm visit  is selected <br> 3. Created new Appointment for  Doctor- Farm visit   <br>  4. Booked an appointment for Doctor farm visit <br>5.Confirmation page elements is verified <br>6 Verified Appointment page whether new appointment created is listing on the page <br> 7.Clicked new appointment created and verified the details that is compared with the data given while creating")
		public void ScheduleArabicFarmVisitAppointmentTest() throws InterruptedException {
		ScheduleAppointmentArabicPage sp = new ScheduleAppointmentArabicPage(driver);
		boolean farmVisitArabicVerification = sp.FarmVisitValidation();
		Assert.assertEquals(farmVisitArabicVerification, true, ANSI_RED + "Farm visit Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "purpose dropdown  is clicked ,Farm visitis clicked and fields are displayed "
				+ ANSI_RESET);
	}
	
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
		

}
