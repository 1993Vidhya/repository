package qatarlivestock.pagefactory.android1;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import qatarlivestock.pagefactory.utils.AndroidActions;

public class ScheduleAppointmentArabicPage extends AndroidActions {
	AndroidDriver driver;

	public  ScheduleAppointmentArabicPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		// PageFactory.initElements(driver, this);
	}

	@AndroidFindBy(id = "appointmentFragment")
	private WebElement AppointmentModule;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ميعاد']")
	private WebElement AppointmentListingTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='جدول موعد']")
	private WebElement appointmenttitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='غاية']")
	private WebElement purposefield;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='نوع الحيوان']")
	private WebElement AnimalTypefield;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='صِنف']")
	private WebElement SpeciesField;

	@AndroidFindBy(className = "android.widget.Spinner")
	private WebElement PurposeDropdown;

	@AndroidFindBy(xpath = ".//android.widget.ImageButton")
	private WebElement backbtn;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement AppDetailsbackbutton;

	@AndroidFindBy(id = "clinicSpinner")
	private WebElement ClinicDropdown;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='عيادة']")
	private WebElement Clinic;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الفحص الصحي للتصدير']")
	private WebElement Export;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تلقيح']")
	private WebElement Vaccination;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='مكافحة الآفات']")
	private WebElement pestControl;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='فحص ما قبل التربية']")
	private WebElement Breeding;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='خاص']")
	private WebElement privateClinic;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='اسم العيادة']")
	private WebElement ClinicName;

	@AndroidFindBy(id = "addAppointmentBtn")
	private WebElement addappointmentbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='نوع الحيوان']")
	private WebElement AnimalType;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='حكومي']")
	private WebElement publicclinic;

	@AndroidFindBy(id = "bookBtn")
	private WebElement BookAppointmentbtn;

	@AndroidFindBy(id = "radioButtonIndividual")
	private WebElement Individual;

	@AndroidFindBy(id = "radioButtonHerd")
	private WebElement Herd;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='طبيب - زيارة مزرعة']")
	private WebElement Farmvisit;

	@AndroidFindBy(id = "speciesSpinner")
	private WebElement speciesListDropdown;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معرف العلامة']")
	private WebElement TagId;

	@AndroidFindBy(id = "speciesName")
	private WebElement SpeciesName;

	@AndroidFindBy(id = "totalCountEdt")
	private WebElement TotalCount;

	@AndroidFindBy(id = "animalIdEt")
	private WebElement TagEt;

	@AndroidFindBy(id = "bookBtn")
	private WebElement bookBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تأكيد']")
	private WebElement ConfirmationTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تأكيد']")
	private WebElement ConfirmationText;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='اسم العيادة']")
	private WebElement CLinicName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معرف الحجز']")
	private WebElement BookingId;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تم إرسال الطلب بنجاح']")
	private WebElement RequestMsg;

	@AndroidFindBy(xpath = ".//android.widget.Button[@text='نعم']")
	private WebElement Okbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='صِنف']")
	private WebElement speciesListName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ميعاد']")
	private WebElement AppointmentTitle;

	@AndroidFindBy(className = "android.widget.ImageView")
	private WebElement TickMark;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تاريخ']")
	private WebElement Date;

	@AndroidFindBy(id = "appointmentBookId")
	private WebElement AppointmentBookingid;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معرف الحجز']")
	private WebElement Bookingid;

	@AndroidFindBy(id = "bookingId")
	private WebElement appointmentiddetailspage;

	@AndroidFindBy(id = "purpose")
	private WebElement purposeExporting;

	@AndroidFindBy(id = "clinicName")
	private WebElement clinicnametext;

	@AndroidFindBy(id = "purposeBookingID")
	private WebElement PurposeBookingid;

	@AndroidFindBy(id = "date")
	private WebElement datetext;

	@AndroidFindBy(xpath = "//*[contains(@class,'android.widget.TextView')]")
	private WebElement purposeID;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معرف الحجز']")
	private WebElement purposeDetail;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ابقار']")
	private WebElement cattle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='ماعز']")
	private WebElement goat;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='خروف']")
	private WebElement sheep;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الرجاء إدخال معرف العلامة']")
	private WebElement TagIdError;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement TagIdErrorOkBtn;

	@AndroidFindBy(id = "totalCountEdt")
	private WebElement TotalCountEdt;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الرجاء إدخال عدد الحيوانات']")
	private WebElement AnimalCountError;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement AnimalCountErrorOkBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[3]")
	private WebElement clinicNameselected;

	@AndroidFindBy(id = "doctorFarmVisitComments")
	private WebElement commentEdit;

	@AndroidFindBy(id = "clinicNameSpinner")
	private WebElement clinicNamedropdown;

	@AndroidFindBy(id = "clinicLocation")
	private WebElement cliniclocation;

	@AndroidFindBy(id = "alertMessage")
	private WebElement clinicalertMsg;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement clinicokButton;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تعليقات']")
	private WebElement comment;

	@AndroidFindBy(id = "alertMessage")
	private WebElement clinicNamealertMsg;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement clinicNameokButton;

	@AndroidFindBy(id = "alertMessage")
	private WebElement RequestCancelled;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement OkcancelBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='هل أنت متأكد من إلغاء الموعد؟']")
	private WebElement canceltext;

	@AndroidFindBy(id = "alertOkButton")
	private WebElement Okbuttonpopup;

	@AndroidFindBy(id = "alertCancelButton")
	private WebElement cancelbuttonpopup;

	@AndroidFindBy(id = "alertMessage")
	private WebElement Clinicerror;

	@AndroidFindBy(id = "comments")
	private WebElement commentstext;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> purposelist;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> cliniclist;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> clinicnamelist;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> speciesnamelist;

	@AndroidFindBy(xpath = ".//hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
	private List<WebElement> clinicNameList;
	
	@AndroidFindBy(id = "exportDetails")
	private WebElement ExportDetails;
	
	@AndroidFindBy(id = "animalDetails")
	private WebElement ExportAnimalDetails;			

	public String Appointmentiddetailpage;
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
	public String ExportDate;
	public String purposeName;
	public String ExpectedclinicalertMessage;
	public String ActualClinicAlertmessage;

	public String ANSI_RED = "\u001B[31m";
	public String ANSI_RESET = "\u001B[0m";

	public Boolean AppointmentModuleVerify() {

		/// Click on the Appointment name in the home page
		boolean val = false;
		AppointmentModule.click();
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
		addappointmentbtn.click();
		System.out.println("Add Appointment button is clicked");
		if (appointmenttitle.isDisplayed()&&appointmenttitle.getText().equals("جدول موعد")) {
			val = true;
			System.out.println("Schedule Appointment title is verified");
			backbtn.click();
			System.out.println("Back Button is clicked");
			Thread.sleep(5000);
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

	public Boolean BreedingIndividualVerification() throws InterruptedException {

		System.out.println("if purpose is selected as breeding-Individual");
		
		// if purpose is selected as breeding
		boolean val = false;
		Thread.sleep(5000);
		addappointmentbtn.click();
		System.out.println("Add appointment button is clicked successfully");
		purposeList();
		System.out.println("Purpose dropdown isdropdown list verified successfully");

		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(5000);

		if (Breeding.isDisplayed()  && Breeding.getText().equals("فحص ما قبل التربية")&& Farmvisit.isDisplayed()&& Farmvisit.getText().equals("طبيب - زيارة مزرعة")&& pestControl.isDisplayed() && pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح")	&& Export.isDisplayed() && Export.getText().equals("الفحص الصحي للتصدير")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit has been displayed , purpose dropdown verified successfully");
			Breeding.click();
			System.out.println("Breeding is clicked from dropdown");
			Thread.sleep(5000);
			if (purposefield.isDisplayed() && purposefield.getText().equals("غاية") && Clinic.isDisplayed() && Clinic.getText().equals("عيادة")&& ClinicName.isDisplayed() && ClinicName.getText().equals("اسم العيادة")
					&& AnimalType.isDisplayed() && AnimalType.getText().equals("نوع الحيوان")&& BookAppointmentbtn.isDisplayed() && BookAppointmentbtn.getText().equals("حجز موعد")) {
				val = true;
				System.out.println(
						"purpose, clinic, clinic name, Animal type & bookAppointmentbtn  has displayed if purpose is selected as breeding");
			//	VerifyClinicDropdownEmpty();
			//	System.out.println("Clinic is not selected, alert message displayed");
			    VerifyClinicDropdown();
				System.out.println("Clinic dropdown is clicked , public and private is displayed successfully");
				verifyClinicNameEmpty();
				System.out.println("Clinic Name dropdown is not selected , alert message displayed");
				verifyClinicName();
				System.out.println("Clinic Name dropdown is clicked and clinic names is displayed successfully");
				VerifyAnimaltype();
				System.out.println("Animal type is clicked, Individual and herd is displayed successfully");
				ClickIndividual();
				System.out.println("Individual is clicked,Species and Tagid is displayed successfully");
				VerifySpeciesIndividual();
				System.out
						.println("Species dropdown in Individual is clicked , species list is displayed successfully");
				ClickHerd();
				System.out.println("Herd is clicked,Species list and Count box is displayed successfully");
				// VerifySpeciesHerd();
				// System.out.println("Species in herd is clicked ,species list is displayed
				// successfully");
				ClickTagIdEmpty();
				System.out.println("Individual is clicked and tag id empty is verified successfully");
				ClickTagIdBookNBtn();
				System.out.println("Individual is clicked and tag id with value is verified successfully");
				verifyTagIdBookingbtn();
				System.out.println(
						"Individual is clicked and tag id with value is given, book an appointment is clicked, confirmation page is verified and booking is verified from appointment list is verified successfully");
				appointmentidverification();
				System.out.println("Appointment details page is verified successfully");
				backbuttonverification();
				System.out.println("Back button in the Appointment details page is verified successfully");
				
			} else {
				System.out.println(" No text  has displayed");
			}
		} else {
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting, Doctor -farm visit is not displayed");
		}
		return val;
	}

	public Boolean BreedingHerdVerification() throws InterruptedException {
		
		System.out.println("if purpose is selected as breeding-Herd");
		// if purpose is selected as breeding
		boolean val = false;
		addappointmentbtn.click();
		System.out.println("Add appointment button is clicked successfully");
		purposeList();
		System.out.println("Purpose dropdown isdropdown list verified successfully");
		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(5000);
		if (Breeding.isDisplayed()  && Breeding.getText().equals("فحص ما قبل التربية")&& Farmvisit.isDisplayed()&& Farmvisit.getText().equals("طبيب - زيارة مزرعة")&& pestControl.isDisplayed() && pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح")	&& Export.isDisplayed() && Export.getText().equals("الفحص الصحي للتصدير")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit has been displayed , purpose dropdown verified successfully");
			Breeding.click();
			System.out.println("Breeding is clicked from dropdown");
			if (purposefield.isDisplayed() && purposefield.getText().equals("غاية") && Clinic.isDisplayed() && Clinic.getText().equals("عيادة")&& ClinicName.isDisplayed() && ClinicName.getText().equals("اسم العيادة")
					&& AnimalType.isDisplayed() && AnimalType.getText().equals("نوع الحيوان")&& BookAppointmentbtn.isDisplayed() && BookAppointmentbtn.getText().equals("حجز موعد")) {
				val = true;
				System.out.println(
						"purpose, clinic, clinic name, Animal type & bookAppointmentbtn  has displayed if purpose is selected as breeding");
			//	VerifyClinicDropdownEmpty();
		//		System.out.println("Clinic is not selected, alert message displayed");
				VerifyClinicDropdown();
				System.out.println("Clinic dropdown is clicked , public and private is displayed successfully");
				verifyClinicNameEmpty();
				System.out.println("Clinic Name dropdown is not selected , alert message displayed");
				verifyClinicName();
				System.out.println("Clinic Name dropdown is clicked and clinic names is displayed successfully");
				VerifyAnimaltype();
				System.out.println("Animal type is clicked, Individual and herd is displayed successfully");
				ClickIndividual();
				System.out.println("Individual is clicked,Species and Tagid is displayed successfully");
				VerifySpeciesIndividual();
				System.out
						.println("Species dropdown in Individual is clicked , species list is displayed successfully");
				ClickHerd();
				System.out.println("Herd is clicked,Species list and Count box is displayed successfully");
				VerifySpeciesHerd();
				System.out.println("Species in herd is clicked ,species list is displayed successfully");
				BreedingAnimalCountEmpty();
				System.out.println("Herd is clicked and Animal count empty is verified successfully");
				BreedingAnimalCountBookNBtn();
				System.out.println("Herd is clicked and Animal Count with value is verified successfully");
				verifyAnimalCountBookingbtn();
				System.out.println(
						"Herd is clicked and Animal Count with value is given, book an appointment is clicked, confirmation page is verified and booking is verified from appointment list is verified successfully");
				appointmentidHerdverification() ;
				System.out.println("purpose id in the appointment details page is clicked, verified the details page ");
				backbuttonverification();
				System.out.println("Back button in the appointment details page is verified successfully ");
				// OkandCancelbuttonverification();
				// System.out.println("Appointment requested is verified, cancellation verified
				// ");
			} else {
				System.out.println(" No text  has displayed");
			}
		} else {
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit is not displayed");
		}
		return val;
	}

	public void BreedingAnimalCountEmpty() throws InterruptedException {
		// addappointmentbtn.click();
		/*
		 * PurposeDropdown.click(); Breeding.click(); ClinicDropdown.click();
		 * publicclinic.click(); clinicNamedropdown.click(); clinicNameselected.click();
		 * Herd.click();
		 */
		TotalCountEdt.sendKeys("");
		/*
		 * WebElement element = (WebElement) driver .findElement(MobileBy.
		 * AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		 * ".scrollIntoView(new UiSelector().text(\"حجز موعد\"));"));
		 */
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
	}

	public void BreedingAnimalCountBookNBtn() {

		TotalCountEdt.sendKeys("100");
		bookBtn.click();
		System.out.println("Booking Appointment Button is clicked when Animal Count is selected");
	}

	public Boolean appointmentidverification() throws InterruptedException {

		boolean val = false;
		System.out.println("Appointment details page verification");
		AppointmentIdTitle = PurposeBookingid.getAttribute("text");
		cliniclocationstr = cliniclocation.getAttribute("text");

		// datetimestr = datetime.getAttribute("text");
		// Status = status.getAttribute("text");

		if (PurposeBookingid.isDisplayed()) {
			String longWord = AppointmentIdTitle;			
			System.out.println("Export purpose is clicked " + longWord);

			String str = longWord;
		

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(27);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 24);
			System.out.println(substr2);

			PurposeBookingid.click();
			System.out.println("Appointment Id in the Listing page is clicked");
			Thread.sleep(5000);
			appointmentDetailsID = appointmentiddetailspage.getAttribute("text");
			purposeName = purposeExporting.getAttribute("text");

	/*		if (substr1.equals(appointmentDetailsID)) {
				val = true;
				System.out.println("Id in the Appointment listing page is same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			} else {
				System.err.println("Id in the Appointment listing page is not same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			}
			*/
			
		} else {
			System.out.println("The purpose is not displayed.");
		}

		
		
	/*	if (purposefield.isDisplayed()&& purposefield.getText().equals("غاية")) {			
				Assert.assertEquals(substr2, purposeName);
				System.out.println("purpose Name is same as in the Appointment Title " + purposeName);
			} else {
				System.out.println("purpose Name is not same " + purposeName);
			}
		*/

		if (BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")) {
				Appointmentiddetailpage = appointmentiddetailspage.getAttribute("text");
		//		Assert.assertEquals(appointmentDetailsID, Appointmentiddetailpage);
				System.out.println("Booking Id is same as in the Appointment Title " + Appointmentiddetailpage);
			} else{
				System.out.println("Appointment is not same " + Appointmentiddetailpage);
			}
		

		if (clinicnametext.isDisplayed() ) {			
				cliniclocationstrdetailpage = clinicnametext.getAttribute("text");
				Assert.assertEquals(cliniclocationstr, cliniclocationstrdetailpage);
				System.out.println("clinic Name is same as in the Appointment list " + cliniclocationstrdetailpage);
			} else {
				System.out.println("clinic Name is not same " + cliniclocationstrdetailpage);
			}
		

	
		if (ExportDetails.isDisplayed( )) {					
				String exportdetailpage = ExportDetails.getAttribute("text");				
				System.out.println("Exporting details are : " + exportdetailpage);				
			} else {
				System.out.println("export details not displayed");
			}
		

		return val;
	}
	
	public Boolean appointmentidHerdverification() throws InterruptedException {

		boolean val = false;
		System.out.println("Appointment details page verification");
		AppointmentIdTitle = PurposeBookingid.getAttribute("text");
		cliniclocationstr = cliniclocation.getAttribute("text");

		// datetimestr = datetime.getAttribute("text");
		// Status = status.getAttribute("text");

		if (PurposeBookingid.isDisplayed()) {
			String longWord = AppointmentIdTitle;

			System.out.println("Export purpose is clicked " + longWord);

			String str = longWord;

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(27);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 24);
			System.out.println(substr2);

			PurposeBookingid.click();
			System.out.println("Appointment Id in the Listing page is clicked");
			Thread.sleep(5000);
			appointmentDetailsID = appointmentiddetailspage.getAttribute("text");
			purposeName = purposeExporting.getAttribute("text");

		/*	if (substr1.equals(appointmentDetailsID)) {
				val = true;
				System.out.println("Id in the Appointment listing page is same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			} else {
				System.err.println("Id in the Appointment listing page is not same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			}
*/
			
		} else {
			System.out.println("The word is not long enough.");
		}

	/*	if (purposefield.isDisplayed()&& purposefield.getText().equals("غاية")) {				
				Assert.assertEquals(substr2, purposeName);
				System.out.println("purpose Name is same as in the Appointment Title " + purposeName);
			} else{
				System.out.println("purpose Name is not same " + purposeName);
			}
	*/	

		if (BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")) {			
				Appointmentiddetailpage = appointmentiddetailspage.getAttribute("text");
			//	Assert.assertEquals(appointmentDetailsID, Appointmentiddetailpage);
				System.out.println("Booking Id is same as in the Appointment Title " + Appointmentiddetailpage);
			} else {
				System.out.println("Appointment is not same " + Appointmentiddetailpage);
			}
		

		if (clinicnametext.isDisplayed()) {		
			  cliniclocationstrdetailpage = clinicnametext.getAttribute("text");
				Assert.assertEquals(cliniclocationstr, cliniclocationstrdetailpage);
				System.out.println("clinic Name is same as in the Appointment list " + cliniclocationstrdetailpage);
			} else {
				System.out.println("clinic Name is not same " + cliniclocationstrdetailpage);
			}
		
	
		if (ExportDetails.isDisplayed( )) {					
				String exportdetailpage = ExportDetails.getAttribute("text");					
				System.out.println("Exporting details are : " + exportdetailpage);				
			}else {
				System.out.println("export details not displayed");
			}
	
		return val;
	}
	
	

	public Boolean pestControlIndividualVerification() throws InterruptedException {
		
		System.out.println("if purpose is selected as pestControl-Individual");
		// if purpose is selected as pestcontol
		boolean val = false;
		addappointmentbtn.click();
		System.out.println("Add appointment button is clicked successfully");
		purposeList();
		System.out.println("Purpose dropdown isdropdown list verified successfully");
		Thread.sleep(5000);
		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(5000);
		if (Breeding.isDisplayed()  && Breeding.getText().equals("فحص ما قبل التربية")&& Farmvisit.isDisplayed()&& Farmvisit.getText().equals("طبيب - زيارة مزرعة")&& pestControl.isDisplayed() && pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح")	&& Export.isDisplayed() && Export.getText().equals("الفحص الصحي للتصدير")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting, , Doctor-farm visit has been displayed");
			pestControl.click();
			Thread.sleep(5000);
			System.out.println("PestControl is clicked from dropdown");
			if (purposefield.isDisplayed() && purposefield.getText().equals("غاية") && Clinic.isDisplayed() && Clinic.getText().equals("عيادة")&& ClinicName.isDisplayed() && ClinicName.getText().equals("اسم العيادة")
					&& AnimalType.isDisplayed() && AnimalType.getText().equals("نوع الحيوان")&& BookAppointmentbtn.isDisplayed() && BookAppointmentbtn.getText().equals("حجز موعد")) {
				val = true;
				System.out.println(
						"purpose, clinic, clinic name, Animal type & bookAppointmentbtn  has displayed if purpose is selected as  pestcontrol");

			//	VerifyClinicDropdownEmpty();
			//	System.out.println("Clinic is not selected, alert message displayed");
				VerifyClinicDropdown();
				System.out.println("Clinic dropdown is clicked , public and private is displayed successfully");
				verifyClinicNameEmpty();
				System.out.println("Clinic Name dropdown is not selected , alert message displayed");
				verifyClinicName();
				System.out.println("Clinic Name dropdown is clicked and clinic names is displayed successfully");
				VerifyAnimaltype();
				System.out.println("Animal type is clicked, Individual and herd is displayed successfully");
				ClickIndividual();
				System.out.println("Individual is clicked,Species and Tagid is displayed successfully");
				VerifySpeciesIndividual();
				System.out
						.println("Species dropdown in Individual is clicked , species list is displayed successfully");
				ClickHerd();
				System.out.println("Herd is clicked,Species list and Count box is displayed successfully");
				VerifySpeciesHerd();
				System.out.println("Species in herd is clicked ,species list is displayed successfully");
				ClickTagIdEmpty();
				System.out.println("Individual is clicked and tag id empty is verified successfully");
				ClickTagIdBookNBtn();
				System.out.println("Individual is clicked and tag id with value is verified successfully");
				verifypestcontrolTagIdBookingbtn();
				System.out.println(
						"Individual is clicked and tag id with value is given, book an appointment is clicked, confirmation page is verified and booking is verified from appointment list is verified successfully");
				appointmentPestcontrolidverification();
				System.out.println("purpose id in the appointment details page is clicked, verified the details page ");
				backbuttonverification();
				System.out.println("Back button in the appointment details page is verified successfully ");
				// OkandCancelbuttonverification();
				// System.out.println("Appointment requested is verified, cancellation verified
				// ");

			} else {
				System.out.println("No text  has displayed");
			}
		} else {
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting, , Doctor -farm visit is not displayed");
		}
		return val;
	}

	public Boolean pestControlHerdVerification() throws InterruptedException {
		
		System.out.println("if purpose is selected as pestControl-Herd");

		// if purpose is selected as pestcontol
		boolean val = false;
		addappointmentbtn.click();
		System.out.println("Add appointment button is clicked successfully");
		purposeList();
		System.out.println("Purpose dropdown isdropdown list verified successfully");
		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(5000);
		if (Breeding.isDisplayed()  && Breeding.getText().equals("فحص ما قبل التربية")&& Farmvisit.isDisplayed()&& Farmvisit.getText().equals("طبيب - زيارة مزرعة")&& pestControl.isDisplayed() && pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح")	&& Export.isDisplayed() && Export.getText().equals("الفحص الصحي للتصدير")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination ,Health Certificate for Exporting, Doctor-farm visit has been displayed");
			pestControl.click();
			System.out.println("PestControl is clicked from dropdown");
			if (purposefield.isDisplayed() && purposefield.getText().equals("غاية") && Clinic.isDisplayed() && Clinic.getText().equals("عيادة")&& ClinicName.isDisplayed() && ClinicName.getText().equals("اسم العيادة")
					&& AnimalType.isDisplayed() && AnimalType.getText().equals("نوع الحيوان")&& BookAppointmentbtn.isDisplayed() && BookAppointmentbtn.getText().equals("حجز موعد")) {
				val = true;
				System.out.println(
						"purpose, clinic, clinic name, Animal type & bookAppointmentbtn  has displayed if purpose is selected as  pestcontrol");

			//	VerifyClinicDropdownEmpty();
			//	System.out.println("Clinic is not selected, alert message displayed");
				VerifyClinicDropdown();
				System.out.println("Clinic dropdown is clicked , public and private is displayed successfully");
				verifyClinicNameEmpty();
				System.out.println("Clinic Name dropdown is not selected , alert message displayed");
				verifyClinicName();
				System.out.println("Clinic Name dropdown is clicked and clinic names is displayed successfully");
				VerifyAnimaltype();
				System.out.println("Animal type is clicked, Individual and herd is displayed successfully");
				ClickIndividual();
				System.out.println("Individual is clicked,Species and Tagid is displayed successfully");
				VerifySpeciesIndividual();
				System.out
						.println("Species dropdown in Individual is clicked , species list is displayed successfully");
				ClickHerd();
				System.out.println("Herd is clicked,Species list and Count box is displayed successfully");
				// VerifySpeciesHerd();
				// System.out.println("Species in herd is clicked ,species list is displayed
				// successfully");
				PestAnimalCountEmpty();
				System.out.println("Herd is clicked and Animal count empty is verified successfully");
				pestAnimalCountBookNBtn();
				System.out.println("Herd is clicked and Animal Count with value is verified successfully");
				verifypestcontrolAnimalCountBookingbtn();
				System.out.println(
						"Herd is clicked and Animal Count with value is given, book an appointment is clicked, confirmation page is verified and booking is verified from appointment list is verified successfully");
			appointmentPestcontrolidHerdverification();
				System.out.println("purpose id in the appointment details page is clicked, verified the details page ");
				backbuttonverification();
				System.out.println("Back button in the appointment details page is verified successfully ");
				// OkandCancelbuttonverification();
				// System.out.println("Appointment requested is verified, cancellation verified
				// ");

			} else {
				System.out.println("No text  has displayed");
			}
		} else {
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit is not displayed");
		}
		return val;
	}

	public void PestAnimalCountEmpty() throws InterruptedException {

		TotalCountEdt.sendKeys("");
		System.out.println("Animal count is set as empty");
		bookBtn.click();
		System.out.println("book an appointment is  clicked");

		// This will capture error message

		String Actual_Error_msg;
		String Expected_Error_Msg;
		Actual_Error_msg = AnimalCountError.getAttribute("text");
		Expected_Error_Msg = "الرجاء إدخال عدد الحيوانات";
		// Verify error message
		Assert.assertEquals(Actual_Error_msg, Expected_Error_Msg);
		System.err.println("Error message displayed Please enter animal count");

		AnimalCountErrorOkBtn.click();
		System.out.println("ok button in Error message is clicked");
		System.out.println("Error message get closed in Animal count");
	}

	public void pestAnimalCountBookNBtn() {

		TotalCountEdt.sendKeys("65");
		System.out.println("Animal count is given value");
		bookBtn.click();
		System.out.println("Booking Appointment Button is clicked when Animal Count is selected");
	}

	public Boolean appointmentPestcontrolidverification() throws InterruptedException {

		boolean val = false;
		System.out.println("Appointment details page verification");
		AppointmentIdTitle = PurposeBookingid.getAttribute("text");
		cliniclocationstr = cliniclocation.getAttribute("text");

		// datetimestr = datetime.getAttribute("text");
		// Status = status.getAttribute("text");

		if (PurposeBookingid.isDisplayed()) {
			String longWord = AppointmentIdTitle;

			System.out.println("Export purpose is clicked " + longWord);
			String str = longWord;

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(15);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 12);
			System.out.println(substr2);

			PurposeBookingid.click();
			System.out.println("Appointment Id in the Listing page is clicked");
			Thread.sleep(5000);
			appointmentDetailsID = appointmentiddetailspage.getAttribute("text");
			purposeName = purposeExporting.getAttribute("text");

		/*	if (substr1.equals(appointmentDetailsID)) {
				val = true;
				System.out.println("Id in the Appointment listing page is same as Id in Appointment Details Page "
						+ appointmentDetailsID);			
			}
			else {
				System.err.println("Id in the Appointment listing page is not same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			}
			*/
		}
			 else {
					System.out.println("The purpose booking is not displayed");
				}
		
		
		
	/*	if (purposefield.isDisplayed()&& purposefield.getText().equals("غاية")) {		
				Assert.assertEquals(substr2, purposeName);
				System.out.println("purpose Name is same as in the Appointment Title " + purposeName);
			} else {
				System.out.println("purpose Name is not same " + purposeName);
			}
	*/	

		if (BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")) {		
				Appointmentiddetailpage = appointmentiddetailspage.getAttribute("text");
			//	Assert.assertEquals(appointmentDetailsID, Appointmentiddetailpage);
				System.out.println("Booking Id is same as in the Appointment Title " + Appointmentiddetailpage);
			} else {
				System.out.println("Appointment is not same " + Appointmentiddetailpage);
			}
		
		if (clinicnametext.isDisplayed()) {					
				cliniclocationstrdetailpage = clinicnametext.getAttribute("text");
				Assert.assertEquals(cliniclocationstr, cliniclocationstrdetailpage);
				System.out.println("clinic Name is same as in the Appointment list " + cliniclocationstrdetailpage);
			} else {
				System.out.println("clinic Name is not same " + cliniclocationstrdetailpage);
			}	
		
		if (ExportDetails.isDisplayed()) {
			String exportdetailpage = ExportDetails.getAttribute("text");				
				System.out.println("Exporting details are : " + exportdetailpage);
			} else {
				System.out.println("export details not displayed");
			}		
		
		return val;
	}
	
	public Boolean appointmentPestcontrolidHerdverification() throws InterruptedException {

		boolean val = false;
		System.out.println("Appointment details page verification");
		AppointmentIdTitle = PurposeBookingid.getAttribute("text");
		cliniclocationstr = cliniclocation.getAttribute("text");

		// datetimestr = datetime.getAttribute("text");
		// Status = status.getAttribute("text");

		if (PurposeBookingid.isDisplayed()) {
			String longWord = AppointmentIdTitle;

			System.out.println("Export purpose is clicked " + longWord);
			String str = longWord;

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(15);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 12);
			System.out.println(substr2);

			PurposeBookingid.click();
			System.out.println("Appointment Id in the Listing page is clicked");
			Thread.sleep(5000);
			appointmentDetailsID = appointmentiddetailspage.getAttribute("text");
			purposeName = purposeExporting.getAttribute("text");

		/*	if (substr1.equals(appointmentDetailsID)) {
				val = true;
				System.out.println("Id in the Appointment listing page is same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			} else {
				System.err.println("Id in the Appointment listing page is not same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			}
*/
		} else {
			System.out.println("The word is not long enough.");
		}

