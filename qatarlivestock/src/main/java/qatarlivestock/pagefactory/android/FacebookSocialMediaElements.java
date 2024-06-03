package qatarlivestock.pagefactory.android;

import java.util.Set;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import qatarlivestock.pagefactory.utils.AppiumUtils;

public class FacebookSocialMediaElements extends AndroidActions {

	AndroidDriver driver;
	AppiumUtils utils = new AppiumUtils();

	public FacebookSocialMediaElements(AndroidDriver driver)

	{

		super(driver);

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		// Pagefactory.initElements(driver,this);

	}

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement hambergerelmnt;	
	
	@AndroidFindBy(id = "twitterNavigation")
	private WebElement twitterBtn;
	
	@AndroidFindBy(id = "facebookNavigation")
	private WebElement facebookBtn;
	
	@AndroidFindBy(id = "linkedInNavigation")
	private WebElement linkedinBtn;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.view.ViewGroup/android.widget.TextView")
	private WebElement twitterTitle;	
	
	@AndroidFindBy(id = "url_field")
	private WebElement url;	
	
	public boolean openhambergermenu() 
	{ 
		if (hambergerelmnt.isDisplayed()){
			hambergerelmnt.click(); 
			return true;
		}
		else { 
			return false;
		}		
	}	
	
	public boolean verifyicons() 
	{ 
		if (twitterBtn.isDisplayed() && facebookBtn.isDisplayed() && linkedinBtn.isDisplayed()){
			
			return true;
		}
		else { 
			return false;
		}		
	}	
	
	public boolean clickTwitter() throws InterruptedException
	{	
		
		if (twitterBtn.isDisplayed())
		{
			twitterBtn.click();
			Thread.sleep(10000);
			Set<String> contexts = driver.getContextHandles();
			for (String contextName : contexts)
			{
				System.out.println(contextName);
			}
//			Thread.sleep(10000);
			driver.context("WEBVIEW_com.ust.qatarlivestock.qa");
			Thread.sleep(10000);
			
			//driver.navigate().back();
			
			//System.out.println(driver.getPageSource());
			
			if (driver.getCurrentUrl().equals("https://twitter.com/albaladiya/")) 
			{
				return true;
			} 
			else
			{
				return false; 
			}
			 
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickFacebook() throws InterruptedException
	{	
		
		if (facebookBtn.isDisplayed())
		{
			facebookBtn.click();
			Thread.sleep(10000);
			Set<String> contexts = driver.getContextHandles();
			for (String contextName : contexts)
			{
				System.out.println(contextName);
			}
			Thread.sleep(10000);
			driver.context("WEBVIEW_chrome");
			Thread.sleep(10000);
			
			if(driver.getCurrentUrl().equals("https://m.facebook.com/albaladiya")) 
			{ 
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public boolean clickLinkedin() throws InterruptedException
	{	
		
		if (linkedinBtn.isDisplayed())
		{
			linkedinBtn.click();
			Thread.sleep(10000);
			Set<String> contexts = driver.getContextHandles();
			for (String contextName : contexts)
			{
				System.out.println(contextName);
			}
//			Thread.sleep(10000);
			//driver.context("WEBVIEW_com.ust.qatarlivestock.qa");
			Thread.sleep(5000);
			
			//System.out.println(driver.getPageSource());
			/*
			 * if (driver.getCurrentUrl().equals("https://twitter.com/albaladiya/")) {
			 * return true; } else { return false; }
			 */
			driver.navigate().back();
			return false;
		}
		else
		{
			return true;
		}
	}
}
