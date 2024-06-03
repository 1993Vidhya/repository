package qatarlivestock.testcases1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android1.LogoutArabicPage;
import qatarlivestock.pagefactory.android1.PremiseArabicPage;
import qatarlivestock.pagefactory.utils.BaseTest;


public class PremiseArabicRecordsTest  extends BaseTest{
	
	Class<PremiseArabicRecordsTest> classNameInstance = PremiseArabicRecordsTest.class;
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
	

	@Test(priority = 1 , description="1. Login is clicked <br> 2.Premise name is clicked <br> 3.Permissions are clicked <br> 4.Checked premises name <br>5. Premise Module is verified <br> 6.Premise Module is clicked ")
	public void PremiseArabicPageTest() throws InterruptedException {

		System.out.println(ANSI_PURPLE + "Premise Records Arabic Page Test" + ANSI_RESET);

		PremiseArabicPage pp = new PremiseArabicPage(driver);
		//SuccessfullLoginArabicElements login = new SuccessfullLoginArabicElements(driver);
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

		boolean PremiseModuleVerification = pp.ClickPremiseModule();
		Assert.assertEquals(PremiseModuleVerification, true,
				ANSI_RED + "Premise module verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Premise Details Title is displayed , hence verified" + ANSI_RESET);

			
		}
	
	@Test(priority = 2, description="1.Verified Premise Records icon  is present in the premise details page " )
	public void PremiseRecordsIconsverificationTest() throws InterruptedException
	{		
	PremiseArabicPage pp = new PremiseArabicPage(driver);
	boolean PremiseRecordsIconsverification = pp.PremiseRecordsIcons();
	Assert.assertEquals(PremiseRecordsIconsverification, true,
			ANSI_RED + "Premise Records Icons in the premise page verification failed" + ANSI_RESET);
	System.out.println(ANSI_GREEN + "Premise Records Icons in the premise page  is successfully verified" + ANSI_RESET);
}
	
	@Test(priority = 3, description="1.Verified Premise records  icon <br> Clicked Premise Records Icon <br>2.Verified  premise records title is displaying <br> 3.Back button in the Records  page is clicked <br>4. Verified premise  details title" )
	public void PremiseRecordsPageTest() throws InterruptedException {
		PremiseArabicPage pp = new PremiseArabicPage(driver);
		boolean PremiseRecordsPageverification = pp.VerifyPremiseRecordspage();
		Assert.assertEquals(PremiseRecordsPageverification, true,
				ANSI_RED + "Premise records page verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Premise records page is successfully verified" + ANSI_RESET);
	}
	
	@Test(priority = 4, description="1.Clicked premise records Icon <br> 2. Verified The page contains details of the documents" )
	public void PremiseRecordsPageDetailsTest() throws InterruptedException {
		PremiseArabicPage pp = new PremiseArabicPage(driver);		
		boolean PremiserecordsPageVerification = pp.VerifyclickPremiseRecordsPage();
		Assert.assertEquals(PremiserecordsPageVerification, true,
				ANSI_RED + "Premse Records page validation failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Premise Records page is successfully verified " + ANSI_RESET);
}
	
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
	
}
