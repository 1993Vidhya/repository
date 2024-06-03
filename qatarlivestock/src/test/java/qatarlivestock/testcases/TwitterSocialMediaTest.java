package qatarlivestock.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android.TwitterSocialMediaElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class TwitterSocialMediaTest extends BaseTest {			
			
	Class<TwitterSocialMediaTest> classNameInstance = TwitterSocialMediaTest.class;
	
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
		
	//	SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		TwitterSocialMediaElements social = new TwitterSocialMediaElements(driver);
		
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
		
		mm.clickpremisename();
		mm.clicknotifications();
		Thread.sleep(5000);
		
		boolean hambrgr = social.openhambergermenu();
		Assert.assertEquals(hambrgr, true, "Hamberger menu is not opened");
		System.out.println("Hamberger menu is opened");	
		
	}
	
	
	  @Test(priority=2, description ="1.Verify twitter logo.<br>2.Verify twitter page opened")
	  public void TwitterVerification() throws InterruptedException 
	  { 
		  TwitterSocialMediaElements social = new TwitterSocialMediaElements(driver);
	  
		  boolean twitter = social.clickTwitter(); 
		  Assert.assertEquals(twitter, true,"Twitter is not opened"); 
		  System.out.println("Twitter is opened");
	  
	  }
	
	@AfterClass                                         // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
}




