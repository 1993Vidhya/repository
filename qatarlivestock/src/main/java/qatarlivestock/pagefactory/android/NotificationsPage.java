package qatarlivestock.pagefactory.android;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;

public class NotificationsPage extends AndroidActions {

	AndroidDriver driver;

	public NotificationsPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement hambergerelmnt;
	
	@AndroidFindBy(xpath= ".//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
	private WebElement hambergerelmnt1;
	

	@AndroidFindBy(xpath= ".//android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]")
	private WebElement Notification;
	
	@AndroidFindBy(id= "notification")
	private WebElement Notification1;

	@AndroidFindBy(xpath = ".//android.widget.ImageButton[@content-desc=\"BackPress\"]")
	private WebElement notificationBackbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Notifications']")
	private WebElement NotificationlistTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NotificationNodataAvailable;

	@AndroidFindBy(id = "notificationTitle")
	private WebElement NotificationlistTitles;

	@AndroidFindBy(id = "notificationDate")
	private WebElement NotificationDate;

	@AndroidFindBy(xpath = ".//android.widget.ImageButton[@content-desc=\"BackPress\"]")
	private WebElement notificationDeatilsBackbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Notifications']")
	private WebElement NotificationDetailsTitle;

	@AndroidFindBy(id = "notificationDescription")
	private WebElement NotificationDescription;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise']")
	private WebElement NotificationPremise;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Location']")
	private WebElement NotificationLocation;

	@AndroidFindBy(xpath = ".//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
	private List<WebElement> notificationlist;

	@AndroidFindBy(id = "notificationTitle")
	private List<WebElement> NotificationsTitle;

	@AndroidFindBy(id = "notificationLocation")
	private List<WebElement> notificationpremise;

	@AndroidFindBy(id = "notificationDate")
	private List<WebElement> NotificationDates;

	@AndroidFindBy(id = "notificationTitle")
	private WebElement notificationHeading;

	@AndroidFindBy(id = "premiseName")
	private WebElement premiseNameNotification;

	@AndroidFindBy(id = "premiseLocation")
	private WebElement PremiseNotificationLoc;
	
	@AndroidFindBy(xpath= ".//android.widget.TextView[@text='Call Assignee']")
	private WebElement  CallAssignee;
	
	@AndroidFindBy(id = "callBtn")
	private WebElement PhoneIcon;

	@AndroidFindBy(xpath = "android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
	private List<WebElement> notificationlisting;

	public Boolean verifyNotification() throws InterruptedException {

		boolean val = false;
		if (hambergerelmnt.isDisplayed()) {
			val = true;
			hambergerelmnt.click();
			System.out.println("Hamburger menu is present & clicked ");

			if (Notification.isDisplayed()) {
				val = true;
				System.out.println("Notification in the hamberger menu is displayed");
				Notification.click();
				System.out.println("Notification in the hamberger menu is clicked");

				if (NotificationlistTitle.isDisplayed()) {
					System.out.println(
							"Notification in the hamberger menu is clicked and Notification title in the notification page is Displayed");
					String Expectednotification = "Notifications";
					String ActualNotification = NotificationlistTitle.getAttribute("text");
					Assert.assertEquals(ActualNotification, Expectednotification);
					System.out.println("Notification title in the notification page is Displayed successfully");
					if (notificationBackbtn.isDisplayed()) {
						val = true;
						System.out.println("backbutton in the  notification page is Displayed successfully");
						notificationBackbtn.click();
						System.out.println("backbutton in the  notification page is clicked sucesfully");
						Thread.sleep(5000);
						if (hambergerelmnt.isDisplayed()) {
							val = true;
							System.out.println(
									"backbutton in the  notification page is clicked sucesfully and Hamburger Menu is displayed");
						} else {
							System.out.println(
									"backbutton in the  notification page is not clicked sucesfully and Hamberger Menu is not displayed");
						}
					}
				} else {
					System.out.println("Notification title is not displayed");
				}

			} else {
				System.out.println("Notification in the Hamberger is not displayed");
			}
		} else {
			System.out.println("Hamburger menu is not present");
		}
		return val;
	}

	public Boolean verifyNotificationPage() throws InterruptedException {

		boolean val = false;
		if (hambergerelmnt.isDisplayed()) {
			val = true;
			hambergerelmnt.click();
			System.out.println("Hamburger menu is present & clicked ");
			Notification1.click();
			System.out.println("Notification in the hamberger menu is clicked");

			Thread.sleep(5000);
			try {
				try {
					if (NotificationNodataAvailable.isDisplayed()) {
						val = true;
						System.out.println("Notification page does not contain any notifications");
						notificationBackbtn.click();
						System.out.println("back button in the notification deatils page is present and clicked");

						if (hambergerelmnt.isDisplayed()) {

							System.out.println(
									"back button in the notification page is present and clicked, hamburger menu   is displayed successfully");
						} else {
							System.out.println(
									"back button in the notification  page is present and clicked, Hamburger menu is not  displayed successfully");
						}
					} else {
						System.out.println("Notification page contain notifications");
					}
				} catch (Exception e) {
					System.out.println("Notification page verification,  notification is listing in the page ");
				}

				try {

					if (NotificationlistTitle.isDisplayed()) {
						for (int i = 0; i < notificationlist.size(); i++) {

							if (NotificationsTitle.get(i).isDisplayed() && notificationpremise.get(i).isDisplayed()
									&& NotificationDates.get(i).isDisplayed()) {
								val = true;

								String Notificationsid = notificationlist.get(i).getText();
								String NotifiactionTitlee = NotificationsTitle.get(i).getText();
								String premiseLoc = notificationpremise.get(i).getText();
								String Datess = NotificationDates.get(i).getText();

								System.out.println(NotifiactionTitlee);
								System.out.println(premiseLoc);
								System.out.println(Datess);

							}

							else {
								System.out.println("Notifications, premise location and  date is  not displayed ");
							}
							System.out.println("Notification, premise location and date is  displayed ");
						}
					} else {
						System.out.println("Notification title is not displayed ");
					}

				}

				catch (Exception e) {
					System.out.println("Notification page verification,  notification is listing in the page");
				}
			}

			catch (Exception e) {
				System.out.println("Notification list details are verifying");
			}
		}

		else {
			System.out.println("Hamberger is not displayed  and clicked");
		}

		return val;
	}

	public Boolean verifyNotificationDetailsPage() throws InterruptedException {
		boolean val = false;
	
		Thread.sleep(5000);
		if (hambergerelmnt.isDisplayed()) {
			val = true;
			Thread.sleep(5000);
			hambergerelmnt.click();
			System.out.println("Hamburger menu is present & clicked from homepage ");
			Thread.sleep(5000);
			Notification1.click();
			System.out.println("Notification in the hamberger menu is clicked");

			Thread.sleep(5000);
			try {
				try {
					if (NotificationNodataAvailable.isDisplayed()) {
						val = true;
						System.out.println("Notification page does not contain any notifications");
						notificationBackbtn.click();
						System.out.println("back button in the notification deatils page is present and clicked");

						if (hambergerelmnt.isDisplayed()) {

							System.out.println(
									"back button in the notification page is present and clicked, hamburger menu   is displayed successfully");
						} else {
							System.out.println(
									"back button in the notification  page is present and clicked, Hamburger menu is not  displayed successfully");
						}
					} else {
						System.out.println("Notification page contain notifications");
					}
				} catch (Exception e) {
					System.out.println("Notification page verification,  notification is listing in the page ");
				}

				try {

					if (NotificationlistTitle.isDisplayed()) {
						Thread.sleep(5000);
						for (int i = 0; i < notificationlist.size(); i++) {
							Thread.sleep(5000);

							if (NotificationsTitle.get(i).isDisplayed() && notificationpremise.get(i).isDisplayed()
									&& NotificationDates.get(i).isDisplayed()) {
								val = true;

								String Notificationsid = notificationlist.get(i).getText();

								notificationlist.get(i).click();
								System.out.println(Notificationsid + " Notification is clicked");
								
								if (NotificationDescription.isDisplayed() && notificationHeading.isDisplayed()
										&& NotificationPremise.isDisplayed() && NotificationLocation.isDisplayed()
										&& premiseNameNotification.isDisplayed() && PremiseNotificationLoc.isDisplayed() ) {
									
									//&& CallAssignee.isDisplayed() && PhoneIcon.isDisplayed()

									System.out.println(
											"Notification page contains tagging request number, Appointment date, technian name,technician number ,tagging requests is displayed");

									String heading = notificationHeading.getText();
									String Description = NotificationDescription.getText();								
									String premise = NotificationPremise.getText();
									String location = NotificationLocation.getText();
									String premiseNotifications = premiseNameNotification.getText();
									String premiseLocation = PremiseNotificationLoc.getText();

									System.out.println(heading);
									System.out.println(Description);								
									System.out.println(premise + ": " + premiseNotifications);
									System.out.println(location + ": "   + premiseLocation);
								//	System.out.println(premiseNotifications);
								//	System.out.println();

									Thread.sleep(5000);
									notificationDeatilsBackbtn.click();
									System.out.println(" Notification details page back button is clicked successfully");									
								}

								
								else {
									System.out.println(
											"Notification page contains tagging request number, Appointment date, technian name,technician number ,tagging requests is not displayed ");
								}
							}

							else {
								System.out.println("Notifications, premise location and  date is  not displayed ");
							}
							System.out.println("Notification, premise location and date is  displayed ");
						}								
					} 
								
					else {
						System.out.println("Notification title is not displayed ");
					}
				} catch (Exception e) {
					System.out.println("Notification page verification,  notification is listing in the page");
				}
				
				Thread.sleep(5000);
				notificationBackbtn.click();
				System.out.println("back button in the notification page is present and clicked");	
				
			}

			catch (Exception e) {
				System.out.println("Notification list details are verifying");
			}
		}

		else {
			System.out.println("Hamberger is not displayed  and clicked");
		}

		return val;
	}

}
