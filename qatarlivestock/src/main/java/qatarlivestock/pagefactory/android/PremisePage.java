package qatarlivestock.pagefactory.android;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

//import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PremisePage extends AndroidActions {
	AndroidDriver driver;

	public PremisePage(AndroidDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise']")
	public WebElement premiseModule;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise Details']")
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

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwnerinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.LinearLayout[1]")
	private WebElement ViewButton;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement PremiseinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement LocationinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NomineeinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement CoworkersinfoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement PremiseVisitNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement PremiseWeatherNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement PremiseLocationNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement PremiseRecordNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Owner Info']")
	private WebElement OwnerInfo;

	@AndroidFindBy(id = "owner_info_btn")
	private WebElement OwnerInfoMinusBtn;

	@AndroidFindBy(id = "owner_info_btn")
	private WebElement OwnerInfoplusBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Owner Name']")
	private WebElement OwnerName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Owner Number']")
	private WebElement OwnerNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Owner QID']")
	private WebElement OwnerQId;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Gender']")
	private WebElement Gender;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Age']")
	private WebElement Age;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Address']")
	private WebElement Address;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='PO Box']")
	private WebElement PoBox;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Fax']")
	private WebElement Fax;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Email ID']")
	private WebElement EmailId;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='location_info_btn']")
	private WebElement LocationInfoBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Location Info']")
	private WebElement LocationInfo;

	@AndroidFindBy(id = "location_info_btn")
	private WebElement LocationInfoMinusBtn;

	@AndroidFindBy(id = "location_info_btn")
	private WebElement LocationInfoplusBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Zone No']")
	private WebElement ZoneNo;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Sub MM Name']")
	private WebElement SubName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='PIN Number']")
	private WebElement PinNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise Info']")
	private WebElement premiseInfo;

	@AndroidFindBy(id = "premise_info_btn")
	private WebElement PremiseInfoMinusBtn;

	@AndroidFindBy(id = "premise_info_btn")
	private WebElement PremiseInfoplussBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Type of Ownership']")
	private WebElement TypeOwnership;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Type of Premise']")
	private WebElement TypeofPremise;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise Name']")
	private WebElement PremisesName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Municipality']")
	private WebElement Municipality;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Ration Card No']")
	private WebElement RationCard;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Purpose']")
	private WebElement Purposes;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Source of Water']")
	private WebElement SourceofWater;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise Area']")
	private WebElement PremiseArea;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[9]/android.widget.TextView[1]")
	private WebElement DateofCensus;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement RecordsbackArrowbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise Records']")
	private WebElement PremiseRecordsTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Declared Boundaries']")
	private WebElement DeclaredBoundary;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Actual Boundaries']")
	private WebElement ActualBoundary;

	@AndroidFindBy(id = "mapview_esribanner_layout")
	private WebElement MapView;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Co-Workers Info']")
	private WebElement CoWorkersInfo;

	@AndroidFindBy(id = "coworkers_info_btn")
	private WebElement CoWorkersInfoMinusBtn;

	@AndroidFindBy(id = "coworkers_info_btn")
	private WebElement CoWorkersInfoplussBtn;

	@AndroidFindBy(id= "qatariCount")
	private WebElement Qatari;

	@AndroidFindBy(id = "nonQatariCount")
	private WebElement NonQatari;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Nominee Info']")
	private WebElement NomineeInfo;

	@AndroidFindBy(id = "nominee_info_btn")
	private WebElement NomineeInfoMinusBtn;

	@AndroidFindBy(id = "nominee_info_btn")
	private WebElement NomineeInfoplussBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Nominee Name']")
	private WebElement NomineeName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Nominee Number']")
	private WebElement NomineeNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Nominee QID']")
	private WebElement NomineeQid;

	@AndroidFindBy(id = "docName")
	private List<WebElement> DocumentName;

	@AndroidFindBy(className = "android.widget.ImageView")
	private List<WebElement> PdfView;

	@AndroidFindBy(id = "docDate")
	private List<WebElement> DocumentDate;

	@AndroidFindBy(className = "android.widget.ImageView")
	private List<WebElement> eyeicon;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='View']")
	private List<WebElement> ViewText;

	@AndroidFindBy(className = "android.widget.ImageButton")
	private WebElement HistorysbackArrowbtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Premise Visit History']")
	private WebElement PremiseVisitHistoryTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Last 5 visits']")
	private WebElement Lastvisit;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Weather Info']")
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

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwnerNameDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwnerNoNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoPremiseTypeofpremise;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwnergenderNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwnerageNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwnerAddressNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwnerFaxNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwnerPoboxNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwneremailNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	private WebElement nomineeNames;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]")
	private WebElement nomineeNumber;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView[2]")
	private WebElement nomineeqid;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NonomineeNames;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NonomineeNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement Nonomineeqid;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	private WebElement locationZoneNo;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]")
	private WebElement locationsubmmName;

	@AndroidFindBy(id = "last_item_loc")
	private WebElement locationPinNumber;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NolocationZoneNo;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NolocationsubmmName;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
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

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoPremiseTypeofOWnership;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoPremiseNamehouse;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement OwnerqidNoDataAvailable;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoPremisemuniciplality;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoPremiseRationCardNo;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoPremisepurpose;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoPremisesourceofwater;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoPremisePremisearea;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoPremisedateofCensus;

	@AndroidFindBy(id = "qatariCount")
	private WebElement Coworkersqatari;

	@AndroidFindBy(id = "nonQatariCount")
	private WebElement CoworkersnonQatari;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoCoworkersqatari;

	@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'No data available')]")
	private WebElement NoCoworkersnonQatari;

	//vivo
   @AndroidFindBy(xpath = ".//android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ImageView")
   private WebElement pdfbackBtn;
	
	//android
	//@AndroidFindBy(xpath = ".//android.widget.ImageButton[@content-desc=\"Back\"]")
