package qatarlivestock.pagefactory.android;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;

public class ScheduleExportAppointmentPage extends AndroidActions {
	AndroidDriver driver;

	public ScheduleExportAppointmentPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(id = "appointmentFragment")
	private WebElement AppointmentModule;

	@AndroidFindBy(id = "addAppointmentBtn")
	private WebElement addappointmentbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Health Examination for Exporting']")
	private WebElement Export;	
	
	@AndroidFindBy(className = "android.widget.Spinner")
	private WebElement PurposeDropdown;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Destination']")
	private WebElement Destination;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Date of shipping']")
	private WebElement DateofShipping;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Means of shipping']")
	private WebElement MeansofShipping;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Product']")
	private WebElement product;

	@AndroidFindBy(xpath = ".//android.widget.Switch[@text='Sampling required']")
	private WebElement samplimgRequired;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Clinic Name']")
	private WebElement CLinicName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Animal Type']")
	private WebElement AnimalType;

	@AndroidFindBy(id = "publicClinicTv")
	private WebElement publicClinicTv;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Doctor - Farm Visit']")
	private WebElement Farmvisit;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Purpose']")
	private WebElement purpose;

	@AndroidFindBy(id = "date")
	private WebElement datetime;

	@AndroidFindBy(id = "selectDateIv")
	private WebElement DateCalenderIcon;

	@AndroidFindBy(id = "selectedDateTv")
	private WebElement DateTextField;

	@AndroidFindBy(id = "isSamplingRequired")
	private WebElement myToggle;

	@AndroidFindBy(id = "meansSpinner")
	private WebElement MeansofShippingIcon;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Sea']")
	private WebElement Sea;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Land']")
	private WebElement Land;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Air']")
	private WebElement Air;

	@AndroidFindBy(id = "productSpinner")
	private WebElement productIcon;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Meat']")
	private WebElement Meat;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Breeding']")
	private WebElement Breedingdrop;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Milk']")
	private WebElement Milk;
	
	@AndroidFindBy(xpath = ".//android.widget.ImageButton[@content-desc=\"BackPress\"]")
	private WebElement AppDetailsbackbutton;

	@AndroidFindBy(id = "animalDetails")
	private WebElement ExportAnimalDetails;

	@AndroidFindBy(id = "radioButtonHerd")
	private WebElement Herd;

	@AndroidFindBy(id = "radioButtonIndividual")
	private WebElement Individual;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Species']")
	private WebElement speciesListName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Tag ID']")
	private WebElement TagId;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Cattle']")
	private WebElement cattle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Goat']")
	private WebElement goat;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Sheep']")
	private WebElement sheep;

	@AndroidFindBy(id = "speciesName")
	private WebElement SpeciesName;

	@AndroidFindBy(id = "totalCountEdt")
	private WebElement TotalCount;

	@AndroidFindBy(id = "speciesSpinner")
	private WebElement speciesListDropdown;

	@AndroidFindBy(id = "animalIdEt")
	private WebElement TagEt;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Comments']")
	private WebElement comment;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Clinic']")
	private WebElement Clinic;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Purpose']")
	private WebElement purposefield;

	@AndroidFindBy(id = "doctorFarmVisitComments")
	private WebElement commentEdit;

	@AndroidFindBy(id = "clinicSpinner")
	private WebElement clinicdropdown;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Public']")
	private WebElement publicClinic;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Private']")
	private WebElement privateClinic;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Confirmation']")
	private WebElement ConfirmationTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Confirmation']")
	private WebElement ConfirmationText;

	@AndroidFindBy(id = "bookingId")
	private WebElement appointmentiddetailspage;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Booking ID']")
	private WebElement BookingId;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Request has been successfully sent']")
	private WebElement RequestMsg;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Ok']")
	private WebElement Okbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Appointment']")
	private WebElement AppointmentListingTitle;

	@AndroidFindBy(className = "android.widget.ImageView")
	private WebElement TickMark;

	@AndroidFindBy(id = "monthsSpinner")
	private WebElement MonthSpinner;

	@AndroidFindBy(id = "month_name")
	private WebElement MonthName;

	@AndroidFindBy(id = "bookBtn")
	private WebElement bookBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Date']")
	private WebElement dateAppointment;

	@AndroidFindBy(id = "exportDetails")
	private WebElement ExportDetails;

	@AndroidFindBy(id = "appointmentBookId")
	private WebElement AppointmentBookingid;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Schedule Appointment']")
	private WebElement appointmenttitle;

	@AndroidFindBy(id = "purposeBookingID")
	private WebElement PurposeBookingid;

	@AndroidFindBy(id = "clinicNameSpinner")
	private WebElement clinicNamedropdown;

	@AndroidFindBy(xpath = ".//android.widget.TextView[3]")
	private WebElement clinicNameselected;

	@AndroidFindBy(xpath = ".//android.widget.ImageButton[@content-desc=\"BackPress\"]")
	private WebElement backbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Vaccination']")
	private WebElement Vaccination;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Pest Control']")
	private WebElement pestControl;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Pre-breeding Examination']")
	private WebElement Breeding;

	@AndroidFindBy(id = "alertMessage")
	private WebElement clinicNamealertMsg;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement clinicNameokButton;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Please enter tag id']")
	private WebElement TagIdError;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement TagIdErrorOkBtn;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.EditText")
	private WebElement TotalCountEdt;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.EditText")
	private WebElement TotalCountEdt2;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Please enter animal count']")
	private WebElement AnimalCountError;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Date']")
	private WebElement Date;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement AnimalCountErrorOkBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Exporting Appointment No']")
	private WebElement ExportAppointmentNo;

	@AndroidFindBy(id = "appoint_no_Et")
	private WebElement ExportNo;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")
	private WebElement monthscroll;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")
	private WebElement datescroll;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText")
	private WebElement yearscroll;

	@AndroidFindBy(xpath = ".//android.widget.EditText[@text='Jan']")
	private WebElement targetElement;

	@AndroidFindBy(id = "okDateBtn")
	private WebElement dateOkButton;

	@AndroidFindBy(id = "next")
	private WebElement nextCalenderBtn;

	@AndroidFindBy(id = "previous")
	private WebElement previouscalenderBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Please select date of shipping']")
	private WebElement ErrorDos;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement OkDos;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Preferred Date of Appointment']")
	private WebElement prefferedDateofAppointment;
	
//	@AndroidFindBy(xpath = ".//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText")
//	private WebElement prefferedDateEditText;
	
