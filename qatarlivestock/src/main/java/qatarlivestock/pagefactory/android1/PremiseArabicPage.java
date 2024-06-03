package qatarlivestock.pagefactory.android1;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;

public class PremiseArabicPage extends AndroidActions {
	AndroidDriver driver;

	public PremiseArabicPage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='فرضية']")
	public WebElement premiseModule;

	@AndroidFindBy(xpath = ".//androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.LinearLayout[1]")
	private WebElement ViewButton;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat")
	private List<WebElement> premiselist;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='تفاصيل الفرضية']")
	private WebElement PremiseDetailsTitle;

	@AndroidFindBy(id = "premiseRecordsBtn")
	private WebElement PremiseRecordsIcon;

	@AndroidFindBy(id = "premiseWeatherBtn")
	private WebElement WeatherInfoIcon;

	@AndroidFindBy(id = "visitHistoryBtn")
	private WebElement PremiseVisitHistoryIcon;

	@AndroidFindBy(id = "premiseLocationBtn")
	private WebElement PremiseLocationIcon;

	@AndroidFindBy(id = "premiseBoundaryTxt")
	private WebElement PremiseBoundary;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement Locationbackarrowbtn;

	@AndroidFindBy(id = "textView4")
	private WebElement PremiseName;

	@AndroidFindBy(id = "permitStatus")
	private WebElement PermitStatus;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'لا تتوافر بيانات')]")
	private WebElement OwnerinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'لا تتوافر بيانات')]")
	private WebElement PremiseinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'لا تتوافر بيانات')]")
	private WebElement LocationinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'لا تتوافر بيانات')]")
	private WebElement NomineeinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'لا تتوافر بيانات')]")
	private WebElement CoworkersinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'لا تتوافر بيانات')]")
	private WebElement PremiseVisitNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'لا تتوافر بيانات')]")
	private WebElement PremiseWeatherNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'لا تتوافر بيانات')]")
	private WebElement PremiseLocationNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'لا تتوافر بيانات')]")
	private WebElement PremiseRecordNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معلومات المالك']")
	private WebElement OwnerInfo;

	@AndroidFindBy(id = "owner_info_btn")
	private WebElement OwnerInfoMinusBtn;

	@AndroidFindBy(id = "owner_info_btn")
	private WebElement OwnerInfoplusBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='اسم المالك']")
	private WebElement OwnerName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='رقم المالك']")
	private WebElement OwnerNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='البطاقة الشخصية للمالك']")
	private WebElement OwnerQId;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='جنس']")
	private WebElement Gender;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='عمر']")
	private WebElement Age;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='عنوان']")
	private WebElement Address;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='صندوق']")
	private WebElement PoBox;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الفاكس']")
	private WebElement Fax;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='عنوان الايميل']")
	private WebElement EmailId;

	@AndroidFindBy(id = "location_info_btn")
	private WebElement LocationInfoBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معلومات الموقع']")
	private WebElement LocationInfo;

	@AndroidFindBy(id = "location_info_btn")
	private WebElement LocationInfoMinusBtn;

	@AndroidFindBy(id = "location_info_btn")
	private WebElement LocationInfoplusBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='المنطقة رقم']")
	private WebElement ZoneNo;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='اسم مم الفرعية']")
	private WebElement SubName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الرقم السري']")
	private WebElement PinNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معلومات الفرضية']")
	private WebElement premiseInfo;

	@AndroidFindBy(id = "premise_info_btn")
	private WebElement PremiseInfoMinusBtn;

	@AndroidFindBy(id = "premise_info_btn")
	private WebElement PremiseInfoplussBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='نوع الملكية']")
	private WebElement TypeOwnership;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='نوع الفرضية']")
	private WebElement TypeofPremise;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='اسم الفرضية']")
	private WebElement PremisesName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='البلدية']")
	private WebElement Municipality;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='بطاقة الحصص لا']")
	private WebElement RationCard;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='غاية']")
	private WebElement Purposes;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='مصدر للمياه']")
	private WebElement SourceofWater;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='منطقة الفرضية']")
	private WebElement PremiseArea;

	@AndroidFindBy(className = "android.widget.TextView")
	private WebElement DateofCensus;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement RecordsbackArrowbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='سجلات الفرضية']")
	private WebElement PremiseRecordsTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الحدود المعلنة']")
	private WebElement DeclaredBoundary;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='الحدود الفعلية']")
	private WebElement ActualBoundary;

	@AndroidFindBy(id = "mapview_esribanner_layout")
	private WebElement MapView;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معلومات زملاء العمل']")
	private WebElement CoWorkersInfo;

	@AndroidFindBy(id = "coworkers_info_btn")
	private WebElement CoWorkersInfoMinusBtn;

	@AndroidFindBy(id = "coworkers_info_btn")
	private WebElement CoWorkersInfoplussBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='القطري 0']")
	private WebElement Qatari;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='غير القطري 1']")
	private WebElement NonQatari;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معلومات المرشح']")
	private WebElement NomineeInfo;

	@AndroidFindBy(id = "nominee_info_btn")
	private WebElement NomineeInfoMinusBtn;

	@AndroidFindBy(id = "nominee_info_btn")
	private WebElement NomineeInfoplussBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='اسم المرشح']")
	private WebElement NomineeName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='رقم المرشح']")
	private WebElement NomineeNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='البطاقة الشخصية للمرشح']")
	private WebElement NomineeQid;

	@AndroidFindBy(id = "docName")
	private WebElement DocumentName;

	@AndroidFindBy(className = "android.widget.ImageView")
	private WebElement PdfView;

	@AndroidFindBy(id = "docDate")
	private WebElement DocumentDate;

	@AndroidFindBy(className = "android.widget.ImageView")
	private WebElement eyeicon;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='منظر']")
	private WebElement ViewText;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement HistorysbackArrowbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='فرضية زيارة التاريخ']")
	private WebElement PremiseVisitHistoryTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='آخر 5 زيارات']")
	private WebElement Lastvisit;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='معلومات الطقس']")
	private WebElement weatherInfoTitle;

	@AndroidFindBy(id = "tv_no_data_available")
	private WebElement WeatherNoDataAvailable;

	@AndroidFindBy(id = "close_weather")
	private WebElement weathercloseBtn;

	@AndroidFindBy(id = "weather_loc_iv")
	private WebElement weatherlocation;

	@AndroidFindBy(id = "addressTv")
	private WebElement weatherAddress;

	@AndroidFindBy(id = "placeNameTv")
	private WebElement weatherPlace;

	@AndroidFindBy(id = "temperatureIv")
	private WebElement weatherTemparature;

	@AndroidFindBy(id = "temperatureTv")
	private WebElement weathertemparatureCelsius;

	@AndroidFindBy(id = "precipitationTv")
	private WebElement weather;

	@AndroidFindBy(id = "weatherValueTv")
	private WebElement weatherValue;

	@AndroidFindBy(id = "humidityTv")
	private WebElement weatherHumidity;

	@AndroidFindBy(id = "humidityValueTv")
	private WebElement weatherHumidityValue;

	@AndroidFindBy(id = "windTv")
	private WebElement weatherWind;

	@AndroidFindBy(id = "windValueTv")
	private WebElement weatherWindValue;

	@AndroidFindBy(id = "line1")
	private WebElement LineBtn;

	@AndroidFindBy(id = "tv_no_data_available")
	private WebElement premiseVisitNoDataAvailable;

	@AndroidFindBy(id = "textView12")
	private WebElement premiseActive;

	@AndroidFindBy(id = "ownerName")
	private WebElement ownerNames;

	@AndroidFindBy(id = "ownerNumber")
	private WebElement ownerNumber;

	@AndroidFindBy(id = "ownerQID")
	private WebElement ownerQid;

	@AndroidFindBy(id = "gender")
	private WebElement OwnerGender;

	@AndroidFindBy(id = "age")
	private WebElement Ownerage;

	@AndroidFindBy(id = "address")
	private WebElement owneraddress;

	@AndroidFindBy(id = "pobox")
	private WebElement ownerpobox;

	@AndroidFindBy(id = "fax")
	private WebElement ownerfax;

	@AndroidFindBy(id = "ownerEmail")
	private WebElement owneremail;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement OwnerNameDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement OwnerNoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoPremiseTypeofpremise;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement OwnergenderNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement OwnerageNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement OwnerAddressNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement OwnerFaxNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement OwnerPoboxNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement OwneremailNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	private WebElement nomineeNames;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]")
	private WebElement nomineeNumber;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView[2]")
	private WebElement nomineeqid;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NonomineeNames;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NonomineeNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement Nonomineeqid;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	private WebElement locationZoneNo;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]")
	private WebElement locationsubmmName;

	@AndroidFindBy(id = "last_item_loc")
	private WebElement locationPinNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NolocationZoneNo;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NolocationsubmmName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NolocationPinNumber;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	private WebElement premiseTypeofOWnership;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]")
	private WebElement premiseNamehouse;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView[2]")
	private WebElement premiseTypeofpremise;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.TextView[2]")
	private WebElement premisemuniciplality;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[5]/android.widget.TextView[2]")
	private WebElement premiseRationCardNo;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[6]/android.widget.TextView[2]")
	private WebElement premisepurpose;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[7]/android.widget.TextView[2]")
	private WebElement premisesourceofwater;

	@AndroidFindBy(id = "premiseArea")
	private WebElement premisePremisearea;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[9]/android.widget.TextView[2]")
	private WebElement premisedateofCensus;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoPremiseTypeofOWnership;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoPremiseNamehouse;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement OwnerqidNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoPremisemuniciplality;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoPremiseRationCardNo;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoPremisepurpose;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoPremisesourceofwater;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoPremisePremisearea;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoPremisedateofCensus;

	@AndroidFindBy(id = "qatariCount")
	private WebElement Coworkersqatari;

	@AndroidFindBy(id = "nonQatariCount")
	private WebElement CoworkersnonQatari;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoCoworkersqatari;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,' لا تتوافر بيانات')]")
	private WebElement NoCoworkersnonQatari;

	//vivo
	   @AndroidFindBy(xpath = ".//android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ImageView")
	   private WebElement pdfbackBtn;
		
		//android
	//@AndroidFindBy(xpath = ".//android.widget.ImageButton[@content-desc=\"Back\"]")
