package qatarlivestock.pagefactory.android;

import java.util.Set;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import qatarlivestock.pagefactory.utils.AppiumUtils;

public class LinkedinSocialMediaElements extends AndroidActions {

	AndroidDriver driver;
	AppiumUtils utils = new AppiumUtils();

	public LinkedinSocialMediaElements(AndroidDriver driver)

	{

		super(driver);

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		// Pagefactory.initElements(driver,this);

	}

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement hambergerelmnt;	
		
	@AndroidFindBy(id = "linkedInNavigation")
	private WebElement linkedinBtn;
	
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
			
			Thread.sleep(10000);
			
			driver.context("WEBVIEW_com.ust.qatarlivestock.qa");
			
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(10000);
			
			if (driver.getCurrentUrl().equals("https://www.linkedin.com/company/ministry-of-environment-qatar/"))
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
