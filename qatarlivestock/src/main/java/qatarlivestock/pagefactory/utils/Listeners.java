package qatarlivestock.pagefactory.utils;
 
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
 

import io.appium.java_client.android.AndroidDriver;
 
//import io.appium.java_client.ios.IOSDriver;
 
public class Listeners extends AppiumUtils implements ITestListener {
	
	ExtentReports extent = ExtentReporterNG.getReporterObject();
	ExtentTest test;
	AndroidDriver driver;
	
	@Override
	public void onTestStart(ITestResult result)
	{
		test = extent.createTest(result.getMethod().getMethodName());
		test.info(result.getMethod().getDescription());
	}
 
	@Override
	public void onTestSuccess(ITestResult result)
	{
		test.log(Status.PASS,"Test Passed");
		
	}
 
	@Override
	public void onTestFailure(ITestResult result)
	{
		test.fail(result.getThrowable());
		
		try {
			driver = (AndroidDriver) result.getTestClass().getRealClass().getField("driver")
					.get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			test.addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	@Override
	public void onTestSkipped(ITestResult result)
	{
		
	}
 
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
 
	@Override
	public void onStart(ITestContext context)
	{
		
	}
	
	@Override
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
 

 
public double formattedAmount(String amount)
    {
        Double price = Double.parseDouble(amount.substring(1));
        return price;
    }
 
    public void waitForElementToAppear(WebElement ele, String attr, String val, AndroidDriver driver)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
 
        wait.until(ExpectedConditions.attributeContains((ele), attr, val));
    }
    
    public void waitForElementToClick(WebElement ele, AndroidDriver driver)
    {
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
    	
    	wait.until(ExpectedConditions.elementToBeSelected(ele));
      
    }
 
    public String getScreenshotPath(String testCaseName, AndroidDriver driver) throws IOException
    {
    	File source = driver.getScreenshotAs(OutputType.FILE);
    	String destinationFile = System.getProperty("user.dir")+"//testreports//errorscreenshots//"+testCaseName+".png";
    	FileUtils.copyFile(source, new File(destinationFile));
    	return destinationFile;
    }
}
 