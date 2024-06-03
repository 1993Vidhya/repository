package qatarlivestock.pagefactory.android;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import qatarlivestock.pagefactory.utils.AndroidActions;
import qatarlivestock.pagefactory.utils.AppiumUtils;

@SuppressWarnings("deprecation")
public class AnimalListingElements extends AndroidActions {

	AndroidDriver driver;
	AppiumUtils utils = new AppiumUtils();

	public AnimalListingElements(AndroidDriver driver)

	{

		super(driver);

		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

		// Pagefactory.initElements(driver,this);

	}

	@AndroidFindBy(className = "android.widget.ImageView")
	private WebElement qatarlivestockelemnt;
	
	@AndroidFindBy(className = "android.widget.ImageView")
	private WebElement qatarlivestockelemnt1;

	

	@AndroidFindBy(id = "sName")
	private List<WebElement> speciesnamehome;

	@AndroidFindBy(xpath = ".//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
	private List<WebElement> animalbox;

	@AndroidFindBy(id = "animalIcon")
	private List<WebElement> animalicon;

	@AndroidFindBy(id = "healthStatus")
	private List<WebElement> healthstatus;

	@AndroidFindBy(id = "animalId")
	private List<WebElement> animalid;

	@AndroidFindBy(id = "textView17")
	private List<WebElement> age;

	@AndroidFindBy(id = "animalAge")
	private List<WebElement> agevalue;

	@AndroidFindBy(id = "textView19")
	private List<WebElement> bar;

	@AndroidFindBy(id = "animalLocation")
	private List<WebElement> animalloc;

	@AndroidFindBy(id = "animalStatus")
	private List<WebElement> animalstatus;

	@AndroidFindBy(id = "imageView6")
	private List<WebElement> arrow;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"BackPress\"]")
	private WebElement backbutton;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Species Count']")
	private WebElement speciescountext;

