package qatarlivestock.pagefactory.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class BaseTest {

	public AndroidDriver driver;
	protected Properties prop = new Properties();

	@BeforeClass(alwaysRun = true)
	public void configAppium() throws IOException, InterruptedException {		

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//qatarlivestock//testdata//data.properties");
		prop.load(fis);

		String ipAddress = prop.getProperty("ipAddress");

		String deviceName = prop.getProperty("deviceName");
		
		String udid = prop.getProperty("udid");

			UiAutomator2Options options = new UiAutomator2Options();

		options.setDeviceName(deviceName);

		options.setUdid(udid);
		
		// AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723"),
		// options);

		options.setApp(
				System.getProperty("user.dir") + "//src//test//java//qatarlivestock//testresources//app-qa-release (2).apk");
		
			driver = new AndroidDriver(new URL(ipAddress), options);
			
		//	   System.setProperty("webdriver.chrome.driver","C:\\Users\\227547\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
	//		options.setChromedriverExecutable("C:\\Users\\227547\\.appium\\node_modules\\chromedriver-win32\\chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);		
		
	}

	public String getProperty(String key)
	{
		return prop.getProperty(key);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
		}

}
