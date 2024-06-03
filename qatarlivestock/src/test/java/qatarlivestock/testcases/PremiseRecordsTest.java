package qatarlivestock.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.PremisePage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class PremiseRecordsTest  extends BaseTest{
	
	Class<PremiseRecordsTest> classNameInstance = PremiseRecordsTest.class;
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

		System.out.println(ANSI_PURPLE + "Premise Records Page Test" + ANSI_RESET);

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
	
	@Test(priority = 2, description="1.Verified Premise Records icon  is present in the premise details page " )
	public void PremiseRecordsIconsverificationTest() throws InterruptedException
	{		
	PremisePage pp = new PremisePage(driver);
	boolean PremiseRecordsIconsverification = pp.PremiseRecordsIcons();
	Assert.assertEquals(PremiseRecordsIconsverification, true,
			ANSI_RED + "Premise Records Icons in the premise page verification failed" + ANSI_RESET);
	System.out.println(ANSI_GREEN + "Premise Records Icons in the premise page  is successfully verified" + ANSI_RESET);
}
	
	@Test(priority = 3, description="1.Verified Premise records  icon <br> Clicked Premise Records Icon <br>2.Verified  premise records title is displaying <br> 3.Back button in the Records  page is clicked <br>4. Verified premise  details title" )
	public void PremiseRecordsIconverificationTest() throws InterruptedException
	{		
	PremisePage pp = new PremisePage(driver);
	boolean PremiseRecordsPageIconsClickverification = pp.ClickpremiseRecordsIcon();
	Assert.assertEquals(PremiseRecordsPageIconsClickverification, true,
			ANSI_RED + "Premise Records Page s in the premise page is clicked and verification failed" + ANSI_RESET);
	System.out.println(ANSI_GREEN + "Premise Records Page Icons in the premise page is clicked successfully verified" + ANSI_RESET);
}
	
	@Test(priority = 4, description="1.Clicked premise records Icon <br> 2. Verified The page contains details of the documents" )
	public void PremiseRecordsPageDetailsTest() throws InterruptedException {
		PremisePage pp = new PremisePage(driver);		
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
