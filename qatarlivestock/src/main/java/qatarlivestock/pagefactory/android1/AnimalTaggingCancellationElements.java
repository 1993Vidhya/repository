package qatarlivestock.pagefactory.android1;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import qatarlivestock.pagefactory.utils.AppiumUtils;

 

public class AnimalTaggingCancellationElements extends AndroidActions{ 

	AndroidDriver driver;
	AppiumUtils utils = new AppiumUtils();

	public AnimalTaggingCancellationElements(AndroidDriver driver)

	{

		super(driver);

	    this.driver = driver;

	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	    //Pagefactory.initElements(driver,this);

	 }
	
	@AndroidFindBy(id="animalTaggingRequestFragment")
	private WebElement taggingModuleElementName;
	
	@AndroidFindBy(xpath =".//android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
	private WebElement taggingTitleText;
		
	@AndroidFindBy(xpath =".//androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat")
	private List<WebElement> taggingRequestBox;
		
	@AndroidFindBy(id ="status")
	private List<WebElement> status;
	
	@AndroidFindBy(id ="alertMessage")
	private WebElement alertMessage;
	
	@AndroidFindBy(id = "alertOkButton")
	private WebElement alertOkBtn;
	
	@AndroidFindBy(id = "alertCancelButton")
	private WebElement alertCancelBtn;
	
	@AndroidFindBy(id ="close")
	private WebElement closeBtn;
	
	@AndroidFindBy(id ="requestID")
	private List<WebElement> requestID;
	
	@AndroidFindBy(id ="tv_no_data_found")
	private WebElement noTaggingRequests;
	
	private List<String> swipeList = Arrays.asList("User Cancelled", "Scheduled", "Visited", "Associated");
	
	public boolean clicktaggingmodulebtn()

	{
		if(taggingModuleElementName.isDisplayed()) {
			taggingModuleElementName.click();
			//System.out.println("Clicked on request module button");
			return true;
		}
		else {
			//System.out.println("Not clicked on request module button");
			return false;
		}
	}
	
	public boolean taggingtitleverification()
    {        
        if (taggingTitleText.isDisplayed()
        		&& taggingTitleText.getText().equals("Tagging Requests"))
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
	
	public boolean canceltaggingrequests(String cancel) throws InterruptedException
	{
		try
		{
			if (noTaggingRequests.isDisplayed())
			{
				System.out.println("No tagging requests");
				return true;
			}
		}
		catch (Exception e)
		{
			
		}
		try
		{
			if (taggingRequestBox.size() > 0)
			{
				for (int i = 0; i < taggingRequestBox.size(); i++)
				{	
					if (swipeList.contains(status.get(i).getText()))
					{						
						System.out.println("cl");
						SwipeAction(status.get(i),"left");					
						Thread.sleep(1000);
						if (alertMessage.isDisplayed() && alertMessage.getText().equals("Request is under processing can’t cancel."))
						{
							alertOkBtn.click();
							continue;
						}
						else
						{
							return false;
						}
					}
							
					else if (status.get(i).getText().equals("Cancelled"))
					{ 
						SwipeAction(status.get(i), "left");
						Thread.sleep(1000);
						if (alertMessage.isDisplayed() && alertMessage.getText().equals("Request is already cancelled."))
						{
							alertOkBtn.click();
							continue;
						}
						else
						{
							return false;
						}
					}
					else if (status.get(i).getText().equals("Requested"))
					{
						SwipeAction(taggingRequestBox.get(i), "left");
						Thread.sleep(1000);
						if (alertMessage.isDisplayed() && alertMessage.getText().equals("Are you sure you want to cancel the tagging request ?"))
						{
							if (cancel.equals("Cancel"))
							{
								alertCancelBtn.click();
								if (status.get(i).getText().equals("Requested"))
								{
									continue;
								}
								else 
								{
									System.out.println("Request cancelled after clicking Cancel button");
									return false;
								}
							}
							else
							{
								alertOkBtn.click();
								Thread.sleep(4000);
								if (status.get(i).getText().equals("User Cancelled"))
								{
									continue;
								}
								else 
								{
									System.out.println("Unable to cancel request");
									return false;
								}
							}
						}
						else
						{
							return false;
						}
					}
				}
				return true;	
			}
		}
		catch (Exception e)
		{
			System.out.println("No details displayed");
			return false;
		}
		return false;
	}	
}	
	
        
	

 