//	private WebElement pdfbackBtn;		
	
	//emulator
 // @AndroidFindBy(className = "android.widget.ImageButton")
 // private WebElement pdfbackBtn;
	
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

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat")
	private List<WebElement> premiselist;

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
			premiseModule.click();
			System.out.println("premise Module is Clicked");
			Thread.sleep(5000);
			String ActualpremiseTitle = PremiseDetailsTitle.getAttribute("text");
			String ExpectedPremiseTitle = "Premise Details";
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
				ExpectedActive = "Active";
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

	/*
	 * public boolean premiseStatus(String OrginalActive, String premisName) {
	 * boolean val=true; if (PermitStatus.isDisplayed()) { val = true;
	 * System.out.println("Permit Status  verified"); OrginalActive =
	 * premiseActive.getAttribute("text"); ExpectedActive = "Active"; // Verify
	 * error message Assert.assertEquals(OrginalActive, ExpectedActive);
	 * 
	 * val = true; System.out.println("Premise is  Active");
	 * 
	 * } else { System.out.println("Not verified PermitStatus ");
	 * 
	 * } return val; }
	 */
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

	public Boolean WeatherInfoIcons() {
		boolean val = false;
		if (WeatherInfoIcon.isDisplayed()) {
			val = true;
			System.out.println("weatherinfo  icon is verified");
		}
		return val;
	}

	public Boolean PremiseLocationIcons() {
		boolean val = false;
		if (PremiseLocationIcon.isDisplayed()) {
			val = true;
			System.out.println("Premise Location icon is  verified");
		}
		return val;
	}

	public Boolean VerifyOwnerInfo() {
		boolean val = false;
		String ExpectedOwnerinfoo = OwnerInfo.getAttribute("text");
		String ActualOwnerInfoo = "Owner Info";
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
				if (OwnerName.isDisplayed() && OwnerName.getText().equals("Owner Name") && OwnerNumber.isDisplayed()
						&& OwnerNumber.getText().equals("Owner Number") && OwnerQId.isDisplayed()
						&& OwnerQId.getText().equals("Owner QID") && Gender.isDisplayed()
						&& Gender.getText().equals("Gender") && Age.isDisplayed() && Age.getText().equals("Age")
						&& Address.isDisplayed() && Address.getText().equals("Address") && PoBox.isDisplayed()
						&& PoBox.getText().equals("PO Box") && Fax.isDisplayed() && Fax.getText().equals("Fax")
						&& EmailId.isDisplayed() && EmailId.getText().equals("Email ID")) {
					val = true;
					System.out.println(
							"OwnerName, OwnerNumber, OwnerQID, Gender, Age, Address, PoBox, Fax, Email id  has Displayed");
					ownerData(ownerName, ownerNo, ownerqid, ownergender, ownerAge, ownerAddress, ownerPobox, ownerFax,
							ownerEmail);
					System.out.println("owner info details displayed successfully");
				} else {
					System.out.println("Not displayed Any Text in the owner info");
				}
			} catch (Exception e) {
				System.out.println("owner info details not available");
			}
		} catch (Exception e) {
			System.out.println("owner info data is available");
		}
		return val;
	}

	public Boolean VerifyLocationInfo() {

		boolean val = false;
		OwnerInfoMinusBtn.click();
		if (LocationInfo.isDisplayed() && LocationInfo.getText().equals("Location Info")) {
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
			if (ZoneNo.isDisplayed() && ZoneNo.getText().equals("Zone No") && SubName.isDisplayed()
					&& SubName.getText().equals("Sub MM Name") && PinNumber.isDisplayed()
					&& PinNumber.getText().equals("PIN Number")) {
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
		if (premiseInfo.isDisplayed() && premiseInfo.getText().equals("Premise Info")) {
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

			if (TypeOwnership.isDisplayed() && TypeOwnership.getText().equals("Type of Ownership")
					&& PremisesName.isDisplayed() && PremisesName.getText().equals("Premise Name")
					&& TypeofPremise.isDisplayed() && TypeofPremise.getText().equals("Type of Premise")
					&& Municipality.isDisplayed() && Municipality.getText().equals("Municipality")
					&& RationCard.isDisplayed() && RationCard.getText().equals("Ration Card No")
					&& Purposes.isDisplayed() && Purposes.getText().equals("Purpose")) {
				val = true;
				System.out.println(
						"Type of ownership, premise Name, type of premise, Municiplaity, ration card number, purpose has Displayed");
			} else {
				System.out.println(
						"Type of ownership, premise Name, type of premise, Municiplaity, ration card number, purpose has not displayed");
			}

			/*
			 * WebElement element = (WebElement) driver .findElement(MobileBy.
			 * AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
			 * ".scrollIntoView(new UiSelector().text(\"Date of latest census\"));"));
			 */

			String scrollableList = "new UiScrollable(new UiSelector().scrollable(true))";
			String scrollIntoView = ".scrollIntoView(new UiSelector().text(\"Date of latest census\"));";

			String fullLocator = scrollableList + scrollIntoView;

			WebElement element = driver.findElement(MobileBy.AndroidUIAutomator(fullLocator));

			if (SourceofWater.isDisplayed() && SourceofWater.getText().equals("Source of Water")
					&& PremiseArea.isDisplayed() && PremiseArea.getText().equals("Premise Area")
					&& DateofCensus.isDisplayed() && DateofCensus.getText().equals("Date of latest census")) {
				val = true;
				System.out.println("source of water, Premise Area, Date of Latest Census has Displayed");
			} else {
				System.out.println("source of water, Premise Area, Date of Latest Census has not Displayed");
			}
			PremiseData(PremisetypeofOWnership, PremiseNameHouse, PremiseTypeofPremise, PremiseMuniciplality,
					PremiseRationCard, PremisePurpose, PremiseSourceofwater, PremisePremiseArea, PremiseDateofCensus);

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
		if (CoWorkersInfo.isDisplayed() && CoWorkersInfo.getText().equals("Co-Workers Info")) {
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
			if (Qatari.isDisplayed()  && NonQatari.isDisplayed()) {
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
		if (NomineeInfo.isDisplayed() && NomineeInfo.getText().equals("Nominee Info")) {
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

		try {
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
			if (NomineeName.isDisplayed() && NomineeName.getText().equals("Nominee Name") && NomineeNumber.isDisplayed()
					&& NomineeNumber.getText().equals("Nominee Number") && NomineeQid.isDisplayed()
					&& NomineeQid.getText().equals("Nominee QID")) {
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

	public Boolean ClickpremiseRecordsIcon() throws InterruptedException {
		PremiseRecordsIcon.click();
		boolean val = false;
		if (PremiseRecordsTitle.isDisplayed() && PremiseRecordsTitle.getText().equals("Premise Records")
				&& RecordsbackArrowbtn.isDisplayed()) {
			System.out.println("Premise Records icon  is clicked successfully and premise Records title is displayed");
			String ExpectedRecord = "Premise Records";
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
						if (DocumentName.get(i).isDisplayed() && PdfView.get(i).isDisplayed()
								&& DocumentDate.get(i).isDisplayed() && eyeicon.get(i).isDisplayed()
								&& ViewText.get(i).isDisplayed()) {
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
				System.out.println("No Premise records available");
			}
		} catch (Exception e) {
			System.out.println("Premise records verification");
		}
		return val;
	}

	public Boolean VerifyclickPremiseLocationPage() {
		boolean val = false;
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
				if (PremiseBoundary.isDisplayed() && PremiseBoundary.getText().equals("Premise Boundaries")
						&& Locationbackarrowbtn.isDisplayed()) {
					val = true;
					System.out.println("clicked premise Location Icon,premise boundaries title  is verified");

					if (DeclaredBoundary.isDisplayed() && DeclaredBoundary.getText().equals("Declared Boundaries")
							&& ActualBoundary.isDisplayed() && ActualBoundary.getText().equals("Actual Boundaries")) {
						System.out.println("Declared boundary and Actual boundary is displayed");
					} else {
						System.out.println("Declared boundary and Actual boundary is not displayed");
					}
					Locationbackarrowbtn.click();
					if (PremiseDetailsTitle.isDisplayed() && PremiseDetailsTitle.getText().equals("Premise Details")) {
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
		//		String ExpectedVisitHistory = "Premise Visit History";
		//		String VisitHistory = PremiseVisitHistoryTitle.getText();
				if (PremiseVisitHistoryTitle.isDisplayed()) {
					for (int i = 0; i <Visitlayout.size(); i++) {

					val = true;		
								
						Thread.sleep(5000);
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

					if (PremiseDetailsTitle.isDisplayed() && PremiseDetailsTitle.getText().equals("Premise Details")) {
						val = true;
						System.out.println(
								"Back Arrow in Premise Visit History page is clicked, premise history page  is verified");
					} else {
						System.out.println(
								" not clicked Premise Visit History page is clicked, premise history page  is not verified ");
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
				if (weatherInfoTitle.isDisplayed() && weatherInfoTitle.getText().equals("Weather Info")
						&& weathercloseBtn.isDisplayed()) {
					System.out.println("Premise weather info is clicked successfully");
					String Expectedweather = "Weather Info";
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
					&& weatherAddress.isDisplayed() && weatherAddress.getText().equals("Address/Area")
					&& weatherPlace.isDisplayed() && weathertemparatureCelsius.isDisplayed()
					&& weatherTemparature.isDisplayed() && LineBtn.isDisplayed() && weather.isDisplayed()
					&& weather.getText().equals("Weather") && weatherValue.isDisplayed() && LineBtn.isDisplayed()
					&& weatherHumidity.isDisplayed() && weatherHumidity.getText().equals("Humidity")
					&& weatherHumidityValue.isDisplayed() && weatherWind.isDisplayed()
					&& weatherWind.getText().equals("Wind") && weatherWindValue.isDisplayed()) {
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
		String ExpectedVisitHistory = "Premise Visit History";
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

}
