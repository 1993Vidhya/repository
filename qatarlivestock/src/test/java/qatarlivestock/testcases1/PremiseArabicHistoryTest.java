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

public class PremiseArabicHistoryTest extends BaseTest{
	
	Class<PremiseArabicHistoryTest> classNameInstance = PremiseArabicHistoryTest.class;
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
	public void PremisePageTest() throws InterruptedException {

		System.out.println(ANSI_PURPLE + "Premise History Page Test" + ANSI_RESET);

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

		
		boolean LogoutArabicPageVerification = lp.hamburgerverification();
		Assert.assertEquals(LogoutArabicPageVerification, true, ANSI_RED + "Hamberger page Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Hamberger  page is verified successfully" + ANSI_RESET);

		boolean LogoutArabicPageLanguagechangeVerification = lp.HamburgerLanguageChangeverification();
		Assert.assertEquals(LogoutArabicPageLanguagechangeVerification, true,
				ANSI_RED + "Language change Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Language change is verified successfully" + ANSI_RESET);
		
		boolean PremiseModuleVerification = pp.ClickPremiseModule();
		Assert.assertEquals(PremiseModuleVerification, true,
				ANSI_RED + "Premise module verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Premise Details Title is displayed , hence verified" + ANSI_RESET);			
		}
	
	@Test(priority = 2, description="1.Verified Premise Visit history icon" )
	public void PremiseIconsverificationTest() throws InterruptedException
	{		
	PremiseArabicPage pp = new PremiseArabicPage(driver);
	boolean PremiseHistoryIconsverification = pp.premiseHistoryIcon();
	Assert.assertEquals(PremiseHistoryIconsverification, true,
			ANSI_RED + "Premise history Icons in the premise page verification failed" + ANSI_RESET);
	System.out.println(ANSI_GREEN + "Premise History Icons in the premise page  is successfully verified" + ANSI_RESET);
}
	
	@Test(priority = 3, description="1.Verified Premise Visit history icon <br> 2.Clicked PremiseVisit history Icon and verified title <br> 3.back button in the History page is clicked <br> 4.verified premise Details title" )
	public void PremiseHistoryIconverificationTest() throws InterruptedException
	{		
	PremiseArabicPage pp = new PremiseArabicPage(driver);
	boolean PremiseHistoryIconsClickverification = pp.ClickpremiseHistoryIcon();
	Assert.assertEquals(PremiseHistoryIconsClickverification, true,
			ANSI_RED + "Premise history Icons in the premise page is clicked and verification failed" + ANSI_RESET);
	System.out.println(ANSI_GREEN + "Premise History Icons in the premise page is clicked successfully verified" + ANSI_RESET);
}
	
	
	@Test(priority = 4 ,description="1.clicked premise History Icon <br> 2. Verified by clicking premise History icon the Premise History page is displaying ")
	public void PremiseHistoryPageTest() throws InterruptedException {
		PremiseArabicPage pp = new PremiseArabicPage(driver);
		boolean Historyverification = pp.VerifyPremiseHistorypage();
		Assert.assertEquals(Historyverification, true, ANSI_RED + "History page validation failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Premise Visit History Title is displayed , hence verified" + ANSI_RESET);
	}
	
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
	
}

	