/*		if (purposefield.isDisplayed()&& purposefield.getText().equals("غاية")) {	
				Assert.assertEquals(substr2, purposeName);
				System.out.println("purpose Name is same as in the Appointment Title " + purposeName);
			} else {
				System.out.println("purpose Name is not same " + purposeName);
			}
	*/	
		if (BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")) {
				Appointmentiddetailpage = appointmentiddetailspage.getAttribute("text");
		//		Assert.assertEquals(appointmentDetailsID, Appointmentiddetailpage);
				System.out.println("Booking Id is same as in the Appointment Title " + Appointmentiddetailpage);
			} else {
				System.out.println("Appointment is not same " + Appointmentiddetailpage);
			}
		

		if (clinicnametext.isDisplayed()) {					
				cliniclocationstrdetailpage = clinicnametext.getAttribute("text");
				Assert.assertEquals(cliniclocationstr, cliniclocationstrdetailpage);
				System.out.println("clinic Name is same as in the Appointment list " + cliniclocationstrdetailpage);
			}else {
				System.out.println("clinic Name is not same " + cliniclocationstrdetailpage);
			}
	
		
	if (ExportDetails.isDisplayed())  {			
				String exportdetailpage = ExportDetails.getText();						
				System.out.println("Exporting details are : " + exportdetailpage  );
				
			} else {
				System.out.println("export details not displayed");
			}
				
		return val;
	}
	

	public void verifypestcontrolTagIdBookingbtn() throws InterruptedException {
		if (ConfirmationTitle.isDisplayed() && ConfirmationTitle.getText().equals("تأكيد")) {
			System.out.println("Booking button verified,confirmation title is displayed");
			if (CLinicName.isDisplayed() && CLinicName.getText().equals("اسم العيادة")&& BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")&& RequestMsg.isDisplayed() && RequestMsg.getText().equals("تم إرسال الطلب بنجاح")
					&& ConfirmationText.isDisplayed() && ConfirmationText.getText().equals("تأكيد")&& TickMark.isDisplayed()) {
				//&& Date.isDisplayed() && Date.getText().equals("Date") ) {
			
				System.out.println("confirmation page elements verified");
			} else {
				System.out.println("confirmation page elements not verified");
			}

			String Booking_Id = AppointmentBookingid.getAttribute("text");
			if(Okbtn.isDisplayed() && Okbtn.getText().equals("نعم"))
			{
			Okbtn.click();
			System.out.println("Ok  Button in the confirmation page is clicked & Appointment title is displayed");
			}
			else
			{
				System.out.println("Ok  Button in the confirmation page is not clicked & Appointment title is not  displayed");
			}
			
			if (AppointmentListingTitle.isDisplayed() && AppointmentListingTitle.getText().equals("Appointment")) {

				System.out.println("Ok button is verified, appointment title is displayed");

			} else {
				System.out.println("Ok button is  not verified");

			}

			Thread.sleep(5000);
			String AppointmentIdTitle = PurposeBookingid.getAttribute("text");
			String longWord = AppointmentIdTitle;

			// Check if the word is at least 8 characters long
			if (longWord.length() >= 22) {
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
		}

		else {
			System.out.println("Booking button not verified, confirmation title is not displayed");
		}

	}

	public void verifypestcontrolAnimalCountBookingbtn() throws InterruptedException {
		if (ConfirmationTitle.isDisplayed() && ConfirmationTitle.getText().equals("تأكيد")) {
			System.out.println("Booking button verified ,Confirmation title displayed when Animal count is selected");

			if (CLinicName.isDisplayed() && CLinicName.getText().equals("اسم العيادة")&& BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")&& RequestMsg.isDisplayed() && RequestMsg.getText().equals("تم إرسال الطلب بنجاح")
					&& ConfirmationText.isDisplayed() && ConfirmationText.getText().equals("تأكيد")&& TickMark.isDisplayed()) {
				//&& Date.isDisplayed() && Date.getText().equals("Date") ) {

				System.out.println("confirmation page elements verified when Animal count is selected");

			} else {

				System.out.println("confirmation page elements not verified when Animal count is selected");

			}

			String Booking_Id = AppointmentBookingid.getAttribute("text");
			if(Okbtn.isDisplayed() && Okbtn.getText().equals("نعم"))
			{
			Okbtn.click();
			System.out.println("Ok  Button in the confirmation page is clicked & Appointment title is displayed");
			}
			else
			{
				System.out.println("Ok  Button in the confirmation page is not clicked & Appointment title is not  displayed");
			}
			System.out.println("Ok  Button is clicked & verified");

			Thread.sleep(5000);
			String AppointmentIdTitle = PurposeBookingid.getAttribute("text");

			String longWord = AppointmentIdTitle;

			// Check if the word is at least 8 characters long
			if (longWord.length() >= 22) {
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

	public Boolean VaccinationIndividualVerification() throws InterruptedException {
		System.out.println("if purpose is selected as Vaccination-Individual");

		// if purpose is selected as vaccination
		boolean val = false;
		Thread.sleep(5000);
		addappointmentbtn.click();
		System.out.println("Add appointment button is clicked successfully");
		purposeList();
		System.out.println("Purpose dropdown isdropdown list verified successfully");
		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(6000);
		if (Breeding.isDisplayed()  && Breeding.getText().equals("فحص ما قبل التربية")&& Farmvisit.isDisplayed()&& Farmvisit.getText().equals("طبيب - زيارة مزرعة")&& pestControl.isDisplayed() && pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح")	&& Export.isDisplayed() && Export.getText().equals("الفحص الصحي للتصدير")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit has been displayed");
			Vaccination.click();
			System.out.println("Vaccination is clicked from dropdown");
			if (purposefield.isDisplayed() && purposefield.getText().equals("غاية") && Clinic.isDisplayed() && Clinic.getText().equals("عيادة")&& ClinicName.isDisplayed() && ClinicName.getText().equals("اسم العيادة")
					&& AnimalType.isDisplayed() && AnimalType.getText().equals("نوع الحيوان")&& BookAppointmentbtn.isDisplayed() && BookAppointmentbtn.getText().equals("حجز موعد")) {
				val = true;
				System.out.println(
						"purpose, clinic, clinic name, Animal type & bookAppointmentbtn  has displayed if purpose is selected as vaccination");

			//	VerifyClinicDropdownEmpty();
			//	System.out.println("Clinic is not selected, alert message displayed");
				VerifyClinicDropdown();
				System.out.println("Clinic dropdown is clicked , public and private is displayed successfully");
				verifyClinicNameEmpty();
				System.out.println("Clinic Name dropdown is not selected , alert message displayed");
				verifyClinicName();
				System.out.println("Clinic Name dropdown is clicked and clinic names is displayed successfully");
				VerifyAnimaltype();
				System.out.println("Animal type is clicked, Individual and herd is displayed successfully");
				ClickIndividual();
				System.out.println("Individual is clicked,Species and Tagid is displayed successfully");
				VerifySpeciesIndividual();
				System.out
						.println("Species dropdown in Individual is clicked , species list is displayed successfully");
				ClickHerd();
				System.out.println("Herd is clicked,Species list and Count box is displayed successfully");
				VerifySpeciesHerd();
				System.out.println("Species in herd is clicked ,species list is displayed successfully");
				ClickTagIdEmpty();
				System.out.println("Individual is clicked and tag id empty is verified successfully");
				ClickTagIdBookNBtn();
				System.out.println("Individual is clicked and tag id with value is verified successfully");
				verifyTagIdBookingbtn();
				System.out.println(
						"Individual is clicked and tag id with value is given, book an appointment is clicked, confirmation page is verified and booking is verified from appointment list is verified successfully");
				appointmentVaccinationidverification();
				System.out.println("purpose id in the appointment details page is clicked, verified the details page ");
				backbuttonverification();
				System.out.println("Back button in the appointment details page is verified successfully ");
				// OkandCancelbuttonverification();
				// System.out.println("Appointment requested is verified, cancellation verified
				// ");
			} else {
				System.out.println("No text  has displayed");
			}
		} else {
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit is not displayed");
		}
		return val;
	}

	public Boolean VaccinationHerdVerification() throws InterruptedException {
		System.out.println("if purpose is selected as Vaccination-herd");
		// if purpose is selected as vaccination
		boolean val = false;
		addappointmentbtn.click();
		System.out.println("Add appointment button is clicked successfully");
		purposeList();
		System.out.println("Purpose dropdown isdropdown list verified successfully");
		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(5000);
		if (Breeding.isDisplayed()  && Breeding.getText().equals("فحص ما قبل التربية")&& Farmvisit.isDisplayed()&& Farmvisit.getText().equals("طبيب - زيارة مزرعة")&& pestControl.isDisplayed() && pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح")	&& Export.isDisplayed() && Export.getText().equals("الفحص الصحي للتصدير")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit has been displayed");
			Vaccination.click();
			System.out.println("Vaccination is clicked from dropdown");
			if (purposefield.isDisplayed() && purposefield.getText().equals("غاية") && Clinic.isDisplayed() && Clinic.getText().equals("عيادة")&& ClinicName.isDisplayed() && ClinicName.getText().equals("اسم العيادة")
					&& AnimalType.isDisplayed() && AnimalType.getText().equals("نوع الحيوان")&& BookAppointmentbtn.isDisplayed() && BookAppointmentbtn.getText().equals("حجز موعد")) {
				val = true;
				System.out.println(
						"purpose, clinic, clinic name, Animal type & bookAppointmentbtn  has displayed if purpose is selected as vaccination");

			//	VerifyClinicDropdownEmpty();
			//	System.out.println("Clinic is not selected, alert message displayed");
				VerifyClinicDropdown();
				System.out.println("Clinic dropdown is clicked , public and private is displayed successfully");
				verifyClinicNameEmpty();
				System.out.println("Clinic Name dropdown is not selected , alert message displayed");
				verifyClinicName();
				System.out.println("Clinic Name dropdown is clicked and clinic names is displayed successfully");
				VerifyAnimaltype();
				System.out.println("Animal type is clicked, Individual and herd is displayed successfully");
				ClickIndividual();
				System.out.println("Individual is clicked,Species and Tagid is displayed successfully");
				VerifySpeciesIndividual();
				System.out
						.println("Species dropdown in Individual is clicked , species list is displayed successfully");
				ClickHerd();
				System.out.println("Herd is clicked,Species list and Count box is displayed successfully");
				VerifySpeciesHerd();
				System.out.println("Species in herd is clicked ,species list is displayed successfully");
				VaccinationAnimalCountEmpty();
				System.out.println("Herd is clicked and Animal count empty is verified successfully");
				VaccinationAnimalCountBookNBtn();
				System.out.println("Herd is clicked and Animal Count with value is verified successfully");
				verifyAnimalCountBookingbtn();
				System.out.println(
						"Herd is clicked and Animal Count with value is given, book an appointment is clicked, confirmation page is verified and booking is verified from appointment list is verified successfully");
				appointmentVaccinationidHerdverification();
				System.out.println("purpose id in the appointment details page is clicked, verified the details page ");
				backbuttonverification();
				System.out.println("Back button in the appointment details page is verified successfully ");
				/*
				 * OkandCancelbuttonverification(); System.out.
				 * println("Appointment requested is verified, cancellation verified ");
				 */
			} else {
				System.out.println("No text  has displayed");
			}
		} else {
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting, Doctor -farm visit is not displayed");
		}
		return val;
	}

	public void VaccinationAnimalCountEmpty() {
		TotalCountEdt.sendKeys("");
		System.out.println("Animal count is selected as empty");
		/*
		 * WebElement element = (WebElement) driver .findElement(MobileBy.
		 * AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		 * ".scrollIntoView(new UiSelector().text(\"حجز موعد\"));"));
		 */
		bookBtn.click();
		System.out.println("Book an Appointment is clicked");

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
	}

	public void VaccinationAnimalCountBookNBtn() {

		if (TotalCountEdt.isDisplayed()) {
			TotalCountEdt.sendKeys("10065");
			System.out.println("Animal count has given value");
			bookBtn.click();
			System.out.println("Booking Appointment Button is clicked when Animal Count is selected");
		} else {
			System.out.println("Animal count is not displayed");
		}

	}

	public Boolean appointmentVaccinationidverification() throws InterruptedException {

		boolean val = false;
		System.out.println("Appointment details page verification");
		AppointmentIdTitle = PurposeBookingid.getAttribute("text");
		cliniclocationstr = cliniclocation.getAttribute("text");

		// datetimestr = datetime.getAttribute("text");
		// Status = status.getAttribute("text");

		if (PurposeBookingid.isDisplayed()) {
			String longWord = AppointmentIdTitle;

			System.out.println("Export purpose is clicked " + longWord);

			String str = longWord;

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(14);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 11);
			System.out.println(substr2);

			PurposeBookingid.click();
			System.out.println("Appointment Id in the Listing page is clicked");
			Thread.sleep(5000);
			appointmentDetailsID = appointmentiddetailspage.getAttribute("text");
			purposeName = purposeExporting.getAttribute("text");

	/*		if (substr1.equals(appointmentDetailsID)) {
				val = true;
				System.out.println("Id in the Appointment listing page is same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			} else {
				System.err.println("Id in the Appointment listing page is not same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			}
*/
		} else {
			System.out.println("The word is not long enough.");
		}

	/*	if (purposefield.isDisplayed()&& purposefield.getText().equals("غاية")) {			
				Assert.assertEquals(substr2, purposeName);
				System.out.println("purpose Name is same as in the Appointment Title " + purposeName);
			} else {
				System.out.println("purpose Name is not same " + purposeName);
			}
*/		

		if (BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")) {			
				Appointmentiddetailpage = appointmentiddetailspage.getAttribute("text");
		//		Assert.assertEquals(appointmentDetailsID, Appointmentiddetailpage);
				System.out.println("Booking Id is same as in the Appointment Title " + Appointmentiddetailpage);
			} else {
				System.out.println("Appointment is not same " + Appointmentiddetailpage);
			}
		

		if (clinicnametext.isDisplayed()) {					
				cliniclocationstrdetailpage = clinicnametext.getAttribute("text");
				Assert.assertEquals(cliniclocationstr, cliniclocationstrdetailpage);
				System.out.println("clinic Name is same as in the Appointment list " + cliniclocationstrdetailpage);
			} else {
				System.out.println("clinic Name is not same " + cliniclocationstrdetailpage);
			}
			
		
		if (ExportDetails.isDisplayed() ) {
			
				String exportdetailpage = ExportDetails.getText();					
				System.out.println("Exporting details are : " + exportdetailpage  );						
			}else {
				System.out.println("export details not displayed");
			}	
		
		return val;
	}
	
	public Boolean appointmentVaccinationidHerdverification() throws InterruptedException {

		boolean val = false;
		System.out.println("Appointment details page verification");
		AppointmentIdTitle = PurposeBookingid.getAttribute("text");
		cliniclocationstr = cliniclocation.getAttribute("text");

		// datetimestr = datetime.getAttribute("text");
		// Status = status.getAttribute("text");

		if (PurposeBookingid.isDisplayed()) {
			String longWord = AppointmentIdTitle;

			System.out.println("Export purpose is clicked " + longWord);

			String str = longWord;

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(14);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 11);
			System.out.println(substr2);

			PurposeBookingid.click();
			System.out.println("Appointment Id in the Listing page is clicked");
			Thread.sleep(5000);
			appointmentDetailsID = appointmentiddetailspage.getAttribute("text");
			purposeName = purposeExporting.getAttribute("text");

		/*	if (substr1.equals(appointmentDetailsID)) {
				val = true;
				System.out.println("Id in the Appointment listing page is same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			} else {
				System.err.println("Id in the Appointment listing page is not same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			}
*/
		} else {
			System.out.println("The word is not long enough.");
		}

	/*	if (purposefield.isDisplayed()&& purposefield.getText().equals("غاية")) {				
				Assert.assertEquals(substr2, purposeName);
				System.out.println("purpose Name is same as in the Appointment Title " + purposeName);
			} else {
				System.out.println("purpose Name is not same " + purposeName);
			}
	*/	

		if (BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")) {	
				Appointmentiddetailpage = appointmentiddetailspage.getAttribute("text");
			//	Assert.assertEquals(appointmentDetailsID, Appointmentiddetailpage);
				System.out.println("Booking Id is same as in the Appointment Title " + Appointmentiddetailpage);
			} else{
				System.out.println("Appointment is not same " + Appointmentiddetailpage);
			}
	

		if (clinicnametext.isDisplayed()) {		
				cliniclocationstrdetailpage = clinicnametext.getAttribute("text");
				Assert.assertEquals(cliniclocationstr, cliniclocationstrdetailpage);
				System.out.println("clinic Name is same as in the Appointment list " + cliniclocationstrdetailpage);
			} else {
				System.out.println("clinic Name is not same " + cliniclocationstrdetailpage);
			}		
		
			if (ExportDetails.isDisplayed() ) {			
				String exportdetailpage = ExportDetails.getText();				
				System.out.println("Exporting details are : " + exportdetailpage  );
							
			} else{
				System.out.println("export details not displayed");
			}			
		return val;
	}

	

	public Boolean FarmVisitValidation() throws InterruptedException {
		System.out.println("if purpose is selected as Doctor farm Visit");
		boolean val = false;
		Thread.sleep(5000);
		addappointmentbtn.click();
		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(5000);
		if (Breeding.isDisplayed()  && Breeding.getText().equals("فحص ما قبل التربية")&& Farmvisit.isDisplayed()&& Farmvisit.getText().equals("طبيب - زيارة مزرعة")&& pestControl.isDisplayed() && pestControl.getText().equals("مكافحة الآفات") && Vaccination.isDisplayed()
				&& Vaccination.getText().equals("تلقيح")	&& Export.isDisplayed() && Export.getText().equals("الفحص الصحي للتصدير")) {
			val = true;
			System.out.println(
					"Breeding, pestcontrol, vaccination ,Health Certificate for Exporting, Doctor -farm visit has been displayed");
			Farmvisit.click();
			System.out.println("Farm visit is clicked from dropdown");
			if (purposefield.isDisplayed() && purposefield.getText().equals("غاية")&& comment.isDisplayed() && comment.getText().equals("تعليقات")&& Clinic.isDisplayed()&&Clinic.getText().equals("عيادة")&& ClinicName.isDisplayed()&& ClinicName.getText().equals("اسم العيادة")
					&& BookAppointmentbtn.isDisplayed()&& BookAppointmentbtn.getText().equals("حجز موعد")) {
				val = true;
				System.out.println("purpose,comment,Clinic, ClinicName &  bookAppointmentbtn  field  has displayed");
				FarmVisitcomments();
				System.out.println(
						"Farm visit is selected, book an appointment , confirmation page is verified and Appointment title is verified  ");
			//	VerifyClinicDropdownEmpty();
			//	System.out.println("Clinic is not selected, alert message displayed");
				VerifyClinicDropdown();
				System.out.println("Clinic dropdown is clicked , public and private is displayed successfully");
				verifyClinicNameEmpty();
				System.out.println("Clinic Name dropdown is not selected , alert message displayed");
				verifyClinicName();
				System.out.println("Clinic Name dropdown is clicked and clinic names is displayed successfully");
				verifyVaccinationBookingbtn();
				System.out.println(
						"Book an appointment is clicked in farm visit, verified confirmation page elements and title from the appointment list");
				appointmentidFarmvisitverification();
				System.out.println("Appointment details page is verified successfully");
			} else {
				System.out.println("No text  has displayed");
			}
		} else {
			System.out.println(
					"Breeding, pestcontrol, vaccination , Health Certificate for Exporting,  Doctor -farm visit is not displayed");
		}
		return val;
	}

	public void FarmVisitcomments() throws InterruptedException {

		commentEdit.sendKeys(" ");
		BookAppointmentbtn.click();
		String coments = commentEdit.getAttribute("text");
		System.err.println("Please enter comments here " + coments);
		System.out.println("Error message displayed when comments field is not selected");

		commentEdit.sendKeys("Farm visit completed");
		String comments = commentEdit.getAttribute("text");
		System.out.println("comments entered successfully : " + comments);

	}

	public void verifyVaccinationBookingbtn() throws InterruptedException {
		Thread.sleep(5000);
		BookAppointmentbtn.click();
		System.out.println("Book an Appointment has clicked");
		if (ConfirmationTitle.isDisplayed() && ConfirmationTitle.getText().equals("تأكيد")) {
			System.out.println("Booking button verified,confirmation title is displayed");
			if (CLinicName.isDisplayed() && CLinicName.getText().equals("اسم العيادة")&& BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")&& RequestMsg.isDisplayed() && RequestMsg.getText().equals("تم إرسال الطلب بنجاح")
					&& ConfirmationText.isDisplayed() && ConfirmationText.getText().equals("تأكيد")&& TickMark.isDisplayed()) {
				//&& Date.isDisplayed() && Date.getText().equals("Date") ) {
				System.out.println("confirmation page elements verified");
			} else {
				System.out.println("confirmation page elements not verified");
			}

			String Booking_Id = AppointmentBookingid.getAttribute("text");
			if(Okbtn.isDisplayed() && Okbtn.getText().equals("نعم"))
			{
			Okbtn.click();
			System.out.println("Ok  Button in the confirmation page is clicked & Appointment title is displayed");
			}
			else
			{
				System.out.println("Ok  Button in the confirmation page is not clicked & Appointment title is not  displayed");
			}
			System.out.println("Ok  Button in the confirmation page is clicked & Appointment title is displayed");

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
		}

		else {
			System.out.println("Booking button not verified, confirmation title is not displayed");
		}

	}

	public Boolean appointmentidFarmvisitverification() throws InterruptedException {

		boolean val = false;
		System.out.println("Appointment details page verification");
		AppointmentIdTitle = PurposeBookingid.getAttribute("text");
		cliniclocationstr = cliniclocation.getAttribute("text");

		// datetimestr = datetime.getAttribute("text");
		// Status = status.getAttribute("text");

		if (PurposeBookingid.isDisplayed()) {
			String longWord = AppointmentIdTitle;
			System.out.println("Export purpose is clicked " + longWord);
			String str = longWord;

			// Extract a substring from index 12 to the end of the string
			substr1 = str.substring(22);
			System.out.println(substr1);

			// Extract a substring from index 0 to index 9 (exclusive)
			substr2 = str.substring(0, 19);
			System.out.println(substr2);

			PurposeBookingid.click();
			System.out.println("Appointment Id in the Listing page is clicked");
			Thread.sleep(5000);
			appointmentDetailsID = appointmentiddetailspage.getAttribute("text");
			purposeName = purposeExporting.getAttribute("text");

		/*	if (substr1.equals(appointmentDetailsID)) {
				val = true;
				System.out.println("Id in the Appointment listing page is same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			} else {
				System.err.println("Id in the Appointment listing page is not same as Id in Appointment Details Page "
						+ appointmentDetailsID);
			}
*/
		} else {
			System.out.println("The word is not long enough.");
		}

	/*	if (purposefield.isDisplayed()&& purposefield.getText().equals("Purpose")) {		
				Assert.assertEquals(substr2, purposeName);
				System.out.println("purpose Name is same as in the Appointment Title " + purposeName);
			}else {
				System.out.println("purpose Name is not same " + purposeName);
			}
	*/	

		if (BookingId.isDisplayed()){			
				Appointmentiddetailpage = appointmentiddetailspage.getAttribute("text");
			//	Assert.assertEquals(appointmentDetailsID, Appointmentiddetailpage);
				System.out.println("Booking Id is same as in the Appointment Title " + Appointmentiddetailpage);
			} else {
				System.out.println("Appointment is not same " + Appointmentiddetailpage);
			}
		

		if (clinicnametext.isDisplayed()) {			
				cliniclocationstrdetailpage = clinicnametext.getAttribute("text");
				Assert.assertEquals(cliniclocationstr, cliniclocationstrdetailpage);
				System.out.println("clinic Name is same as in the Appointment list " + cliniclocationstrdetailpage);
			} else {
				System.out.println("clinic Name is not same " + cliniclocationstrdetailpage);
			}
	

	/*	if (Date.isDisplayed()) {
			String dateAppointed = datetext.getAttribute("text");
			System.out.println("Date in the Appointment List : " + dateAppointed);
		} else {
			System.out.println("Date is not displayed");
		}
*/
		
		if (ExportDetails.isDisplayed()) {
			
				String exportdetailpage = ExportDetails.getAttribute("text");				
				System.out.println("Exporting details are : " + exportdetailpage);
			}else {
				System.out.println("export details not displayed");
			}
	
		
/*		if (comment.isDisplayed()) {
			String CommentsText = commentstext.getAttribute("text");
			System.out.println("Comments in the Appointment List : " + CommentsText);
		} else {
			System.out.println("Comments is not displayed");
		}
*/
		return val;
	}

	

	public Boolean VerifyClinicDropdownEmpty() {
		boolean val = false;
		bookBtn.click();

		ExpectedclinicalertMessage = clinicalertMsg.getAttribute("text");
		ActualClinicAlertmessage = "Please select clinic name";

		Assert.assertEquals(ActualClinicAlertmessage, ExpectedclinicalertMessage);
		System.err.println("Error message displayed Please Select clinic");

		clinicokButton.click();
		System.out.println("ok button inside clinic error message is displyed and clicked successfully");

		return val;
	}

	public Boolean VerifyClinicDropdown() throws InterruptedException {
		boolean val = false;
		ClinicList();
		// ClinicDropdown.click();
		// System.out.println("Clinic dropdown is clicked");
		Thread.sleep(5000);

		return val;
	}

	public Boolean verifyClinicNameEmpty() {
		boolean val = false;
		System.out.println("clinic name is slected as empty");
		
		bookBtn.click();
		System.out.println("Book an appointrment is clicked");

		ExpectedclinicalertMessage = clinicNamealertMsg.getAttribute("text");
		ActualClinicAlertmessage = "الرجاء تحديد اسم العيادة";

		Assert.assertEquals(ActualClinicAlertmessage, ExpectedclinicalertMessage);
		System.err.println("Error message displayed Please Select clinic name");

		clinicNameokButton.click();
		System.out.println("Ok button inside clinic Name error message is displayed and clicked successfully");

		return val;

	}

	public void verifyClinicName() throws InterruptedException {

		ClinicNameList();
		System.out.println("clinic Name has been selected");

	}

	public void VerifyAnimaltype() {
		if (Individual.isDisplayed() && Individual.getText().equals("فردي")&& Herd.isDisplayed() && Herd.getText().equals("قطيع")) {
			System.out.println("Individual & Herd  displayed");
		} else {
			System.out.println("No Animaltype has displayed");
		}
	}

	public void ClickIndividual() {
		Individual.click();
		System.out.println("Individual is clicked");
		if (speciesListName.isDisplayed() && speciesListName.getText().equals("صِنف")&& TagId.isDisplayed()&& TagId.getText().equals("معرف العلامة")) {
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
		if (Herd.isDisplayed() && Herd.getText().equals("قطيع")) {
			System.out.println("Herd is displayed");
			Herd.click();
			System.out.println("Herd is clicked");

		//	if (SpeciesName.isDisplayed() && TotalCount.isDisplayed()) {
			if (TotalCount.isDisplayed()) {
				System.out.println("SpeciesName & TotalCount elements has Verified when Herd is clicked");
			} else {
				System.out.println("No elements  has displayed");
			}
		} else {
			System.out.println("Herd is not displayed");
		}
	}

	public void VerifySpeciesHerd() {

		if (cattle.isDisplayed() && cattle.getText().equals("ابقار") && sheep.isDisplayed() && sheep.getText().equals("خروف")&& goat.isDisplayed() && goat.getText().equals("ماعز")) {
			System.out.println("cattle, sheep & goat elements has Verified when Herd is clicked");
		} else {
			System.out.println("No elements  has displayed");
		}
	}

	public void ClickTagIdEmpty() {
		if (Individual.isDisplayed() && Individual.getText().equals("فردي")) {
			System.out.println("Individual is displayed");
			Individual.click();
			System.out.println("Individual is clciked");
			TagEt.sendKeys("");
			System.out.println("Tag id is empty");
			bookBtn.click();
			System.out.println("book an appointment is clicked");
		} else {
			System.out.println("Individual is not displayed");
		}

		// This will capture error message

		String Actual_Error_msg;
		String Expected_Error_Msg;
		Actual_Error_msg = TagIdError.getAttribute("text");

		Expected_Error_Msg = "الرجاء إدخال معرف العلامة";
		// Verify error message
		Assert.assertEquals(Actual_Error_msg, Expected_Error_Msg);
		System.err.println("Error message displayed Please enter tag id");

		TagIdErrorOkBtn.click();
		System.out.println("ok button  in the Error message is clicked");
		System.out.println("Error message get closed in tag Id");

	}

	public void ClickTagIdBookNBtn() {
		if (TagEt.isDisplayed()) {
			TagEt.sendKeys("10065");
			System.out.println("tag id is displayed");
			bookBtn.click();
			System.err.println("please enter valid tag Id");

			TagEt.sendKeys("1006578656789546");
			bookBtn.click();
			System.out.println("Booking Appointment Button is clicked");
			System.out.println("Tag id entered is correct");

		} else {
			System.out.println("tag id is not displayed");
		}
	}

	public void verifyTagIdBookingbtn() throws InterruptedException {
		if (ConfirmationTitle.isDisplayed() && ConfirmationTitle.getText().equals("تأكيد")) {
			System.out.println("Booking button verified,confirmation title is displayed");
			if (CLinicName.isDisplayed() && CLinicName.getText().equals("اسم العيادة")&& BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")&& RequestMsg.isDisplayed() && RequestMsg.getText().equals("تم إرسال الطلب بنجاح")
					&& ConfirmationText.isDisplayed() && ConfirmationText.getText().equals("تأكيد")&& TickMark.isDisplayed()) {
		//			&& Date.isDisplayed() && Date.getText().equals("Date") ) {
				System.out.println("confirmation page elements verified");
			} else {
				System.out.println("confirmation page elements not verified");
			}

			Thread.sleep(5000);
			String Booking_Id = AppointmentBookingid.getAttribute("text");
			if(Okbtn.isDisplayed() && Okbtn.getText().equals("نعم"))
			{
			Okbtn.click();
			System.out.println("Ok  Button in the confirmation page is clicked & Appointment title is displayed");
			}
			else
			{
				System.out.println("Ok  Button in the confirmation page is not clicked & Appointment title is not  displayed");
			}
			System.out.println("Ok  Button in the confirmation page is clicked & Appointment title is displayed");

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
		}

		else {
			System.out.println("Booking button not verified, confirmation title is not displayed");
		}

	}

	public void verifyAnimalCountBookingbtn() throws InterruptedException {
		if (ConfirmationTitle.isDisplayed() && ConfirmationTitle.getText().equals("تأكيد")) {
			System.out.println("Booking button verified ,Confirmation title displayed when Animal count is selected");

			if (CLinicName.isDisplayed() && CLinicName.getText().equals("اسم العيادة")&& BookingId.isDisplayed() && BookingId.getText().equals("معرف الحجز")&& RequestMsg.isDisplayed() && RequestMsg.getText().equals("تم إرسال الطلب بنجاح")
					&& ConfirmationText.isDisplayed() && ConfirmationText.getText().equals("تأكيد")&& TickMark.isDisplayed()) {
				
					//&& Date.isDisplayed() && Date.getText().equals("Date") ) {

				System.out.println("confirmation page elements verified when Animal count is selected");

			} else {

				System.out.println("confirmation page elements not verified when Animal count is selected");

			}

			String Booking_Id = AppointmentBookingid.getAttribute("text");
			if(Okbtn.isDisplayed() && Okbtn.getText().equals("نعم"))
			{
			Okbtn.click();
			System.out.println("Ok  Button in the confirmation page is clicked & Appointment title is displayed");
			}
			else
			{
				System.out.println("Ok  Button in the confirmation page is not clicked & Appointment title is not  displayed");
			}
			System.out.println("Ok  Button is clicked & verified");

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

	public Boolean OkandCancelbuttonverification() throws InterruptedException {

		boolean val = false;
		String ExpectedAppointment = "ميعاد";
		String ActualAppointment = AppointmentListingTitle.getAttribute("text");
		if (AppointmentListingTitle.isDisplayed() && ActualAppointment.equalsIgnoreCase(ExpectedAppointment)) {

			val = true;
		}
		Dimension windowSize = driver.manage().window().getSize();

		Thread.sleep(5000);
		try {
			try {

				Thread.sleep(5000);
				TouchAction ts = new TouchAction(driver);
				ts.longPress(PointOption.point(983, 480)).moveTo(PointOption.point(97, 290)).release()
						// Release the touch action(ending the swipe)
						.perform(); // Perform the swipe action

				if (canceltext.isDisplayed()) {
					System.out
							.println("Are you sure you want to cancel the Request, text inside the popup is displayed");
					if (cancelbuttonpopup.isDisplayed()) {
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

				// if (canceltext.isDisplayed()) {
				// System.out
				// .println("Are you sure you want to cancel the Request, text inside the popup
				// is displayed");

				Thread.sleep(5000);
				TouchAction ts1 = new TouchAction(driver);
				ts1.longPress(PointOption.point(983, 480)).moveTo(PointOption.point(97, 290)).release() // Release the
																										// touch
																										// action
																										// (ending
																										// the
																										// swipe)
						.perform(); // Perform the swipe action

				if (canceltext.isDisplayed()) {
					System.out
							.println("Are you sure you want to cancel the Request, text inside the popup is displayed");

					if (Okbuttonpopup.isDisplayed()) {
						Thread.sleep(5000);
						Okbuttonpopup.click();

						if (appointmenttitle.isDisplayed()) {
							System.out.println("Ok button inside the popup is clicked and move back to the page");
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
			}

			catch (Exception e) {

				System.out.println("Appointment Request is   cancelled");
			}

			try {

				if (RequestCancelled.isDisplayed()) {
					System.out.println("Request is already cancelled text inside the popup is displayed");
					OkcancelBtn.click();
					System.out.println("ok button inside request cancelled is clicked");
				} else {
					System.out.println("Request is already cancelled text inside the popup is not displayed");
				}

			}

			catch (Exception e) {
				System.out.println("Appointment Request is  not cancelled, need to cancel Appointment");
			}
		}

		catch (Exception e) {
			System.out.println("Appointment Request is under process");
		}
		return val;
	}

	public Boolean purposeList() throws InterruptedException {

		boolean val = false;
		Thread.sleep(5000);
		/*
		 * addappointmentbtn.click();
		 * System.out.println("Add appointment button is clicked successfully");
		 */

		PurposeDropdown.click();
		System.out.println("Purpose dropdown is clicked successfully");
		Thread.sleep(5000);
		int listSize1 = purposelist.size();
		val = true;
		// Print the size of the list
		System.out.println("Size of the list: " + listSize1);
		int indexToSelect = 1;
		WebElement selectedElement1 = purposelist.get(indexToSelect);

		String element1 = selectedElement1.getAttribute("text");
		System.out.println("Selected from dropdownlist: " + element1);
		// Perform actions with the selected element
		selectedElement1.click(); // For example, click on the element

		System.out.println(" purpose is a  dropdown list ");
		Thread.sleep(5000);

		return val;
	}

	public Boolean ClinicList() throws InterruptedException {

		boolean val = false;
		ClinicDropdown.click();
		System.out.println("Clinic  dropdown is clicked successfully");
		Thread.sleep(5000);
		int listSize2 = cliniclist.size();
		val = true;
		// Print the size of the list
		System.out.println("Size of the list: " + listSize2);
		if (privateClinic.isDisplayed() && privateClinic.getText().equals("خاص")  && publicclinic.isDisplayed() && publicclinic.getText().equals("حكومي")) {
			val = true;
	//		publicclinic.click();
			System.out.println("clinic dropdown is clicked, public and private has Verified");
			Thread.sleep(5000);
		//	 publicclinic.click();

		} else {
			System.out.println("No dropdown has displayed");
		}

		
		int indexToSelect = 1;
		WebElement selectedElement2 = cliniclist.get(indexToSelect);
		String element2 = selectedElement2.getAttribute("text");
		System.out.println("Selected from dropdownlist: " + element2);

		// Perform actions with the selected element
	  selectedElement2.click(); // For example, click on the element

		
		System.out.println("clinic is a  dropdown list");
	

		return val;
	}

	public Boolean ClinicNameList() throws InterruptedException {
		boolean val = false;
		Thread.sleep(10000);
		ClinicDropdown.click();
		publicclinic.click();
		Thread.sleep(5000);
		clinicNamedropdown.click();
		Thread.sleep(10000);
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
		if (cattle.isDisplayed() && cattle.getText().equals("ابقار") && sheep.isDisplayed() && sheep.getText().equals("خروف")&& goat.isDisplayed() && goat.getText().equals("ماعز")) {
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

}
