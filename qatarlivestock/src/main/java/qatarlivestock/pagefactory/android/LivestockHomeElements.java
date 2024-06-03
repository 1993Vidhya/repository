package qatarlivestock.pagefactory.android;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions; 

public class LivestockHomeElements extends AndroidActions{ 

	AndroidDriver driver;

	public LivestockHomeElements(AndroidDriver driver)

	{

		super(driver);

	    this.driver = driver;

	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	    //Pagefactory.initElements(driver,this);

	}
	
		/*
		 * Properties prop = new Properties();
		 * 
		 * FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
		 * "//src//main//java//qatarlivestock//testdata//data.properties");
		 * 
		 * prop.load(fis);
		 */

	//String[] array1 = prop.getProperty("listofanimals").split(", ");
	
	@AndroidFindBy(id="sName")
	private List<WebElement> speciesnamehome;
	
	@AndroidFindBy(xpath=".//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
	private List<WebElement> speciesdetailsbox;
	
	@AndroidFindBy(xpath=".//android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement hambergerHello;
	
	@AndroidFindBy(id="premise_owner")
	private WebElement ownername;
	
	@AndroidFindBy(id="premise_owner_name")
	private WebElement ownernamehamberger;
	
	@AndroidFindBy(id="toolbar_Text")
	private WebElement speciesnameanimallisting;
	
	@AndroidFindBy(id="livestockFragment")
	private WebElement livestockmdlename;

	@AndroidFindBy(id ="navigation_bar_item_large_label_view")
	private WebElement livestocktextname;
	
	@AndroidFindBy(id="animalTaggingRequestFragment")
	private WebElement taggingmdlename;

	@AndroidFindBy(id="navigation_bar_item_small_label_view")
	private WebElement taggingtextname;
	
	@AndroidFindBy(id="appointmentFragment")
	private WebElement appointmentmdlename;

	@AndroidFindBy(xpath =".//android.widget.FrameLayout[@content-desc='Appointment']/android.view.ViewGroup/android.widget.TextView")
	private WebElement appointmenttextname;
	
	@AndroidFindBy(xpath=".//android.widget.FrameLayout[@content-desc='Premise']/android.widget.FrameLayout")
	private WebElement premisemdlename;

	@AndroidFindBy(xpath="//android.widget.FrameLayout[@content-desc='Premise']/android.view.ViewGroup/android.widget.TextView")
	private WebElement premisetextname;
	
	@AndroidFindBy(className ="android.widget.ImageButton")
	private WebElement hambergerelmnt;

	@AndroidFindBy(id ="settings")
	private WebElement settingselemnt;
	
	@AndroidFindBy(id="closeNavigation")
	private WebElement hambergerexpanded;

	@AndroidFindBy(className ="android.widget.ImageView")
	private WebElement qatarlivestockelemnt;
	
	@AndroidFindBy(id="owner_name")
	private WebElement ownernameelmnt;

	@AndroidFindBy(xpath =".//android.widget.TextView[@text='Associated Animals']")
	private WebElement associatedanimalelemnt;
	
	@AndroidFindBy(id ="animalImage")
	private List<WebElement> animalimageelmnt;
	
	@AndroidFindBy(xpath =".//android.widget.TextView[@text='Healthy']")
	private List<WebElement> healthytextelmnt;
	
	@AndroidFindBy(id ="tvhealthy")
	private List<WebElement> healthycountelmnt;
	
	@AndroidFindBy(xpath=".//android.widget.TextView[4]")
	private List<WebElement> unhealthytextelmnt;
	
	@AndroidFindBy(id="tvepidemic")
	private List<WebElement> unhealthycountelmnt;
	
	@AndroidFindBy(id ="tvCount")
	private List<WebElement> totalcountelemnt;	
	
	private List<String> list = Arrays.asList("Cattle", "Goat", "Sheep", "Camel");
	
	public boolean livestockmoduleverification()
    {
        if (livestockmdlename.isDisplayed() && livestocktextname.getText().equals("Livestock"))
        {
        	return true;
        }
        
        return false;
    }
	
	public boolean taggingmoduleverification()
    {
        if (taggingmdlename.isDisplayed() && taggingtextname.getText().equals("Tagging"))
        {
        	return true;
        }
        
        return false;
    }
	
	public boolean appointmentmoduleverification()
    {
        if (appointmentmdlename.isDisplayed() && appointmenttextname.getText().equals("Appointment"))
        {
        	return true;
        }
        
        return false;
    }
	
	public boolean premisemoduleverification()
    {
        if (premisemdlename.isDisplayed() && premisetextname.getText().equals("Premise"))
        {
        	return true;
        }
        
        return false;
    }
	
	public boolean hambergerdisplayed()
    {
        if (hambergerelmnt.isDisplayed())
        {
            hambergerelmnt.click();
			if (settingselemnt.isDisplayed()) 
			{
				//hambergerexpanded.click();
				return true;
			} 
			else {
				return false;
			} 
        }
        else
        {
        	return false;
        }
    }
	
	public boolean hambergerusername(String premiseownername)
	{
		if (hambergerHello.isDisplayed() && hambergerHello.getText().equals("Hello,")
				&& ownernamehamberger.isDisplayed() && ownernamehamberger.getText().equalsIgnoreCase(premiseownername))
		{
			hambergerexpanded.click();
			return true;
		}
		else {
			return false;				
		}		
	}
	
	public boolean qatarlivestocktitleverification()
    {
        if (qatarlivestockelemnt.isDisplayed())
        {
        	//System.out.println("Qatar Livestock title displayed");
        	return true;
        }
        else
        {
        	//System.out.println("Qatar Livestock title is not  displayed");
        	return true;
        }
    }
	
	public boolean ownernameverification(String premiseownername)

    {
		String name = "Hello, "+ premiseownername;
        if (ownernameelmnt.isDisplayed() && ownernameelmnt.getText().equalsIgnoreCase(name))
        {
        	//System.out.println("Owner name title displayed");
        	return true;
        }
        else
        {
        	//System.out.println("ownername name is not  displayed");
        	return false;
        }
    }
	
	public boolean associatedanimalverification()

    {
        if (associatedanimalelemnt.isDisplayed() && associatedanimalelemnt.getText().equals("Associated Animals"))
        {
            return true;
        }
        else
        {
        	//System.out.println("Associated animal text is not  displayed");
        	return false;
        }
    }
	
	public boolean speciesdetailsverification()
	
	{
		int val = 0;
		if (speciesdetailsbox.size() == 0) {
			System.out.println("No associated animals displayed");
			return false;
		} 
		else {
			for (int i = 0; i < speciesdetailsbox.size(); i++) 
			{
				if (animalimageelmnt.get(i).isDisplayed() 
						&& speciesnamehome.get(i).isDisplayed() 
						&& list.contains(speciesnamehome.get(i).getText())
						&& healthytextelmnt.get(i).isDisplayed() 
						&& healthytextelmnt.get(i).getText().equals("Healthy")
						&& healthycountelmnt.get(i).isDisplayed()
						&& unhealthytextelmnt.get(i).isDisplayed() 
						&& unhealthytextelmnt.get(i).getText().equals("Unhealthy")
						&& unhealthycountelmnt.get(i).isDisplayed()
						&& totalcountelemnt.get(i).isDisplayed())
				{					
					val = i+1;
					continue;
				}
			}
			if (val == speciesdetailsbox.size()) {
				return true;
			}
			return false;
		}
	}
}	
	
        
	

 