	@AndroidFindBy(xpath= ".//android.widget.CheckedTextView[@content-desc=\"29\"]")
	private WebElement prefferedDateEditText;	

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Exporting Appointment No']")
	private WebElement exportAppointment;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Available']")
	private WebElement AvailableText;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Unavailable']")
	private WebElement UnAvailableText;

	
	@AndroidFindBy(xpath = ".//android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.TextView")
	private WebElement prefferedErrorMessage;

	@AndroidFindBy(xpath = ".//android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button")
	private WebElement OkprefferedErrorMessage;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Booking ID']")
	private WebElement Bookingid;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> purposelist;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> cliniclist;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> clinicnamelist;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> speciesnamelist;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> destinationlist;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> productlist;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> meansofshippinglist;

	@AndroidFindBy(id = "destinationSpinner")
	private WebElement destinationListDropdown;

	@AndroidFindBy(id = "meansSpinner")
	private WebElement meansofshippingDropdown;

	@AndroidFindBy(id = "productSpinner")
	private WebElement productDropdown;

	@AndroidFindBy(className = "android.widget.CheckedTextView")
	private List<WebElement> dateElements;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")
	private WebElement monthEditText;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")
	private WebElement DateEditText;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText")
	private WebElement YearEditText;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]")
	private WebElement YearElementClick;

	@AndroidFindBy(xpath = ".//android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]")
	private WebElement YearpreviousElement;

	@AndroidFindBy(id = "appoint_no_Et")
	private WebElement ExportPurposeNo;

	@AndroidFindBy(id = "toolbarText")
	private WebElement appointmentTitleid;

	@AndroidFindBy(id = "purpose")
	private WebElement appointmentpurpose;

	@AndroidFindBy(id = "exportDetails")
	private WebElement exportdetailstext;

	@AndroidFindBy(id = "clinicName")
	private WebElement clinicname;

	@AndroidFindBy(id = "bookingId")
	private WebElement bookingid;
	
	@AndroidFindBy(id = "date")
	private WebElement bookingdate;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Request is under processing can’t cancel.']")
	private WebElement RequestcancelledMsg;

	@AndroidFindBy(id = "alertMessage")
	private WebElement RequestCancelled;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement OkcancelBtn;

	@AndroidFindBy(id = "purpose")
	private WebElement purposeExporting;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Port of Exit')]")
	private WebElement portOfExit;
	
		@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Destination')]")
		private WebElement DestinationExport;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Date of Shipping')]")
	private WebElement DateofShippingExport;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Means of Shipping')]")
	private WebElement MeansofshippingExport;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Exporting Purpose')]")
	private WebElement ExportingPurpose;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Sampling Required')]")
	private WebElement SamplingRequiredExport;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Animal Type')]")
	private WebElement AnimalTypeExport;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Animal Tag Id')]")
	private WebElement AnimalTagIdExport;

	@AndroidFindBy(id = "animalDetails")
	private WebElement SpeciesCountExport;

	@AndroidFindBy(id = "comments")
	private WebElement commentstext;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Health Examination for Exporting')]")
	private WebElement appointmentpurposeexport;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Do you want to set a calendar reminder for this appointment?']")
	private WebElement Calendertext;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Ok']")
	private WebElement OkCalendar;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Cancel']")
	private WebElement CancelCalendar;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Data has been saved successfully']")
	private WebElement DataCalendar;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='Ok']")
	private WebElement OkData;
	
	@AndroidFindBy(id = "alertMessage")
	private WebElement pastMsg;
	
	@AndroidFindBy(id = "alertOkButton")
	private WebElement OkpastMsg;
	
	@AndroidFindBy(id = "portSpinner")
	private WebElement portshippingDropdown;
	
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List <WebElement> portshippinglist;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Al Ruwais Port']")
	private WebElement AlRuwaisPort;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Doha Port']")
	private WebElement DohaPort;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Masaieed']")
	private WebElement Masaieed;
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='RasLaffan']")
	private WebElement RasLaffan;

	String ExpectedclinicalertMessage;
	String ActualClinicAlertmessage;
	public String substr2;
	public String substr1;

	public Boolean AppointmentModuleVerify() {

		/// Click on the Appointment name in the home page
		boolean val = false;
		AppointmentModule.click();
		System.out.println("Appointment module is clicked");
		String ExpectedAppointment = "Appointment";
		String ActualAppointment = AppointmentListingTitle.getAttribute("text");
		if (AppointmentListingTitle.isDisplayed() && ActualAppointment.equalsIgnoreCase(ExpectedAppointment)) {
			val = true;
			System.out.println("Appointment title is verified");

		} else {
			System.out.println("Appointment title is not verified ");

		}
		return val;

	}

	public Boolean AddAppointmentVerification() {

		/// Click on the Add Appointment name in the home page
		boolean val = false;
		addappointmentbtn.click();
		System.out.println("Add Appointment button is clicked");
		if (appointmenttitle.isDisplayed() && appointmenttitle.getText().equals("Schedule Appointment")) {
			val = true;
			System.out.println("Schedule Appointment title is verified");
			backbtn.click();
			System.out.println("Back Button is clicked");
			if (addappointmentbtn.isDisplayed()) {
				val = true;
				System.out.println("Back button is verified,Add Appointment icon is displayed");

			} else {
				System.out.println("Back button is not verified. Add Appointment icon is displayed");
			}

		} else {
			System.out.println("Schedule Appointment title is not verified ");

		}
		return val;
	}

	@SuppressWarnings({ "unused", "deprecation" })
	public Boolean exportpurposeValidation() throws InterruptedException {

		boolean val = false;
		addappointmentbtn.click();
		System.out.println("Add Appointment button is clicked");
		Thread.sleep(5000);
		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(5000);
		if (Breeding.isDisplayed() && Breeding.getText().equals("Pre-breeding Examination") && Farmvisit.isDisplayed()
				&& Farmvisit.getText().equals("Doctor - Farm Visit") && pestControl.isDisplayed()
				&& pestControl.getText().equals("Pest Control") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("Vaccination") && Export.isDisplayed()
				&& Export.getText().equals("Health Examination for Exporting")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit has been displayed , purpose dropdown verified successfully");
			Export.click();
			System.out.println("Export is clicked from dropdown");
		} else {
			System.out.println("purpose dropdown is not clicked");
		}

		if (publicClinicTv.isDisplayed() && publicClinicTv.getText().equals("Public Clinic")) {

			System.out.println("public clinic   has displayed");
		} else {
			System.out.println("public clinic   has not displayed");
		}

		if (purposefield.isDisplayed() && purposefield.getText().equals("Purpose") && Destination.isDisplayed()
				&& Destination.getText().equals("Destination") && DateofShipping.isDisplayed()
				&& DateofShipping.getText().equals("Date of shipping") && MeansofShipping.isDisplayed()
				&& MeansofShipping.getText().equals("Means of shipping") && portOfExit.isDisplayed() && portOfExit.getText().equals("Port of Exit") && product.isDisplayed()
				&& product.getText().equals("Product") && samplimgRequired.isDisplayed()
				&& samplimgRequired.getText().equals("Sampling required") ) {
			System.out.println(
					"purpose,destination,date of shipping, means of shipping, product, sampling required   has displayed");
		} else

		{
			System.out.println("No text  has displayed");
		}

		
		  WebElement element = (WebElement) driver .findElement(MobileBy.
		 AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		  ".scrollIntoView(new UiSelector().text(\"Tag ID\"));"));
		 
		
 		  if ( CLinicName.isDisplayed()
 					&& CLinicName.getText().equals("Clinic Name") && AnimalType.isDisplayed() && AnimalType.getText().equals("Animal Type") )
 		  {
		  System.out.println("Animal type, clinic name   has displayed"); 
		  } else
		  {
		  System.out.println("Animal type,, clinic name   has not displayed");
		  }
		 

		WebElement element12 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Book an appointment\"));"));

		Thread.sleep(5000);

		if ( prefferedDateofAppointment.isDisplayed()
					&& prefferedDateofAppointment.getText().equals("Preferred Date of Appointment") && AvailableText.isDisplayed() && AvailableText.getText().equals("Available") && UnAvailableText.isDisplayed() && UnAvailableText.getText().equals("Unavailable")
				&& exportAppointment.isDisplayed() && exportAppointment.getText().equals("Exporting Appointment No")
				&& nextCalenderBtn.isDisplayed() && previouscalenderBtn.isDisplayed() && MonthName.isDisplayed()
				&& bookBtn.isDisplayed()) {
			System.out.println(
					"Available,unAvailable,Export Appointment Number, next button, previous Button , month  Name,  exporting appointment no and preffered date of appointment And Book an Appointment has displayed");
			findTodaysDate();
			System.out.println("Calender past date is enabled and selected a future Date for Appointment");

			if (nextCalenderBtn.isDisplayed()) {
				nextCalenderBtn.click();
				System.out.println("next button in the calendar is clicked");
			} else {
				System.out.println("next button in the calendar is not  clicked");
			}

			if (previouscalenderBtn.isDisplayed()) {
				previouscalenderBtn.click();
				System.out.println("previous button in the calendar is clicked");
			} else {
				System.out.println("previous button in the calendar is not clicked");
			}

		} else {
			System.out.println(
					"Export Appointment Number,next button, previous Button , month  Name And Book an Appointment   has not displayed");
		}
		
		WebElement element10 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Public Clinic\"));"));
  
		backbuttonverification();
		// System.out.println("Back button in the appointment details page is verified
		// successfully ");
		
		return val;
	}

	public boolean exportIndividualAppointment() throws InterruptedException {
		boolean val = false;
		Thread.sleep(5000);
		addappointmentbtn.click();
		
	
		
	/*	WebElement element10 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Public Clinic\"));"));
						*/
		purposeList();
		System.out.println("Purpose dropdown isdropdown list verified successfully");
		PurposeDropdown.click();
		Thread.sleep(5000);
		System.out.println("Purpose dropdown is clicked successfully");
		if (Breeding.isDisplayed() && Breeding.getText().equals("Pre-breeding Examination") && Farmvisit.isDisplayed()
				&& Farmvisit.getText().equals("Doctor - Farm Visit") && pestControl.isDisplayed()
				&& pestControl.getText().equals("Pest Control") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("Vaccination") && Export.isDisplayed()
				&& Export.getText().equals("Health Examination for Exporting")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination , Exporting Doctor -farm visit has been displayed , purpose dropdown verified successfully");
			Export.click();
			System.out.println("Export is clicked from dropdown");
		} else {
			System.out.println("purpose dropdown is not clicked");
		}
		DestinationList();
		System.out.println("Destination is a dropdown list and a destination is selected from the list");
		Verifydateofshiping();
		System.out.println("Date of shipping is not selected");
		VerifyDateCalenderField();
		System.out.println("Date  is clicked and date  is selected displayed successfully");
		VerifyMeansofShippingDropDown();
		System.out.println("means of shipping dropdown is clicked and values  is displayed successfully");
		VerifyShippingPortDropDown();
		System.out.println("Port of Exit  shipping dropdown is clicked and values  is displayed successfully");
		VerifyproductDropDown();
		System.out.println("product  dropdown is clicked and values is displayed successfully");
		samplingRequired();
		System.out.println("sampling required is verified successfully");
		verifyClinicNameEmpty();
		System.out.println("Clinic Name dropdown is not selected , alert message displayed");
		verifyClinicName();
		System.out.println("Clinic Name dropdown is clicked and clinic names is displayed successfully");
		VerifyAnimaltype();
		System.out.println("Animal type is clicked, Individual and herd is displayed successfully");
		ClickIndividual();
		System.out.println("Individual is clicked,Species and Tagid is displayed successfully");
		VerifySpeciesIndividual();
		System.out.println("Species dropdown in Individual is clicked , species list is displayed successfully");
		ClickHerd();
		System.out.println("Herd is clicked,Species list and Count box is displayed successfully");
		VerifySpeciesHerd();
		System.out.println("Species in herd is clicked ,species list is displayed successfully");
		ClickTagIdEmpty();
		System.out.println("Individual is clicked and tag id empty is verified successfully");
		ClickTagIdBookNBtn();
		System.out.println("Individual  is clicked and Tag id with value is verified successfully");
		verifyPrefferedDate();
		System.out.println("date of shipping should not be less than prefferd date");
		prefferedDate();
		System.out.println("preffered has been given successfully");
		setDateofshipping();
		System.out.println("date of shipping is  greater  than prefferd date");		
		verifyExportTagIdBookingbtn();
		System.out.println(
				"Individual  is clicked and Tag id with value is given, book an appointment is clicked, confirmation page is verified and booking is verified from appointment list is verified successfully");

		// appointmentPestcontrolidverification();
		// System.out.println("purpose id in the appointment details page is clicked,
		// verified the details page ");
		// backbuttonverification();
		// System.out.println("Back button in the appointment details page is verified
		// successfully ");
		return val;

	}

	public boolean exportHerdAppointment() throws InterruptedException {
		Thread.sleep(5000);
		boolean val = false;
		addappointmentbtn.click();

	/*	WebElement element = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Public Clinic\"));"));
*/
		PurposeDropdown.click();
		Thread.sleep(5000);
		System.out.println("Purpose dropdown is clicked successfully");
		if (Breeding.isDisplayed() && Breeding.getText().equals("Pre-breeding Examination") && Farmvisit.isDisplayed()
				&& Farmvisit.getText().equals("Doctor - Farm Visit") && pestControl.isDisplayed()
				&& pestControl.getText().equals("Pest Control") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("Vaccination") && Export.isDisplayed()
				&& Export.getText().equals("Health Examination for Exporting")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination , Exporting Doctor -farm visit has been displayed , purpose dropdown verified successfully");
			Export.click();
			System.out.println("Export is clicked from dropdown");
		} else {
			System.out.println("purpose dropdown is not clicked");
		}
		Verifydateofshiping();
		System.out.println("Date of shipping is not selected");
		VerifyDateCalenderField();
		System.out.println("Date  is clicked and date  selected displayed successfully");
		VerifyMeansofShippingDropDown();
		System.out.println("means of shipping dropdown is clicked and values  is displayed successfully");
		VerifyproductDropDown();
		System.out.println("product  dropdown is clicked and values is displayed successfully");
		verifyClinicNameEmpty();
		System.out.println("Clinic Name dropdown is not selected , alert message displayed");
		verifyClinicName();
		System.out.println("Clinic Name dropdown is clicked and clinic names is displayed successfully");
		VerifyAnimaltype();
		System.out.println("Animal type is clicked, Individual and herd is displayed successfully");
		ClickIndividual();
		System.out.println("Individual is clicked,Species and Tagid is displayed successfully");
		VerifySpeciesIndividual();
		System.out.println("Species dropdown in Individual is clicked , species list is displayed successfully");
		ClickHerd();
		System.out.println("Herd is clicked,Species list and Count box is displayed successfully");
		VerifySpeciesHerd();
		System.out.println("Species in herd is clicked ,species list is displayed successfully");
		ExportAnimalCountEmpty();
		System.out.println("Herd is clicked and Animal count empty is verified successfully");
		ExportAnimalCountBookNBtn();
		System.out.println("Herd is clicked and Animal Count with value is verified successfully");
		verifyPrefferedDate();
		System.out.println("date of shipping is less than prefferd date");
		prefferedDate();
		System.out.println("preffered has been given successfully");
		setDateofshipping();
		System.out.println("date of shipping is  greater  than prefferd date");
		verifyExportAnimalCountBookingbtn();
		System.out.println(
				"Herd is clicked and Animal Count with value is given, book an appointment is clicked, confirmation page is verified and booking is verified from appointment list is verified successfully");

		// appointmentPestcontrolidverification();
		// System.out.println("purpose id in the appointment details page is clicked,
		// verified the details page ");
		// backbuttonverification();
		// System.out.println("Back button in the appointment details page is verified
		// successfully ");
		return val;

	}

	public void ExportAnimalCountEmpty() throws InterruptedException {
		// addappointmentbtn.click();
		/*
		 * PurposeDropdown.click(); Breeding.click(); ClinicDropdown.click();
		 * publicclinic.click(); clinicNamedropdown.click(); clinicNameselected.click();
		 * Herd.click();
		 */
		String Exporting_Number = ExportPurposeNo.getText();
		System.out.println("Exporting number is:" + Exporting_Number);

		TotalCountEdt.sendKeys("");
		WebElement element13 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Book an appointment\"));"));
		Thread.sleep(5000);

		bookBtn.click();

		// This will capture error message

		String Actual_Error_msg;
		String Expected_Error_Msg;
		Actual_Error_msg = AnimalCountError.getAttribute("text");

		Expected_Error_Msg = "Please enter animal count";
		// Verify error message
		Assert.assertEquals(Actual_Error_msg, Expected_Error_Msg);
		System.err.println("Error message displayed Please enter animal count");

		AnimalCountErrorOkBtn.click();

		System.out.println("Error message get closed in Animal count");
		
		WebElement element7 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Animal Type\"));"));
	}

	public void ExportAnimalCountBookNBtn() {
		

		TotalCountEdt.sendKeys("100");
		TotalCountEdt2.sendKeys("20");
		WebElement element13 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Book an appointment\"));"));
		bookBtn.click();
		System.out.println("Booking Appointment Button is clicked when Animal Count is selected");
	}

	public void verifyExportAnimalCountBookingbtn() throws InterruptedException {
		if (ConfirmationTitle.isDisplayed()) {

			System.out.println("Booking button verified ,Confirmation title displayed when Animal count is selected");

			if (CLinicName.isDisplayed() && RequestMsg.isDisplayed() && ConfirmationText.isDisplayed()
					&& TickMark.isDisplayed() && Bookingid.isDisplayed()) {

				System.out.println("confirmation page elements verified when Animal count is selected");

			} else {

				System.out.println("confirmation page elements not verified when Animal count is selected");

			}

			String Booking_Id = AppointmentBookingid.getAttribute("text");
			Okbtn.click();
			System.out.println("Ok  Button is clicked & verified");

			CalendarReminder();
			System.out.println("Reminder is added to calendar");

			
			Thread.sleep(5000);
			String AppointmentIdTitle = PurposeBookingid.getAttribute("text");

			String longWord = AppointmentIdTitle;

			// Check if the word is at least 8 characters long
			if (longWord.length() >= 7) {
				// Extract the last 8 characters
				String last8Digits = longWord.substring(longWord.length() - 7);

				// Print or use the variable
				System.out.println(last8Digits);

				if (last8Digits.equals(Booking_Id)) {
					System.out.println("String assertion passed!" + Booking_Id);
					System.out.println("Booking id is displayed same in the Appointment list");

				} else {
					System.err.println("String assertion failed!" + Booking_Id);
					System.out.println("Booking id is not displayed same in the Appointment list");
				}

			} else {
				System.out.println("The word is not long enough.");
			}

		} else {

			System.out.println(
					"Booking button not verified if Animal count is selected,confirmation title is not  displayed if Animal count is selected");

		}
	}

	public Boolean VerifyDateCalenderField() throws InterruptedException {
		boolean val = false;
		// addappointmentbtn.click();
//		PurposeDropdown.click();
		// Export.click();
		WebElement element14 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Date of shipping\"));"));

		if (DateCalenderIcon.isDisplayed() && DateTextField.isDisplayed()) {
			val = true;
			System.out.println("DateField & Calender icon   has displayed");
		}

		else {
			System.out.println("DateField & Calender icon   has not displayed");
		}

		if (DateCalenderIcon.isDisplayed()) {

			// LocalDate today = LocalDate.now();
			// System.out.println(today);

			DateCalenderIcon.click();
			Thread.sleep(5000);
			// DateCalenderIcon.click();
			System.out.println("CalenderIcon is clicked");

			Thread.sleep(5000);

			dateOkButton.click();
			System.out.println(" ok button is clicked");
			String DateofShipping = DateTextField.getText();
			System.out.println(" Date of shipping selected is : " + DateofShipping);

		} else {
			System.out.println(" Date Calendar is not Displayed");
		}

		return val;
	}

	public boolean dateSelection() {
		boolean val = false;
		System.out.println("date selecttion for Appointment");
		val = true;
		return val;

	}

	public void Verifydateofshiping() throws InterruptedException {

		boolean val = false;
		System.out.println(" date of shipping is empty is selected");

		WebElement element2 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Book an appointment\"));"));
		bookBtn.click();
		Thread.sleep(5000);
		String Actualdateofshipping = ErrorDos.getAttribute("text");
		String Expecteddateofshipping = "Please select date of shipping";
		// Verify error message
		Assert.assertEquals(Actualdateofshipping, Expecteddateofshipping);
		val = true;
		System.err.println("Date of shipping error message displayed: " + Actualdateofshipping);

		OkDos.click();
		System.out.println("ok button in the date of shipping error message is clicked");

	}

	public void VerifyMeansofShippingDropDown() throws InterruptedException {
		Thread.sleep(5000);
		WebElement element14 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Date of shipping\"));"));
		MeansofshippingList();

		System.out.println(" Means of shipping  is a dropdown and verified successfully");
	}
	
	public void VerifyShippingPortDropDown() throws InterruptedException {
		Thread.sleep(5000);
	/*	WebElement element15 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Port of Exit\"));"));
						*/
		shippingPort();

		System.out.println(" Port of exit shipping  is a dropdown and verified successfully");
	}
	
	
	public Boolean shippingPort() throws InterruptedException {

		boolean val = false;
		Thread.sleep(5000);
		if (portOfExit.isDisplayed() && portOfExit.getText().equals("Port of Exit")) {
		  portshippingDropdown.click();
			System.out.println("Port of exit shipping  dropdown is clicked successfully");
			Thread.sleep(5000);
			int listSize2 = portshippinglist.size();
			if (AlRuwaisPort.isDisplayed() && DohaPort.isDisplayed() && Masaieed.isDisplayed() && RasLaffan.isDisplayed()) {
				System.out.println("port of exit  elements has Verified");
			} else {
				System.out.println(" Port of exit elements has not  Verified");
			}
			val = true;
			// Print the size of the list
			System.out.println("Size of the list: " + listSize2);
			int indexToSelect6 = 2;
			WebElement selectedElement6 = portshippinglist.get(indexToSelect6);
			String element4 = selectedElement6.getAttribute("text");
			System.out.println("Selected from dropdownlist: " + element4);
			Thread.sleep(5000);
			// Perform actions with the selected element
			selectedElement6.click(); // For example, click on the element
			System.out.println("means of shipping   is a  dropdown list");
		}
		return val;
	}
	
	

	public void VerifyproductDropDown() throws InterruptedException {
		ProductDropdownList();
		System.out.println(" Product   is a dropdown and verified successfully");

	}

	public Boolean verifyClinicNameEmpty() throws InterruptedException {

	/*	WebElement element15 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Exporting Appointment No\"));"));
*/
		
		boolean val = false;
		Thread.sleep(5000);

		WebElement element16 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Book an appointment\"));"));
		bookBtn.click();

		ExpectedclinicalertMessage = clinicNamealertMsg.getAttribute("text");
		ActualClinicAlertmessage = "Please select clinic name";

		Assert.assertEquals(ActualClinicAlertmessage, ExpectedclinicalertMessage);
		System.err.println("Error message displayed Please Select clinic");

		clinicNameokButton.click();
		System.out.println("Ok button inside clinic Name error message is displayed and clicked successfully");

		return val;

	}

	public void verifyClinicName() throws InterruptedException {

		WebElement element5 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Clinic Name\"));"));

		boolean val = false;
		Thread.sleep(5000);

		ClinicNameList();
		System.out.println("clinic Name has been selected");

	}

	public void VerifyAnimaltype() {

		WebElement element6 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Tag ID\"));"));
		
		if (Individual.isDisplayed() && Herd.isDisplayed()) {
			System.out.println("Individual & Herd  displayed");
		} else {
			System.out.println("No Animaltype has displayed");
		}
	}

	public void ClickIndividual() {
		Individual.click();
		System.out.println("Individual is clicked");
		if (speciesListName.isDisplayed() && TagId.isDisplayed()) {
			System.out.println("SpeciesList & TagId elements has Verified when Individual is clicked");
		} else {
			System.out.println("No elements  has displayed");
		}
	}

	public void VerifySpeciesIndividual() throws InterruptedException {
		Individual.click();
		System.out.println("individual is clicked");
		SpeciesNameList();
	}

	public void ClickHerd() {
		Herd.click();
		System.out.println("Herd is clicked");
		
		WebElement element12 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Exporting Appointment No\"));"));

		if (SpeciesName.isDisplayed() && TotalCount.isDisplayed()) {
			System.out.println("SpeciesName & TotalCount elements has Verified when Herd is clicked");
		} else {
			System.out.println("No elements  has displayed");
		}

	}

	public void VerifySpeciesHerd() {

				
		if (cattle.isDisplayed() && goat.isDisplayed() && sheep.isDisplayed()) {
			System.out.println("cattle, sheep & goat elements has Verified when Herd is clicked");
		} else {
			System.out.println("No elements  has displayed");
		}
	}

	public void ClickTagIdEmpty() {
		Individual.click();
		String Exporting_Number = ExportPurposeNo.getText();
		System.out.println("Exporting number is:" + Exporting_Number);
		TagEt.sendKeys("");

		WebElement element7 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Book an appointment\"));"));

		bookBtn.click();

		// This will capture error message

		String Actual_Error_msg;
		String Expected_Error_Msg;
		Actual_Error_msg = TagIdError.getAttribute("text");

		Expected_Error_Msg = "Please enter tag id";
		// Verify error message
		Assert.assertEquals(Actual_Error_msg, Expected_Error_Msg);
		System.err.println("Error message displayed Please enter tag id");

		TagIdErrorOkBtn.click();

		System.out.println("Error message get closed in tag Id");

	}

	public void ClickTagIdBookNBtn() {

		TagEt.sendKeys("10065");
		System.err.println("please enter valid tag Id");
		bookBtn.click();

		TagEt.sendKeys("1006578656789546");
		System.out.println("Tag id entered is correct");
		bookBtn.click();
		System.out.println("Booking Appointment Button is clicked");

	}

	public void verifyExportTagIdBookingbtn() throws InterruptedException {
		Thread.sleep(5000);
		if (ConfirmationTitle.isDisplayed()) {
			System.out.println("Booking button verified,confirmation title is displayed");
			if (CLinicName.isDisplayed() && dateAppointment.isDisplayed() && RequestMsg.isDisplayed()
					&& ConfirmationText.isDisplayed() && TickMark.isDisplayed() && AppointmentBookingid.isDisplayed()) {
				System.out.println("confirmation page elements verified");
			} else {
				System.out.println("confirmation page elements not verified");
			}

			String Booking_Id = AppointmentBookingid.getAttribute("text");
			Okbtn.click();
			System.out.println("Ok  Button in the confirmation page is clicked ");

			CalendarReminder();
			System.out.println("Reminder is added to calendar");

		

			if (AppointmentListingTitle.isDisplayed()) {
				System.out.println("Ok button is verified, appointment title is displayed");
			} else {
				System.out.println("Ok button is  not verified");
			}

			Thread.sleep(5000);
			String AppointmentIdTitle = PurposeBookingid.getAttribute("text");

			String longWord = AppointmentIdTitle;

			// Check if the word is at least 8 characters long
			if (longWord.length() >= 7) {
				// Extract the last 8 characters
				String last8Digits = longWord.substring(longWord.length() - 7);

				// Print or use the variable
				System.out.println(last8Digits);

				if (last8Digits.equals(Booking_Id)) {
					System.out.println("String assertion passed!" + Booking_Id);
					System.out.println("Booking id is displayed same in the Appointment list");

				} else {
					System.err.println("String assertion failed!" + Booking_Id);
					System.out.println("Booking id is not displayed same in the Appointment list");
				}

			} else {
				System.out.println("The word is not long enough.");
			}
		} else {
			System.out.println("Booking button not verified, confirmation title is not displayed");
		}
	}

	public boolean verifyPrefferedDate() {
		boolean val = false;

		if (prefferedErrorMessage.isDisplayed()) {
			val = true;
			System.err.println("please select preffered date is displayed successfully");
			OkprefferedErrorMessage.click();
			System.out.println("ok button in the error message is clicked");

		//	String prefferedMessage = prefferedErrorMessage.getAttribute("text");
		//	String ExpectedMessage = "Past date is not acceptable for date of shipping Preferred date should be prior to date of shipping";
		//	Assert.assertEquals(prefferedMessage, ExpectedMessage);

		//	System.err.println("Past date will not be accepted for preferred date and date of shipping");
			
		}
		return val;

	}

	public Boolean purposeList() throws InterruptedException {
		boolean val = false;
		Thread.sleep(5000);
		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(5000);
		int listSize1 = purposelist.size();
		val = true;
		// Print the size of the list
		System.out.println("Size of the list: " + listSize1);
		int indexToSelect = 2;

		WebElement selectedElement1 = purposelist.get(indexToSelect);

		String element1 = selectedElement1.getAttribute("text");
		System.out.println("Selected from dropdown list is: " + element1);
		// Perform actions with the selected element
		selectedElement1.click(); // For example, click on the element

		System.out.println(" purpose is a  dropdown list ");

		return val;
	}

	public Boolean ClinicNameList() throws InterruptedException {
		boolean val = false;
		
		clinicNamedropdown.click();
		System.out.println("clinic  name  dropdown is clicked successfully");
		Thread.sleep(5000);
		int listSize2 = clinicnamelist.size();
		val = true;
		// Print the size of the list
		System.out.println("Size of the list: " + listSize2);

		int indexToSelect2 = 8;
		WebElement selectedElement3 = clinicnamelist.get(indexToSelect2);
		String element3 = selectedElement3.getAttribute("text");
		System.out.println("Selected from dropdownlist: " + element3);

		// Perform actions with the selected element
		selectedElement3.click(); // For example, click on the element

		System.out.println("clinic name is a  dropdown list");

		return val;
	}

	public Boolean SpeciesNameList() throws InterruptedException {

		boolean val = false;
		speciesListDropdown.click();
		System.out.println("Species list dropdown is clicked successfully");
		Thread.sleep(5000);
	
		int listSize2 = speciesnamelist.size();
		val = true;
		// Print the size of the list
		System.out.println("Size of the list: " + listSize2);
		if (cattle.isDisplayed() && sheep.isDisplayed() && goat.isDisplayed()) {
			System.out.println("cattle, sheep & goat elements has Verified when individual is  clicked");
		} else {
			System.out.println(" No elements  has displayed");
		}
		int indexToSelect = 2;
		WebElement selectedElement4 = speciesnamelist.get(indexToSelect);
		String element4 = selectedElement4.getAttribute("text");
		System.out.println("Selected from dropdownlist: " + element4);
		Thread.sleep(5000);
		// Perform actions with the selected element
		selectedElement4.click(); // For example, click on the element

		System.out.println("Species  is a  dropdown list");
		return val;
	}

	public Boolean DestinationList() throws InterruptedException {

		boolean val = false;
		Thread.sleep(5000);
		if (Destination.isDisplayed() && Destination.getText().equals("Destination")) {
			destinationListDropdown.click();
			System.out.println("destination dropdown is clicked successfully");
			Thread.sleep(5000);
			int listSize2 = destinationlist.size();
			val = true;
			// Print the size of the list
			System.out.println("Size of the list: " + listSize2);
			int indexToSelect5 = 2;
			WebElement selectedElement4 = destinationlist.get(indexToSelect5);
			String element4 = selectedElement4.getAttribute("text");
			System.out.println("Selected from dropdownlist: " + element4);
			// Perform actions with the selected element
			selectedElement4.click(); // For example, click on the element

			System.out.println("destination  is a  dropdown list");
		}
		return val;
	}

	public Boolean MeansofshippingList() throws InterruptedException {

		boolean val = false;
		Thread.sleep(5000);
		if (MeansofShipping.isDisplayed() && MeansofShipping.getText().equals("Means of shipping")) {
			meansofshippingDropdown.click();
			System.out.println("Means of shipping  dropdown is clicked successfully");
			Thread.sleep(5000);
			int listSize2 = meansofshippinglist.size();
			if (Sea.isDisplayed() && Land.isDisplayed() && Air.isDisplayed()) {
				System.out.println(" Means of shipping  elements has Verified");
			} else {
				System.out.println("Means of shipping elements has not  Verified");
			}
			val = true;
			// Print the size of the list
			System.out.println("Size of the list: " + listSize2);
			int indexToSelect6 = 2;
			WebElement selectedElement4 = meansofshippinglist.get(indexToSelect6);
			String element4 = selectedElement4.getAttribute("text");
			System.out.println("Selected from dropdownlist: " + element4);
			// Perform actions with the selected element
			selectedElement4.click(); // For example, click on the element
			System.out.println("means of shipping   is a  dropdown list");
		}
		return val;
	}

	public Boolean ProductDropdownList() throws InterruptedException {
		boolean val = false;

		Thread.sleep(5000);
		if (product.isDisplayed() && product.getText().equals("Product")) {
			productDropdown.click();
			int listSize2 = productlist.size();
			if (Meat.isDisplayed() && Breedingdrop.isDisplayed() && Milk.isDisplayed()) {
				System.out.println(" Product  Dropdown  elements has Verified");
			} else {
				System.out.println("Product  Dropdown elements has not  Verified");
			}
			val = true;
			// Print the size of the list
			System.out.println("Size of the list: " + listSize2);
			int indexToSelect7 = 2;
			WebElement selectedElement4 = productlist.get(indexToSelect7);
			String element4 = selectedElement4.getAttribute("text");
			System.out.println("Selected from dropdownlist: " + element4);
			// Perform actions with the selected element
			selectedElement4.click(); // For example, click on the element

			System.out.println("product   is a  dropdown list");
		}
		return val;
	}

	public boolean findTodaysDate() throws InterruptedException {
		boolean val = false;
		// Get today's date

		System.out.println("Verifying calendar below the exporting Number");

		LocalDate today = LocalDate.now();

		for (WebElement dateElement : dateElements) {
			String dateText = dateElement.getText();

			LocalDate pastDate = today.plusDays(-1);
			System.out.println(pastDate);

			// Compare the date with today's date
			if (pastDate.isBefore(today)) {
				val = true;
				System.out.println("Found a date before today: " + pastDate);
				// Perform any additional actions, e.g., click on the date element
				if (!dateElement.isEnabled()) {
					System.out.println("pastDate is disabled");
				} else {
					System.out.println("pastDate is not disabled");
				}

				System.out.println("selected past date is displayed: " + pastDate);

				LocalDate futureDate = today.plusDays(1);
				System.out.println(futureDate);

				// Compare the date with today's date
				if (futureDate.isAfter(today)) {
					val = true;
					System.out.println("Found a date after today: " + futureDate);
					// Perform any additional actions, e.g., click on the date element
					if (dateElement.isEnabled()) {
						System.out.println("futureDate is disabled");
					} else {
						System.out.println("futureDate is not disabled");
					}

					if (!dateElement.isSelected()) {
						System.out.println("futureDate is selected");
						// dateElement.click();
						// System.out.println("futureDate is clicked" + dateElement);
					} else {
						System.out.println("futureDate is not selected");
					}

					System.out.println("selected Future date is displayed");

					break;
				}
			}

		}
		return val;
	}

	public boolean samplingRequired() {
		boolean val = false;
		if (samplimgRequired.isDisplayed()) {
			if (samplimgRequired.getText().equals("Off")) {
				// Toggle the button to "On" state
				samplimgRequired.click();
				System.out.println("Toggle button switched to 'On' state.");
			} else {
				// Toggle the button to "Off" state
				samplimgRequired.click();
				System.out.println("Toggle button switched to 'Off' state.");
			}
		}

		val = true;

		return val;

	}

	public boolean setDateofshipping() throws InterruptedException {
		boolean val = false;
		WebElement element14 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"Date of shipping\"));"));

		if (DateCalenderIcon.isDisplayed() && DateTextField.isDisplayed()) {
			val = true;
			System.out.println("DateField & Calender icon   has displayed");
		}

		else {
			System.out.println("DateField & Calender icon   has not displayed");
		}

		if (DateCalenderIcon.isDisplayed()) {

			DateCalenderIcon.click();
			Thread.sleep(5000);
			System.out.println("CalenderIcon is clicked");

			Thread.sleep(5000);
			monthEditText.clear();
			monthEditText.click();
			Thread.sleep(5000);
			monthEditText.sendKeys("Mar");
			DateEditText.clear();
			DateEditText.click();
			Thread.sleep(5000);
			DateEditText.sendKeys("14");
			YearEditText.clear();
			YearEditText.click();
			Thread.sleep(5000);
			YearEditText.sendKeys("2025");
			Thread.sleep(5000);

			WebElement element13 = (WebElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"OK\"));"));

			Thread.sleep(5000);

			dateOkButton.click();
			System.out.println("  ok button is clicked");

			WebElement element12 = (WebElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"Book an appointment\"));"));

			bookBtn.click();
			System.out.println("Booking Appointment Button is clicked when ID  is selected");

		} else {
			System.out.println(" Date Callendar is not Displayed");
		}

		return val;

	}

	public boolean exportpurposeIndividualdetails() throws InterruptedException {

		Thread.sleep(5000);
		boolean val = false;
		/*
		 * WebElement elementToScrollTo = driver.findElement(By.
		 * xpath(".//android.widget.TextView[contains(@text,'Health Certificate for Exporting')]"
		 * )); // Use JavascriptExecutor to scroll to the element ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);",
		 * elementToScrollTo);
		 */
		if (appointmentpurposeexport.isDisplayed()) {
			val = true;
			String ExportAppointment = appointmentpurposeexport.getAttribute("text");
			System.out.println("Export purpose is clicked " + ExportAppointment);
			String str = ExportAppointment;

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(35);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 32);
			System.out.println(substr2);

			appointmentpurposeexport.click();
			Thread.sleep(5000);
			String exportingTitle = appointmentpurposeexport.getAttribute("text");
			System.out.println("Export purpose is clicked: " + exportingTitle);

			String exportingText = appointmentiddetailspage.getAttribute("text");

			if (exportingText.equalsIgnoreCase(substr1)) {
				val = true;
				System.out.println("Appointment title Id is same as Appointment id in the list : " + exportingText);
			} else {
				System.err.println("Appointment Export id is not displayed");
			}

			if (exportingTitle.equalsIgnoreCase(substr2)) {
				val = true;
				System.out.println(
						"Appointment Export purpose name is same as Appointment name in the list : " + exportingTitle);
			} else {
				System.err.println("Appointment Export purpose name is not displayed");
			}
		} else {
			System.err.println("Appointment Export purpose is not displayed");
		}

		if (ExportDetails.isDisplayed()) {
			String exportdetailpage = ExportDetails.getText();
			System.out.println("Exporting details are : " + exportdetailpage);

		} else {
			System.out.println("export details not displayed");
		}

		if (clinicname.isDisplayed()) {
			val = true;
			String clinics = clinicname.getAttribute("text");
			System.out.println("Clinic name is Displayed : " + clinics);
		} else {
			System.out.println("Clinic name is not Displayed");
		}
		if (bookingid.isDisplayed()) {
			val = true;
			String BookingId = bookingid.getAttribute("text");
			System.out.println("Booking Id is Displayed : " + BookingId);
		} else {
			System.out.println("Booking Id is not Displayed");
		}
		if (Date.isDisplayed()) {
			val = true;
			String ExportDate = datetime.getAttribute("text");
			System.out.println("Booking date is Displayed : " + ExportDate);
		} else {
			System.out.println("Booking date is not Displayed");
		}
		backbtn.click();

		System.out.println("Back button is clicked successfully");

		return val;
	}

	public boolean exportpurposeHerddetails() throws InterruptedException {

		Thread.sleep(5000);
		boolean val = false;
		/*
		 * WebElement elementToScrollTo = driver.findElement(By.
		 * xpath(".//android.widget.TextView[contains(@text,'Health Certificate for Exporting')]"
		 * )); // Use JavascriptExecutor to scroll to the element ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);",
		 * elementToScrollTo);
		 */
		if (appointmentpurposeexport.isDisplayed()) {
			val = true;
			String ExportAppointment = appointmentpurposeexport.getAttribute("text");
			System.out.println("Export purpose is clicked " + ExportAppointment);
			String str = ExportAppointment;

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(37);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 32);
			System.out.println(substr2);

			appointmentpurposeexport.click();
			Thread.sleep(5000);
			String exportingTitle = appointmentpurposeexport.getAttribute("text");
			System.out.println("Export purpose is clicked: " + exportingTitle);

			String exportingText = appointmentiddetailspage.getAttribute("text");

			if (exportingText.equalsIgnoreCase(substr1)) {
				val = true;
				System.out.println("Appointment title Id is same as Appointment id in the list : " + exportingText);
			} else {
				System.err.println("Appointment Export id is not displayed");
			}

			if (exportingTitle.equalsIgnoreCase(substr2)) {
				val = true;
				System.out.println(
						"Appointment Export purpose name is same as Appointment name in the list : " + exportingTitle);
			} else {
				System.err.println("Appointment Export purpose name is not displayed");
			}
		} else {
			System.err.println("Appointment Export purpose is not displayed");
		}

		if (ExportDetails.isDisplayed() && ExportAnimalDetails.isDisplayed()) {
			String exportdetailpage = ExportDetails.getText();
			String ExportSpeciesCount = ExportAnimalDetails.getText();
			System.out.println("Exporting details are : " + exportdetailpage);
			System.out.println("" + ExportSpeciesCount);
		} else {
			System.out.println("export details not displayed");
		}

		if (clinicname.isDisplayed()) {
			val = true;
			String clinics = clinicname.getAttribute("text");
			System.out.println("Clinic name is Displayed : " + clinics);
		} else {
			System.out.println("Clinic name is not Displayed");
		}
		if (bookingid.isDisplayed()) {
			val = true;
			String BookingId = bookingid.getAttribute("text");
			System.out.println("Booking Id is Displayed : " + BookingId);
		} else {
			System.out.println("Booking Id is not Displayed");
		}
		if (Date.isDisplayed()) {
			val = true;
			String ExportDate = datetime.getAttribute("text");
			System.out.println("Booking date is Displayed : " + ExportDate);
		} else {
			System.out.println("Booking date is not Displayed");
		}
		backbtn.click();

		System.out.println("Back button is clicked successfully");

		return val;
	}

	public boolean CalendarReminder() throws InterruptedException {
		Thread.sleep(5000);
		boolean val = false;

		if (Calendertext.isDisplayed()
				&& Calendertext.getText().equals("Do you want to set a calendar reminder for this appointment?")
				&& OkCalendar.isDisplayed() && CancelCalendar.isDisplayed()) {
			val = true;
			System.out.println("Do you want to set a calendar reminder for this appointment?  is Displayed");
			OkCalendar.click();
			System.out.println("Reminder is added to calender");

			if (DataCalendar.isDisplayed() && DataCalendar.getText().equals("Data has been saved successfully")) {
				val = true;
				Thread.sleep(5000);
				OkData.click();
			}
		}

		return val;
	}
	
	public boolean prefferedDate() throws InterruptedException
	{
		boolean val=false;
		Thread.sleep(5000);
		
	//	prefferedDateEditText.sendKeys("02-03-2024");
		if (prefferedDateEditText.isDisplayed()) {
			prefferedDateEditText.click();
			String preffer= prefferedDateEditText.getText();
			
			System.out.println("Preffered date is displayed:" +preffer);
			
			bookBtn.click();
			
			System.out.println("Book an appointment button is clicked sucessfully");
			
			
			if(pastMsg.isDisplayed())
			{
				//	String prefferedMessage = prefferedErrorMessage.getAttribute("text");
				//	String ExpectedMessage = "Past date is not acceptable for date of shipping Preferred date should be prior to date of shipping";
				//	Assert.assertEquals(prefferedMessage, ExpectedMessage);

					System.err.println("Past date will not be accepted for preferred date and date of shipping is displayed");
					OkpastMsg.click();
					System.out.println(" ok button is clicked in the past date error msg");
					
			}
			else
			{
				System.err.println("Past date will not be accepted for preferred date and date of shipping not displayed");
		}
		}
		else
		{
			System.out.println("Preffered date is not displayed:");
		}	
		
	return val;	
	}
	
	public Boolean backbuttonverification() throws InterruptedException {
		boolean val = false;
		Thread.sleep(5000);
		if (AppDetailsbackbutton.isDisplayed()) {
			AppDetailsbackbutton.click();
			String ExpectedAppointment = "Appointment";
			String ActualAppointment = AppointmentListingTitle.getAttribute("text");
			if (AppointmentListingTitle.isDisplayed() && ActualAppointment.equalsIgnoreCase(ExpectedAppointment)) {

				val = true;
				System.out.println("Appointment - title is displayed");

			}
		}
		return val;
	}

	
}
	
	

