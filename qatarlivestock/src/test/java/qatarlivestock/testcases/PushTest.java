package qatarlivestock.testcases;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import qatarlivestock.pagefactory.android.PushNotifications;

public class PushTest 
{		
	public AndroidDriver driver;	
	protected Properties prop = new Properties();		 		
	
	String ANSI_RED = "\u001B[31m";
	String ANSI_GREEN = "\u001B[32m";
	String ANSI_RESET = "\u001B[0m";
	String ANSI_PURPLE = "\u001B[35m";
	
	
	@Test(priority = 1)

	public void PhonenotificationTest() throws InterruptedException, Exception

	{	

		FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//java//qatarlivestock//testdata//data.properties");
		
			prop.load(fis);

			String ipAddress = prop.getProperty("ipAddress");

			String deviceName = prop.getProperty("deviceName");
			
			String udid = prop.getProperty("udid");

			UiAutomator2Options options = new UiAutomator2Options();

			options.setDeviceName(deviceName);

			options.setUdid(udid);
			
			driver = new AndroidDriver(new URL(ipAddress), options);	
			
	}
	
	@Test(priority = 2)
	public void pushNotificationsBar() throws InterruptedException
	{
		
		PushNotifications hm= new PushNotifications(driver);
		boolean pushnotificationBar = hm.OpenpushNotifications();
		Assert.assertEquals( pushnotificationBar, true,
				ANSI_RED + "open notification bar Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + " open notification bar  is verified successfully" + ANSI_RESET);
	}
	
	
	@Test(priority = 3)
	public void pushNotificationsTitle() throws InterruptedException
	{
		
		PushNotifications hm= new PushNotifications(driver);
		boolean pushnotificationTitle = hm.pushNotificationsTitle();
		Assert.assertEquals( pushnotificationTitle, true,
				ANSI_RED + "title Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + " Title is verified successfully" + ANSI_RESET);
	}
	
		
	@Test(priority = 4)
	public void CheckingpushNotificationsTitle() throws InterruptedException
	{
		
		PushNotifications hm= new PushNotifications(driver);
		boolean ClickpushnotificationTitle = hm.CheckpushNotifications();
		Assert.assertEquals( ClickpushnotificationTitle, true,
				ANSI_RED + "notification in the list  Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + " Notification in the list is verified successfully" + ANSI_RESET);
	}
	
	/*@Test(priority = 5)
	public void ClickingpushNotificationsTitle() throws InterruptedException
	{
		
		PushNotifications hm= new PushNotifications(driver);
		boolean ClickpushnotificationTitle = hm.ClickpushNotifications();
		Assert.assertEquals( ClickpushnotificationTitle, true,
				ANSI_RED + "notification in the list clicking  Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + " Notification in the list is clikced verified successfully" + ANSI_RESET);
	}
	*/
	@Test(priority = 6)
	public void ClicknewpushNotificationsTitle() throws InterruptedException
	{
		
		PushNotifications hm= new PushNotifications(driver);
		boolean ClickpushnotificationTitle = hm.ClicknextpushNotifications();
		Assert.assertEquals( ClickpushnotificationTitle, true,
				ANSI_RED + "notification in the list clicking  Verification failed" + ANSI_RESET);
		System.out.println(ANSI_GREEN + " Notification in the list is clikced verified successfully" + ANSI_RESET);
	}
	
					

}

	


