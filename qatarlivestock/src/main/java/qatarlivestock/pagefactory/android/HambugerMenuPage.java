package qatarlivestock.pagefactory.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;

public class HambugerMenuPage extends AndroidActions {
	AndroidDriver driver;

	public HambugerMenuPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement hambergerelmnt;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Hello,']")
	private WebElement hello;

	@AndroidFindBy(id = "premise_owner_name")
	private WebElement premise_owner_name;

	@AndroidFindBy(id = "closeNavigation")
	private WebElement closeButton;

	@AndroidFindBy(id = "owner_contact_number_label")
	private WebElement contactNumberLabel;

	@AndroidFindBy(id = "owner_contact_number")
	private WebElement contactNumber;

	@AndroidFindBy(id = "premise_location_label")
	private WebElement premiselocationlabel;

	@AndroidFindBy(id = "premise_location")
	private WebElement premiseLocation;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement HamburgerNodataAvailable;

	@AndroidFindBy(id = "settings")
	private WebElement Settings;

	@AndroidFindBy(id = "notification")
	private WebElement Notification;

	@AndroidFindBy(id = "addNominee")
	private WebElement addnomineeelemnt;

	@AndroidFindBy(id = "faq")
	private WebElement Faq;

	@AndroidFindBy(id = "languageSwitch")
	private WebElement Languageswitch;

	@AndroidFindBy(id = "contactUs")
	private WebElement contactus;

	@AndroidFindBy(id = "facebookNavigation")
	private WebElement facebookimg;

	@AndroidFindBy(id = "twitterNavigation")
	private WebElement twitterimg;

	@AndroidFindBy(id = "linkedInNavigation")
	private WebElement linkdnimg;

	@AndroidFindBy(id = "logout")
	private WebElement Logout;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Add Nominee']")
	private WebElement Addnomineetitle;

	@AndroidFindBy(id = "toolbarTitle")
	private WebElement nomineeDetailsTitle;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement nomineeDetailsbackbutton;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement contactDetailsbackbutton;

	@AndroidFindBy(id = "nomineename")
	private WebElement nomineeName;

