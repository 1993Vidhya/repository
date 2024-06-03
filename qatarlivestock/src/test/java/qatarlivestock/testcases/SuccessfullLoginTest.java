package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.SuccessfullLoginElements;


import qatarlivestock.pagefactory.utils.BaseTest;

public class SuccessfullLoginTest extends BaseTest{
		
	Class<SuccessfullLoginTest> classNameInstance = SuccessfullLoginTest.class;
	String className = classNameInstance.getSimpleName();
				
	String premisename = prop.getProperty("premiseName"); 
	String premiseid = prop.getProperty("premiseId");
	String usernameNAS = prop.getProperty("email"); 
	String passwordNAS = prop.getProperty("password");
	
	@BeforeClass                                             // annotated method placed in the beginning.  
	public void before_test()  
	{  
		System.out.println("\n\033[1m"+className+" started executing\033[0m\n"); 
	}  
	
	@Test(priority=1, description = "1.Verify livestock logo on the home screen. <br>2.Click login button. ")
	public void LogoVerification() throws InterruptedException
	{
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
			
		boolean logo = login.logoverification();
		Assert.assertEquals(logo, true,"Livestock logo not displayed");
		System.out.println("Livestock logo is displayed in the page");
		
		boolean val1 = login.clickloginbtn();
		Assert.assertEquals(val1, true, "Login button is not displayed");
		System.out.println("Login button is clicked");
		
		int result = login.clickpremisename(premisename, premiseid);
		Assert.assertEquals(result, 1 , "Premise name is not found");
		System.out.println(premisename + " with id "+ premiseid +" is clicked");
	}
	
	@Test(priority=2, description = "1.Verify the ministry of municipality logo. <br>2.Verify home icon")
	public void MinistryLogoVerification() throws InterruptedException
	{
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		
		boolean ministry = login.ministrylogoverification();
		Assert.assertEquals(ministry, true,"Ministry of municipality logo not displayed");
		System.out.println("Ministry of municipality logo is displayed in the page");
		
		boolean home = login.homeimageverification();
		Assert.assertEquals(home, true,"Home image not displayed");
		System.out.println("Home image is displayed in the page");
	}
	
	
	@Test(priority=3, description = "1.Verify animal premise page title. <br>2.Verify if any duplicate premise ID's are present. <br>3.Verify all premises listed have premise icon, premise name, premise ID, and arrow button.")
	public void PremiseVerification() throws InterruptedException
	{
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		
		boolean title = login.premisetitleverification();
		Assert.assertEquals(title, true,"Premise page title is not displayed in the page");
		System.out.println("Premise page title is displayed in the page");
			
		boolean duplicateid = login.checkpremiseid();
		Assert.assertEquals(duplicateid, true, "Multiple premise names with same premise id exist");
		System.out.println("No premise id duplicates found");
			
		boolean premisedetails = login.checkpremisedetails();
		Assert.assertEquals(premisedetails, true, "All premise names do not have image and arrow");
		System.out.println("All premise names have image and arrow");
	}
		
	@Test(priority=4, description = "1.Click the premise with premise ID that user has entered. <br>2.Accept location permission, call permission, calender and notifications permission.")
	public void ClickPremiseName() throws InterruptedException
	{
		String premisename = prop.getProperty("premiseName"); 
		String premiseid = prop.getProperty("premiseId");
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		
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
	}
		
/*	@Test(priority=5, description = "1.Verify the premise opened is the same from the hamberger menu.")
	public void VerifyPremiseName() throws InterruptedException
	{
		String premisename = prop.getProperty("premiseName"); 
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		
		boolean hambrgr = login.checkpremisenameinhambrgr(premisename);
		Assert.assertEquals(hambrgr, true, "The premise name in hamburger menu is wrong");
		System.out.println("Premise names match");
		
	}	
*/	
	@AfterClass                                            // annotated method placed in the end.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
	
}

 