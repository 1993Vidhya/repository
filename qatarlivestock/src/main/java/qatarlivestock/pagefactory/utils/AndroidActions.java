package qatarlivestock.pagefactory.utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class AndroidActions extends AppiumUtils
{
public AndroidDriver driver;

	

	public AndroidActions(AndroidDriver driver)

	{

		//super(driver);

		this.driver = driver;

	}
	
 

	public void LongPressAction(WebElement ele) {

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", 

				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(),

			    "duration",2000));

 	}

 

	public void scrollToText(String text)

	{

		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));

	}
	
	@SuppressWarnings({ "rawtypes", "deprecation" })
	public void scroll(int startx, int starty, int endx, int endy) 
	{

	    TouchAction touchAction = new TouchAction(driver);

	    touchAction.longPress(PointOption.point(startx, starty))
	               .moveTo(PointOption.point(endx, endy))
	               .release()
	               .perform();

	} 

	public void ScrollToEndAction() {

		boolean canScrollMore;

		do

		{

		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(

		    "left", 100, "top", 100, "width", 200, "height", 200,

		    "direction", "down",

		    "percent", 3.0

		  ));

		}while(canScrollMore);

	}

 

	public void SwipeAction(WebElement ele, String direction) {

 

		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of

				("elementId", ((RemoteWebElement) ele).getId(),

			    "direction", direction,

			    "percent", 0.75

			));

	}	
 
}
