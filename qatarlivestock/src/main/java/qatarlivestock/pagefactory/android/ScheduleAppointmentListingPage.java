package qatarlivestock.pagefactory.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ScheduleAppointmentListingPage extends AndroidActions 
{
	AndroidDriver driver;

	public ScheduleAppointmentListingPage(AndroidDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[@content-desc=\"Open\"]/android.widget.TextView")
	private WebElement OpenTag;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[@content-desc=\"Closed\"]/android.widget.TextView")
	private WebElement CloseTag;
	
	public Boolean tagVerification() {
		boolean val = false;
		if (OpenTag.isDisplayed() && CloseTag.isDisplayed()) {
				val = true;
				System.out.println("Open Tag and Close Tag is available");
			}
		
		return val;
	}
}
