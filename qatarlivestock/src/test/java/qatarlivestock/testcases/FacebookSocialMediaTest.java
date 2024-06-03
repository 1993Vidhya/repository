package qatarlivestock.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.FacebookSocialMediaElements;
import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class FacebookSocialMediaTest extends BaseTest{			
			
	Class<FacebookSocialMediaTest> classNameInstance = FacebookSocialMediaTest.class;
	
	String className = classNameInstance.getSimpleName();
	
	@BeforeClass                                             // annotated method placed in the beginning.  
	public void before_test()  
	{  
		System.out.println("\n\033[1m"+className+" started executing\033[0m\n"); 
	}  
	
	@Test(priority=1, description = "1.Verify livestock homepage logo.<br>2.Click login button.<br>3.Click premise name.<br>"
			+ "4.Allow location permission, call permission, calender and notifications permissions.<br>5.Verify the premise opened is the same from the hamberger menu.<br>"
			+ "6.Verify Facebook, LinkedIn and Twitter logos.")
	public void Login() throws InterruptedException
	{
		
	  SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		FacebookSocialMediaElements social = new FacebookSocialMediaElements(driver);
		
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
				
		
		boolean hambrgr = social.openhambergermenu();
		Assert.assertEquals(hambrgr, true, "Hamberger menu is not opened");
		System.out.println("Hamberger menu is opened");	
		
		boolean icons = social.verifyicons();
		Assert.assertEquals(icons, true, "Facebook, Twitter and LinkedIn icons not verified");
		System.out.println("Facebook, Twitter and LinkedIn icons verified");	
	}
	
	
	  @Test(priority=2, description = "1.Verify facebook logo.<br>2.Verify facebook page opened") 
	  public void FacebookVerification() throws InterruptedException 
	  {
		  FacebookSocialMediaElements social = new FacebookSocialMediaElements(driver);
		  boolean twitter = social.clickFacebook(); 
		  Assert.assertEquals(twitter, true,"Facebook is not opened"); 
		  System.out.println("Facebook is opened");
	  
	  }
	 
		/*
		 * @Test(priority=3, description =
		 * "1.Verified twitter logo.<br>2.Verified twitter page opened") public void
		 * TwitterVerification() throws InterruptedException { SocialMediaElements
		 * social = new SocialMediaElements(driver);
		 * 
		 * boolean twitter = social.clickTwitter(); Assert.assertEquals(twitter, true,
		 * "Twitter is not opened"); System.out.println("Twitter is opened");
		 * 
		 * }
		 */
	
	/*
	 * @Test(priority=4, description =
	 * "1.Verified linkedIn logo.<br>2.Verified linkedIn page opened") public void
	 * LinkedinVerification() throws InterruptedException { SocialMediaElements
	 * social = new SocialMediaElements(driver);
	 * 
	 * boolean linkedin = social.clickLinkedin(); Assert.assertEquals(linkedin,
	 * true, "LinkedIn is not opened"); System.out.println("LinkedIn is opened");
	 * 
	 * }
	 */
	
	@AfterClass                                         // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
}




