package qatarlivestock.testcases1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android1.SuccessfullLoginArabicElements;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.AnimalListingArabicElements;
import qatarlivestock.pagefactory.android1.ArabicLanguageSwitchElements;
import qatarlivestock.pagefactory.utils.BaseTest;


public class AnimalListingArabicTest extends BaseTest{
		
	Class<AnimalListingArabicElements> classNameInstance = AnimalListingArabicElements.class;
	String className = classNameInstance.getSimpleName();
	
	@BeforeClass                                             // annotated method placed in the beginning.  
	public void before_test()  
	{  
		System.out.println("\n\033[1m"+className+" started executing\033[0m\n"); 
	}  
	
	@Test(priority=1, description = "1.Verify livestock homepage logo.<br>2.Click login button.<br>3.Click premise name.")
	public void Login() throws InterruptedException
	{
		
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		String premisename = prop.getProperty("premiseName"); 
		String premiseid = prop.getProperty("premiseId");
		String usernameNAS = prop.getProperty("emailNAS"); 
		String passwordNAS = prop.getProperty("passwordNAS");
		boolean logo = login.logoverification();
		Assert.assertEquals(logo, true,"Livestock logo not displayed");
		System.out.println("Livestock logo is displayed in the page");

		boolean val1 = login.clickloginbtn();
		Assert.assertEquals(val1, true, "Login button is not displayed");
		System.out.println("Login button is clicked");
		int result = login.clickpremisename(premisename, premiseid);
		Assert.assertEquals(result, 1 , "Premise name is not found");
		System.out.println(premisename + " with id "+ premiseid +" is clicked");
		
	}
	
	@Test(priority=2, description = "1.Allow location permission, call permission, calender and notifications permissions.")
	public void ClickPermissions() throws InterruptedException
	{	
		
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		boolean permission1 = login.clicklocationpermissionwhileusingapp();
		Assert.assertEquals(permission1, true, "Location permission is not displayed");
		System.out.println("Location permission is displayed and clicked");
	
		boolean permission2 = login.clickallowcallpermission();
		Assert.assertEquals(permission2, true, "Allow call permission is not displayed");
		System.out.println("Allow call permission is displayed and clicked");
	
		boolean permission3 = login.clickallowcallpermission();
		Assert.assertEquals(permission3, true, "Calender permission is not displayed");	
		System.out.println("Calender permission is displayed and clicked");
		
		boolean permission4 = login.clickallowcallpermission();
		Assert.assertEquals(permission4, true, "Notifications permission is not displayed");	
		System.out.println("Notifications permission is displayed and clicked");
		Thread.sleep(5000);
		
	}
	
	@Test(priority=3, description = "1.Verify the premise opened is the same from the hamberger menu.")
	public void VerifyHambergerPremiseName() throws InterruptedException
	{	
		
		SuccessfullLoginArabicElements login = new SuccessfullLoginArabicElements(driver);
		String premisename = prop.getProperty("premiseName");
				
		boolean hambrgr = login.checkpremisenameinhambrgr(premisename);
		Assert.assertEquals(hambrgr, true, "The premise name in hamburger menu is wrong");
		System.out.println("Premise names match");	
	}
	
	@Test(priority=4, description = "1.Switch the language to Arabic.<br>2.Click the species specified by the user.")
	public void ClickSpecies() throws InterruptedException
	{
		String speciesname = prop.getProperty("speciesnameArabic");
		AnimalListingArabicElements animal = new AnimalListingArabicElements(driver);
		ArabicLanguageSwitchElements lang = new ArabicLanguageSwitchElements(driver);
		
		boolean langswitch = lang.switchLanguage();
		Assert.assertEquals(langswitch, true, "Unable to switch to Arabic");
		System.out.println("App language switched to Arabic");
		
		boolean species = animal.clickspeciesname(speciesname);		
		Assert.assertEquals(species, true, "The species name is not found");
		System.out.println("The species "+speciesname+" is clicked");
	}
	
	@Test(priority=5, description = "1.Verify the back button of the animal listing page.")
	public void AnimalListBackBtnVerification() throws InterruptedException
	{
		AnimalListingArabicElements animal = new AnimalListingArabicElements(driver);
		
		boolean back = animal.animallistbackbuttonverification();
		Assert.assertEquals(back, true, "Back button not verified");
		System.out.println("Back button clicked and user navigated to livestock home page");
	}
	
	@Test(priority=6, description = "1.Click the species specified by the user.")
	public void ClickSpeciesName() throws InterruptedException
	{
		String speciesname = prop.getProperty("speciesnameArabic");
		AnimalListingArabicElements animal = new AnimalListingArabicElements(driver);
		
		boolean species2 = animal.clickspeciesname(speciesname);
		Assert.assertEquals(species2, true, "The species name is not found");
		System.out.println("The species "+speciesname+" is clicked");
	}
	