	/*
	 * @AndroidFindBy(xpath = ".//android.widget.TextView[@text='Health Info']")
	 * private WebElement healthinfotext;
	 */
	@AndroidFindBy(id = "pieChart")
	private WebElement piechart;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='100']")
	private WebElement texthundred;

	@AndroidFindBy(id = "animalType")
	private WebElement speciesnameunderpiechart;

	@AndroidFindBy(id = "animalSearchBtn")
	private WebElement searchBtn;

	@AndroidFindBy(id = "filterEdt")
	private WebElement searchField;

	@AndroidFindBy(id = "noDataAvailable")
	private WebElement searchFieldNoData;

	@AndroidFindBy(id = "recyclerLayout")
	private WebElement searchFieldData;

	@AndroidFindBy(id = "animalId")
	private WebElement animalidstring;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.TextView[1][@text='Healthy']")
	private WebElement healthyunderpiechart;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout/android.widget.TextView[2][@text='Unhealthy']")
	private WebElement unhealthyunderpiechart;

	@AndroidFindBy(id = "toolbar_Text")
	private WebElement speciesnametitle;

	@AndroidFindBy(id = "others")
	private WebElement otherstext;

	@AndroidFindBy(id = "livestockFragment")
	private WebElement livestockmdlename;

	@AndroidFindBy(id = "navigation_bar_item_large_label_view")
	private WebElement livestocktextname;

	@AndroidFindBy(xpath = ".//android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
	private List<WebElement> speciesdetailsbox;

	@AndroidFindBy(id = "tvCount")
	private List<WebElement> totalcountelemnt;

	@AndroidFindBy(id = "toolbarText")
	private WebElement animalidpageTitle;

	@AndroidFindBy(id = "speciesIdLayout")
	private WebElement firstTab;

	@AndroidFindBy(id = "animalIcon")
	private WebElement animalIcon;

	@AndroidFindBy(id = "healthStatus")
	private WebElement healthStatus;

	@AndroidFindBy(id = "cowId")
	private WebElement animalId;

	@AndroidFindBy(id = "rfidTag")
	private WebElement rfidTag;

	@AndroidFindBy(id = "tv_RFID")
	private WebElement rfidTagText;

	@AndroidFindBy(id = "status")
	private WebElement status;

	@AndroidFindBy(id = "tv_status")
	private WebElement statusText;

	@AndroidFindBy(id = "locationBtn")
	private WebElement locationBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Demographic Data']")
	private WebElement demographicDetailsTitle;

	@AndroidFindBy(id = "hidden_view")
	private WebElement demographicDataTab;

	@AndroidFindBy(id = "arrow_button")
	private WebElement demographicDataArrow;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Species']")
	private WebElement speciesTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Age']")
	private WebElement ageTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Gender']")
	private WebElement genderTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Animal Keeper Name']")
	private WebElement animalKeeperNameTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Date of Birth']")
	private WebElement dobTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Breed']")
	private WebElement breedTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Passport No']")
	private WebElement passportTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Purpose']")
	private WebElement purposeTitle;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Medical Records']")
	private WebElement medicalRecordsTitle;

	@AndroidFindBy(id = "arrow_button_medicalrecords")
	private WebElement medicalDetailsArrowBtn;

	@AndroidFindBy(id = "hidden_view_medicalrecords")
	private WebElement medicalRecordsDataTab;

	@AndroidFindBy(id = "fixed_layout_medicalrecords")
	private WebElement medicalRecordsTitleDataTab;

	@AndroidFindBy(id = "tv_no_data_medical_records")
	private WebElement medicalRecordsNoData;

	@AndroidFindBy(id = "rv_medical_records")
	private WebElement medicalRecordsData;

	@AndroidFindBy(xpath = ".//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
	private List<WebElement> medicalRecordsBox;

	@AndroidFindBy(id = "clinic_date")
	private List<WebElement> clinicDate;

	@AndroidFindBy(id = "clinic_month")
	private List<WebElement> clinicMonth;

	@AndroidFindBy(id = "tv_clinic_name")
	private List<WebElement> clinicName;

	@AndroidFindBy(id = "tv_doctor_name")
	private List<WebElement> doctorName;

	@AndroidFindBy(id = "records_btn")
	private List<WebElement> recordsNxtBtn;

	@AndroidFindBy(id = "toolbarText")
	private WebElement medicalRecordTitle;

	@AndroidFindBy(xpath = ".//android.widget.ImageButton[@content-desc=\"BackPress\"]")
	private WebElement medicalrecordsbackbtn;

	@AndroidFindBy(id = "tv_clinicName")
	private WebElement clinicNameRecords;

	@AndroidFindBy(id = "tv_doctorName")
	private WebElement doctorNameRecords;

	@AndroidFindBy(id = "tv_regNo")
	private WebElement regNo;

	@AndroidFindBy(id = "tv_record_date")
	private WebElement recordDate;

	@AndroidFindBy(id = "tv_record_time")
	private WebElement recordTime;

	@AndroidFindBy(xpath = ".//android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[1]")
	private WebElement diagnosisTitle;

	@AndroidFindBy(id = "tv_no_data_1")
	private WebElement diagnosisNoData;
	
	@AndroidFindBy(id = "tv_disease")
	private WebElement diagnosisData;

	@AndroidFindBy(xpath = ".//android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView")
	private WebElement treatmentPlanTitle;

	@AndroidFindBy(id = "arrow_button_treatmentplan")
	private WebElement treatmentPlanArrow;

	@AndroidFindBy(id = "hidden_view_treatmentPlan")
	private WebElement treatmentPlanDataTab;

	@AndroidFindBy(id = "fixed_layout_medicinesIssued")
	private WebElement treatmentPlanTitleDataTab;

	@AndroidFindBy(id = "tv_no_data_2")
	private WebElement treatmentPlanNoData;

	@AndroidFindBy(id = "treatmentPlanRv")
	private WebElement treatmentPlanData;

	@AndroidFindBy(xpath = ".//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
	private List<WebElement> treatmentPlanDataList;

	@AndroidFindBy(id = "tv_plan_txt")
	private List<WebElement> plan;

	@AndroidFindBy(id = "tv_plan")
	private List<WebElement> planTextField;

	@AndroidFindBy(id = "tv_remarks_txt")
	private List<WebElement> remarks;

	@AndroidFindBy(id = "tv_remarks")
	private List<WebElement> remarksTextField;

	@AndroidFindBy(xpath = ".//android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView")
	private WebElement medicinesIssuedTitle;

	@AndroidFindBy(id = "arrow_button_medicinesIssued")
	private WebElement medicinesIssuedArrow;

	@AndroidFindBy(id = "hidden_view_medicinesIssued")
	private WebElement medicinesIssuedDataTab;

	@AndroidFindBy(id = "fixed_layout_medicinesIssued")
	private WebElement medicinesIssuedTitleDataTab;

	@AndroidFindBy(id = "tv_no_data_3")
	private WebElement medicinesIssuedNoData;

	@AndroidFindBy(id = "medicinesIssuedRv")
	private WebElement medicinesIssuedData;

	@AndroidFindBy(xpath = ".//androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout")
	private List<WebElement> medicinesIssuedDataList;

	@AndroidFindBy(id = "medicineNameTxt")
	private List<WebElement> medicine;

	@AndroidFindBy(id = "tv_medicines_prescribed")
	private List<WebElement> medicineTextField;

	@AndroidFindBy(id = "amountTxt")
	private List<WebElement> amount;

	@AndroidFindBy(id = "tv_prescribedQty")
	private List<WebElement> prescribedQty;

	@AndroidFindBy(id = "directionsTxt")
	private List<WebElement> directions;

	@AndroidFindBy(id = "tv_directions")
	private List<WebElement> directionsTextField;

	@AndroidFindBy(id = "tv_comments")
	private List<WebElement> commentsTextField;

	@AndroidFindBy(id = "commentsTxt")
	private List<WebElement> comments;

	@AndroidFindBy(xpath = ".//android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView")
	private WebElement medicinesDispensedTitle;

	@AndroidFindBy(id = "arrow_button_medicinesDispensed")
	private WebElement medicinesDispensedArrow;

	@AndroidFindBy(id = "hidden_view_medicinesDispensed")
	private WebElement medicinesDispensedDataTab;

	@AndroidFindBy(id = "fixed_layout_medicinesDispensed")
	private WebElement medicinesDispensedTitleDataTab;

	@AndroidFindBy(id = "tv_no_data_4")
	private WebElement medicinesDispensedNoData;

	@AndroidFindBy(xpath = ".//android.widget.FrameLayout[4]/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.TextView")
	private WebElement vaccinationsTitle;

	@AndroidFindBy(id = "arrow_button_vaccinations")
	private WebElement vaccinationsArrow;

	@AndroidFindBy(id = "hidden_view_vaccinations")
	private WebElement vaccinationsDataTab;

	@AndroidFindBy(id = "fixed_layout_vaccinations")
	private WebElement vaccinationsTitleDataTab;

	@AndroidFindBy(id = "tv_no_data_5")
	private WebElement vaccinationsNoData;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Traceability Info']")
	private WebElement tracebilityInfoTitle;

	@AndroidFindBy(id = "traceabilityBtn")
	private WebElement tracebilityInfoArrowtBtn;

	@AndroidFindBy(id = "fixed_layout_traceability_info")
	private WebElement traceabilityInfoTitleDataTab;

	@AndroidFindBy(id = "hidden_view_traceabilityInfo")
	private WebElement traceabilityInfoDataTab;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Country of origin']")
	private WebElement countryOfOrigin;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Date of import']")
	private WebElement dateOfImport;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Mode of transport']")
	private WebElement modeOfTransport;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Import batch No.']")
	private WebElement importBatchNo;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Quarantine Period']")
	private WebElement quarantinePeriod;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Current owner and premise']")
	private WebElement currentOwnerandPremise;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='In Date']")
	private WebElement inDate;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='Traceability Document']")
	private WebElement tracebilityDocumentTitle;

	@AndroidFindBy(id = "traceabilityDocBtn")
	private WebElement tracebilityDocumentArrowtBtn;

	@AndroidFindBy(id = "fixed_layout_traceability_doc")
	private WebElement traceabilityDocumentTitleDataTab;

	@AndroidFindBy(id = "hidden_view_traceabilityDocument")
	private WebElement traceabilityDocumentDataTab;

	@AndroidFindBy(xpath = ".//android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.TextView")
	private WebElement traceabilityDocumentNoData;

	@AndroidFindBy(id = "traceability_doc_title")
	private WebElement traceabilityDocumentPdfTitle;

	@AndroidFindBy(id = "view_doc_btn")
	private WebElement traceabilityDocViewBtn;

	@AndroidFindBy(xpath = ".//android.widget.TextView[@text='View']")
	private WebElement traceabilityDocViewText;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView")
	private WebElement traceabilityDocEyeBtn;

	@AndroidFindBy(id = "tv_species")
	private WebElement speciesField; 
	
	@AndroidFindBy(id = "tv_Age")
	private WebElement ageField;

	@AndroidFindBy(id = "tv_gender")
	private WebElement genderField;

	@AndroidFindBy(id = "tv_animal_keeper_name")
	private WebElement animalKeeperNameField;

	@AndroidFindBy(id = "tv_DoB")
	private WebElement dobField;

	@AndroidFindBy(id = "tv_Breed")
	private WebElement breedField;

	@AndroidFindBy(id = "tv_Passport_No")
	private WebElement passportNoField;

	@AndroidFindBy(id = "tv_Purpose")
	private WebElement purposeField;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	private WebElement countryOfOriginField;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.TextView[2]")
	private WebElement dateOfImportField;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.TextView[2]")
	private WebElement modeOfTransportField;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[4]/android.widget.TextView[2]")
	private WebElement importBatchNoField;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[5]/android.widget.TextView[2]")
	private WebElement quarantinePeriodField;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[6]/android.widget.TextView[2]")
	private WebElement currentOwnerAndPremiseField;

	@AndroidFindBy(xpath = ".//android.widget.LinearLayout[2]/android.widget.LinearLayout[7]/android.widget.TextView[2]")
	private WebElement inDateField;

	private List<String> list = Arrays.asList("Healthy", "Unhealthy", "Dead", "No determined");

	private List<String> monthlist = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
			"Nov", "Dec");

	AndroidActions action = new AndroidActions(driver);

	// click the user specified species name
	public boolean clickspeciesname(String speciesname) {
		int val = 0;
		if (speciesdetailsbox.size() == 0) {
			System.out.println("No associated animals displayed");
			return false;
		} else {
			for (int i = 0; i < speciesdetailsbox.size(); i++) {
				String str = totalcountelemnt.get(i).getText();
				int value = Integer.parseInt(str.substring(3));
				if (speciesnamehome.get(i).getText().equalsIgnoreCase(speciesname) && (value > 0)) {
					speciesnamehome.get(i).click();
					val = 1;
					break;
				}
			}
			if (val == 1) {
				return true; 
			}
			return false;
		}
	}

	// verify back button in the animal details page
	public boolean animaldetailsbackbuttonverification() {
		if (backbutton.isDisplayed()) {
			// System.out.println("Back button is verified");
			backbutton.click();
			if (piechart.isDisplayed()) {
				System.out.println("Back button in animal details page is verified");
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Back button in animal details page is not verified");
			return false;
		}
	}

	public boolean animaldetailsbackbuttonverificationsearch() {
		if (backbutton.isDisplayed()) {
			// System.out.println("Back button is verified");
			backbutton.click();
			if (searchBtn.isDisplayed()) {
				System.out.println("Back button in animal details page is verified");
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Back button in animal details page is not verified");
			return false;
		}
	}

	// verify back button in animal listing page
	public boolean animallistbackbuttonverification() {
		if (backbutton.isDisplayed()) {
			backbutton.click();
			if (livestockmdlename.isDisplayed() && livestocktextname.getText().equals("Livestock")) {
				System.out.println("Back button in animal list page is verified");
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Back button in animal list page is not verified");
			return false;
		}
	}

	// verify the title of animal listing page is same as selected species
	public boolean animallistingpagetitleverification(String speciesname) {
		if (speciesnametitle.isDisplayed() && speciesnametitle.getText().equalsIgnoreCase(speciesname)) {
			// System.out.println("Qatar Livestock title displayed");
			return true;
		} else {
			// System.out.println("Qatar Livestock title is not displayed");
			return false;
		}
	}

	// verify the search button in animal listing page
	public boolean searchBtnverification() {
		if (searchBtn.isDisplayed()) {
			searchBtn.click();
			return true;
		} else {
			return false;
		}
	}

	// verify the search field
	public int searchBtnfieldverification(String searchString) throws InterruptedException {
		if (searchField.isDisplayed() && searchField.getText().equals("Search by tag ID")) {
			//searchField.click();
			searchField.clear();
			//System.out.println("hi");
			searchField.sendKeys(searchString);
			//System.out.println("hi");
			Thread.sleep(5000);
			System.out.println("User entered " + searchString + " in the search field");
			try {
				if (searchFieldNoData.isDisplayed() && searchFieldNoData.getText().equals("No data available")) {
					return 1;
				}
			} catch (Exception e) {

			}
			try {
				if (searchFieldData.isDisplayed()) {
					if (animalidstring.getText().equals(searchString)) {
						System.out.println("The animal ID " + searchString + " is available");
							animalidstring.click();
						if (animalidpageTitle.getText().equalsIgnoreCase(searchString)) {
							return 2;
						}
					}
				}
			} 
			catch (Exception e) {
				System.out.println("Search field is not displayed");
				return 0;
			}
			return 0;
		}
		else
		{
			return 0;
		}
	}

	// verify the back button in the search page
	public boolean searchbackbuttonverification() {
		if (backbutton.isDisplayed()) {
			backbutton.click();
			if (piechart.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	// verify search page closed when search btn clicked
	public boolean searchbtnclick() throws InterruptedException {
		if (searchBtn.isDisplayed())
		{
			Thread.sleep(2000);
			searchBtn.click();
			if (piechart.isDisplayed())
			{
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	// verify if user specified animal id is found in search
	public int searchStringVerification(String searchString) throws InterruptedException {
		
		searchField.clear();
		
		searchField.click();
		Thread.sleep(10000);
		searchField.sendKeys(searchString);
		Thread.sleep(5000);
		System.out.println("User entered " + searchString + " in the search field");
		try {
			if (searchFieldNoData.isDisplayed() && searchFieldNoData.getText().equals("No data available")) {
				return 1;
			}
		} catch (Exception e) {

		}
		try {
			if (searchFieldData.isDisplayed()) {
				if (animalidstring.getText().equals(searchString)) {
					System.out.println("The animal ID " + searchString + " is available");
						animalidstring.click();
					if (animalidpageTitle.getText().equalsIgnoreCase(searchString)) {
						return 2;
					}
				}
			}
		} 
		catch (Exception e) {
			System.out.println("Search field is not displayed");
			return 0;
		}
		return 0;
	}

	// verify all details under species count
	public boolean speciesdetailsverification() {
		if (speciescountext.isDisplayed()) {
			speciescountext.click();
			// Console.WriteLine("Species count text is displayed");
			if (piechart.isDisplayed() && texthundred.isDisplayed()
					&& speciesnametitle.getText().equals(speciesnameunderpiechart.getText())
					&& otherstext.isDisplayed()) {
				// Console.WriteLine("Pie chart image is displayed");
			} else {
				// Console.WriteLine("Others text is not displayed");
				return false;
			}
		} else {
			// Console.WriteLine("Species count text is not displayed");
			return false;
		}
		return true;
	}

	// verify all details under health info
	/*
	 * public boolean healthinfodetailsverification() { if
	 * (healthinfotext.isDisplayed()) { healthinfotext.click(); //
	 * Console.WriteLine("Species count text is displayed"); if
	 * (piechart.isDisplayed() && texthundred.isDisplayed() &&
	 * healthyunderpiechart.isDisplayed() &&
	 * healthyunderpiechart.getText().equals("Healthy") &&
	 * unhealthyunderpiechart.isDisplayed() &&
	 * unhealthyunderpiechart.getText().equals("Unhealthy")) { //
	 * Console.WriteLine("Pie chart image is displayed"); } else { //
	 * Console.WriteLine("Others text is not displayed"); return false; } } else {
	 * // Console.WriteLine("Species count text is not displayed"); return false; }
	 * return true; }
	 */

	// verify all the animals listed under pie chart using scroll
	// verify the animal details of each animal listed
	public boolean animalsdetailsverification(String speciesname) throws InterruptedException {
		System.out.println("No of animals: "+animalbox.size());
		if (animalbox.size() == 0) {
			System.out.println("No animals listed");
			return false;
		}

		for (int i = 0; i < animalbox.size()-1; i++) {
			if (animalicon.get(i).isDisplayed() && healthstatus.get(i).isDisplayed()
					&& list.contains(animalstatus.get(i).getText()) && animalid.get(i).isDisplayed()
					&& arrow.get(i).isDisplayed() && age.get(i).isDisplayed() && agevalue.get(i).isDisplayed()
					&& bar.get(i).isDisplayed() && animalloc.get(i).isDisplayed()
					&& animalstatus.get(i).isDisplayed()) {

				String animalID = animalid.get(i).getText();
				//arrow.get(i).click();
				animalid.get(i).click();
				System.out.println(animalID + " is clicked");
				if (verifyanimalidastitle(animalID) && verifybasicanimaldetails() && verifydemographictitle()
						&& verifydemographictitlearrow() && verifydemographictitlecollapsed()
						&& demographicdataverification(speciesname) && verifymedicalrecords()
						&& verifymedicalrecordstitlearrow() && verifymedicalrecordstitlecollapsed()) {
					int result = medicalrecordsdatavalidation();
					if (result == 1 || result == 2) {
						if (verifytracebilityinfotitle() && verifytraceabilityinfotitlearrow()
								&& verifytraceabilityinfotitlecollapsed() && traceabilityinfodataverification()
								&& verifytracebilitydocumenttitle() && verifytraceabilitydocumenttitlearrow()
								&& verifytraceabilitydocumenttitlecollapsed()
								&& verifydocumentsundertraceabilitydocument()) {
							System.out.println("All animal details verified");
							if (animaldetailsbackbuttonverification()) {
								continue;
							} else {
								return false;
							}
						} else {
							return false;
						}
					} else if (medicalrecordsdatavalidation() == 0) {
						System.out.println("All animal details not verified");
						return false;
					}
				} else {
					return false;
				}
			}
		}

		return true;
	}

	// verify the animal id of the selected animal is displayed as title of animal
	// details page
	public boolean verifyanimalidastitle(String animalID) {
		if (animalidpageTitle.isDisplayed()) {
			if (animalID.equals(animalidpageTitle.getText())) {
				System.out.println("Page contains animal ID " + animalID + " as title");
				return true;
			}
		}
		System.out.println("Page does not contain animal ID " + animalID + " as title");
		return false;
	}

	// verify the basic animal details
	public boolean verifybasicanimaldetails() {
		if (firstTab.isDisplayed()) {
			if (animalIcon.isDisplayed() && animalId.isDisplayed()
					&& animalId.getText().equals(animalidpageTitle.getText()) && healthStatus.isDisplayed()
					&& rfidTag.isDisplayed() && rfidTag.getText().equals("RFID Tag ") && rfidTagText.isDisplayed()
					&& rfidTagText.getText().length() == 16 && status.isDisplayed()
					&& status.getText().equals("Status ") && statusText.isDisplayed()) 
			{
				
				  if (statusText.getText().equals("Dead")) 
				  { 
					  try 
					  { 
						  if(locationBtn.isDisplayed())
						  {
							  System.out.println("Location button available for dead animal");
							  return false; 
						  } 
					  } 
					  catch (Exception e) 
					  { 
						  System.out.println("Animal icon, rfid tag, status, last updated date are all verified");
						  return true; 
					  }
				  }
				  else
				  {
					  try
					  { 
						  if (locationBtn.isDisplayed()) 
						  {
							  System.out.println("Animal icon, rfid tag, status, last updated date and location button are all verified");
							  return true; 
						  }
					  } 
					  catch (Exception e)
					  {
						  System.out.println("Location button not available for live animal");
						  return false;
					  }
				  }
				  return true;
			}
			else 
			{
				System.out.println("Animal icon, rfid tag, status, last updated date are not verified");
				return false;
			}

		}
		else 
		{
			System.out.println("Details group not displayed");
			return false;
		}
	}

	// verify demographic title displayed
	public boolean verifydemographictitle() {
		if (demographicDetailsTitle.isDisplayed() && demographicDetailsTitle.getText().equals("Demographic Data")) {
			System.out.println("Page contains Demographic data");
			return true;
		} else {
			System.out.println("Page does not contain Demographic data");
			return false;
		}
	}

	// verify demographic title arrow
	public boolean verifydemographictitlearrow() {
		if (demographicDataArrow.isDisplayed()) {
			System.out.println("Page contains Demographic data arrow button");
			return true;
		} else {
			System.out.println("Page does not contain Demographic data arrow button");
			return false;
		}
	}

	// Verify '-' button is clicked and demographic data collapses
	public boolean verifydemographictitlecollapsed() {
		if (demographicDataTab.isDisplayed()) {
			demographicDataArrow.click();

			System.out.println("Clicked the arrow and demographic data tab closed");

			demographicDataArrow.click();

			System.out.println("Clicked the arrow and demographic data tab collapsed");
			return true;
		} else {
			System.out.println("Demographic data tab not collapsed");
			return false;
		}
		// return true;
	}

	// verify demographic data
	public boolean demographicdataverification(String speciesname) {
		if (demographicDataTab.isDisplayed()) {
			// demographicDataArrow.Click();
			if (speciesTitle.isDisplayed() && speciesTitle.getText().equals("Species") && speciesField.isDisplayed()
					&& speciesField.getText().equalsIgnoreCase(speciesname) && ageTitle.isDisplayed()
					&& ageTitle.getText().equals("Age") && ageField.isDisplayed() && genderTitle.isDisplayed()
					&& genderTitle.getText().equals("Gender") && genderField.isDisplayed()
					&& animalKeeperNameTitle.isDisplayed()
					&& animalKeeperNameTitle.getText().equals("Animal Keeper Name")
					&& animalKeeperNameField.isDisplayed() && dobTitle.isDisplayed()
					&& dobTitle.getText().equals("Date of Birth") && dobField.isDisplayed() && breedTitle.isDisplayed()
					&& breedTitle.getText().equals("Breed") && breedField.isDisplayed() && passportTitle.isDisplayed()
					&& passportTitle.getText().equals("Passport No") && passportNoField.isDisplayed()
					&& purposeTitle.isDisplayed() && purposeTitle.getText().equals("Purpose")
					&& purposeField.isDisplayed()) {
				System.out.println("All demographic data verified");
				return true;
			} else {
				System.out.println("Demographic data is not displayed");
				return false;
			}
		}

		else {
			System.out.println("Demographic data tab is not displayed");
			return false;
		}
	}

	// verify medical records title
	public boolean verifymedicalrecords() {
		demographicDataArrow.click();
		if (medicalRecordsTitle.isDisplayed() && medicalRecordsTitle.getText().equals("Medical Records")) {
			System.out.println("Page contains medical records");
			return true;
		} else {
			System.out.println("Page does not contain medical records");
			return false;
		}
	}

	// verify medical records title arrow
	public boolean verifymedicalrecordstitlearrow() {
		if (medicalDetailsArrowBtn.isDisplayed()) {
			System.out.println("Page contains Medical records arrow button");
			// demographicDataArrow.Click();
		} else {
			System.out.println("Page does not contain Medical records arrow button");
			return false;
		}
		return true;
	}

	// verify medical records title gets collapsed
	public boolean verifymedicalrecordstitlecollapsed() {
		if (medicalRecordsTitleDataTab.isDisplayed()) {
			medicalDetailsArrowBtn.click();

			System.out.println("Clicked the arrow and medical records tab collapsed");

			medicalDetailsArrowBtn.click();

			System.out.println("Clicked the arrow and medical records tab closed");
			return true;
		} else {
			System.out.println("Medical Records tab not collapsed");
			return false;
		}
	}

	// verify medical records details
	public int medicalrecordsdatavalidation() {
		medicalDetailsArrowBtn.click();
		if (medicalRecordsDataTab.isDisplayed()) {
			try {
				if (medicalRecordsNoData.isDisplayed() && medicalRecordsNoData.getText().equals("No data available")) {
					System.out.println("No details displayed under medical records");
					return 1;
				}
			} catch (Exception e) {

			}
			try {
				if (medicalRecordsData.isDisplayed()) {
					System.out.println("Medical records available");
					for (int i = 0; i < medicalRecordsBox.size(); i++) {				
						
						if (clinicDate.get(i).isDisplayed() && clinicMonth.get(i).isDisplayed()
								&& monthlist.contains(clinicMonth.get(i).getText()) && clinicName.get(i).isDisplayed()
								&& doctorName.get(i).isDisplayed() && recordsNxtBtn.get(i).isDisplayed()) {
							String clinicname = clinicName.get(i).getText();
							String doctorname = doctorName.get(i).getText();
							clinicName.get(i).click();
							
							utils.waitForElementToAppear(diagnosisTitle, "text", "Diagnosis", driver);
							
							if (verifymedicalrecordpagetitle()
									&& medicalrecordsdetailsverification(clinicname, doctorname)) {
								if (medicaldiagnosisverification() == 1) {
									if (verifytreatmentplantitle() && verifytreatmentplantitlearrow()
											&& verifytreatmentplantitlecollapsed() && treatmentplandataverification()
											&& verifymedicinesissuedtitle() && verifymedicinesissuedtitlearrow()
											&& verifymedicinesissuedtitlecollapsed()
											&& medicinesissueddataverification() && verifymedicinesdispensedtitle()
											&& verifymedicinesdispensedtitlearrow()
											&& verifymedicinesdispensedtitlecollapsed()
											&& medicinesdispenseddataverification() && verifyvaccinetitle()
											&& verifyvaccinationtitlearrow() && verifyvaccinationstitlecollapsed()
											&& vaccinationsdataverification()) {
										System.out.println("All data in medical records verified");
										medicalrecordsbackbuttonverification();
										continue;
									}
								} else if (medicaldiagnosisverification() == 0) {
									System.out.println("All data in medical records not verified");
									return 0;
								}
							}
						}
					}
					return 2;
				}
			} catch (Exception e) {
				System.out.println("No data displayed");
				return 1;
			}
		} else {
			System.out.println("Medical records data tab is not displayed");
			return 1;
		}
		return 2;
	}

	// verify the medical records page title
	public boolean verifymedicalrecordpagetitle() {
		if (medicalRecordTitle.isDisplayed() && medicalRecordTitle.getText().equals("Medical Records")) {
			System.out.println("Page contains Medical Records text as title");
			return true;
		} else {
			System.out.println("Page does not contain Medical Records text as title");
			return false;
		}
	}

	// verify back button in the medical records page
	public boolean medicalrecordsbackbuttonverification() {
		if (medicalrecordsbackbtn.isDisplayed()) {
			medicalrecordsbackbtn.click();
			if (demographicDetailsTitle.isDisplayed()) {
				System.out.println("Back button in medical records page is verified");
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("Back button in medical records page is not verified");
			return false;
		}

	}

	// verify the details under medical records
	public boolean medicalrecordsdetailsverification(String clinicname, String doctorname) {
		if (clinicNameRecords.isDisplayed() && clinicNameRecords.getText().equals(clinicname)
				&& doctorNameRecords.isDisplayed() && doctorNameRecords.getText().equals(doctorname)
				&& regNo.isDisplayed() && recordDate.isDisplayed() && recordTime.isDisplayed()) {
			System.out.println("Clinic name, doctor name, reg No. are verified");
			return true;
		} else {
			System.out.println("Clinic name, doctor name, reg No. are not displayed");
			return false;
		}
	}

	// verify the medical diagnosis title
	public int medicaldiagnosisverification() {
		try 
		{
			if (diagnosisTitle.isDisplayed() && diagnosisTitle.getText().equals("Diagnosis")
					&& diagnosisNoData.isDisplayed()) // return 1 when no data displayed and return 2 when data present. Add
														// the if condition when data is available for testing
			{
				if (diagnosisNoData.getText().equals("No data available")) {
					System.out.println("No data is displayed under diagnosis");
					return 1;
				}
			}
		}		
		catch (Exception e) {

		}
		try 
		{
			if (diagnosisData.isDisplayed())
			{
				System.out.println("Data is displayed under diagnosis");
				return 1;
			}
		}
		catch (Exception e) {
			System.out.println("Diagnosis data is not available");
			return 0;
		}
		return 0;		
	}

	// verify treatmenet plan title
	public boolean verifytreatmentplantitle() {
		if (treatmentPlanTitle.isDisplayed() && treatmentPlanTitle.getText().equals("Treatment Plan")) {
			System.out.println("Treatment Plan title is verified");
			return true;
		} else {
			System.out.println("Treatment Plan title is not verified");
			return false;
		}
	}

	// Verify '-' button is present beside treatment plan title
	public boolean verifytreatmentplantitlearrow() {
		if (treatmentPlanArrow.isDisplayed()) {
			System.out.println("Page contains treatment plan arrow button");
			// demographicDataArrow.Click();
		} else {
			System.out.println("Page does not contain treatment plan arrow button");
			return false;
		}
		return true;
	}

	// Verify '-' button is clicked and treatment plan collapses
	public boolean verifytreatmentplantitlecollapsed() {
		if (treatmentPlanDataTab.isDisplayed()) {
			treatmentPlanArrow.click();

			System.out.println("Clicked the arrow and treatment plan tab closed");

			treatmentPlanArrow.click();

			System.out.println("Clicked the arrow and treatment plan tab collapsed");
			return true;
		} else {
			System.out.println("Treatment plan tab not collapsed");
			return false;
		}
		// return true;
	}

	// Verify all details in the treatment plan tab
	public boolean treatmentplandataverification() {
		if (treatmentPlanDataTab.isDisplayed()) {
			try {
				if (treatmentPlanNoData.isDisplayed() && treatmentPlanNoData.getText().equals("No data available")) {
					System.out.println("No details displayed under treatment plan");
					return true;
				}
			} catch (Exception e) {

			}
			try {
				if (treatmentPlanData.isDisplayed()) {
					for (int i = 0; i < treatmentPlanDataList.size(); i++) {
						if (plan.get(i).isDisplayed() && plan.get(i).getText().equals("Plan ")
								&& planTextField.get(i).isDisplayed() && remarks.get(i).isDisplayed()
								&& remarks.get(i).getText().equals("Remarks ")
								&& remarksTextField.get(i).isDisplayed()) {
							continue;
						} else {
							System.out.println("Plan and Remarks fields and headings not verified");
							return false;
						}
					}
				}
			} catch (Exception e) {
				System.out.println("No data displayed");
				return false;
			}
			System.out.println("Plan and Remarks fields and headings are verified");
			return true;
		} else {
			System.out.println("Treatment Plan data tab is not displayed");
			return false;
		}
	}

	// verify medicines issued title
	public boolean verifymedicinesissuedtitle() {
		treatmentPlanArrow.click();
		if (medicinesIssuedTitle.isDisplayed() && medicinesIssuedTitle.getText().equals("Medicines Issued")) {
			System.out.println("Page contains Medicines Issued");
			return true;
		} else {
			System.out.println("Page does not contain Medicines Issued");
			return false;
		}
	}

	// Verify '-' button is present beside medicines issued title
	public boolean verifymedicinesissuedtitlearrow() {
		if (medicinesIssuedArrow.isDisplayed()) {
			System.out.println("Page contains medicines issued arrow button");
			// demographicDataArrow.Click();
		} else {
			System.out.println("Page does not contain medicines issued arrow button");
			return false;
		}
		return true;
	}

	// Verify '-' button is clicked and medicines issued collapses
	public boolean verifymedicinesissuedtitlecollapsed() {
		if (medicinesIssuedTitleDataTab.isDisplayed()) {
			medicinesIssuedArrow.click();

			System.out.println("Clicked the arrow and medicines issued tab collapsed");

			medicinesIssuedArrow.click();

			System.out.println("Clicked the arrow and medicines issued tab closed");
			return true;
		} else {
			System.out.println("Medicines issued tab not collapsed");
			return false;
		}
		// return true;
	}

	// verify medicines issued data
	public boolean medicinesissueddataverification() {
		medicinesIssuedArrow.click();
		if (medicinesIssuedDataTab.isDisplayed()) {
			try {
				if (medicinesIssuedNoData.isDisplayed()
						&& medicinesIssuedNoData.getText().equals("No data available")) {
					System.out.println("No details displayed under medicines issued");
					return true;
				}
			} catch (Exception e) {

			}
			try {
				if (medicinesIssuedData.isDisplayed()) {
					for (int i = 0; i < medicinesIssuedDataList.size(); i++) {
						if (medicine.get(i).isDisplayed() && medicine.get(i).getText().equals("Medicine ")
								&& medicineTextField.get(i).isDisplayed() && amount.get(i).isDisplayed()
								&& amount.get(i).getText().equals("Amount ") && prescribedQty.get(i).isDisplayed()
								&& directions.get(i).isDisplayed() && directions.get(i).getText().equals("Directions ")
								&& directionsTextField.get(i).isDisplayed() && comments.get(i).isDisplayed()
								&& comments.get(i).getText().equals("Comments ")
								&& commentsTextField.get(i).isDisplayed()) {
							continue;
						} else {
							System.out.println("Medicine, amount, directions and comments are not verified");
							return false;
						}
					}
				}
			} catch (Exception e) {
				System.out.println("No data displayed");
				return false;
			}
			System.out.println("Medicine, amount, directions and comments are verified");
			return true;
		} else {
			System.out.println("Medicines issued data tab is not displayed");
			return false;
		}
	}

	// verify medicines dispensed title
	public boolean verifymedicinesdispensedtitle() {
		medicinesIssuedArrow.click();
		if (medicinesDispensedTitle.isDisplayed() && medicinesDispensedTitle.getText().equals("Medicines Dispensed")) {
			System.out.println("Page contains Medicines Dispensed");
			return true;
		} else {
			System.out.println("Page does not contain Medicines Dispensed");
			return false;
		}
	}

	// Verify '-' button is present beside medicines dispensed title
	public boolean verifymedicinesdispensedtitlearrow() {
		if (medicinesDispensedArrow.isDisplayed()) {
			System.out.println("Page contains medicines dispensed arrow button");
			// demographicDataArrow.Click();
		} else {
			System.out.println("Page does not contain medicines dispensed arrow button");
			return false;
		}
		return true;
	}

	// Verify '-' button is clicked and medicines dispensed collapses
	public boolean verifymedicinesdispensedtitlecollapsed() {
		if (medicinesDispensedTitleDataTab.isDisplayed()) {
			medicinesDispensedArrow.click();

			System.out.println("Clicked the arrow and medicines dispensed tab collapsed");

			medicinesDispensedArrow.click();

			System.out.println("Clicked the arrow and medicines dispensed tab closed");
			return true;
		} else {
			System.out.println("Medicines dispensed tab not collapsed");
			return false;
		}
		// return true;
	}

	// Verify all details in the medicines dispensed tab
	public boolean medicinesdispenseddataverification() {
		medicinesDispensedArrow.click();
		if (medicinesDispensedDataTab.isDisplayed()) {
			if (medicinesDispensedNoData.isDisplayed()
					&& medicinesDispensedNoData.getText().equals("No data available")) {
				System.out.println("No data displayed under medicines dispensed");
				return true;
			} else // check when data is displayed
			{
				System.out.println("Data displayed under medicines dispensed");
				return true;
			}
		} else {
			System.out.println("Medicines dispensed data tab is not displayed");
			return false;
		}
	}

	// verify vaccine title
	public boolean verifyvaccinetitle() {
		medicinesDispensedArrow.click();
		if (vaccinationsTitle.isDisplayed() && vaccinationsTitle.getText().equals("Vaccinations")) {
			System.out.println("Page contains Vaccinations tab");
			return true;
		} else {
			System.out.println("Page does not contain Vaccinations tab");
			return false;
		}
	}

	// Verify '-' button is present beside vaccination title
	public boolean verifyvaccinationtitlearrow() {
		if (vaccinationsArrow.isDisplayed()) {
			System.out.println("Page contains vaccinations arrow button");
			// demographicDataArrow.Click();
		} else {
			System.out.println("Page does not contain vaccinations arrow button");
			return false;
		}
		return true;
	}

	// Verify '-' button is clicked and vaccination collapses
	public boolean verifyvaccinationstitlecollapsed() {
		if (vaccinationsTitleDataTab.isDisplayed()) {
			vaccinationsArrow.click();

			System.out.println("Clicked the arrow and vaccinations tab collapsed");

			vaccinationsArrow.click();

			System.out.println("Clicked the arrow and vaccinations tab closed");
			return true;
		} else {
			System.out.println("Vaccinations tab not collapsed");
			return false;
		}
		// return true;
	}

	// Verify all details in the vaccination tab
	public boolean vaccinationsdataverification() {
		vaccinationsArrow.click();
		if (vaccinationsDataTab.isDisplayed()) {
			if (vaccinationsNoData.isDisplayed() && vaccinationsNoData.getText().equals("No data available")) {
				System.out.println("No data displayed under vaccinations");
				return true;
			} else // check when data is displayed
			{
				System.out.println("Data displayed under vaccinations");
				return true;
			}
		} else {
			System.out.println("Vaccinations data tab is not displayed");
			return false;
		}
	}

	// verify traceability info title
	public boolean verifytracebilityinfotitle() {
		medicalDetailsArrowBtn.click();
		if (tracebilityInfoTitle.isDisplayed() && tracebilityInfoTitle.getText().equals("Traceability Info")) {
			System.out.println("Page contains traceability info");
			return true;
		} else {
			System.out.println("Page does not contain traceability info");
			return false;
		}
	}

	// Verify '-' button is present beside traceability info title
	public boolean verifytraceabilityinfotitlearrow() {
		if (tracebilityInfoArrowtBtn.isDisplayed()) {
			System.out.println("Page contains traceability info arrow button");
			// demographicDataArrow.Click();
		} else {
			System.out.println("Page does not contain traceability info arrow button");
			return false;
		}
		return true;
	}

	// Verify '-' button is clicked and traceability info collapses
	public boolean verifytraceabilityinfotitlecollapsed() {
		if (traceabilityInfoTitleDataTab.isDisplayed()) {
			tracebilityInfoArrowtBtn.click();

			System.out.println("Clicked the arrow and traceability info tab collapsed");

			tracebilityInfoArrowtBtn.click();

			System.out.println("Clicked the arrow and traceability info tab closed");
			return true;
		} else {
			System.out.println("traceability info tab not collapsed");
			return false;
		}
		// return true;
	}

	// Verify all details in the traceability info tab
	public boolean traceabilityinfodataverification() {
		tracebilityInfoArrowtBtn.click();
		if (traceabilityInfoDataTab.isDisplayed()) {
			if (countryOfOrigin.isDisplayed() && countryOfOriginField.isDisplayed() && dateOfImport.isDisplayed()
					&& dateOfImportField.isDisplayed() && modeOfTransport.isDisplayed()
					&& modeOfTransportField.isDisplayed() && importBatchNo.isDisplayed()
					&& importBatchNoField.isDisplayed() && quarantinePeriod.isDisplayed()
					&& quarantinePeriodField.isDisplayed() && currentOwnerandPremise.isDisplayed()
					&& currentOwnerAndPremiseField.isDisplayed() && inDate.isDisplayed() && inDateField.isDisplayed()) {
				System.out.println("Country of origin title, date of import, mode of transport, import batch no, "
						+ "quarantine period, current owner and premise, in date is displayed correctly");
				return true;
			} else {
				System.out.println("Traceability info data is not displayed");
				return false;
			}
		}

		else {
			System.out.println("Traceability info data tab is not displayed");
			return false;
		}

	}

	// Verify traceability document title
	public boolean verifytracebilitydocumenttitle() {
		tracebilityInfoArrowtBtn.click();
		if (tracebilityDocumentTitle.isDisplayed()
				&& tracebilityDocumentTitle.getText().equals("Traceability Document")) {
			System.out.println("Page contains traceability document title");
			return true;
		} else {
			System.out.println("Page does not contain traceability info");
			return false;
		}
	}

	// Verify '-' button is present beside traceability document title
	public boolean verifytraceabilitydocumenttitlearrow() {
		if (tracebilityDocumentArrowtBtn.isDisplayed()) {
			System.out.println("Page contains traceability document arrow button");
			// demographicDataArrow.Click();
		} else {
			System.out.println("Page does not contain traceability document arrow button");
			return false;
		}
		return true;
	}

	// Verify '-' button is clicked and traceability document collapses
	public boolean verifytraceabilitydocumenttitlecollapsed() {
		if (traceabilityDocumentTitleDataTab.isDisplayed()) {
			tracebilityDocumentArrowtBtn.click();

			System.out.println("Clicked the arrow and traceability docuement tab collapsed");

			tracebilityDocumentArrowtBtn.click();

			System.out.println("Clicked the arrow and traceability document tab closed");
			return true;
		} else {
			System.out.println("traceability document tab not collapsed");
			return false;
		}
		// return true;
	}

	// Verify if documents present under traceability document
	public boolean verifydocumentsundertraceabilitydocument() {
		tracebilityDocumentArrowtBtn.click();
		if (traceabilityDocumentDataTab.isDisplayed()) {
			try {
				if (traceabilityDocumentNoData.isDisplayed()
						&& traceabilityDocumentNoData.getText().equals("No data available")) {
					System.out.println("No details displayed under traceability document");
					return true;
				}
			} catch (Exception e) {

			}
			try {
				String str = ".pdf";
				String traceabilitydoctitle = traceabilityDocumentPdfTitle.getText();

				if (traceabilitydoctitle.contains(str)) {
					System.out.println("Traceability document tab contains document");
					if (traceabilityDocViewBtn.isDisplayed()) {
						if (traceabilityDocViewText.isDisplayed() && traceabilityDocEyeBtn.isDisplayed()
								&& traceabilityDocViewText.getText().equals("View")) {
							System.out.println(
									"View text displayed beside the document and eye icon present beside the document");
						} else {
							System.out.println("No view text or eye icon present");
							return false;
						}
					} else {
						System.out.println("No view button beside document");
						return false;
					}
				} else {
					System.out.println("Traceability document tab does not contain any document");
					return false;
				}
				return true;
			} catch (Exception e) {
				System.out.println("No data displayed");
				return false;
			}
		} else {
			System.out.println("Treatment Plan data tab is not displayed");
			return false;
		}
	}
}