//	private WebElement pdfbackBtn;		
		
		//emulator
//	   @AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton")
//	   private WebElement pdfbackBtn;
		

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat")
	private List<WebElement> Visitlayout;

	@AndroidFindBy(id = "visit_person_name")
	private List<WebElement> visitPersonName;

	@AndroidFindBy(id = "visit_date_time")
	private List<WebElement> VisitDateTime;

	@AndroidFindBy(id = "visit_comments")
	private List<WebElement> VisitComments;

	@AndroidFindBy(id = "visit_purpose")
	private List<WebElement> visitpurpose;

	String OrginalActive;
	String ExpectedActive;
	String ownerName;
	String ownerNo;
	String ownerqid;
	String ownergender;
	String ownerAge;
	String ownerAddress;
	String ownerPobox;
	String ownerFax;
	String ownerEmail;
	String premisName;
	String locationZone;
	String locationSubmmName;
	String locationpinNumber;
	String CoworkersQatari;
	String CoworkersNonQatari;
	String nolocationZone;
	String nolocationSubmmName;
	String nolocationpinNumber;
	String PremisetypeofOWnership;
	String PremiseNameHouse;
	String PremiseTypeofPremise;
	String PremiseMuniciplality;
	String PremiseRationCard;
	String PremisePurpose;
	String PremiseSourceofwater;
	String PremisePremiseArea;
	String PremiseDateofCensus;
	String noPremisetypeofOWnership;
	String noPremiseNameHouse;
	String noPremiseTypeofPremise;
	String noPremiseMuniciplality;
	String noPremiseRationCard;
	String noPremisePurpose;
	String noPremiseSourceofwater;
	String noPremisePremiseArea;
	String noPremiseDateofCensus;
	String noCoworkersQatari;
	String noCoworkersNonQatari;
	String NoNomineeNames;
	String NoNomineeNumbers;
	String NoNomineeqids;

	public boolean ClickPremiseModule() throws InterruptedException {
		boolean val = false;
		if (premiseModule.isDisplayed()) {
			val = true;
			Thread.sleep(5000);
			premiseModule.click();
			premiseModule.click();
			System.out.println("premise Module is Clicked");
			Thread.sleep(5000);
			String ActualpremiseTitle = PremiseDetailsTitle.getAttribute("text");
			String ExpectedPremiseTitle = "تفاصيل الفرضية";
			if (PremiseDetailsTitle.isDisplayed() && ActualpremiseTitle.equalsIgnoreCase(ExpectedPremiseTitle)) {
				val = true;
				System.out.println("clicked Premise module , premise details title is verified");

			} else {
				System.out.println("Premise module click , premise details title is not verified ");

			}

		} else {
			System.out.println("PremiseModule is not clicked");
		}
		return val;

	}

	public Boolean VerifyPremisName(String OrginalActive, String premisName) throws InterruptedException {

		boolean val = false;
		if (PremiseName.isDisplayed()) {
			val = true;
			System.out.println("Premise Name verified");
			premisName = PremiseName.getAttribute("text");
			System.out.println("Premise Name is displayed " + premisName);

			Thread.sleep(5000);
			if (PermitStatus.isDisplayed()) {
				val = true;
				System.out.println("Permit Status  verified");
				OrginalActive = premiseActive.getAttribute("text");
				ExpectedActive = "نشيط";
				// Verify error message
				Assert.assertEquals(OrginalActive, ExpectedActive);
				System.out.println("Premise is  Active");

			} else {
				System.out.println("Not verified PermitStatus ");

			}

		} else {
			System.out.println("Not verified Premise Name ");
		}
		return val;
	}

	public Boolean VerifyIcons() {
		boolean val = false;
		if (PremiseRecordsIcon.isDisplayed() && WeatherInfoIcon.isDisplayed() && PremiseLocationIcon.isDisplayed()
				&& PremiseVisitHistoryIcon.isDisplayed()) {
			val = true;
			System.out.println(
					"Premise Records icon, weatherinfo Icon, Premise Location icon, premise visit history icon verified");
		}
		return val;
	}

	public Boolean VerifyOwnerInfo() {
		boolean val = false;
		String ExpectedOwnerinfoo = OwnerInfo.getAttribute("text");
		String ActualOwnerInfoo = "معلومات المالك";
		if (OwnerInfo.isDisplayed() && ActualOwnerInfoo.equalsIgnoreCase(ExpectedOwnerinfoo)) {
			val = true;
			System.out.println("OwnerInfo  verified");
			OwnerInfoMinusBtn.click();
			System.out.println("clicked Minus sign in owner info, Owner info  minus verified ");

			if (OwnerInfoplusBtn.isDisplayed()) {
				val = true;
				System.out.println("plus sign has Displayed");
				OwnerInfoplusBtn.click();
				System.out.println("owner info plus sign has clicked");
			} else {
				System.out.println("owner info plus sign is not displayed,and not clicked");
			}

		} else {
			System.out.println("Not verified OwnerInfo");
		}
		return val;
	}

	public Boolean Verifyownerinfodetail(String ownerName, String ownerNo, String ownerqid, String ownergender,
			String ownerAge, String ownerAddress, String ownerPobox, String ownerFax, String ownerEmail,
			String nolocationZone, String nolocationSubmmName, String nolocationpinNumber, String locationZone,
			String locationSubmmName, String locationpinNumber, String noownerPobox, String noownerFax,
			String noownerEmail) {

		boolean val = false;
		try {
			try {
				if (OwnerinfoNoDataAvailable.isDisplayed()) {
					System.out.println("No owner info details available");
					val = true;
					ownerNoDataAvailable(ownerName, ownerNo, ownerqid, ownergender, ownerAge, ownerAddress, ownerPobox,
							ownerFax, ownerEmail);
					OwnerInfoMinusBtn.click();
				}
			} catch (Exception e) {
				System.out.println("owner info data is available");
			}

			try {
				if (OwnerName.isDisplayed() && OwnerName.getText().equals("اسم المالك") && OwnerNumber.isDisplayed()
						&& OwnerNumber.getText().equals("رقم المالك") && OwnerQId.isDisplayed()
						&& OwnerQId.getText().equals("البطاقة الشخصية للمالك") && Gender.isDisplayed()
						&& Gender.getText().equals("جنس") && Age.isDisplayed() && Age.getText().equals("عمر")
						&& Address.isDisplayed() && Address.getText().equals("عنوان") && PoBox.isDisplayed()
						&& PoBox.getText().equals("صندوق") && Fax.isDisplayed() && Fax.getText().equals("الفاكس")) {
					// && EmailId.isDisplayed() && EmailId.getText().equals("عنوان الايميل")) {
					val = true;
					System.out.println(
							"OwnerName, OwnerNumber, OwnerQID, Gender, Age, Address, PoBox, Fax, Email id  has Displayed");

					WebElement element = (WebElement) driver.findElement(
							MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
									+ ".scrollIntoView(new UiSelector().text(\"عنوان الايميل\"));"));

					if (EmailId.isDisplayed() && EmailId.getText().equals("عنوان الايميل")) {
						val = true;
						System.out.println("Email id is displayed successfully");
					} else {
						System.out.println("Email id is not displayed successfully");
					}

					ownerData(ownerName, ownerNo, ownerqid, ownergender, ownerAge, ownerAddress, ownerPobox, ownerFax,
							ownerEmail);

					Thread.sleep(5000);
					WebElement element12 = (WebElement) driver.findElement(
							MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
									+ ".scrollIntoView(new UiSelector().text(\"اسم المالك\"));"));

				} else {
					System.out.println("Not displayed Any Text in the owner info");
				}

			} catch (Exception e) {
				System.out.println("owner info details not available");
			}
		} catch (Exception e) {
			System.out.println("owner info details  verification");
		}
		return val;
	}

	public Boolean VerifyLocationInfo() throws InterruptedException {

		boolean val = false;

		OwnerInfoMinusBtn.click();
		if (LocationInfo.isDisplayed() && LocationInfo.getText().equals("معلومات الموقع")) {
			val = true;
			System.out.println("LocationInfo  verified");
			if (LocationInfoplusBtn.isDisplayed()) {
				val = true;
				System.out.println("plus sign icon available in Location info ");
				LocationInfoplusBtn.click();
				System.out.println("plus sign icon in Location info is clicked ");
				if (LocationInfoMinusBtn.isDisplayed()) {
					val = true;
					System.out.println("Minus sign icon available in Location info ");
					LocationInfoMinusBtn.click();
					System.out.println("Minus sign icon in Location info is clicked ");
				} else {
					System.out.println("plus sign  not available in Location info");
				}
			}
		} else {
			System.out.println("Not verified LocationInfo");
		}
		return val;
	}

	public Boolean VerifyLocationinfodetail(String nolocationZone, String nolocationSubmmName,
			String nolocationpinNumber, String locationZone, String locationSubmmName, String locationpinNumber) {
		boolean val = false;
		LocationInfoplusBtn.click();

		try {
			if (LocationinfoNoDataAvailable.isDisplayed()) {
				val = true;
				System.out.println("No premise info details available");
				LocationNoDataAvailable(locationZone, nolocationSubmmName, nolocationpinNumber);

				LocationInfoMinusBtn.click();
			}
		} catch (Exception e) {
			System.out.println("Location info data is available");
		}

		try {
			if (ZoneNo.isDisplayed() && ZoneNo.getText().equals("المنطقة رقم") && SubName.isDisplayed()
					&& SubName.getText().equals("اسم مم الفرعية") && PinNumber.isDisplayed()
					&& PinNumber.getText().equals("الرقم السري")) {
				val = true;
				System.out.println("Zone Number, Sub MM Number, Pin Number  has Displayed");
				LocationData(locationZone, locationSubmmName, locationpinNumber);
				LocationInfoMinusBtn.click();
			} else {
				System.out.println("Not displayes Any Text in the Location info");
			}
		} catch (Exception e) {
			System.out.println("Location info data is  not available");
		}
		return val;
	}

	public Boolean VerifyPremiseInfo() {
		boolean val = false;
		if (premiseInfo.isDisplayed() && premiseInfo.getText().equals("معلومات الفرضية")) {
			val = true;
			System.out.println("PremiseInfo  verified");
			if (PremiseInfoplussBtn.isDisplayed()) {
				val = true;
				System.out.println("plus sign icon available in premise info ");
				PremiseInfoplussBtn.click();
				System.out.println("plus sign icon in premise info is clicked ");
				if (PremiseInfoMinusBtn.isDisplayed()) {
					val = true;
					System.out.println("Minus sign icon available in premise info ");
					PremiseInfoMinusBtn.click();
					System.out.println("Minus sign icon in premise info is clicked ");
				} else {
					System.out.println("plus sign  not available in Location info");
				}
			} else {
				System.out.println(" Not verified Premise Info");
			}
		}
		return val;
	}

	public Boolean VerifyPremiseinfodetail(String PremisetypeofOWnership, String PremiseNameHouse,
			String PremiseTypeofPremise, String PremiseMuniciplality, String PremiseRationCard, String PremisePurpose,
			String PremiseSourceofwater, String PremisePremiseArea, String PremiseDateofCensus,
			String noPremisetypeofOWnership, String noPremiseNameHouse, String noPremiseTypeofPremise,
			String noPremiseMuniciplality, String noPremiseRationCard, String noPremisePurpose,
			String noPremiseSourceofwater, String noPremisePremiseArea, String noPremiseDateofCensus) {
		boolean val = false;
		PremiseInfoplussBtn.click();

		try {
			if (PremiseinfoNoDataAvailable.isDisplayed()) {
				val = true;
				System.out.println("No premise info details available");

				PremiseDataNodatAvailable(noPremisetypeofOWnership, noPremiseNameHouse, noPremiseTypeofPremise,
						noPremiseMuniciplality, noPremiseRationCard, noPremisePurpose, noPremiseSourceofwater,
						noPremisePremiseArea, noPremiseDateofCensus);

				PremiseInfoMinusBtn.click();
			}
		} catch (Exception e) {
			System.out.println("premise info data is available");
		}
		try {

			if (TypeOwnership.isDisplayed() && TypeOwnership.getText().equals("نوع الملكية")
					&& PremisesName.isDisplayed() && PremisesName.getText().equals("اسم الفرضية")
					&& TypeofPremise.isDisplayed() && TypeofPremise.getText().equals("نوع الفرضية")
					&& Municipality.isDisplayed() && Municipality.getText().equals("البلدية")
					&& RationCard.isDisplayed() && RationCard.getText().equals("بطاقة الحصص لا")
					&& Purposes.isDisplayed() && Purposes.getText().equals("غاية")) {
				val = true;
				System.out.println(
						"Type of ownership, premise Name, type of premise, Municiplaity, ration card number, purpose has Displayed");
			} else {
				System.out.println(
						"Type of ownership, premise Name, type of premise, Municiplaity, ration card number, purpose has not displayed");
			}

	/*		WebElement element = (WebElement) driver
					.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
							+ ".scrollIntoView(new UiSelector().text(\"تاريخ أحدث التعداد\"));"));

			if (SourceofWater.isDisplayed() && SourceofWater.getText().equals("مصدر للمياه")
					&& PremiseArea.isDisplayed() && PremiseArea.getText().equals("منطقة الفرضية")
					&& DateofCensus.isDisplayed() && DateofCensus.getText().equals("تاريخ أحدث التعداد")) {
				val = true;
				System.out.println("source of water, Premise Area, Date of Latest Census has Displayed");
			} else {
				System.out.println("source of water, Premise Area, Date of Latest Census has not Displayed");
			}
			PremiseData(PremisetypeofOWnership, PremiseNameHouse, PremiseTypeofPremise, PremiseMuniciplality,
					PremiseRationCard, PremisePurpose, PremiseSourceofwater, PremisePremiseArea, PremiseDateofCensus);
*/
		}

		catch (Exception e) {
			System.out.println("premise info data is not available");
		}
		return val;
	}

	// verify CoWorkersInfo
	public Boolean VerifyCoWorkersInfo() {
		boolean val = false;
		PremiseInfoMinusBtn.click();
		if (CoWorkersInfo.isDisplayed() && CoWorkersInfo.getText().equals("معلومات زملاء العمل")) {
			val = true;
			System.out.println("CoWorkers  verified");
			if (CoWorkersInfoplussBtn.isDisplayed()) {
				val = true;
				System.out.println("plus sign icon available in Coworkers info ");
				CoWorkersInfoplussBtn.click();
				System.out.println("plus sign icon in Coworkers info is clicked ");
				if (CoWorkersInfoMinusBtn.isDisplayed()) {
					val = true;
					System.out.println("Minus sign icon available in Coworkers info ");
					CoWorkersInfoMinusBtn.click();
					System.out.println("Minus sign icon in Coworkers info is clicked ");
				} else {
					System.out.println("plus sign  not available in Coworkers info");
				}
			}
		} else {
			System.out.println("Not verified Coworkers info");
		}
		return val;
	}

	public Boolean VerifyCoWorkersdetail(String CoworkersQatari, String CoworkersNonQatari, String noCoworkersQatari,
			String noCoworkersNonQatari) {
		boolean val = false;
		CoWorkersInfoplussBtn.click();

		try {
			if (CoworkersinfoNoDataAvailable.isDisplayed()) {
				val = true;
				System.out.println("No Coworkers info details available");
				CoworkersNoDataAvailable(noCoworkersQatari, noCoworkersNonQatari);
				CoWorkersInfoMinusBtn.click();
			}
		} catch (Exception e) {
			System.out.println("Coworkers info data is available");
		}
		try {
			if (Qatari.isDisplayed() && Qatari.getText().equals("القطري 0") && NonQatari.isDisplayed()
					&& NonQatari.getText().equals("غير القطري 1")) {
				val = true;
				System.out.println("Qatari & non qatari has Displayed");
				CoworkersData(CoworkersQatari, CoworkersNonQatari);
			} else {
				System.out.println("Not displayes Any Text in the Coworkers Info ");
			}
		} catch (Exception e) {
			System.out.println("Coworkers info data is not available");
		}
		return val;

	}

	// verify NomineeInfo
	public Boolean VerifyNomineeInfo() {
		boolean val = false;
		CoWorkersInfoMinusBtn.click();
		if (NomineeInfo.isDisplayed() && NomineeInfo.getText().equals("معلومات المرشح")) {
			val = true;
			System.out.println("Nominee Info  verified");
			if (NomineeInfoplussBtn.isDisplayed()) {
				val = true;
				System.out.println("plus sign icon available in Nominee Info ");
				NomineeInfoplussBtn.click();
				System.out.println("plus sign icon in Nominee Info is clicked ");
				if (NomineeInfoMinusBtn.isDisplayed()) {
					val = true;
					System.out.println("Minus sign icon available in Nominee Info");
					NomineeInfoMinusBtn.click();
					System.out.println("Minus sign icon in Nominee Info is clicked ");
				} else {
					System.out.println("plus sign  not available in Nominee Info");
				}
			}
		} else {
			System.out.println("Not verified Nominee Info");
		}
		return val;
	}

	public Boolean VerifyNomineeInfodetail(String NomineeNames, String NomineeNumbers, String Nomineeqids,
			String NoNomineeNames, String NoNomineeNumbers, String NoNomineeqids) {
		boolean val = false;
		NomineeInfoplussBtn.click();
		try 
		{
			if (NomineeinfoNoDataAvailable.isDisplayed()) {
				val = true;
				System.out.println("No nominee info details available");
				NomineeDataNoDataAvailable(NomineeNames, NomineeNumbers, Nomineeqids);
				NomineeInfoMinusBtn.click();
			}
		} catch (Exception e) {
			System.out.println("Nominee info data is available");
		}
		try {
			if (NomineeName.isDisplayed() && NomineeName.getText().equals("اسم المرشح") && NomineeNumber.isDisplayed()
					&& NomineeNumber.getText().equals("رقم المرشح") && NomineeQid.isDisplayed()
					&& NomineeQid.getText().equals("البطاقة الشخصية للمرشح")) {
				val = true;
				System.out.println("Nominee name , Nominee Number , Nominee qid has isDisplayed");
				NomineeData(NomineeNames, NomineeNumbers, Nomineeqids);
				NomineeInfoMinusBtn.click();
			} else {
				System.out.println("Not displayes Any Text in the NomineeInfo info");
			}
		} catch (Exception e) {
			System.out.println("No nominee info data is available");
		}
		return val;
	}

	public Boolean VerifyPremiseRecordspage() throws InterruptedException {
		PremiseRecordsIcon.click();
		boolean val = false;
		if (PremiseRecordsTitle.isDisplayed() && PremiseRecordsTitle.getText().equals("سجلات الفرضية")
				&& RecordsbackArrowbtn.isDisplayed()) {
			System.out.println("Premise Records icon  is clicked successfully");
			String ExpectedRecord = "سجلات الفرضية";
			String Records = PremiseRecordsTitle.getText();
			if (PremiseRecordsTitle.isDisplayed() && Records.equalsIgnoreCase(ExpectedRecord)) {
				val = true;
				Thread.sleep(5000);
				RecordsbackArrowbtn.click();
			}
		}
		return val;
	}

	public Boolean VerifyclickPremiseRecordsPage() {
		boolean val = false;
		PremiseRecordsIcon.click();
		try {
			try {
				if (PremiseRecordNoDataAvailable.isDisplayed()) {
					val = true;
					System.out.println("No premise Records details available");
					Thread.sleep(5000);
					RecordsbackArrowbtn.click();
				} else {
					System.out.println("premise Records details available");
				}
			} catch (Exception e) {
				System.out.println("premise records available");
			}

			try {
				if (PremiseRecordsTitle.isDisplayed()) {
					for (int i = 0; i < premiselist.size(); i++) {
						Thread.sleep(5000);
						if (DocumentName.isDisplayed() && PdfView.isDisplayed() && DocumentDate.isDisplayed()
								&& eyeicon.isDisplayed() && ViewText.isDisplayed()
								&& ViewText.getText().equals("منظر")) {
							val = true;
							System.out.println("Clicked Premise records , premise records page is verified");
							pdfDownload();
							System.out.println("Clicked records icon and view document");
							Thread.sleep(5000);
						} else {
							System.out.println(" not clicked Premise records , premise records page is not verified ");
						}
					}
				} else {
					System.out.println(" Premise records title is not available");
				}

			} catch (Exception e) {
				System.out.println("Premise records available");
			}
		} catch (Exception e) {
			System.out.println("Premise records verification");
		}
		RecordsbackArrowbtn.click();
		return val;
	}

	public Boolean VerifyclickPremiseLocationPage() throws InterruptedException {
		boolean val = false;
		Thread.sleep(5000);
		PremiseLocationIcon.click();
		try {
			try {
				if (PremiseLocationNoDataAvailable.isDisplayed()) {
					val = true;
					System.out.println("No Location details available");
					Locationbackarrowbtn.click();
				}
			} catch (Exception e) {
				System.out.println("Location Details available");
			}

			try {
				if (PremiseBoundary.isDisplayed() && PremiseBoundary.getText().equals("حدود الفرضية")
						&& Locationbackarrowbtn.isDisplayed()) {
					val = true;
					System.out.println("clicked premise Location Icon,premise boundaries title  is verified");

					if (DeclaredBoundary.isDisplayed() && DeclaredBoundary.getText().equals("الحدود المعلنة")
							&& ActualBoundary.isDisplayed() && ActualBoundary.getText().equals("الحدود الفعلية")) {
						System.out.println("Declared boundary and Actual boundary is displayed");
					} else {
						System.out.println("Declared boundary and Actual boundary is not displayed");
					}
					Locationbackarrowbtn.click();
					if (PremiseDetailsTitle.isDisplayed() && PremiseDetailsTitle.getText().equals("تفاصيل الفرضية")) {
						val = true;
						System.out.println("Back Arrow in Location page is clicked, premise location is verified");
					} else {
						System.out.println(
								"not clicked back arrow in Location page , premise location page is not verified ");
					}

				} else {
					System.out.println(" not clicked premise Location Icon,premise boundaries title not verified ");

				}
			} catch (Exception e) {
				System.out.println("No Premise location details available");
			}
		} catch (Exception e) {
			System.out.println("Premise location details verified");
		}

		return val;
	}

	public boolean VerifyPremiseHistorypage() {
		boolean val = false;
		PremiseVisitHistoryIcon.click();
		try {
			try {
				if (PremiseVisitNoDataAvailable.isDisplayed()) {
					val = true;
					System.out.println("No Premise visit history available");
					HistorysbackArrowbtn.click();
					System.out.println("premise visit history backarrow button is clicked");
				} else {
					System.out.println(" Premise visit history available");
				}
			} catch (Exception e) {
				System.out.println("Premise visit history available");
			}

			try {
				String ExpectedVisitHistory = "فرضية زيارة التاريخ";
				String VisitHistory = PremiseVisitHistoryTitle.getText();
				if (PremiseVisitHistoryTitle.isDisplayed() && VisitHistory.equalsIgnoreCase(ExpectedVisitHistory)) {
					val = true;
					System.out.println("Premise Visit History title displayed successfully");
					
					for (int i = 0; i <Visitlayout.size(); i++) {
						Thread.sleep(5000);						
							val = true;		
							
							if (visitPersonName.get(i).isDisplayed() && VisitDateTime.get(i).isDisplayed()
								 && visitpurpose.get(i).isDisplayed()) {
								//	&& Lastvisit.isDisplayed()) {
								val = true;
								System.out.println(
										"clicked premise History Icon, person Name, visit date Time, Visit comments, Visit purpose ,  last visits is Displayed");
							} else {
								System.out.println(
										"clicked premise History Icon, person Name, visit date Time, Visit comments, Visit purpose ,  last visits is Displayed");
							}
						}
						
					} else {
						System.out.println("Premise Visit History title is not displayed ");
					}
				if(	Lastvisit.isDisplayed())
				{
					System.out.println("last visit is displayed ");
				}
				else
				{
					System.out.println("last visit is  not displayed ");
				}

					HistorysbackArrowbtn.click();

					if (PremiseDetailsTitle.isDisplayed() && PremiseDetailsTitle.getText().equals("تفاصيل الفرضية")) {
						val = true;
						System.out.println(
								"Back Arrow in Premise Visit History page is clicked, premise history page  is verified");
					} else {
						System.out.println(
								"  Premise Visit History page back button is not  clicked, premise history page  is not verified ");
					}
	

			} catch (Exception e) {
				System.out.println(" Premise visit history available");
			}
		} catch (Exception e) {
			System.out.println(" Premise visit history verified");
		}
		return val;
	}

	/*
	 * public Boolean VerifyPremiseHistorypageDetails() { boolean val = false; try {
	 * if (premiseVisitNoDataAvailable.isDisplayed()) { val = true;
	 * System.out.println("No premise visit details available");
	 * HistorysbackArrowbtn.click(); } } catch (Exception e) {
	 * System.out.println("premise visit history available"); }
	 * 
	 * try { if (visitPersonName.isDisplayed() && VisitDateTime.isDisplayed() &&
	 * VisitComments.isDisplayed() && visitpurpose.isDisplayed() &&
	 * Lastvisit.isDisplayed()) { val = true; System.out.println(
	 * "clicked premise History Icon, person Name, visit date Time, Visit comments, Visit purpose, Last vists  text  is Displayed"
	 * );
	 * 
	 * HistorysbackArrowbtn.click();
	 * 
	 * if (PremiseDetailsTitle.isDisplayed()) { val = true; System.out.println(
	 * "Back Arrow in Premise Visit History page is clicked, premise history page  is verified"
	 * ); } else { System.out.println(
	 * " not clicked Premise Visit History page is clicked, premise history page  is not verified "
	 * ); } } } catch (Exception e) {
	 * System.out.println("No Premise visit history available"); } return val; }
	 */

	public boolean VerifyclickPremiseWeatherPage() throws InterruptedException {

		boolean val = false;
		WeatherInfoIcon.click();
		Thread.sleep(10000);
		try {
			try {
				if (PremiseWeatherNoDataAvailable.isDisplayed()) {
					val = true;
					System.out.println("No premise visit details available");
				
					weathercloseBtn.click();
					
					
				}
			} catch (Exception e) {
				System.out.println("premise weather details available");
			}

			try {
				if (weatherInfoTitle.isDisplayed() && weatherInfoTitle.getText().equals("معلومات الطقس")
						&& weathercloseBtn.isDisplayed()) {
					System.out.println("Premise weather info is clicked successfully");
					String Expectedweather = "معلومات الطقس";
					String weatherInfo = weatherInfoTitle.getText();
					if (weatherInfoTitle.isDisplayed() && weatherInfo.equalsIgnoreCase(Expectedweather)) {
						val = true;
						System.out.println("weather info title is displayed successfully");
					}
				}

			} catch (Exception e) {
				System.out.println("premise weather details not available");
			}
		} catch (Exception e) {
			System.out.println(" Premise weather details verified");
		}
		return val;

	}

	public Boolean VerifyWeatherinfopageDetails() {
		boolean val = false;
		try {
			// Thread.sleep(5000);
			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			// WebElement weatherNodata =
			// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//android.widget.TextView[contains(@text,'No
			// data available')]")));

			// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			if (PremiseWeatherNoDataAvailable.isDisplayed()) {
				val = true;
				System.out.println("No premise weather page available");
				weathercloseBtn.click();
			}
		} catch (Exception e) {
			System.out.println("premise weather page available");
		}

		try {

			// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
			// WebElement weatherTit =
			// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//android.widget.TextView[@text='Weather
			// Info']")));
			// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			// Thread.sleep(5000);
			if (weatherInfoTitle.isDisplayed() && weathercloseBtn.isDisplayed() && weatherlocation.isDisplayed()
					&& weatherAddress.isDisplayed() && weatherAddress.getText().equals("العنوان/المنطقة")
					&& weatherPlace.isDisplayed() && weathertemparatureCelsius.isDisplayed()
					&& weatherTemparature.isDisplayed() && LineBtn.isDisplayed() && weather.isDisplayed()
					&& weather.getText().equals("طقس") && weatherValue.isDisplayed() && LineBtn.isDisplayed()
					&& weatherHumidity.isDisplayed() && weatherHumidity.getText().equals("رطوبة")
					&& weatherHumidityValue.isDisplayed() && weatherWind.isDisplayed()
					&& weatherWind.getText().equals("رياح") && weatherWindValue.isDisplayed()) {
				val = true;
				System.out.println(
						"clicked Premise weatherInfo icon , Premise weather Info pop appeared & verified the fields like weather info title, close button,loaction icon, address/area, place, tempareture, celsius, weather,weather value, slash icon, humidity, humidity value, wind & Wind Value\"");

				String Address = weatherPlace.getText();
				String Temparature = weathertemparatureCelsius.getText();
				String WeatherValue = weatherValue.getText();
				String HumidityValue = weatherHumidityValue.getText();
				String Windwalue = weatherWindValue.getText();

				System.out.println("Address : " + Address);
				System.out.println("Temparature : " + Temparature);
				System.out.println("Weather : " + WeatherValue);
				System.out.println("Humidity : " + HumidityValue);
				System.out.println("Wind : " + Windwalue);

				weathercloseBtn.click();

				if (PremiseDetailsTitle.isDisplayed()) {
					val = true;
					System.out.println("CloseButton in weather page is clicked, premise weather page  is verified");
				} else {
					System.out.println(
							"not clicked premise weather page is clicked, premise weather page is not verified ");
				}
			}
		} catch (Exception e) {
			System.out.println("No premise weather page details available");
		}
		return val;
	}

	public Boolean ownerData(String ownerName, String ownerNo, String ownerqid, String ownergender, String ownerAge,
			String ownerAddress, String ownerPobox, String ownerFax, String ownerEmail) {
		boolean val = false;

		ownerName = ownerNames.getAttribute("text");
		val = true;
		System.out.println("premise Owner Name is displayed: " + ownerName);

		ownerNo = ownerNumber.getAttribute("text");
		val = true;
		System.out.println("Premise owner number is displayed: " + ownerNo);

		ownerqid = ownerQid.getAttribute("text");
		val = true;
		System.out.println("Premise Owner Qid is displayed: " + ownerqid);

		ownergender = OwnerGender.getAttribute("text");
		val = true;
		System.out.println("Premise Owner gender is displayed:" + ownergender);

		ownerAge = Ownerage.getAttribute("text");
		val = true;
		System.out.println("Premise owner Age is displayed: " + ownerAge);

		ownerAddress = owneraddress.getAttribute("text");
		val = true;
		System.out.println("Premise owner Address is displayed: " + ownerAddress);

		ownerPobox = ownerpobox.getAttribute("text");
		val = true;
		System.out.println("Premise owner po box is displayed: " + ownerPobox);

		ownerFax = ownerfax.getAttribute("text");
		val = true;
		System.out.println("Premise owner Fax is displayed: " + ownerFax);

		ownerEmail = owneremail.getAttribute("text");
		val = true;
		System.out.println("Premise owner Email is displayed: " + ownerEmail);

		return val;

	}

	public Boolean ownerNoDataAvailable(String NoownerName, String NoownerNo, String Noownerqid, String Noownergender,
			String NoownerAge, String NoownerAddress, String NoownerPobox, String NoownerFax, String NoownerEmail) {
		boolean val = false;

		NoownerName = OwnerNameDataAvailable.getAttribute("text");
		val = true;
		System.out.println("premise Owner Name is displayed: " + ownerName);

		NoownerNo = OwnerNoNoDataAvailable.getAttribute("text");
		val = true;
		System.out.println("Premise owner number is displayed: " + ownerNo);

		Noownerqid = OwnerqidNoDataAvailable.getAttribute("text");
		val = true;
		System.out.println("Premise Owner Qid is displayed: " + ownerqid);

		Noownergender = OwnergenderNoDataAvailable.getAttribute("text");
		val = true;
		System.out.println("Premise Owner gender is displayed:" + ownergender);

		NoownerAge = OwnerageNoDataAvailable.getAttribute("text");
		val = true;
		System.out.println("Premise owner Age is displayed: " + ownerAge);

		NoownerAddress = OwnerAddressNoDataAvailable.getAttribute("text");
		val = true;
		System.out.println("Premise owner Address is displayed: " + ownerAddress);

		NoownerPobox = OwnerPoboxNoDataAvailable.getAttribute("text");
		val = true;
		System.out.println("Premise owner po box is displayed: " + ownerPobox);

		NoownerFax = OwnerFaxNoDataAvailable.getAttribute("text");
		val = true;
		System.out.println("Premise owner Fax is displayed: " + ownerFax);

		NoownerEmail = OwneremailNoDataAvailable.getAttribute("text");
		val = true;
		System.out.println("Premise owner Email is displayed: " + ownerEmail);

		return val;

	}

	public Boolean LocationData(String locationZone, String locationSubmmName, String locationpinNumber) {
		Boolean val = false;
		locationZone = locationZoneNo.getAttribute("text");
		val = true;
		System.out.println("premise Location Zone Number is displayed: " + locationZone);

		locationSubmmName = locationsubmmName.getAttribute("text");
		val = true;
		System.out.println("premise location sub MM  Name is displayed: " + locationSubmmName);

		locationpinNumber = locationPinNumber.getAttribute("text");
		val = true;
		System.out.println("premise location Pin number is displayed: " + locationpinNumber);
		return val;
	}

	public Boolean LocationNoDataAvailable(String nolocationZone, String nolocationSubmmName,
			String nolocationpinNumber) {
		Boolean val = false;
		nolocationZone = NolocationZoneNo.getAttribute("text");
		val = true;
		System.out.println("premise Location Zone Number is displayed: " + nolocationZone);

		nolocationSubmmName = NolocationsubmmName.getAttribute("text");
		val = true;
		System.out.println("premise location sub MM  Name is displayed: " + nolocationSubmmName);

		nolocationpinNumber = NolocationPinNumber.getAttribute("text");
		val = true;
		System.out.println("premise location Pin number is displayed: " + nolocationpinNumber);
		return val;
	}

	public Boolean PremiseData(String PremisetypeofOWnership, String PremiseNameHouse, String PremiseTypeofPremise,
			String PremiseMuniciplality, String PremiseRationCard, String PremisePurpose, String PremiseSourceofwater,
			String PremisePremiseArea, String PremiseDateofCensus) {
		Boolean val = false;
		PremisetypeofOWnership = premiseTypeofOWnership.getAttribute("text");
		val = true;
		System.out.println("premise type of ownership is displayed: " + PremisetypeofOWnership);

		PremiseNameHouse = premiseNamehouse.getAttribute("text");
		val = true;
		System.out.println("premise house name  is displayed: " + PremiseNameHouse);

		PremiseTypeofPremise = premiseTypeofpremise.getAttribute("text");
		val = true;
		System.out.println("premise Location Zone Number is displayed: " + PremiseTypeofPremise);

		PremiseMuniciplality = premisemuniciplality.getAttribute("text");
		val = true;
		System.out.println("premise municiplality is displayed: " + PremiseMuniciplality);

		PremiseRationCard = premiseRationCardNo.getAttribute("text");
		val = true;
		System.out.println("premise ration card Number is displayed: " + PremiseRationCard);

		PremisePurpose = premisepurpose.getAttribute("text");
		val = true;
		System.out.println("premise purpose is displayed: " + PremisePurpose);

		PremiseSourceofwater = premisesourceofwater.getAttribute("text");
		val = true;
		System.out.println("premise source of water is displayed: " + PremiseSourceofwater);

		PremisePremiseArea = premisePremisearea.getAttribute("text");
		val = true;
		System.out.println("premise Area is displayed: " + PremisePremiseArea);

		PremiseDateofCensus = premisedateofCensus.getAttribute("text");
		val = true;
		System.out.println("premise date of census is displayed: " + PremiseDateofCensus);
		return val;

	}

	public Boolean PremiseDataNodatAvailable(String noPremisetypeofOWnership, String noPremiseNameHouse,
			String noPremiseTypeofPremise, String noPremiseMuniciplality, String noPremiseRationCard,
			String noPremisePurpose, String noPremiseSourceofwater, String noPremisePremiseArea,
			String noPremiseDateofCensus) {
		Boolean val = false;
		noPremisetypeofOWnership = NoPremiseTypeofOWnership.getAttribute("text");
		val = true;
		System.out.println("premise type of OWnership is displayed: " + noPremisetypeofOWnership);

		noPremiseNameHouse = NoPremiseNamehouse.getAttribute("text");
		val = true;
		System.out.println("Premise Name House is displayed: " + noPremiseNameHouse);

		noPremiseTypeofPremise = NoPremiseTypeofpremise.getAttribute("text");
		val = true;
		System.out.println("TypeofPremise is displayed: " + noPremiseTypeofPremise);

		noPremiseMuniciplality = NoPremisemuniciplality.getAttribute("text");
		val = true;
		System.out.println("Premise Municiplality is displayed: " + noPremiseMuniciplality);

		noPremiseRationCard = NoPremiseRationCardNo.getAttribute("text");
		val = true;
		System.out.println("Premise Ration Card is displayed: " + noPremiseRationCard);

		noPremisePurpose = NoPremisepurpose.getAttribute("text");
		val = true;
		System.out.println("Premise Purpose is displayed: " + noPremisePurpose);

		noPremiseSourceofwater = NoPremisesourceofwater.getAttribute("text");
		val = true;
		System.out.println("Premise Source of water is displayed: " + noPremiseSourceofwater);

		noPremisePremiseArea = NoPremisePremisearea.getAttribute("text");
		val = true;
		System.out.println("Premise Area is displayed: " + noPremisePremiseArea);

		noPremiseDateofCensus = NoPremisedateofCensus.getAttribute("text");
		val = true;
		System.out.println("Premise Date of Census is displayed: " + noPremiseDateofCensus);
		return val;

	}

	public Boolean CoworkersData(String CoworkersQatari, String CoworkersNonQatari) {
		Boolean val = false;
		CoworkersQatari = Coworkersqatari.getAttribute("text");
		val = true;
		System.out.println("Qatari is displayed: " + CoworkersQatari);

		CoworkersNonQatari = CoworkersnonQatari.getAttribute("text");
		val = true;
		System.out.println("NonQatari is displayed: " + CoworkersNonQatari);
		return val;

	}

	public Boolean CoworkersNoDataAvailable(String noCoworkersQatari, String noCoworkersNonQatari) {
		Boolean val = false;
		noCoworkersQatari = NoCoworkersqatari.getAttribute("text");
		val = true;
		System.out.println("Qatari is displayed: " + noCoworkersQatari);

		noCoworkersNonQatari = NoCoworkersnonQatari.getAttribute("text");
		val = true;
		System.out.println("NonQatari is displayed: " + noCoworkersNonQatari);
		return val;

	}

	public Boolean NomineeData(String NomineeNames, String NomineeNumbers, String Nomineeqids) {
		boolean val = true;
		NomineeNames = nomineeNames.getAttribute("text");
		val = true;
		System.out.println("Premise nominee name is displayed: " + NomineeNames);
		NomineeNumbers = nomineeNumber.getAttribute("text");
		val = true;
		System.out.println("Premise nominee number is displayed: " + NomineeNumbers);
		Nomineeqids = nomineeqid.getAttribute("text");
		val = true;
		System.out.println("Premise nominee qid is displayed: " + Nomineeqids);
		return val;

	}

	public Boolean NomineeDataNoDataAvailable(String NoNomineeNames, String NoNomineeNumbers, String NoNomineeqids) {
		boolean val = true;
		NoNomineeNames = NonomineeNames.getAttribute("text");
		val = true;
		System.out.println("Premise nominee Name is displayed: " + NoNomineeNames);
		NoNomineeNumbers = NonomineeNumber.getAttribute("text");
		val = true;
		System.out.println("Premise nominee number is displayed: " + NoNomineeNumbers);
		NoNomineeqids = Nonomineeqid.getAttribute("text");
		val = true;
		System.out.println("Premise nominee qid is displayed: " + NoNomineeqids);
		return val;
	}

	public boolean pdfDownload() throws InterruptedException {

		boolean val = false;
		// Locate and click the download button
		ViewButton.click();
		val = true;
		System.out.println("Premise view button pdf is clciked");
		Thread.sleep(5000);
		pdfbackBtn.click();
		val = true;
		System.out.println("Premise pdf is available and viewed");
		return val;

		
	}

	public boolean visithistoryLayout() throws InterruptedException {

		boolean val = false;
		PremiseVisitHistoryIcon.click();
		val = true;
		System.out.println("Premise Visit History is clicked successfully");
		String ExpectedVisitHistory = "فرضية زيارة التاريخ";
		String VisitHistory = PremiseVisitHistoryTitle.getText();
		if (PremiseVisitHistoryTitle.isDisplayed() && VisitHistory.equalsIgnoreCase(ExpectedVisitHistory)) {
			val = true;
			System.out.println("Premise Visit History title displayed successfully");
		} else {
			System.out.println("Premise Visit History title is not displayed ");
		}

		int listSize = Visitlayout.size();
		// Print the size of the list
		System.out.println("Size of the list: " + listSize);

		for (int i = 1; i <= listSize; i++) {
			Thread.sleep(5000);
			if (visitPersonName.get(i).isDisplayed() && VisitDateTime.get(i).isDisplayed()
					&& VisitComments.get(i).isDisplayed() && visitpurpose.get(i).isDisplayed()) {
				val = true;
				System.out.println(
						"clicked premise History Icon, person Name, visit date Time, Visit comments, Visit purpose  is Displayed");

				if (Lastvisit.isDisplayed()) {
					val = true;
					System.out.println(" Last visit is displayed");
				} else {
					System.out.println(" Last visits is not displayed");
				}

				HistorysbackArrowbtn.click();

				if (PremiseDetailsTitle.isDisplayed()) {
					val = true;
					System.out.println(
							"Back Arrow in Premise Visit History page is clicked, premise history page  is verified");
				} else {
					System.out.println(
							" not clicked Premise Visit History page is clicked, premise history page  is not verified ");
				}
			}
		}
		return val;

	}
	
	public Boolean premiseHistoryIcon() {
		boolean val = false;
		if (PremiseVisitHistoryIcon.isDisplayed()) {
			val = true;
			System.out.println(" premise visit history icon is verified");
		}
		return val;
	}

	public Boolean ClickpremiseHistoryIcon() {
		boolean val = false;
		if (PremiseVisitHistoryIcon.isDisplayed()) {
			val = true;
			System.out.println(" premise visit history icon is displayed");
			PremiseVisitHistoryIcon.click();

			if (PremiseVisitHistoryTitle.isDisplayed()) {
				System.out.println("Premise visit history title is  displayed");
				HistorysbackArrowbtn.click();
				System.out.println("clicked back button in history page and redirects to premise Page");
			} else {
				System.out.println("Premise visit history title is not displayed");
			}
		}
		return val;
	}
	
	public Boolean PremiseRecordsIcons() {
		boolean val = false;
		if (PremiseRecordsIcon.isDisplayed()) {
			val = true;
			System.out.println("Premise Records icon is  verified");
		}
		return val;
	}

	
}
