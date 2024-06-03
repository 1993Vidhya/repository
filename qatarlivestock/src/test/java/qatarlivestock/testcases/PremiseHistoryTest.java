package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.PremisePage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;
public class PremiseHistoryTest extends BaseTest{
	
	Class<PremiseHistoryTest> classNameInstance = PremiseHistoryTest.class;
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
	public void PremisePageTest() throws Exception {

		System.out.println(ANSI_PURPLE + "Premise History Page Test" + ANSI_RESET);

		PremisePage pp = new PremisePage(driver);		
		
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
		
		boolean PremiseModuleVerification = pp.ClickPremiseModule();
		Assert.assertEquals(PremiseModuleVerification, true,
				ANSI_RED + "Premise module verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Premise Details Title is displayed , hence verified" + ANSI_RESET);			
		}
	
	@Test(priority = 2, description="1.Verified Premise Visit history icon" )
	public void PremiseIconsverificationTest() throws InterruptedException
	{		
	PremisePage pp = new PremisePage(driver);
	boolean PremiseHistoryIconsverification = pp.premiseHistoryIcon();
	Assert.assertEquals(PremiseHistoryIconsverification, true,
			ANSI_RED + "Premise history Icons in the premise page verification failed" + ANSI_RESET);
	System.out.println(ANSI_GREEN + "Premise History Icons in the premise page  is successfully verified" + ANSI_RESET);
}
	
	@Test(priority = 3, description="1.Verified Premise Visit history icon <br> 2.Clicked PremiseVisit history Icon and verified title <br> 3.back button in the History page is clicked <br> 4.verified premise Details title" )
	public void PremiseHistoryIconverificationTest() throws InterruptedException
	{		
	PremisePage pp = new PremisePage(driver);
	boolean PremiseHistoryIconsClickverification = pp.ClickpremiseHistoryIcon();
	Assert.assertEquals(PremiseHistoryIconsClickverification, true,
			ANSI_RED + "Premise history Icons in the premise page is clicked and verification failed" + ANSI_RESET);
	System.out.println(ANSI_GREEN + "Premise History Icons in the premise page is clicked successfully verified" + ANSI_RESET);
}
	
	
	@Test(priority = 4 ,description="1.clicked premise History Icon <br> 2. Verified by clicking premise History icon the Premise History page is displaying ")
	public void PremiseHistoryPageTest() throws InterruptedException {
		PremisePage pp = new PremisePage(driver);
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
