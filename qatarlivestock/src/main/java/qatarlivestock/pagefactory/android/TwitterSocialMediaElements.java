package qatarlivestock.pagefactory.android;

import java.util.Set;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import qatarlivestock.pagefactory.utils.AppiumUtils;

public class TwitterSocialMediaElements extends AndroidActions {

	AndroidDriver driver;
	AppiumUtils utils = new AppiumUtils();

	public TwitterSocialMediaElements(AndroidDriver driver)

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
			
			Thread.sleep(10000);
			driver.context("WEBVIEW_com.ust.qatarlivestock.qa");
			Thread.sleep(10000);
			
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
			return false;
		}
	}
}