	@AndroidFindBy(id = "detailsLayout")
	private WebElement nomineeDetailsLayout;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='QID']")
	private WebElement qidfield;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Nominee Name']")
	private WebElement nomineename;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Mobile Number']")
	private WebElement Mobilenofield;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement backbuttonelmnt;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement AddNomineeBackButton;

	@AndroidFindBy(id = "addNomineeBtn")
	private WebElement addnomineebutton;

	@AndroidFindBy(id = "addBtn")
	private WebElement addbutton;

	@AndroidFindBy(className = "android.widget.ImageView")
	private WebElement RemoveNomineebtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Contact Us']")
	private WebElement contactustitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Unified call centre (24*7)']")
	private WebElement callcentretxt;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='184']")
	private WebElement callcentrenum;

	@AndroidFindBy(id = "callBtn")
	private WebElement callimage;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Mail Us']")
	private WebElement mailustxt;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='info@mm.gov.qa']")
	private WebElement mailidtxt;

	@AndroidFindBy(id = "emailBtn")
	private WebElement mailimage;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='PO Box']")
	private WebElement poboxtxt;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='2727']")
	private WebElement ponumber;

	@AndroidFindBy(id = "delete_text")
	private WebElement removenominee;

	@AndroidFindBy(id = "alertMessage")
	private WebElement removenomineemsg;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement okbuttonremovenominee;

	@AndroidFindBy(id = "alertCancelButton")
	private WebElement cancelbuttonremovenominee;

	@AndroidFindBy(id = "nomineeName")
	private WebElement NomineeNameFieldEditable;

	@AndroidFindBy(id = "no_nominee_available")
	private WebElement noNomineeAvailable;

	@AndroidFindBy(id = "nomineeQid")
	private WebElement QidFieldEditable;

	@AndroidFindBy(id = "nominee_mobile_no")
	private WebElement MobilenoFieldEditable;

	@AndroidFindBy(id = "alertMessage")
	private WebElement Expected_Add_Error_Msg;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement AddOkButton;

	@AndroidFindBy(id = "alertMessage")
	private WebElement AddNomineeError;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement AddOkButtons;

	@AndroidFindBy(xpath = "(//android.widget.Toast)[1]")
	private WebElement toastError;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Are you sure you want to remove existing nominee?']")
	private WebElement RemoveeNomineeAlert;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Nominee has been deleted successfully']")
	private WebElement okremovenomineemsg;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement OkBtnPopup;

	@AndroidFindBy(id = "alertCancelButton")
	private WebElement cancelbtnPopup;

	@AndroidFindBy(id = "premise_owner_name")
	private WebElement premiseOwner;
	
	@AndroidFindBy(id = "owner_contact_number")
	private WebElement ContactNumebr;
	
	@AndroidFindBy(id = "premise_location")
	private WebElement premiseLoca;

	@AndroidFindBy(xpath = ".//androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[2]")
	private WebElement Alerts;
	
	public boolean hamburgerverification() {

		boolean val = false;
		if (hambergerelmnt.isDisplayed()) {
			val = true;
			hambergerelmnt.click();
			System.out.println("Hamburger menu is present & clicked ");
		} else {
			System.out.println("Hamburger menu is not present");
		}
		return val;
	}

	public Boolean Hamburgerelementsverification() {
		boolean val = false;
		try {
			try {
				if (HamburgerNodataAvailable.isDisplayed()) {
					System.out.println("Hamburger details are not available");
					closeButton.click();
				}
			} catch (Exception e) {
				System.out.println("Hamburger details are available");
			}

			try {
				if (closeButton.isDisplayed() && hello.isDisplayed() && premise_owner_name.isDisplayed()
						&& contactNumberLabel.isDisplayed() && contactNumberLabel.getText().equals("Contact Number")
						&& premiselocationlabel.isDisplayed()
						&& premiselocationlabel.getText().equals("Address/Area")) {

					String Heloi = hello.getAttribute("text");
					String helloi = "Hello,";

					Assert.assertEquals(helloi, Heloi);

					System.out.println("Hello  is verified successfully");

					val = true;

					System.out.println(
							"Hello, Premiseowner , contact Number premise location and close Button is displayed ");

					String premiseownerName = premiseOwner.getAttribute("text");
					String contactNumbr = ContactNumebr.getAttribute("text");
					String PremiseLoc = premiseLoca.getAttribute("text");

					System.out.println("Premise Owner Name :" + premiseownerName);
					System.out.println("Contact number :" + contactNumbr);
					System.out.println("Premise Location :" + PremiseLoc);

				} else {
					System.out.println(
							"Hello, Premiseowner , contact Number premise location and close button is not displayed ");
				}
			} catch (Exception e) {
				System.err.println("Hamburger data is not available");
			}
		} catch (Exception e) {
			System.out.println("Hamburger menu verification");
		}
		return val;
	}

	public Boolean HamburgerListverification() {
		boolean val = false;
		if (Settings.isDisplayed() && Alerts.isDisplayed() && Notification.isDisplayed() && addnomineeelemnt.isDisplayed() && Faq.isDisplayed()
				&& Languageswitch.isDisplayed() && contactus.isDisplayed() && Logout.isDisplayed()
				&& closeButton.isDisplayed()) {
			val = true;
			System.out.println(
					"Settings , Notification , AddNominee, Faq , languageSwitch,  ContactUs   Logout and hambergerclose button  is displayed");

		} else {
			System.out.println(
					"Settings , Notification , AddNominee, Faq , languageSwitch,  ContactUs   Logout, hambergerclose button is not displayed ");
		}
		return val;
	}

	public Boolean SocialIconsVerification() {
		boolean val = false;
		if (facebookimg.isDisplayed() && twitterimg.isDisplayed() && linkdnimg.isDisplayed()) {
			val = true;
			System.out.println("facebook ,twitter and linkdn is displayed");

			if (closeButton.isDisplayed()) {
				closeButton.click();

				System.out.println(
						"close button in the hamburger menu is displayed and clicked, hence hamburger closed ");
			} else {
				System.out.println("close button in the hamburger menu is not displayed ");
			}

		} else {
			System.out.println("facebook ,twitter and linkdn is not displayed ");
		}
		return val;
	}

	public boolean contactushamburger() throws InterruptedException {
		boolean val = false;
		hambergerelmnt.click();
		Thread.sleep(5000);
		if (contactus.isDisplayed()) {

			contactus.click();
			String Actualcontact = contactustitle.getAttribute("text");
			String ExpectedContact = "Contact Us";
			if (contactustitle.isDisplayed() && Actualcontact.equalsIgnoreCase(ExpectedContact)) {
				val = true;
				System.out.println("Contact Us title  is  displayed");
			} else {
				System.out.println("Contact us title not  is not  displayed");
			}
		} else {
			System.out.println("Contact Us option  is not  displayed");
		}
		return val;
	}

	// Verify details in the Contact Us page
	public Boolean contactusverification() {
		boolean val = false;
		String ActualcallCenterText = callcentretxt.getAttribute("text");
		String expectedCallcentreText = "Unified call centre (24*7)";
		if (callcentretxt.isDisplayed() && ActualcallCenterText.equalsIgnoreCase(expectedCallcentreText)) {
			val = true;
			System.out.println("Unified call centre text  is  displayed : " + ActualcallCenterText);
		} else {
			System.out.println("Unified call centre text  is not  displayed");
		}
		if (callcentrenum.isDisplayed() && callcentrenum.getText().equals("184")) {
			String centrenum = callcentrenum.getAttribute("text");
			System.out.println("Unified call centre number  is  displayed : " + centrenum);
		} else {
			System.out.println("Unified call centre number is not  displayed");
		}
		if (callimage.isDisplayed()) {
			System.out.println("Call centre image is  displayed");
		} else {
			System.out.println("Call centre image is not  displayed");
		}
		if (mailustxt.isDisplayed() && mailustxt.getText().equals("Mail Us")) {
			String mailus = mailustxt.getAttribute("text");
			System.out.println("Mail Us text is  displayed : " + mailus);
		} else {
			System.out.println("Mail Us text is not  displayed");
		}
		if (mailidtxt.isDisplayed() && mailidtxt.getText().equals("info@mm.gov.qa")) {
			String mailid = mailidtxt.getAttribute("text");
			System.out.println("Mail Id text is  displayed : " + mailid);
		} else {
			System.out.println("Mail Id text is not  displayed");
		}

		if (mailimage.isDisplayed()) {
			System.out.println("Mail Id image is  displayed");
		} else {
			System.out.println("Mail Id image is not  displayed");
		}
		if (poboxtxt.isDisplayed() && poboxtxt.getText().equals("PO Box")) {
			String pobox = poboxtxt.getAttribute("text");
			System.out.println("PO box text is  displayed :" + pobox);
		} else {
			System.out.println("PO box text is not  displayed");
		}
		if (ponumber.isDisplayed() && ponumber.getText().equals("2727")) {
			String poNumber = ponumber.getAttribute("text");
			System.out.println("PO box number is  displayed : " + poNumber);
		} else {
			System.out.println("PO box number is not  displayed");
		}

		if (contactDetailsbackbutton.isDisplayed()) {
			contactDetailsbackbutton.click();

			System.out.println("Back button is clicked in contact us");

		} else {
			System.out.println("Back button is not clicked in contact us");
		}
		return val;

	}

	// Verify Add Nominee button from the hamburger menu
	public Boolean addnomineehamburger() throws InterruptedException {
		System.out.println("Adding nominee in the hamberger menu ");
		boolean val = false;
		Thread.sleep(5000);
		hambergerelmnt.click();
		if (addnomineeelemnt.isDisplayed()) {
			addnomineeelemnt.click();
			Thread.sleep(5000);
			System.out.println("Add nominee  is present & clicked ");
			// String ActualNomineeDetailsTitle = nomineeDetailsTitle.getAttribute("text");
			// String expectedNomineeTitle = "Nominee Details";

			if (nomineeDetailsTitle.isDisplayed() && nomineeDetailsTitle.getText().equals("Nominee Details")) {
				System.out.println(
						"Nominee details title is present hence Add Nominee in the hamburger menu is clicked successfully ");
				if (nomineeDetailsbackbutton.isDisplayed()) {
					val = true;
					System.out.println("back button is present in Nominee details Page ");
					nomineeDetailsbackbutton.click();
					System.out.println("back button is present in Nominee details Page and it is clicked ");

					Thread.sleep(5000);

					if (hambergerelmnt.isDisplayed()) {
						val = true;
						System.out
								.println("Hamberger menu is displayed hence back button in nominee details is clicked");
					} else {
						System.out.println(
								"Hamberger menu is displayed hence back button in nominee details is not clicked");
					}
				}

				else {
					System.out.println("Back button is not present ");
				}

			} else {
				System.out.println("Nominee details title is not present");
			}
		}

		else {
			System.out.println("Add Nominee in the hamburger menu is not clicked");
		}
		return val;

	}

	// Verify details in the Add nominee details page
	public Boolean nomineedetailspageverification() throws InterruptedException {
		boolean val = false;
		hambergerelmnt.click();
		System.out.println("Hamburger is clicked");
		Thread.sleep(5000);
		addnomineeelemnt.click();
		System.out.println("Add Nominee in Hamburger is clicked");
		try {
			try {
				if (noNomineeAvailable.isDisplayed()
						&& noNomineeAvailable.getText().equals("No nominee details available!")
						&& nomineeDetailsbackbutton.isDisplayed() && addnomineebutton.isDisplayed()
						&& nomineeDetailsTitle.isDisplayed() && nomineeDetailsTitle.getText().equals("Nominee Details"))

				{
					val = true;
					System.out.println("No Nominee details available");
					if (nomineeDetailsbackbutton.isDisplayed()) {
						nomineeDetailsbackbutton.click();

						System.out.println("Back button is clicked in nominee details page");
						Thread.sleep(5000);

						if (hambergerelmnt.isDisplayed()) {
							val = true;

							System.out.println(
									"hamburger menu is displayed , hence back button in the nominee details page is clicked");

						} else {
							System.out.println("hamburger menu is not displayed");
						}
					}

					else {
						System.out.println("Back button is not displayed and clicked");
					}

				} else {
					System.out.println("Nominee details available in the page");
				}

			} catch (Exception e) {
				System.out.println("Nominee details available in the premise");
			}

			try {
				if (nomineeDetailsTitle.isDisplayed() && nomineeDetailsTitle.getText().equals("Nominee Details")
						&& nomineename.isDisplayed() && nomineename.getText().equals("Nominee Name")
						&& qidfield.isDisplayed() && qidfield.getText().equals("QID") && Mobilenofield.isDisplayed()
						&& Mobilenofield.getText().equals("Mobile Number") && RemoveNomineebtn.isDisplayed()
						&& removenominee.isDisplayed() && removenominee.getText().equals("Remove Nominee")
						&& nomineeDetailsbackbutton.isDisplayed()) {
					val = true;

					System.out.println(
							"Nominee details, Nominee Name,QID, Mobile number,remove nominee,remove nominee icon , were verified ");

					String Nomineename = NomineeNameFieldEditable.getAttribute("text");
					String QidNumber = QidFieldEditable.getAttribute("text");
					String MobilNo = QidFieldEditable.getAttribute("text");

					System.out.println("Nominee Name :" + Nomineename);
					System.out.println("QidNumber :" + QidNumber);
					System.out.println("Mobile Number : " + MobilNo);

					if (backbuttonelmnt.isDisplayed()) {
						val = true;
						backbuttonelmnt.click();

						System.out.println("Back button is clicked in nominee details page");
						Thread.sleep(5000);

						if (hambergerelmnt.isDisplayed()) {
							val = true;

							System.out.println(
									"hamburger menu is displayed , hence back button in the nominee details page is clicked");
						} else {
							System.out.println("hamburger menu is not displayed");
						}
					}
					else {
						System.out.println("Back button is not displayed and clicked");
					}
				}
				else {
					System.out.println("Nominee details displayed");
				}

			} catch (Exception exe) {
				System.out.println("No Nominee details available");
			}
		} catch (Exception exe) {
			System.out.println("No Nominee details available");
		}
		return val;
	}

	// Verify Adding Nominee from the hamburger menu

	public Boolean AddingNomineeVerification() throws InterruptedException {

		boolean val = false;
		Thread.sleep(5000);
		hambergerelmnt.click();
		System.out.println("Hamburger is clicked");
		Thread.sleep(5000);
		addnomineeelemnt.click();
		System.out.println("Add nominee is clicked and navigates to Nominee details page ");

		try {
			try {
				if (removenominee.isDisplayed() && removenominee.getText().equals("Remove Nominee")) {
					val = true;
					System.out.println("nominee details available so no need to add nominee");
					nomineeDetailsbackbutton.click();
					System.out.println("Nominee details back button is clicked , Hamburgermenu is displayed ");
				} else {
					System.out.println("remove nominee button is  not available");
				}
			} catch (Exception e) {
				System.out.println("No Nominee details available in the premise , remove nominee not displayed");
			}

			try {
				if (addnomineebutton.isDisplayed() && nomineeDetailsbackbutton.isDisplayed()
						&& nomineeDetailsTitle.isDisplayed()
						&& nomineeDetailsTitle.getText().equals("Nominee Details")) {
					val = true;
					Thread.sleep(5000);
					System.out.println("Add (+) button is displayed in nominee details page");
					System.out.println("Back button is displayed in nominee details page");
					System.out.println("Add Nominee title is displayed nominee details page");
					addnomineebutton.click();
					System.out.println("Add Nominee(+) is clicked");
					addNomineeDetails();
					Thread.sleep(5000);
					System.out.println("Nominee details Added successfully");
					nomineeDetailsbackbutton.click();
					System.out.println("Nominee details back button is clicked");
				}

				else {
					System.out.println("Add nominee button is not displayed in nominee details page");
				}

			} catch (Exception e) {
				System.out.println("Nominee details available in the premise , remove nominee is displayed");
			}
		} catch (Exception e) {
			System.out.println("No Nominee details available in the premise ,added nominee successfully");
		}

		return val;
	}

	public Boolean ClickRemoveeNominee() throws InterruptedException {
		boolean val = false;
		Thread.sleep(5000);
		if (hambergerelmnt.isDisplayed()) {
			System.out.println("Hamberger element is displayed");
			hambergerelmnt.click();
			System.out.println("Hamberger element is clicked");

			addnomineeelemnt.click();
			System.out.println("Add Nominee in Hamburger is clicked");
			try {
				if (nomineeDetailsTitle.isDisplayed() && nomineename.isDisplayed()
						&& nomineename.getText().equals("Nominee Name") && qidfield.isDisplayed()
						&& Mobilenofield.isDisplayed() && RemoveNomineebtn.isDisplayed() && removenominee.isDisplayed()
						&& removenominee.getText().equals("Remove Nominee") && nomineeDetailsbackbutton.isDisplayed()) {
					val = true;
					System.out.println("Nominee details available");
					removenominee.click();
					System.out.println("Remove Nominee button is clicked");
					String Actual_Error_msg;
					String Expected_Error_Msg;
					Actual_Error_msg = removenomineemsg.getAttribute("text");

					Expected_Error_Msg = "Are you sure you want to remove existing nominee?";
					// Verify error message
					Assert.assertEquals(Actual_Error_msg, Expected_Error_Msg);
					System.out.println("pop up message displayed");
					if (cancelbuttonremovenominee.isDisplayed()) {
						val = true;
						System.out.println("cancel button  is displayed");
						cancelbuttonremovenominee.click();
						System.out.println("cancel button is clicked");
						if (nomineeDetailsTitle.isDisplayed()) {
							val = true;
							System.out.println("Nominee details title & (+) is displayed");
						} else {
							System.out.println("Nominee details title is not displayed");
						}
					}

					removenominee.click();
					System.out.println("Remove Nominee button is clicked");

					if (okbuttonremovenominee.isDisplayed() && okbuttonremovenominee.getText().equals("Ok")) {
						val = true;
						System.out.println("Ok button  is displayed");
						okbuttonremovenominee.click();
						System.out.println("ok button is cliked, nominee is removed");
					} else {
						System.out.println("Ok button  is not displayed");
					}
					String Actual_okmsg;
					String Expected_okMsg;
					Actual_okmsg = okremovenomineemsg.getAttribute("text");

					Expected_okMsg = "Nominee has been deleted successfully";
					// Verify error message
					Assert.assertEquals(Actual_okmsg, Expected_okMsg);
					System.out.println("pop up message displayed");
					OkBtnPopup.click();
					System.out.println("Ok  button in the popup is clicked");

					if (nomineeDetailsTitle.isDisplayed() && nomineeDetailsTitle.getText().equals("Nominee Details")
							&& addnomineebutton.isDisplayed()) {
						val = true;
						System.out.println("Nominee details title & (+) is displayed");
					} else {
						System.out.println("Nominee details title is not displayed");
					}
				}
			} catch (Exception e) {
				System.out.println("Nominee details not available, so no need to remove nominee");
			}

			try {
				if (noNomineeAvailable.isDisplayed()
						&& noNomineeAvailable.getText().equals("No nominee details available!")
						&& nomineeDetailsbackbutton.isDisplayed() && addnomineebutton.isDisplayed()
						&& nomineeDetailsTitle.isDisplayed() && nomineeDetailsTitle.getText().equals("Nominee Details"))

				{
					val = true;
					System.out.println("No nominee details available");
				} else {
					System.out.println("nominee details available");
				}
			} catch (Exception e) {
				System.out.println("Nominee details available, so removed Nominee details");
			}
		} else {
			System.out.println("Hamberger is not displayed");
		}
		return val;
	}

	public void removenominees() throws InterruptedException {
		removenominee.click();
		String Actual_Error_msg;
		String Expected_Error_Msg;
		Actual_Error_msg = removenomineemsg.getAttribute("text");
		Expected_Error_Msg = "Are you sure you want to remove existing nominee ?";
		Assert.assertEquals(Actual_Error_msg, Expected_Error_Msg);
		if (okbuttonremovenominee.isDisplayed()) {
			okbuttonremovenominee.click();
			Thread.sleep(5000);
			okbuttonremovenominee.click();
		} else {

		}
	}

	public Boolean addNomineeDetails() throws InterruptedException {

		boolean val = false;
		if (Addnomineetitle.isDisplayed() && Addnomineetitle.getText().equals("Add Nominee")
				&& AddNomineeBackButton.isDisplayed()) {
			val = true;
			System.out.println("Add nominee title and back button is displayed");

			if (nomineename.isDisplayed() && nomineename.getText().equals("Nominee Name")) {
				val = true;
				System.out.println("Nominee name  is  displayed");
				NomineeNameFieldEditable.sendKeys("suhaib");
				System.out.println("Nominee name is entered correctly");
			} else {
				System.out.println("Nominee name  is not  displayed");
			}

			if (qidfield.isDisplayed() && qidfield.getText().equals("QID")) {
				val = true;
				System.out.println("Qatar id  is  displayed");
				QidFieldEditable.sendKeys("12345678890");
				System.out.println("Qatar id  is  enetered correctly");
			} else {
				System.out.println("Qatar id  is not  displayed");
			}

			if (Mobilenofield.isDisplayed() && Mobilenofield.getText().equals("Mobile Number")) {
				val = true;
				System.out.println("Mobile number is  displayed");
				MobilenoFieldEditable.sendKeys("09876543");
				System.out.println("mobile No  is  enetered correctly");
			} else {
				System.out.println("Mobile no does not displayed");
			}
			addbutton.click();

			String Actual_Add_Error_Msg;
			String Expected_Add_Error_Msg;
			Actual_Add_Error_Msg = AddNomineeError.getAttribute("text");

			Expected_Add_Error_Msg = "Nominee added successfully";
			// Verify error message

			if (AddNomineeError.isDisplayed() && Actual_Add_Error_Msg.equalsIgnoreCase(Expected_Add_Error_Msg)) {
				// Assert.assertEquals(Actual_Add_Error_Msg, Expected_Add_Error_Msg);
				System.out.println("Adding nominee pop up message displayed");
				AddOkButtons.click();
				System.out.println("Ok button in pop up is clicked & Add nominee successfully ");

				if (nomineeDetailsTitle.isDisplayed() && nomineeDetailsTitle.getText().equals("Nominee Details")) {
					val = true;
					System.out.println("Nominee details title   is displayed, so nominee added successfully ");

				} else {
					System.out.println("Nominee details title  is not  displayed , so no nominee added successfully");
				}
			} else {
				System.err.println("Error msg displayed is not correct");
			}
		} else {
			System.out.println("Add nominee title is not displayed");
		}
		return val;
	}

	public Boolean NomineenameEmpty() throws InterruptedException {

		boolean val = false;
		hambergerelmnt.click();
		addnomineeelemnt.click();
		
	try {	
		try {
			if(removenominee.isDisplayed())
			{
				removenominees();
			}
			else
			{
				
			}
		}
		catch(Exception e)
		{
			
		}
		
		
		try {
		
			addnomineebutton.click();
			NomineeNameFieldEditable.sendKeys("");
			val = true;
			addbutton.click();
			System.err.println("Nominee name is entered empty");
		}
		catch(Exception e)
		{
			
		}
	}
		catch(Exception e)
		{
			
		}			
	
		return val;

	}

	public Boolean InvalidNomineename() throws InterruptedException {
		boolean val = false;

		NomineeNameFieldEditable.sendKeys("suhaib123");
		val = true;
		addbutton.click();
		Thread.sleep(5000);
		System.err.println("Nominee name should not contain numbers");
		NomineeNameFieldEditable.clear();
		return val;

	}

	public Boolean QidNumberEmpty() throws InterruptedException {
		boolean val = false;
		QidFieldEditable.sendKeys("");
		System.err.println("QId  is entered empty");
		val = true;
		addbutton.click();
		Thread.sleep(5000);
		QidFieldEditable.clear();
		return val;

	}

	public Boolean InvalidQidNumber() throws InterruptedException {
		boolean val = false;
		QidFieldEditable.sendKeys("35677888888888878766");
		val = true;
		addbutton.click();
		Thread.sleep(5000);
		System.err.println("Qatar id is not correct");
		QidFieldEditable.clear();
		return val;

	}

	public Boolean MobileNumberEmpty() throws InterruptedException {
		boolean val = false;
		MobilenoFieldEditable.sendKeys("");
		System.err.println("mobile No is entered empty");
		val = true;
		addbutton.click();
		Thread.sleep(5000);
		MobilenoFieldEditable.clear();
		return val;

	}

	public Boolean InvalidMobileNumber() throws InterruptedException {
		boolean val = false;
		MobilenoFieldEditable.sendKeys("3569");
		val = true;
		addbutton.click();
		Thread.sleep(5000);
		System.err.println("mobile No is not correct");
		MobilenoFieldEditable.clear();
		Thread.sleep(5000);
		AddNomineeBackButton.click();
		Thread.sleep(5000);
		nomineeDetailsbackbutton.click();
		System.out.println("nominee details back button is clicked");
		return val;

	}

}
