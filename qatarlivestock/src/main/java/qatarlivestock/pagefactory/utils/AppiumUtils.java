package qatarlivestock.pagefactory.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class AppiumUtils {
	public double formattedAmount(String amount)

	{
		Double price = Double.parseDouble(amount.substring(1));
		return price;
	}

	public void waitForElementToAppear(WebElement ele, String attr, String val, AndroidDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains((ele), attr, val));
	}

	public void waitForElementToClick(WebElement ele, AndroidDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeSelected(ele));
	}

	public String getScreenshotPath(String testCaseName, AndroidDriver driver) throws IOException
	{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy_HH:mm:ss");

		// Get the current date and time

		String timestamp = dateFormat.format(new Date());

		File source = driver.getScreenshotAs(OutputType.FILE);

		String destinationFile = System.getProperty("user.dir") + "//testreports//errorscreenshots//" + testCaseName
				+ "_" + timestamp + ".png";

		FileUtils.copyFile(source, new File(destinationFile));

		return destinationFile;

	}
}
