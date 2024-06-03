package qatarlivestock.pagefactory.android1;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import qatarlivestock.pagefactory.utils.AppiumUtils;

public class ArabicLanguageSwitchElements extends AndroidActions {

	AndroidDriver driver;
	AppiumUtils utils = new AppiumUtils();

	public ArabicLanguageSwitchElements(AndroidDriver driver)

	{

		super(driver);

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		// Pagefactory.initElements(driver,this);

	}

	@AndroidFindBy(id = "languageSwitch") 
	private WebElement languageSwitchBtn;
	
	@AndroidFindBy(id = "design_menu_item_text") 
	private WebElement languageSwitchBtnText;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement hambergerelmnt;
	
	@AndroidFindBy(xpath = ".//android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView") 
	private WebElement associatedAnimalsText;

	public boolean switchLanguage() 
	{ 
		if (hambergerelmnt.isDisplayed()){
			hambergerelmnt.click(); 
			if (languageSwitchBtn.isDisplayed()) {
				languageSwitchBtn.click();
				utils.waitForElementToAppear(associatedAnimalsText, "text", "الحيوانات المرتبطة", driver);
				return true;
			} 
			else {
				//System.out.println("Premise name not displayed in hamburger menu"); 
				return false;
			} 
		} 
		else { 
			return false;
		}
		
	}	
}
