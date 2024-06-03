package qatarlivestock.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.LinkedinSocialMediaElements;
import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class LinkedinSocialMediaTest extends BaseTest {			
			
	Class<LinkedinSocialMediaTest> classNameInstance = LinkedinSocialMediaTest.class;
	
	String className = classNameInstance.getSimpleName();
	
	@BeforeClass                                             // annotated method placed in the beginning.  
	public void before_test()  
	{  
		System.out.println("\n\033[1m"+className+" started executing\033[0m\n"); 
	}  
	
	@Test(priority=1, description = "1.Verify livestock homepage logo.<br>2.Click login button.<br>3.Click premise name.<br>"
			+ "4.Allow location permission, call permission, calender and notifications permissions.<br>5.Verify the premise opened is the same from the hamberger menu.")
	public void Login() throws Exception
	{
		
		LinkedinSocialMediaElements social = new LinkedinSocialMediaElements(driver);		
		
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
		
		boolean hambrgr = social.openhambergermenu();
		Assert.assertEquals(hambrgr, true, "Hamberger menu is not opened");
		System.out.println("Hamberger menu is opened");	
		
	}
	
	
	@Test(priority=2, description ="1.Verify Linkedin logo.<br>2.Verify Linkedin page opened")
	public void LinkedinVerification() throws InterruptedException 
	{ 
		LinkedinSocialMediaElements social = new LinkedinSocialMediaElements(driver);
	  
		boolean linkedin = social.clickLinkedin(); 
		Assert.assertEquals(linkedin, true,"Linkedin is not opened"); 
		System.out.println("Linkedin is opened");
	  
	}
	
	@AfterClass                                         // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
}




