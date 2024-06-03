package qatarlivestock.pagefactory.android;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.google.common.base.Splitter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import qatarlivestock.pagefactory.utils.AppiumUtils;

public class PushNotifications extends AndroidActions {

	AndroidDriver driver;
	AppiumUtils utils = new AppiumUtils();

	String NotificationsTitlee;
	String NotifiactionDetails;

	public PushNotifications(AndroidDriver driver)

	{

		super(driver);

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		// Pagefactory.initElements(driver,this);

	}

	int numberOfIterations;
	String notificationText;
	String NotificationsActualTitlee;		
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='QatarLiveStock']")
	private WebElement qatarlivestockApp_name;	
	
	@AndroidFindBy(id = "android:id/notification_headerless_view_row")
	private List<WebElement> notificationTab;

	@AndroidFindBy(id = "android:id/title")
	private List<WebElement> notification_Name;

	@AndroidFindBy(id = "android:id/text")
	private List<WebElement> notification_details;

	@AndroidFindBy(xpath = ".//android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout")
	private WebElement notification_bar;

	@AndroidFindBy(id = "android:id/title")
	private WebElement notificationName;

	@AndroidFindBy(id = "android:id/text")
	private WebElement notificationdetails;

	@AndroidFindBy(id = "com.ust.qatarlivestock.qa:id/notificationTitle")
	private WebElement notificationtitle;

	@AndroidFindBy(id = "android:id/text")
	private WebElement AppointmentDetails;

	public boolean OpenpushNotifications() throws InterruptedException {
		boolean val = false;
		val = true;
		driver.openNotifications();
		System.out.println(" Notification bar in the phone is opened");
		return val;
	}

	public boolean pushNotificationsTitle() throws InterruptedException {
		boolean val = false;
		if (qatarlivestockApp_name.isDisplayed()) {
			val = true;
			System.out.println("Qatar Livestock app name is available");
			Thread.sleep(5000);
			String ActualNotificationTitle = qatarlivestockApp_name.getAttribute("text");
			String expectedTitle = "QatarLiveStock";
			Assert.assertEquals(expectedTitle, ActualNotificationTitle);
			System.out.println("Qatar Livestock app notification title is available : " + ActualNotificationTitle);

		}
		return val;
	}

	public boolean CheckpushNotifications() throws InterruptedException {
		boolean val = false;
		try {
			try {

			} catch (Exception e) {

			}
			try {

				if (qatarlivestockApp_name.isDisplayed()) {
					val = true;

					qatarlivestockApp_name.click();
					System.out.println("Qatar Livestock app notification title is clicked");

					Thread.sleep(5000);

					int size = notificationTab.size();

					System.out.println("no of notification is " + size);

					for (int i = 0; i < notificationTab.size(); i++) {

						System.out.println("Notification title and details is displayed ");

						if (notification_Name.get(i).isDisplayed() && notification_details.get(i).isDisplayed()) {
							val = true;

							String NotificationsTitlee = notification_Name.get(i).getText();
							String NotifiactionDetails = notification_details.get(i).getText();

							System.out.println(NotificationsTitlee);
							System.out.println(NotifiactionDetails);

						} else {
							System.out.println("Notification title and details  is not displayed ");
						}

					}
				} else {
					System.out.println("Qatar Livestock app  title is not displayed ");
				}

				System.out.println("App notifications  is listed in the phone Notification bar");

				Thread.sleep(5000); // Just to observe, you can remove or adjust this as needed

			} catch (Exception e) {

			}
		} catch (Exception e) {

		}
		return val;
	}

	public boolean ClickpushNotifications() throws InterruptedException {
		boolean val = false;
		if (qatarlivestockApp_name.isDisplayed()) {
			val = true;

			String NotificationsActualTitlee = notificationName.getText();

			System.out.println(NotificationsActualTitlee);

			notification_bar.click();

			Thread.sleep(6000);

			String ExpectedNotificationTitle = notificationtitle.getAttribute("text");

			System.out.println(ExpectedNotificationTitle);

			// System.out.println(NotifiactionDetails);

			Assert.assertEquals(ExpectedNotificationTitle, NotificationsActualTitlee);

			System.out.println("notification title is same as displayed in the homepage");

			Thread.sleep(5000);

		}

		return val;
	}

	public Boolean ClicknextpushNotifications() throws InterruptedException {
		boolean val = false;

		Thread.sleep(6000);
		numberOfIterations = notificationTab.size();

		System.out.println(numberOfIterations);

		for (int i = 0; i < numberOfIterations; i++) {

			Thread.sleep(5000);

			NotificationsActualTitlee = notificationName.getText();
			System.out.println(NotificationsActualTitlee);

			Thread.sleep(5000);

			AppointmentNumber();

			// String tr =AppNumber.toString().trim();
			// String tr=AppNumber;
			// System.out.println(tr.length());
			// System.out.println(tr);

			// System.out.println(str);

			notificationTab.get(i).click();

			Thread.sleep(10000);

			// Get the text of the notification name
			notificationText = notificationtitle.getAttribute("text");
			System.out.println("Notification Name: " + notificationText);

			Assert.assertEquals(notificationText, NotificationsActualTitlee);

			Thread.sleep(5000);

			openNotificationsMultiple();

		}
		return val;
	}

	public boolean AppointmentNumber() throws InterruptedException {
		boolean val = false;

		String AppNumber = AppointmentDetails.getAttribute("text");
		String str = AppNumber;
		String nstr = "";
		String nstr1 = "";
		char ch;

		System.out.print("Original word: ");
		System.out.println(AppNumber);

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + nstr);

		if (nstr.length() >= 7) {
			// Extract the last 8 characters
			String last8Digits = nstr.substring(nstr.length() - 7);

			// Print or use the variable
			System.out.println(last8Digits);
			for (int i = 0; i < last8Digits.length(); i++) {
				ch = last8Digits.charAt(i); // extracts each character
				nstr1 = ch + nstr1; // adds each character in front of the existing string
			}
			System.out.println("Reversed word: " + nstr1);
			
			

		}
		return val;

	}

	public Boolean openNotificationsMultiple() throws InterruptedException {
		boolean val = false;

		OpenpushNotifications();

		Thread.sleep(5000);

		
			if (qatarlivestockApp_name.isDisplayed())
			{
				qatarlivestockApp_name.click();

				Thread.sleep(5000);

				System.out.println("Qatar Livestock app notification title is clicked");

				numberOfIterations = notificationTab.size();

				System.out.println(numberOfIterations);

			}

			else {

			}		
		return val;

	}

}
