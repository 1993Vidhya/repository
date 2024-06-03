package qatarlivestock.pagefactory.android1;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.PageFactory;
 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import qatarlivestock.pagefactory.utils.AppiumUtils;
 
 
public class SuccessfullLoginArabicElements extends AndroidActions{
 
	AndroidDriver driver;
	AppiumUtils utils = new AppiumUtils();
 
	public SuccessfullLoginArabicElements(AndroidDriver driver)
 
	{
 
		super(driver);
 
	    this.driver = driver;
 
	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);
 
	    //Pagefactory.initElements(driver,this);
 
	 }
	@AndroidFindBy(id = "loginBtn")
	private WebElement loginbtn;
 
	@AndroidFindBy(id = "premise_arrow")
	private List<WebElement> premisearrow;
 
	@AndroidFindBy(xpath = ".//android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private List<WebElement> premisename;
	@AndroidFindBy(xpath = ".//android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[2]")
	private List<WebElement> premiseid;
 
	@AndroidFindBy(id = "livestock_logo")
	private WebElement livestocklogo;
	@AndroidFindBy(xpath = ".//android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
	private WebElement ministrylogo;
	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.TextView")
	private WebElement premisepagetitle;
	@AndroidFindBy(xpath = ".//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.ImageView[2]")
	private WebElement homeimage;
	@AndroidFindBy(id = "premise_icon")
	private List<WebElement> premiseicon;
 
	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement hambergerelmnt;
	@AndroidFindBy(id = "closeNavigation")
	private WebElement hambergerclose;
 
	@AndroidFindBy(id = "premise_location")
	private WebElement premiseLocation;
	@AndroidFindBy(id = "design_menu_item_text")
	private WebElement logoutBtnText;
	@AndroidFindBy(id = "logout")
	private WebElement logoutBtn;
	@AndroidFindBy(id = "alertMessage")
	private WebElement alertMsg;
	@AndroidFindBy(id = "alertOkButton")
	private WebElement alertMsgOK;
	List<String> newList = new ArrayList<>();
 
	int val = 0;
	int listval = 0;
 
	public boolean clickloginbtn(String email, String password) throws InterruptedException
 
	{
		utils.waitForElementToAppear(loginbtn, "text", "تسجيل الدخول / المصادقة", driver);
		if (loginbtn.isDisplayed() && loginbtn.getText().equals("تسجيل الدخول / المصادقة")) 
		{
			loginbtn.click();
			Thread.sleep(10000);
	/*		Set<String> contexts = driver.getContextHandles();
			for (String contextName : contexts)
			{
				System.out.println(contextName);
			}
			Thread.sleep(5000);
		driver.context("WEBVIEW_chrome");
		Thread.sleep(1000);
		*/
			if (driver.findElement(ById.id("NASExchange")).isDisplayed())
			{
				driver.findElement(ById.id("NASExchange")).click();
				Thread.sleep(10000);
				Set<String> contexts1 = driver.getContextHandles();
				for (String contextName : contexts1)
				{
					System.out.println(contextName);
				}
				if (contexts1.size()>1)
				{					
					driver.findElement(ById.id("username")).sendKeys(email);
					driver.findElement(ById.id("password")).sendKeys(password);
					driver.switchTo().frame(0);
					driver.findElement(ByXPath.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
					Thread.sleep(10000);
					driver.switchTo().defaultContent();
					driver.findElement(ByXPath.xpath("//*[@id=\"frm_mobileid_login\"]/div[1]/div[2]/div[5]/div/div/input")).click();
					Thread.sleep(5000);
					driver.context("NATIVE_APP");
				}
				else
				{
					driver.context("NATIVE_APP");
				}

				if (homeimage.isDisplayed())
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
		else
		{
			return false;
		}
	}
	public boolean logoverification()
 
	{
		if (livestocklogo.isDisplayed())
        {
			 return true;
        }
		else
        {
            return false;
        }
	}
 
	public int clickpremisename(String premiseName, String id)
 
	{
		if (premisename.size() == 0) {
			System.out.println("No premise names displayed");
			return val;
		} 
		else {
			for (int i = 0; i < premisename.size(); i++) {
				String premisenamefromarray = premisename.get(i).getText();
				String premiseidfromarray = premiseid.get(i).getText();
				if (premiseName.equalsIgnoreCase(premisenamefromarray) && id.equalsIgnoreCase(premiseidfromarray)) {
					premisename.get(i).click();					
					val = 1;					
					//System.out.println(premiseName + " with id "+ id +" is clicked");
					break;
				}
			}
		}
		return val;
	}
	public boolean checkpremisenameinhambrgr(String premiseName) 
	{ 
		if (hambergerelmnt.isDisplayed()){
			hambergerelmnt.click(); 
			if (premiseLocation.isDisplayed() && premiseLocation.getText().equalsIgnoreCase(premiseName)) {
				hambergerclose.click();
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
	public boolean logout() 
	{ 
		if (hambergerelmnt.isDisplayed()){
			hambergerelmnt.click(); 
			if (logoutBtn.isDisplayed()) {
				logoutBtn.click();
				if (alertMsg.isDisplayed() && alertMsg.getText().equals("هل أنت متأكد أنك تريد تسجيل الخروج؟"))
				{
					if (alertMsgOK.isDisplayed() && alertMsgOK.getText().equals("نعم"))
					{
						alertMsgOK.click(); 
						Boolean result = logoverification();
						if (result)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else {
						//System.out.println("Premise name not displayed in hamburger menu"); 
						return false;
					} 
				}
				else {
					//System.out.println("Premise name not displayed in hamburger menu"); 
					return false;
				} 
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
	public boolean checkpremiseid() 
	{ 
		if (premiseid.size() == 0) {
			System.out.println("No premise names displayed");
			return false;
		} 
		else {
			for (int i = 0; i < premiseid.size(); i++) {
				for (int j = i+1; j < premiseid.size(); j++) {
					if (premiseid.get(i).getText().equals(premiseid.get(j).getText()) && (newList.contains(premiseid.get(i).getText())) == false) {
						//System.out.println("Multiple premise with id " +premiseid.get(i).getText()+ "are found");
						newList.add(premiseid.get(i).getText());
					}
				}				
			}
			if(newList.size() == 0) {
				//System.out.println(newList.size());
				return true;
			}
			else {
				return false;
			}
		}
	}
	public boolean checkpremisedetails() 
	{ 
		if (premiseid.size() == 0) {
			System.out.println("No premise names displayed");
			return false;
		} 
		else {
			int idLength = premisearrow.size();
			int imageLength = premiseicon.size();
			if (idLength == imageLength && imageLength == premiseid.size()) {
				return true;
			}			
		}
		return true;
	}
	public boolean ministrylogoverification()
	{
		if (ministrylogo.isDisplayed())
        {
			return true;
        }
        else
        {
            return false;
        }           
	}
	public boolean homeimageverification()
	{
		if (homeimage.isDisplayed())
        {
			return true;
        }
        else
        {
            return false;
        }       
	}
	public boolean premisetitleverification()
 
	{
		if (premisepagetitle.isDisplayed() && premisepagetitle.getText().equals("المباني الحيوانية"))
        {
			return true;
        }
 
        else
        {
            return false;
        } 
	}
}	