package qatarlivestock.pagefactory.android1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;

public class LoginArabicPage extends AndroidActions {
	AndroidDriver driver;

	public LoginArabicPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(className = "android.widget.ImageView")
	public WebElement mmLogo;

	@AndroidFindBy(className = "android.widget.Button")
	private WebElement loginbtn;

@AndroidFindBy(xpath = ".//android.widget.Button[@text='ONLY THIS TIME']")
	private WebElement map;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='ALLOW']")
	private WebElement cal;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='ALLOW']")
	private WebElement phone;
	
	@AndroidFindBy(xpath = ".//android.widget.Button[@text='ALLOW']")
	private WebElement notificationss;

	
  /*@AndroidFindBy(xpath = ".//android.widget.Button[@text='Only this time']")
	private WebElement map;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Allow']")
	private WebElement cal;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Allow']")
	private WebElement phone;
	
	
@AndroidFindBy(xpath = ".//android.widget.Button[@text='Allow']")
private WebElement notificationss;
*/	
	
	
	//@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Animal Premises']")
	//private WebElement premisename;

	@AndroidFindBy(id = "premise_arrow")
	private WebElement premise_name_arrow;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise']")
	public WebElement premiseModule;

	//@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise Details']")
	//private WebElement PremiseDetailsTitle;

	//@AndroidFindBy(xpath = ".//android.widget.Button[@text='Allow']")
//	private WebElement notifications;
	
	public void LogoVerification() {
		if (mmLogo.isDisplayed()) {
			System.out.println("LivestockLogo is present");
		} else {
			System.out.println("LivestockLogo is not  present");
		}
		return;
	}

	public boolean LoginBtnValidation() throws InterruptedException {
		boolean val = false;
		if (loginbtn.isDisplayed()) {
			loginbtn.click();
			System.out.println("Login button is clicked successfully");
	/*	String ExpectedAnimalpremise = "Animal Premises";
	String premiseName = premisename.getText();
			if (premisename.isDisplayed() && premiseName.equalsIgnoreCase(ExpectedAnimalpremise)) {
				val = true;
			}*/
		}
		return val;
	}

	public void clickpremisename() {
//		if (premisename.isDisplayed()) {
			System.out.println("Animal premises is available ");
			premise_name_arrow.click();
			
			System.out.println("premise name is clicked");
		}
//	}

	public void clicknotifications() {
		map.click();
		phone.click();
		cal.click();
	    notificationss.click();
		System.out.println("Notifications are clicked & allowed successfully");
	}

}




