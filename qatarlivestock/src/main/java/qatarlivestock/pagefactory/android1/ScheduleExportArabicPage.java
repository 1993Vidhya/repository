package qatarlivestock.pagefactory.android1;

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

public class ScheduleExportArabicPage extends AndroidActions {
	AndroidDriver driver;

	public ScheduleExportArabicPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(id = "appointmentFragment")
	private WebElement AppointmentModule;

	@AndroidFindBy(id = "addAppointmentBtn")
	private WebElement addappointmentbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الفحص الصحي للتصدير']")
	private WebElement Export;

	@AndroidFindBy(id = "purposeSpinner")
	private WebElement PurposeDropdown;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='وجهة']")
	private WebElement Destination;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تاريخ الشحن']")
	private WebElement DateofShipping;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='وسائل الشحن']")
	private WebElement MeansofShipping;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='منتج']")
	private WebElement product;

	@AndroidFindBy(xpath = ".//android.widget.Switch[@text='أخذ العينات المطلوبة']")
	private WebElement samplimgRequired;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='اسم العيادة']")
	private WebElement CLinicName;

	@AndroidFindBy(id = "bookingId")
	private WebElement bookingid;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='نوع الحيوان']")
	private WebElement AnimalType;

	@AndroidFindBy(id = "publicClinicTv")
	private WebElement publicClinicTv;

	@AndroidFindBy(id = "exportDetails")
	private WebElement ExportDetails;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تصدير رقم الموعد']")
	private WebElement exportAppointment;

	@AndroidFindBy(xpath = ".//android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement AvailableText;

	@AndroidFindBy(xpath = ".//android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView[2]")
	private WebElement UnAvailableText;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='طبيب - زيارة مزرعة']")
	private WebElement Farmvisit;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='غاية']")
	private WebElement purpose;

	@AndroidFindBy(id = "bookingId")
	private WebElement appointmentiddetailspage;

	@AndroidFindBy(xpath = ".//android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView")
	private WebElement prefferedDateofAppointment;

	@AndroidFindBy(id = "selectDateIv")
	private WebElement DateCalenderIcon;

	@AndroidFindBy(id = "selectedDateTv")
	private WebElement DateTextField;

	@AndroidFindBy(id = "isSamplingRequired")
	private WebElement myToggle;

	@AndroidFindBy(id = "animalDetails")
	private WebElement ExportAnimalDetails;

	@AndroidFindBy(id = "meansSpinner")
	private WebElement MeansofShippingIcon;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='بحر']")
	private WebElement Sea;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='أرض']")
	private WebElement Land;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='هواء']")
	private WebElement Air;

	@AndroidFindBy(id = "productSpinner")
	private WebElement productIcon;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='لحم']")
	private WebElement Meat;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='انتاج']")
	private WebElement Breedingdrop;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='حليب']")
	private WebElement Milk;

	@AndroidFindBy(id = "date")
	private WebElement datetime;

	@AndroidFindBy(id = "radioButtonHerd")
	private WebElement Herd;

	@AndroidFindBy(id = "radioButtonIndividual")
	private WebElement Individual;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='صِنف']")
	private WebElement speciesListName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معرف العلامة']")
	private WebElement TagId;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ابقار']")
	private WebElement cattle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ماعز']")
	private WebElement goat;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='خروف']")
	private WebElement sheep;

	@AndroidFindBy(id = "speciesName")
	private WebElement SpeciesName;

	@AndroidFindBy(id = "totalCountEdt")
	private WebElement TotalCount;

	@AndroidFindBy(id = "speciesSpinner")
	private WebElement speciesListDropdown;

	@AndroidFindBy(id = "clinicName")
	private WebElement clinicname;
	
	@AndroidFindBy(id = "alertMessage")
	private WebElement pastMsg;
	
	@AndroidFindBy(id = "alertOkButton")
	private WebElement OkpastMsg;

	@AndroidFindBy(id = "animalIdEt")
	private WebElement TagEt;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='عيادة']")
	private WebElement Clinic;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='غاية']")
	private WebElement purposefield;

	@AndroidFindBy(id = "clinicSpinner")
	private WebElement clinicdropdown;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='عام عيادة']")
	private WebElement publicClinic;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='خاص]")
	private WebElement privateClinic;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تأكيد']")
	private WebElement ConfirmationTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تأكيد']")
	private WebElement ConfirmationText;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معرف الحجز']")
	private WebElement BookingId;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تم إرسال الطلب بنجاح']")
	private WebElement RequestMsg;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='نعم']")
	private WebElement Okbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ميعاد']")
	private WebElement AppointmentListingTitle;

	@AndroidFindBy(className = "android.widget.ImageView")
	private WebElement TickMark;

	@AndroidFindBy(id = "monthsSpinner")
	private WebElement MonthSpinner;

	@AndroidFindBy(id = "month_name")
	private WebElement MonthName;

	@AndroidFindBy(id = "bookBtn")
	private WebElement bookBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تاريخ']")
	private WebElement dateAppointment;

	@AndroidFindBy(id = "appointmentBookId")
	private WebElement AppointmentBookingid;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'الفحص الصحي للتصدير')]")
	private WebElement appointmentpurposeexport;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='جدول موعد']")
	private WebElement appointmenttitle;

	@AndroidFindBy(id = "purposeBookingID")
	private WebElement PurposeBookingid;

	@AndroidFindBy(id = "clinicNameSpinner")
	private WebElement clinicNamedropdown;

	@AndroidFindBy(xpath = ".//android.widget.TextView[3]")
	private WebElement clinicNameselected;

	@AndroidFindBy(xpath = ".//android.widget.ImageButton")
	private WebElement backbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تلقيح']")
	private WebElement Vaccination;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='مكافحة الآفات']")
	private WebElement pestControl;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='فحص ما قبل التربية']")
	private WebElement Breeding;

	@AndroidFindBy(id = "alertMessage")
	private WebElement clinicNamealertMsg;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement clinicNameokButton;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الرجاء إدخال معرف العلامة']")
	private WebElement TagIdError;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تاريخ']")
	private WebElement Date;
	
	@AndroidFindBy(xpath= ".//android.widget.CheckedTextView[@content-desc=\"29\"]")
	private WebElement prefferedDateEditText;	

	@AndroidFindBy(id = "alertOkButton")
	private WebElement TagIdErrorOkBtn;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.EditText")
	private WebElement TotalCountEdt;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.appcompat.widget.LinearLayoutCompat/android.widget.EditText")
	private WebElement TotalCountEdt2;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الرجاء إدخال عدد الحيوانات']")
	private WebElement AnimalCountError;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement AnimalCountErrorOkBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تصدير رقم الموعد']")
	private WebElement ExportAppointmentNo;

	@AndroidFindBy(id = "appoint_no_Et")
	private WebElement ExportNo;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[1]/android.widget.EditText")
	private WebElement monthscroll;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[2]/android.widget.EditText")
	private WebElement datescroll;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.DatePicker/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker[3]/android.widget.EditText")
	private WebElement yearscroll;

	@AndroidFindBy(id = "okDateBtn")
	private WebElement dateOkButton;

	@AndroidFindBy(id = "next")
	private WebElement nextCalenderBtn;

	@AndroidFindBy(id = "previous")
	private WebElement previouscalenderBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الرجاء تحديد تاريخ الشحن']")
	private WebElement ErrorDos;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement OkDos;

	@AndroidFindBy(id = "alertMessage")
	private WebElement prefferedErrorMessage;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement OkprefferedErrorMessage;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معرف الحجز']")
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
	
	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='هل تريد تعيين تذكير تقويمي لهذا الموعد؟']")
	private WebElement Calendertext;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='نعم']")
	private WebElement OkCalendar;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='يلغي']")
	private WebElement CancelCalendar;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تم حفظ البيانات بنجاح']")
	private WebElement DataCalendar;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='نعم']")
	private WebElement OkData;
	

	String ExpectedclinicalertMessage;
	String ActualClinicAlertmessage;
	public String substr2;
	public String substr1;

	public Boolean AppointmentModuleVerify() throws InterruptedException {

		Thread.sleep(5000);
		/// Click on the Appointment name in the home page
		boolean val = false;
		AppointmentModule.click();
		System.out.println("Appointment module is clicked");
		String ExpectedAppointment = "ميعاد";
		String ActualAppointment = AppointmentListingTitle.getAttribute("text");
		if (AppointmentListingTitle.isDisplayed() && ActualAppointment.equalsIgnoreCase(ExpectedAppointment)) {
			val = true;
			System.out.println("Appointment title is verified");

		} else {
			System.out.println("Appointment title is not verified ");

		}
		return val;

	}

	public Boolean AddAppointmentVerification() throws InterruptedException {

		/// Click on the Add Appointment name in the home page
		boolean val = false;
		Thread.sleep(5000);
		addappointmentbtn.click();
		System.out.println("Add Appointment button is clicked");
		if (appointmenttitle.isDisplayed() && appointmenttitle.getText().equals("جدول موعد")) {
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
		if (Breeding.isDisplayed() && Breeding.getText().equals("فحص ما قبل التربية") && Farmvisit.isDisplayed()
				&& Farmvisit.getText().equals("طبيب - زيارة مزرعة") && pestControl.isDisplayed()
				&& pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح") && Export.isDisplayed()
				&& Export.getText().equals("الفحص الصحي للتصدير")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit has been displayed , purpose dropdown verified successfully");
			Export.click();
			System.out.println("Export is clicked from dropdown");
		} else {
			System.out.println("purpose dropdown is not clicked");
		}

		if (publicClinicTv.isDisplayed() && publicClinicTv.getText().equals("عام عيادة")) {

			System.out.println("public clinic   has displayed");
		} else {
			System.out.println("public clinic   has not displayed");
		}

		if (purposefield.isDisplayed() && purposefield.getText().equals("غاية") && Destination.isDisplayed()
				&& Destination.getText().equals("وجهة") && DateofShipping.isDisplayed()
				&& DateofShipping.getText().equals("تاريخ الشحن") && MeansofShipping.isDisplayed()
				&& MeansofShipping.getText().equals("وسائل الشحن") && product.isDisplayed()
				&& product.getText().equals("منتج") && samplimgRequired.isDisplayed()
				&& samplimgRequired.getText().equals("أخذ العينات المطلوبة") && CLinicName.isDisplayed()
				&& CLinicName.getText().equals("اسم العيادة") ) {
			System.out.println(
					"purpose,destination,date of shipping, means of shipping, product, sampling required , clinic name   has displayed");
		} else

		{
			System.out.println("No text  has displayed");
		}

		
		  WebElement element = (WebElement) driver .findElement(MobileBy.
		  AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		 ".scrollIntoView(new UiSelector().text(\"معرف العلامة\"));"));
		 
		
		  if (AnimalType.isDisplayed()
					&& AnimalType.getText().equals("نوع الحيوان"))
		  {
		  System.out.println("Animal type  has displayed");
		  } 
		  else 
		  {
		  System.out.println("Animal type  has not displayed"); 
		  }
		 
		  WebElement element12 = (WebElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"حجز موعد\"));"));

			Thread.sleep(5000);
			
		

	/*	if (prefferedDateofAppointment.isDisplayed()
				&& prefferedDateofAppointment.getText().equals("Preferred Date of Appointment") &&AvailableText.isDisplayed()&&AvailableText.getText().equals("Available") && UnAvailableText.isDisplayed() && UnAvailableText.getText().equals("Unavailable")
				&& exportAppointment.isDisplayed() && exportAppointment.getText().equals("Exporting Appointment No")
				&& nextCalenderBtn.isDisplayed() && previouscalenderBtn.isDisplayed() && MonthName.isDisplayed()
				&& bookBtn.isDisplayed()) {
	*/		
			if (prefferedDateofAppointment.isDisplayed()
				&& AvailableText.isDisplayed() && UnAvailableText.isDisplayed()
					&& exportAppointment.isDisplayed() 
					&& nextCalenderBtn.isDisplayed() && previouscalenderBtn.isDisplayed() && MonthName.isDisplayed()
					&& bookBtn.isDisplayed()) {
			System.out.println(
					"Available,unAvailable,Export Appointment Number, next button, previous Button , month  Name And Book an Appointment has displayed");
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
						+ ".scrollIntoView(new UiSelector().text(\"عام عيادة\"));"));
  
		backbtn.click();

		return val;
	}

	public boolean exportIndividualAppointment() throws InterruptedException {
		boolean val = false;
		Thread.sleep(5000);
		addappointmentbtn.click();
	/*	WebElement element10 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"عام عيادة\"));"));
						*/
		
		purposeList();
		System.out.println("Purpose dropdown isdropdown list verified successfully");
		PurposeDropdown.click();
		Thread.sleep(5000);
		System.out.println("Purpose dropdown is clicked successfully");
		if (Breeding.isDisplayed() && Breeding.getText().equals("فحص ما قبل التربية") && Farmvisit.isDisplayed()
				&& Farmvisit.getText().equals("طبيب - زيارة مزرعة") && pestControl.isDisplayed()
				&& pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح") && Export.isDisplayed()
				&& Export.getText().equals("الفحص الصحي للتصدير")) {
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
		
		PurposeDropdown.click();
		Thread.sleep(5000);
		System.out.println("Purpose dropdown is clicked successfully");
		if (Breeding.isDisplayed() && Breeding.getText().equals("فحص ما قبل التربية") && Farmvisit.isDisplayed()
				&& Farmvisit.getText().equals("طبيب - زيارة مزرعة") && pestControl.isDisplayed()
				&& pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح") && Export.isDisplayed()
				&& Export.getText().equals("الفحص الصحي للتصدير")) {
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
						+ ".scrollIntoView(new UiSelector().text(\"حجز موعد\"));"));
		Thread.sleep(5000);

		bookBtn.click();

		// This will capture error message

		String Actual_Error_msg;
		String Expected_Error_Msg;
		Actual_Error_msg = AnimalCountError.getAttribute("text");

		Expected_Error_Msg = "الرجاء إدخال عدد الحيوانات";
		// Verify error message
		Assert.assertEquals(Actual_Error_msg, Expected_Error_Msg);
		System.err.println("Error message displayed Please enter animal count");

		AnimalCountErrorOkBtn.click();

		System.out.println("Error message get closed in Animal count");
		
		WebElement element7 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"نوع الحيوان\"));"));
		
	}

	public void ExportAnimalCountBookNBtn() {

		TotalCountEdt.sendKeys("100");
		TotalCountEdt2.sendKeys("20");
		
		WebElement element13 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"حجز موعد\"));"));
		
		
		bookBtn.click();
		System.out.println("Booking Appointment Button is clicked when Animal Count is selected");
	}

	public void verifyExportAnimalCountBookingbtn() throws InterruptedException {
		if (ConfirmationTitle.isDisplayed() && ConfirmationTitle.getText().equals("تأكيد")) {

			System.out.println("Booking button verified ,Confirmation title displayed when Animal count is selected");

			if (CLinicName.isDisplayed() && CLinicName.getText().equals("اسم العيادة") && RequestMsg.isDisplayed()
					&& RequestMsg.getText().equals("تم إرسال الطلب بنجاح") && ConfirmationText.isDisplayed()
					&& ConfirmationText.getText().equals("تأكيد") && TickMark.isDisplayed() && Bookingid.isDisplayed()
					&& Bookingid.getText().equals("معرف الحجز")) {

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
		/*	if (longWord.length() >= 7) {
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
*/
		} else {

			System.out.println(
					"Booking button not verified if Animal count is selected,confirmation title is not  displayed if Animal count is selected");

		}
	}

	public Boolean VerifyDateCalenderField() throws InterruptedException {
		boolean val = false;
		// addappointmentbtn.click();
//			PurposeDropdown.click();
		// Export.click();
		WebElement element14 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"تاريخ الشحن\"));"));

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
						+ ".scrollIntoView(new UiSelector().text(\"حجز موعد\"));"));
		bookBtn.click();
		Thread.sleep(5000);
		String Actualdateofshipping = ErrorDos.getAttribute("text");
		String Expecteddateofshipping = "الرجاء تحديد تاريخ الشحن";
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
						+ ".scrollIntoView(new UiSelector().text(\"تاريخ الشحن\"));"));
		MeansofshippingList();

		System.out.println(" Means of shipping  is a dropdown and verified successfully");
	}

	public void VerifyproductDropDown() throws InterruptedException {
		ProductDropdownList();
		System.out.println(" Product   is a dropdown and verified successfully");

	}

	public Boolean verifyClinicNameEmpty() throws InterruptedException {

		WebElement element15 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"معرف العلامة\"));"));

		boolean val = false;
		Thread.sleep(5000);

		WebElement element16 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"حجز موعد\"));"));
		bookBtn.click();

		ExpectedclinicalertMessage = clinicNamealertMsg.getAttribute("text");
		ActualClinicAlertmessage = "الرجاء تحديد اسم العيادة";

		Assert.assertEquals(ActualClinicAlertmessage, ExpectedclinicalertMessage);
		System.err.println("Error message displayed Please Select clinic");

		clinicNameokButton.click();
		System.out.println("Ok button inside clinic Name error message is displayed and clicked successfully");

		return val;

	}

	public void verifyClinicName() throws InterruptedException {

		WebElement element5 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
					+ ".scrollIntoView(new UiSelector().text(\"اسم العيادة\"));"));

		boolean val = false;
		Thread.sleep(5000);

		ClinicNameList();
		System.out.println("clinic Name has been selected");

	}

	public void VerifyAnimaltype() {

		WebElement element6 = (WebElement) driver
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
						+ ".scrollIntoView(new UiSelector().text(\"معرف العلامة\"));"));
		
		if (Individual.isDisplayed() && Herd.isDisplayed()) {
			System.out.println("Individual & Herd  displayed");
		} else {
			System.out.println("No Animaltype has displayed");
		}
	}

	public void ClickIndividual() {
		Individual.click();
		System.out.println("Individual is clicked");
		if (speciesListName.isDisplayed() && speciesListName.getText().equals("صِنف") && TagId.isDisplayed()) {
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
						+ ".scrollIntoView(new UiSelector().text(\"حجز موعد\"));"));

		bookBtn.click();

		// This will capture error message

		String Actual_Error_msg;
		String Expected_Error_Msg;
		Actual_Error_msg = TagIdError.getAttribute("text");

		Expected_Error_Msg = "الرجاء إدخال معرف العلامة";
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
		if (ConfirmationTitle.isDisplayed()) {
			System.out.println("Booking button verified,confirmation title is displayed");
			if (CLinicName.isDisplayed() && CLinicName.getText().equals("اسم العيادة") && dateAppointment.isDisplayed()
					&& dateAppointment.getText().equals("تاريخ") && RequestMsg.isDisplayed()
					&& RequestMsg.getText().equals("تم إرسال الطلب بنجاح") && ConfirmationText.isDisplayed()
					&& ConfirmationText.getText().equals("تأكيد") && TickMark.isDisplayed()) {
				System.out.println("confirmation page elements verified");
			} else {
				System.out.println("confirmation page elements not verified");
			}

			String Booking_Id = AppointmentBookingid.getAttribute("text");
			Okbtn.click();
			System.out.println("Ok  Button in the confirmation page is clicked & Appointment title is displayed");

			CalendarReminder();
			System.out.println("Reminder is added to calendar");
			
			
			
			if (AppointmentListingTitle.isDisplayed() && AppointmentListingTitle.getText().equals("ميعاد")) {
				System.out.println("Ok button is verified, appointment title is displayed");
			} else {
				System.out.println("Ok button is  not verified");
			}

			Thread.sleep(5000);
			String AppointmentIdTitle = PurposeBookingid.getAttribute("text");

			String longWord = AppointmentIdTitle;

			// Check if the word is at least 8 characters long
	/*		if (longWord.length() >= 22) {
				// Extract the last 8 characters
				String last8Digits = longWord.substring(longWord.length() - 22);

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
		*/	
				
		} 
		
		else {
			System.out.println("Booking button not verified, confirmation title is not displayed");
		}
	}

	public boolean verifyPrefferedDate() {
		boolean val = false;

		if (prefferedErrorMessage.isDisplayed()) {
			val = true;
			System.err.println("error message occured when date of shipping message is less than preffered date");

		//	String prefferedMessage = prefferedErrorMessage.getAttribute("text");
		//	String ExpectedMessage = "يرجى التحقق من اتصال الإنترنت الخاص بك والمحاولة مرة أخرى";
		//	Assert.assertEquals(prefferedMessage, ExpectedMessage);

			System.out.println("Past date will not be accepted for preferred date and date of shipping");
			OkprefferedErrorMessage.click();
			System.out.println("ok button in the error message is clicked");

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

		int indexToSelect2 = 6;
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
		if (cattle.isDisplayed() && cattle.getText().equals("ابقار") && sheep.isDisplayed()
				&& sheep.getText().equals("خروف") && goat.isDisplayed() && goat.getText().equals("ماعز")) {
			System.out.println("cattle, sheep & goat elements has Verified when individual is  clicked");
		} else {
			System.out.println(" No elements  has displayed");
		}
		int indexToSelect = 2;
		WebElement selectedElement4 = speciesnamelist.get(indexToSelect);
		String element4 = selectedElement4.getAttribute("text");
		System.out.println("Selected from dropdownlist: " + element4);
		// Perform actions with the selected element
		selectedElement4.click(); // For example, click on the element

		System.out.println("Species  is a  dropdown list");
		return val;
	}

	public Boolean DestinationList() throws InterruptedException {

		boolean val = false;
		Thread.sleep(5000);
		if (Destination.isDisplayed() && Destination.getText().equals("وجهة")) {
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
		if (MeansofShipping.isDisplayed() && MeansofShipping.getText().equals("وسائل الشحن")) {
			meansofshippingDropdown.click();
			System.out.println("Means of shipping  dropdown is clicked successfully");
			Thread.sleep(5000);
			int listSize2 = meansofshippinglist.size();
			if (Sea.isDisplayed() && Sea.getText().equals("بحر") && Land.isDisplayed() && Land.getText().equals("أرض")
					&& Air.isDisplayed() && Air.getText().equals("هواء")) {
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
		if (product.isDisplayed() && product.getText().equals("منتج")) {
			productDropdown.click();
			int listSize2 = productlist.size();
			if (Meat.isDisplayed() && Meat.getText().equals("لحم") && Breedingdrop.isDisplayed()
					&& Breedingdrop.getText().equals("انتاج") && Milk.isDisplayed() && Milk.getText().equals("حليب")) {
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

				System.out.println("selected past date is displayed" + pastDate);

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
		if (samplimgRequired.isDisplayed() && samplimgRequired.getText().equals("أخذ العينات المطلوبة")) {
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
						+ ".scrollIntoView(new UiSelector().text(\"تاريخ الشحن\"));"));

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
			monthEditText.sendKeys("Dec");
			DateEditText.clear();
			DateEditText.click();
			Thread.sleep(5000);
			DateEditText.sendKeys("30");
			YearEditText.clear();
			YearEditText.click();
			Thread.sleep(5000);
			YearEditText.sendKeys("2026");
			Thread.sleep(5000);

			WebElement element13 = (WebElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"نعم\"));"));

			Thread.sleep(5000);

			dateOkButton.click();
			System.out.println("  ok button is clicked");

			WebElement element12 = (WebElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"حجز موعد\"));"));

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
			appointmentpurposeexport.click();
			String ExportAppointment = appointmentpurposeexport.getAttribute("text");
			System.out.println("Export purpose is clicked " + ExportAppointment);
		String str = ExportAppointment;
			
	//		int stringSize= str.length();
	//		System.out.println(stringSize);

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(19);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 19);
			System.out.println(substr2);

			appointmentpurposeexport.click();
			Thread.sleep(5000);
			String exportingTitle = appointmentpurposeexport.getAttribute("text");
			System.out.println("Export purpose is clicked: " + exportingTitle);

			String exportingText = appointmentiddetailspage.getAttribute("text");

	/*		if (exportingText.equalsIgnoreCase(substr1)) {
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
			
			*/
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
			substr1 = str.substring(19);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 19);
			System.out.println(substr2);

			appointmentpurposeexport.click();
			Thread.sleep(5000);
			String exportingTitle = appointmentpurposeexport.getAttribute("text");
			System.out.println("Export purpose is clicked: " + exportingTitle);

			String exportingText = appointmentiddetailspage.getAttribute("text");

	/*		if (exportingText.equalsIgnoreCase(substr1)) {
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
			*/
			
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
				&& Calendertext.getText().equals("هل تريد تعيين تذكير تقويمي لهذا الموعد؟")
				&& OkCalendar.isDisplayed() && CancelCalendar.isDisplayed()) {
			val = true;
			System.out.println("Do you want to set a calendar reminder for this appointment?  is Displayed");
			OkCalendar.click();
			System.out.println("Reminder is added to calender");

			if (DataCalendar.isDisplayed() && DataCalendar.getText().equals("تم حفظ البيانات بنجاح")) {
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
	

}