	@Test(priority=7, description = "1.Verify animal listing page title.")
	public void AnimalListingTitleVerification() throws InterruptedException
	{
		String speciesname = prop.getProperty("speciesnameArabic");
		AnimalListingArabicElements animal = new AnimalListingArabicElements(driver);
		
		boolean title = animal.animallistingpagetitleverification(speciesname);
		Assert.assertEquals(title, true, "The page title is wrong");
		System.out.println("Page title is verified");
	}	
	
	@Test(priority=8, description = "1.Verify species count heading and pie chart.<br>2.Verify health info heading and pie chart.")
	public void AnimalListingDetailsVerification() throws InterruptedException
	{			
		AnimalListingArabicElements animal = new AnimalListingArabicElements(driver);
		
		boolean speciescount = animal.speciesdetailsverification();
		Assert.assertEquals(speciescount, true, "Species details not displayed correctly in species count tab");
		System.out.println("All species details verified in species count tab");
		
		/*
		 * boolean healthinfo = animal.healthinfodetailsverification();
		 * Assert.assertEquals(healthinfo, true,
		 * "Species details not displayed correctly in health info tab");
		 * System.out.println("All species details verified in health info tab");
		 */
	}	
		
	@Test(priority=9, description = "1.Verify search button.<br>2.Verify the search field.")
	public void SearchBtnVerification() throws InterruptedException
	{
		AnimalListingArabicElements animal = new AnimalListingArabicElements(driver);
				
		boolean search = animal.searchBtnverification();
		Assert.assertEquals(search, true, "Search button not displayed");
		System.out.println("Search button is displayed");			

//		boolean searchfield = animal.searchBtnfieldverification();
//		Assert.assertEquals(searchfield, true, "Search field not displayed");
//		System.out.println("Search field is displayed");
	}
	
	@Test(priority=10, description = "1.Check if the animal ID entered by user in search bar is listed in the premise.<br>"
			+ "2.Verify the animal if listed.<br>3.Verify back button in search page.<br>4.Verify search page closed when search button is clicked.")
	public void SearchVerification() throws InterruptedException
	{
		AnimalListingArabicElements animal = new AnimalListingArabicElements(driver);
		String searchString = prop.getProperty("searchstring");		
			
//		int searchstring = animal.searchBtnfieldverification(searchString);
//		if (searchstring == 0)
//		{
//			System.out.println("No animal details listed under search box");
//		}
//		else if (searchstring == 1)
//		{
//			Assert.assertEquals(searchstring, 1, "Animal ID "+searchString+" is found");		
//			System.out.println("No animal with ID "+searchString+" is listed");
//		}
//		else 
//		{
//			Assert.assertEquals(searchstring, 2, "No animal with ID "+searchString+" is listed");
//		}		
//		
//		if (searchstring == 2)
//		{
//			boolean searchback = animal.animaldetailsbackbuttonverificationsearch();
//			Assert.assertEquals(searchback, true, "Search page not opened");
//			System.out.println("Search page opened");
//		}
				
		boolean searchbtn = animal.searchbtnclick();
		Assert.assertEquals(searchbtn, true, "Animal listing page not opened");
		System.out.println("Animal listing page opened");
			
		boolean searchclick = animal.searchBtnverification();
		Assert.assertEquals(searchclick, true, "Search button not displayed");
		System.out.println("Search button is clicked");
			
		boolean searchbackbtn = animal.searchbackbuttonverification();
		Assert.assertEquals(searchbackbtn, true, "Animal listing page not opened");
		System.out.println("Animal listing page opened");
	}	
		
	@Test(priority=11, description = "1.Verify animals listed in animal listing page.<br>2.Verify each animal listed has animal icon, health status, animal ID, age, location and arrow button."
			+ "<br>3.Click on animal from list.<br>4.Verify animal details page is opened.<br>5.Verify animal ID, animal icon,"
			+ "health status, RFID tag, last updated date and location button in a tile.<br>"
			+ "5.Verify demographic data is collapsible.<br>6.Verify demographic data title and fields listed."
			+ "<br>7.Verify medical records is collapsible.<br>8.Verify medical records title and data if present.<br>"
			+ "9.Verify traceability info is collapsible.<br>10.Verify traceability info title and fields listed.<br>"
			+ "11.Verify traceability document is collapsible.<br>10.Verify traceability document title and documents if listed.")
	public void AnimalDetailsVerification() throws InterruptedException
	{
		String speciesname = prop.getProperty("speciesnameArabic");
		AnimalListingArabicElements animal = new AnimalListingArabicElements(driver);
		
		boolean animallist = animal.animalsdetailsverification(speciesname);
		Assert.assertEquals(animallist, true, "All details not present in animals list");
		System.out.println("All animal details verified");
		
	}	
	
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
}