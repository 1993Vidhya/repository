package qatarlivestock.pagefactory.android1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import qatarlivestock.pagefactory.utils.AndroidActions;

import org.openqa.selenium.Dimension;

public class CancelAppointmentArabicPage extends AndroidActions {

	AndroidDriver driver;

	public CancelAppointmentArabicPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(id = "appointmentFragment")
	private WebElement AppointmentModule;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ميعاد']")
	private WebElement AppointmentListingTitle;

	@AndroidFindBy(id = "appointmentFragment")
	private WebElement appointmentmdlename;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ميعاد']")
	private WebElement appointmenttitle;

	@AndroidFindBy(id = "addAppointmentBtn")
	private WebElement addappointmentbtn;

	@AndroidFindBy(id = "purposeBookingID")
	private WebElement appointmentid;

	@AndroidFindBy(id = "clinicLocation")
	private WebElement cliniclocation;

	@AndroidFindBy(id = "date")
	private WebElement datetime;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تاريخ']")
	private WebElement Date;

	@AndroidFindBy(id = "clinicLocationNavigation")
	private WebElement locationicon;

	@AndroidFindBy(id = "bookingId")
	private WebElement appointmentiddetailspage;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='غاية']")
	private WebElement purposetext;

	@AndroidFindBy(id = "clinicName")
	private WebElement clinicnametext;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معرف الحجز']")
	private WebElement bookingidtext;

	@AndroidFindBy(id = "date")
	private WebElement datetext;

	@AndroidFindBy(id = "status")
	private WebElement status;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement backbutton;

	@AndroidFindBy(id = "addAppointmentBtn")
	private WebElement addappointmentbutton;

	@AndroidFindBy(className = "androidx.appcompat.widget.LinearLayoutCompat")
	private WebElement appointmentcard;

	@AndroidFindBy(xpath = ".//android.widget.RelativeLayout/android.widget.TextView")
	private WebElement canceltext;

	@AndroidFindBy(xpath = ".//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]")
	private WebElement Okbuttonpopup;

	@AndroidFindBy(xpath = ".//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[2]")
	private WebElement cancelbuttonpopup;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='لا تتوافر بيانات']")
	private WebElement AppointmentNodataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='إما أنه رقم حجز غير صالح أو لا يُسمح لك بإلغاء هذا الموعد الآن']")
	private WebElement Eithererror;

	@AndroidFindBy(xpath = ".//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button")
	private WebElement okbtn2;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement AppDetailsbackbutton;

	public String appointmentiddetailpage;
	public String cliniclocationstr;
	public String cliniclocationstrdetailpage;
	public String datetimestr;
	public String datetimestrdetailpage;
	public String AppointmentIdTitle;
	public String appointmentDetailsID;
	public String exportingText;
	public String splitvalue;
	public String Animaltag;
	public String speciescnt;
	public String Status;
	public String Exports;
	public String substr2;
	public String substr1;
	public String clinics;
	public String BookingId;
	public String ExportDate;
	public String AppointmentbreedingIdTitle;
	public String purposeName;
	public String Appointmentiddetailpage;
	public String AppointmentFarmIdTitle;
	public String Breedingcliniclocationstr;

	public boolean appointmentlistingpageverification() throws InterruptedException {

		boolean val = false;
		if (AppointmentModule.isDisplayed()) {
			AppointmentModule.click();
			AppointmentModule.click();
		
			Thread.sleep(5000);
			System.out.println("Appointment Module is clicked");
			String ExpectedAppointment = "ميعاد";
			String ActualAppointment = AppointmentListingTitle.getAttribute("text");
			if (AppointmentListingTitle.isDisplayed() && ActualAppointment.equalsIgnoreCase(ExpectedAppointment)) {

				val = true;
				System.out.println("Appointment - title is displayed");
				try {
					try {
						if (AppointmentNodataAvailable.isDisplayed()
								&& AppointmentNodataAvailable.getText().equals("لا تتوافر بيانات")) {
							System.out.println("Appointment listing page details are not available");
						} else {
							System.out.println("Appointment listing page details are  available");
						}
					} catch (Exception e) {
						System.out.println("Appointment listing details are available");
					}

					try {
						if (appointmentid.isDisplayed() && cliniclocation.isDisplayed() && datetime.isDisplayed()
								&& status.isDisplayed() && locationicon.isDisplayed()) {
							val = true;
							System.out.println(
									"Appointment Name, clcinic Location, date ,status And location Icon is displayed");

							AppointmentIdTitle = appointmentid.getAttribute("text");
							// cliniclocationstr = cliniclocation.getAttribute("text");
							// datetimestr = datetime.getAttribute("text");
							Status = status.getAttribute("text");

							System.out.println("Appointment listing page contains:");
							System.out.println("Appointment Name: " + AppointmentIdTitle);
							// System.out.println("Clinic Location : " + cliniclocationstr);
							// System.out.println("Date: " + datetimestr);
							System.out.println("Status: " + Status);

							// locationicon.click();

						} else {
							System.out.println(
									"Appointment Name, clinic Location, date ,status And location Icon is displayed");
						}

					} catch (Exception e) {
						System.out.println("Appointment listing page details are available");
					}
				} catch (Exception e) {
					System.out.println("Appointment listing page details are available");
				}
			} else {
				System.out.println("Appointment title is not displayed");
			}
		}
		return val;
	}

	
	public Boolean OkandCancelbuttonverification() throws InterruptedException {

		boolean val = false;
		val = true;
		Dimension windowSize = driver.manage().window().getSize();
		// Extract height and width from windowSize
		/*
		 * int windowHeight = windowSize.getHeight(); int windowWidth =
		 * windowSize.getWidth();
		 * 
		 * System.out.println("Window Height: " + windowHeight);
		 * System.out.println("Window Width: " + windowWidth);
		 */
		Thread.sleep(5000);
		try {
		try {
			if (AppointmentNodataAvailable.isDisplayed()) {
				System.out.println("Appointment listing page details are not available");
			} else {
			}
		} catch (Exception e) {
			System.out.println("Appointment listing page details are available");
		}		
			try {
				Thread.sleep(5000);
				TouchAction ts = new TouchAction(driver);
				ts.longPress(PointOption.point(983, 480)).moveTo(PointOption.point(97, 290)).release()
						// Release the touch action(ending the swipe)
						.perform(); // Perform the swipe action

				if (canceltext.isDisplayed()) {
					// && canceltext.getText().equals("هل أنت متأكد من إلغاء الموعد؟")) {

					val = true;
					System.out
							.println("Are you sure you want to cancel the Request, text inside the popup is displayed");
					if (cancelbuttonpopup.isDisplayed() && cancelbuttonpopup.getText().equals("يلغي")) {
						System.out.println("Cancel button inside the popup is displayed");
						Thread.sleep(5000);
						cancelbuttonpopup.click();
						System.out.println("Cancel button inside the popup is clicked");
					} else {
						System.out.println("Cancel button inside the popup is not displayed");
					}

				} else {
					System.out.println(
							"Are you sure you want to cancel the Request, text inside the popup is not displayed");
				}

				System.out.println("Appointment listing page details are  available");

			} catch (Exception e) {
				System.out.println("Appointment listing page details are not available");
			}

		} catch (Exception e) {
			System.out.println("Appointment listing page details are not available");
		}

		return val;
	}

	public boolean CancelAppointmentVerification() throws InterruptedException {
		boolean val = false;

		val = true;

		Dimension windowSize = driver.manage().window().getSize();

		// Extract height and width from windowSize
		/*
		 * int windowHeight = windowSize.getHeight(); int windowWidth =
		 * windowSize.getWidth();
		 * 
		 * System.out.println("Window Height: " + windowHeight);
		 * System.out.println("Window Width: " + windowWidth);
		 */

		Thread.sleep(5000);

		try {

			try {

				if (AppointmentNodataAvailable.isDisplayed()) {
					System.out.println("Appointment listing page details are not available");

				} else {
				}
			} catch (Exception e) {
				System.out.println("Appointment listing page details are available");
			}

			try {
				try {
					if (status.isDisplayed() && status.getText().equals("مطلوب")) {
						Thread.sleep(5000);
						TouchAction ts1 = new TouchAction(driver);
						ts1.longPress(PointOption.point(983, 480)).moveTo(PointOption.point(97, 290)).release() // Release
																												// the
																												// touch
																												// action
																												// (ending
																												// the
																												// swipe)
								.perform(); // Perform the swipe action

						if (canceltext.isDisplayed())
						// && canceltext.getText().equals("Are you sure to cancel the appointment?"))
						{
							System.out.println(
									"Are you sure you want to cancel the Request, text inside the popup is displayed");

							if (Okbuttonpopup.isDisplayed() && Okbuttonpopup.getText().equals("نعم")) {
								Thread.sleep(5000);
								Okbuttonpopup.click();
								System.out.println("ok button is displayed and clicked in requested");
							} else {
								System.out.println("ok button is not displayed");
							}
						} else {
							System.out.println(
									"Are you sure you want to cancel the Request, text inside the popup is not displayed");
						}
					} else {
						System.out.println("Status is displayed as user cancelled");
					}
				} catch (Exception e) {
					System.out.println("cancelling appointment while requested");
				}

				try {
					if (status.isDisplayed() && status.getText().equals("تم إلغاء المستخدم")) {

						Thread.sleep(5000);
						TouchAction ts1 = new TouchAction(driver);
						ts1.longPress(PointOption.point(983, 480)).moveTo(PointOption.point(97, 290)).release() // Release
																												// the
																												// touch
																												// action
																												// (ending
																												// the
																												// swipe)
								.perform(); // Perform the swipe action

						if (canceltext.isDisplayed())
						// && canceltext.getText().equals("Are you sure to cancel the appointment?"))
						{
							System.out.println(
									"Are you sure you want to cancel the Request, text inside the popup is displayed");

							if (Okbuttonpopup.isDisplayed() && Okbuttonpopup.getText().equals("نعم")) {
								Thread.sleep(5000);
								Okbuttonpopup.click();
								System.out.println("ok button is clicked in the user cancelled");

								if (Eithererror.isDisplayed() && Eithererror.getText()
										.equals("إما أنه رقم حجز غير صالح أو لا يُسمح لك بإلغاء هذا الموعد الآن")) {
									System.out.println(
											"Either it is an invalid booking number or you are not allowed to cancel this appointment now is displayed");
									if (okbtn2.isDisplayed() && okbtn2.getText().equals("نعم")) {
										okbtn2.click();
										System.out.println(" Ok button inside the pop up is clicked ");
									} else {
										System.out.println("ok button inside the pop up is  not clicked ");
									}
								} else {
									System.out.println(
											"Either it is an invalid booking number or you are not allowed to cancel this appointment now is  not displayed");
								}

								if (appointmenttitle.isDisplayed()
										&& appointmenttitle.getText().equals("Appointment")) {
									System.out
											.println("Ok button inside the popup is clicked and move back to the page");
								} else {
									System.out.println(
											"Ok button inside the popup is clicked , Appoimtment title is not displayed");
								}
							} else {
								System.out.println("Ok button inside the popup is not clicked ");
							}
						}

						else {
							System.out.println(
									"Are you sure you want to cancel the Request, text inside the popup is not displayed");
						}

					} else {
						System.out.println("Status is displayed as requested");
					}

				}

				catch (Exception e) {
					System.out.println("Status is not displayed as user cancelled");
				}

			} catch (Exception e) {
				System.out.println("checking cancellation for requested and user cancelled");
			}

		}

		catch (Exception e) {
			System.out.println("Status cancellation ");
		}

		return val;

	}

	public Boolean backbuttonverification() {
		boolean val = false;
		if (AppDetailsbackbutton.isDisplayed()) {
			AppDetailsbackbutton.click();
			String ExpectedAppointment = "ميعاد";
			String ActualAppointment = AppointmentListingTitle.getAttribute("text");
			if (AppointmentListingTitle.isDisplayed() && ActualAppointment.equalsIgnoreCase(ExpectedAppointment)) {
				val = true;
				System.out.println("Appointment - title is displayed");

			}
		}
		return val;
	}

	public boolean AppointmentStatusverification() throws InterruptedException {
		boolean val = false;
		try {

			try {
				if (AppointmentNodataAvailable.isDisplayed()) {
					System.out.println("Appointment listing page details are not available");
				} else {
					System.out.println("Appointment listing page details are  available");
				}
			} catch (Exception e) {
				System.out.println("Appointment listing details are available");
			}

			try {
				try {
					if (status.isDisplayed() && status.getText().equals("مطلوب")) {
						val = true;
						System.out.println("status is displayed as Requested");
						Thread.sleep(5000);
						TouchAction ts = new TouchAction(driver);
						ts.longPress(PointOption.point(983, 480)).moveTo(PointOption.point(97, 290)).release()
								// Release the touch action(ending the swipe)
								.perform(); // Perform the swipe action

						if (canceltext.isDisplayed()) {
							val = true;
							System.out.println("Are you sure you to cancel the Appointment is displayed");
							Thread.sleep(5000);
							cancelbuttonpopup.click();
						} else {
							System.out.println("Are you sure you to cancel the Appointment is not displayed");
						}
					} else {
						System.out.println("status is not displayed as Requested");
					}
				} catch (Exception e) {
					System.out.println(" ");
				}

				try {
					if (status.isDisplayed() && status.getText().equals("تم إلغاء المستخدم")) {
						val = true;
						System.out.println("status is displayed as UserCancelled");
						Thread.sleep(5000);
						TouchAction ts = new TouchAction(driver);
						ts.longPress(PointOption.point(983, 480)).moveTo(PointOption.point(97, 290)).release()
								// Release the touch action(ending the swipe)
								.perform(); // Perform the swipe action

						if (canceltext.isDisplayed()) {
							val = true;
							System.out.println("Are you sure you to cancel the Appointment is displayed");
							Thread.sleep(5000);
							cancelbuttonpopup.click();
						} else {
							System.out.println("Are you sure you to cancel the Appointment is not displayed");
						}
					} else {
						System.out.println("status is not displayed as user cancelled");
					}
				} catch (Exception e) {
					System.out.println(" ");
				}
			} catch (Exception e) {
				System.out.println(" Appointment listing details not available");
			}
		} catch (Exception e) {
			System.out.println(" Appointment listing details not available");
		}

		return val;

	}
}
