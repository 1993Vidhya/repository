package qatarlivestock.pagefactory.android;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
 
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.PageFactory;
 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import qatarlivestock.pagefactory.utils.AppiumUtils;
 
public class SuccessfullLoginElements extends AndroidActions {
 
	AndroidDriver driver;
	AppiumUtils utils = new AppiumUtils();
 
	public SuccessfullLoginElements(AndroidDriver driver)
 
	{
 
		super(driver);
 
		this.driver = driver;
 
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
 
		// Pagefactory.initElements(driver,this);
 
	}
 
	@AndroidFindBy(id = "loginBtn")
	private WebElement loginbtn;
	
	@AndroidFindBy(xpath = "//*[@id=\"NASExchange\"]")
	private WebElement NASbtn;
 
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
 
	@AndroidFindBy(xpath = ".//android.widget.Button[@text='While using the app']")
	private WebElement deviceLocationPermissionAlways;
 
	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Allow']")
	private WebElement allowPermission;
 
	
	/*@AndroidFindBy(xpath = ".//android.widget.Button[@text='WHILE USING THE APP']")
	private WebElement deviceLocationPermissionAlways;
 
	@AndroidFindBy(xpath = ".//android.widget.Button[@text='ALLOW']")
	private WebElement allowPermission;
*/	
	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement hambergerelmnt;
	@AndroidFindBy(id = "closeNavigation")
	
	@AndroidFindBy(id = "closeNavigation")
	private WebElement hambergerclose;
	
	@AndroidFindBy(xpath = ".//android.view.View[@content-desc=\"NAS\"]")
	private WebElement NASExchange;

	@AndroidFindBy(xpath = ".//android.view.View[1]/android.view.View[1]/android.view.View[2]/android.widget.EditText")
	private WebElement username;
	
	@AndroidFindBy(xpath = ".//android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.EditText")	
	private WebElement Password;
	
	@AndroidFindBy(xpath = ".//android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.CheckBox")
	private WebElement captcha;
	
	@AndroidFindBy(xpath = ".//android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.Button")
	private WebElement continuebtn;
	
	@AndroidFindBy(id = "premise_location")
	private WebElement premiseLocation;
	List<String> newList = new ArrayList<>();
 
	int val = 0;
	int listval = 0;
 
	public boolean clickloginbtn() throws InterruptedException
 
	{
		utils.waitForElementToAppear(loginbtn, "text", "Login / Authenticate", driver);
		Thread.sleep(5000);
		if (loginbtn.isDisplayed() && loginbtn.getText().equals("Login / Authenticate")) 
		{
			loginbtn.click();
			try {
			try {			
			if (NASExchange.isDisplayed())
			{
				System.out.println("NAS IS  displayed");
				NASExchange.click();
				System.out.println("NAS is clicked");
				Thread.sleep(5000);			
				 username.sendKeys("sarikas1990@gmail.com");
				Password.sendKeys("Sep@2024");
				Thread.sleep(5000);
				captcha.click();	
				System.out.println("NAS authencition completed");
				Thread.sleep(10000);
				continuebtn.click();		
				System.out.println("NAS is clicked with username and password");
				}
				else
				{		
					System.out.println("NAS authencation username password not  displayed");
				}
			}
			catch(Exception e)
			{
				
			}

			try {
				if (loginbtn.isDisplayed())
				{
					System.out.println("NAS IS  displayed");
					NASExchange.click();
					System.out.println("NAS is clicked without username and password");
					Thread.sleep(10000);			
			}
			else
			{
				
			}
			}
				catch(Exception e)
				{
					
				}
			
			}
				catch(Exception e)
				{
					
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
	public boolean clicklocationpermissionwhileusingapp()
 
	{
		boolean val = false;
		if (deviceLocationPermissionAlways.isDisplayed()) {
			deviceLocationPermissionAlways.click();
			val = true;
		}		
		return val;
	}
 
	public boolean clickallowcallpermission()
 
	{
		boolean val = false;
		if (allowPermission.isDisplayed()) {
			allowPermission.click();
			val = true;
		}	
		return val;
	}
 
	
	public boolean checkpremisenameinhambrgr(String premiseName) throws InterruptedException 
	{ 
		if (hambergerelmnt.isDisplayed()){
			hambergerelmnt.click(); 
			Thread.sleep(2000);
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
		if (premisepagetitle.isDisplayed() && premisepagetitle.getText().equals("Animal Premises"))
        {
			return true;
        }
 
        else
        {
            return false;
        } 
	}
}