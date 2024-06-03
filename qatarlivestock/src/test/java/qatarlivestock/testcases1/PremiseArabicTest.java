package qatarlivestock.testcases1;

	import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android1.LogoutArabicPage;
import qatarlivestock.pagefactory.android1.PremiseArabicPage;
import qatarlivestock.pagefactory.utils.BaseTest;


	public class PremiseArabicTest  extends BaseTest{	
		
		Class<PremiseArabicTest> classNameInstance = PremiseArabicTest.class;
		String className = classNameInstance.getSimpleName();
		
		@BeforeClass                                             // annotated method placed in the beginning.  
		public void before_test()  
		{  
			System.out.println("\n\033[1m"+className+" started executing\033[0m\n"); 
		}  

			String ANSI_RED = "\u001B[31m";
		String ANSI_GREEN = "\u001B[32m";
		String ANSI_RESET = "\u001B[0m";
		String ANSI_PURPLE = "\u001B[35m";

		String OrginalActive = prop.getProperty("OrginalActive");
		String premisName = prop.getProperty("Cattle House");

		String ownerName = prop.getProperty("ownerName");
		String ownerNo = prop.getProperty("ownerNumber");
		String ownerqid = prop.getProperty("ownerQid");
		String ownergender = prop.getProperty("gender");
		String ownerAge = prop.getProperty("age");
		String ownerAddress = prop.getProperty("Address");
		String ownerPobox = prop.getProperty("PObox");
		String ownerFax = prop.getProperty("Fax");
		String ownerEmail = prop.getProperty("Email");

		String NoownerName = prop.getProperty("NoownerName");
		String NoownerNo = prop.getProperty("NoownerNumber");
		String Noownerqid = prop.getProperty("NoownerQid");
		String Noownergender = prop.getProperty("Nogender");
		String NoownerAge = prop.getProperty("Noage");
		String NoownerAddress = prop.getProperty("NoAddress");
		String NoownerPobox = prop.getProperty("NoPObox");
		String NoownerFax = prop.getProperty("NoFax");
		String NoownerEmail = prop.getProperty("NoEmail");

		String NomineeNames = prop.getProperty("nomineename");
		String NomineeNumbers = prop.getProperty("nomineNo");
		String Nomineeqids = prop.getProperty("nomineQid");

		String NoNomineeNames = prop.getProperty("Nonomineename");
		String NoNomineeNumbers = prop.getProperty("NonomineNo");
		String NoNomineeqids = prop.getProperty("NonomineQid");

		String locationZone = prop.getProperty("zoneNo");
		String locationSubmmName = prop.getProperty("SubmmName");
		String locationpinNumber = prop.getProperty("pinNumber");

		String nolocationZone = prop.getProperty("NozoneNo");
		String nolocationSubmmName = prop.getProperty("NoSubmmName");
		String nolocationpinNumber = prop.getProperty("NopinNumber");

		String PremisetypeofOWnership = prop.getProperty("typeofOWnership");
		String PremiseNameHouse = prop.getProperty("PremiseName");
		String PremiseTypeofPremise = prop.getProperty("TypeofPremise");
		String PremiseMuniciplality = prop.getProperty("Municiplality");
		String PremiseRationCard = prop.getProperty("RationCard");
		String PremisePurpose = prop.getProperty("Purpose");
		String PremiseSourceofwater = prop.getProperty("Sourceofwater");
		String PremisePremiseArea = prop.getProperty("PremiseArea");
		String PremiseDateofCensus = prop.getProperty("DateofCensus");

		String noPremisetypeofOWnership = prop.getProperty("NotypeofOWnership");
		String noPremiseNameHouse = prop.getProperty("NoPremiseName");
		String noPremiseTypeofPremise = prop.getProperty("NoTypeofPremise");
		String noPremiseMuniciplality = prop.getProperty("NoMuniciplality");
		String noPremiseRationCard = prop.getProperty("NoRationCard");
		String noPremisePurpose = prop.getProperty("NoPurpose");
		String noPremiseSourceofwater = prop.getProperty("NoSourceofwater");
		String noPremisePremiseArea = prop.getProperty("NoPremiseArea");
		String noPremiseDateofCensus = prop.getProperty("NoDateofCensus");

		String CoworkersQatari = prop.getProperty("Qatari");
		String CoworkersNonQatari = prop.getProperty("NonQatari");

		String noCoworkersQatari = prop.getProperty("NoQatari");
		String noCoworkersNonQatari = prop.getProperty("NoNonQatari");

		@Test(priority = 1 , description="1. login is clicked <br> 2.premise name is clicked <br> 3.permissions are clicked <br> 4.checked premises name <br>5. Premise Module is verified <br> 6.Premise Module is clicked ")
		public void PremisePageTest() throws InterruptedException {

			System.out.println(ANSI_PURPLE + "Premise details Arabic Page Test" + ANSI_RESET);

			PremiseArabicPage pp = new PremiseArabicPage(driver);
		//	SuccessfullLoginArabicElements login = new SuccessfullLoginArabicElements(driver);
			LogoutArabicPage lp = new LogoutArabicPage(driver);			
			
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

			
			boolean LogoutPageVerification = lp.hamburgerverification();
			Assert.assertEquals(LogoutPageVerification, true, ANSI_RED + "Logoutpage Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Logout page is verified successfully" + ANSI_RESET);
			
			
			boolean LogoutPageLanguagechangeVerification = lp.HamburgerLanguageChangeverification();
			Assert.assertEquals(LogoutPageLanguagechangeVerification, true, ANSI_RED + "Language change Verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Language change is verified successfully" + ANSI_RESET);

			boolean PremiseModuleVerification = pp.ClickPremiseModule();
			Assert.assertEquals(PremiseModuleVerification, true,
					ANSI_RED + "Premise module verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise Details Title is displayed , hence verified" + ANSI_RESET);

				
			}
		
		@Test(priority = 2, description="1.Verified premise name in the page <br> verified premise is active <br> Verified Premise Visit history icon, Weather Icon, Records page icon , Premise Location" )
		public void PremiseNameverificationTest() throws InterruptedException
		{
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			
			boolean PremiseNameverification = pp.VerifyPremisName(OrginalActive, premisName);
			Assert.assertEquals(PremiseNameverification, true, ANSI_RED + "Premise Name verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise Name verified and it is active" + ANSI_RESET);
				
			boolean PremiseIconsverification = pp.VerifyIcons();
			Assert.assertEquals(PremiseIconsverification, true,
					ANSI_RED + "Icons in the premise page verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Icons in the premise page  is successfully verified" + ANSI_RESET);
		}

		@Test(priority = 3,  description="1.Verified owner info in the premise page")
		public void PremiseownerInfoTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseOwnerinfoverification = pp.VerifyOwnerInfo();
			Assert.assertEquals(PremiseOwnerinfoverification, true,
					ANSI_RED + "Premise page owner info verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise page owner info is successfully verified" + ANSI_RESET);
		}
		
		@Test(priority = 4,  description="1.Verified owner info details in the premise page <br> verified owner name, owner Number , owner qid, Gender, Age Address , PO BOx , Fax , Email Id is displaying")
		public void PremiseownerInfoDetailsTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseOwnerinfodetailsverification = pp.Verifyownerinfodetail(ownerName, ownerNo, ownerqid,
					ownergender, ownerAge, ownerAddress, ownerPobox, ownerFax, ownerEmail, NoownerName, NoownerNo,
					Noownerqid, Noownergender, NoownerAge, NoownerAddress, NoownerPobox, NoownerFax, NoownerEmail);
			Assert.assertEquals(PremiseOwnerinfodetailsverification, true,
					ANSI_RED + "Premise page owner info details verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise page owner info details is successfully verified" + ANSI_RESET);
		}

		@Test(priority = 5 , description="1.Verified Location  info  in the premise page " )
		public void PremiseLocationInfoTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseLocationinfoverification = pp.VerifyLocationInfo();
			Assert.assertEquals(PremiseLocationinfoverification, true,
					ANSI_RED + "Premise page Location info verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise page Location info is successfully verified" + ANSI_RESET);
		}
		
		@Test(priority = 6 , description="1.Verified Location  info  deatils  in the premise page <br> 2. verified Zone No, Sub MM name, PIn Number is displaying " )
		  public void PremiseLocationInfoDetailsTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseLocationInfodetailsverification = pp.VerifyLocationinfodetail(locationZone, locationSubmmName,
					locationpinNumber, nolocationZone, nolocationSubmmName, nolocationpinNumber);
			Assert.assertEquals(PremiseLocationInfodetailsverification, true,
					ANSI_RED + "Premise page Location info verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise page Location info is successfully verified" + ANSI_RESET);
		}

		@Test(priority = 7,description="1.Verified Permise  info in the premise page ")
		public void PremiseInfoTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseInfoverification = pp.VerifyPremiseInfo();
			Assert.assertEquals(PremiseInfoverification, true, ANSI_RED + "Premise info verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise info is successfully verified" + ANSI_RESET);
		}
		
		@Test(priority = 8,description="1.Verified Permise  info in the premise page <br> 2. Verified Type of Oenership, Premise Name, Type of premise, Ration Card No., Purpose , source of Water, Premise Area , Date of Census is displaying")
	 	public void PremiseInfoDetailsTest() throws InterruptedException { 
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseinfoDetailsverification = pp.VerifyPremiseinfodetail(PremisetypeofOWnership, PremiseNameHouse,
					PremiseTypeofPremise, PremiseMuniciplality, PremiseRationCard, PremisePurpose, PremiseSourceofwater,
					PremisePremiseArea, PremiseDateofCensus, noPremisetypeofOWnership, noPremiseNameHouse,
					noPremiseTypeofPremise, noPremiseMuniciplality, noPremiseRationCard, noPremisePurpose,
					noPremiseSourceofwater, noPremisePremiseArea, noPremiseDateofCensus);
			Assert.assertEquals(PremiseinfoDetailsverification, true,
					ANSI_RED + "Premise info Details verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise info details is successfully verified" + ANSI_RESET);
		}

		@Test(priority = 9 , description="1.Verified Co-Workers  info in the premise page ")
		public void PremiseCoWorkersTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseCoWorkersinfoverification = pp.VerifyCoWorkersInfo();
			Assert.assertEquals(PremiseCoWorkersinfoverification, true,
					ANSI_RED + "Premise coworkers info verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise coworkers info is successfully verified" + ANSI_RESET);
		}
		
		@Test(priority = 10 , description="1.Verified Co-Workers  info in the premise page <br> 2. Verified qatari and Non Qatari is displaying ")
		public void PremiseCoWorkersDetailsTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseCoWorkersinfoDetailsverification = pp.VerifyCoWorkersdetail(CoworkersQatari, CoworkersNonQatari,
					noCoworkersQatari, noCoworkersNonQatari);
			Assert.assertEquals(PremiseCoWorkersinfoDetailsverification, true,
					ANSI_RED + "Premise CoWorkers info Details verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise CoWorkers info Details is successfully verified" + ANSI_RESET);
		}

		@Test(priority = 11,description="1.Verified Nominee info in the premise page" )
		public void PremiseNomineeInfoTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseNomineeinfoverification = pp.VerifyNomineeInfo();
			Assert.assertEquals(PremiseNomineeinfoverification, true,
					ANSI_RED + "Premise nominee info verification failed");
			System.out.println(ANSI_GREEN + "Premise nominee info is successfully verified" + ANSI_RESET);
		}
		
		@Test(priority = 12 ,description="1.Verified Nominee info in the premise page <br> 2. Verified Nominee Number, Nominee Name, Nominee Qid is displaying" )
		public void PremiseNomineeInfoDetailsTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseNomineeinfoDetailsverification = pp.VerifyNomineeInfodetail(NomineeNames, NomineeNumbers,
					Nomineeqids, NoNomineeNames, NoNomineeNumbers, NoNomineeqids);
			Assert.assertEquals(PremiseNomineeinfoDetailsverification, true,
					ANSI_RED + "Premise Nominee info Details verification failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise Nominee info details is successfully verified" + ANSI_RESET);
		}
		

		@Test(priority = 13, description="1.clicked premise Location Icon <br> 2. verified Premise Location Page is displaying the deatils such as Actual boundaries, Map etc" )
		public void PremiseLocationPageTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseLocationVerification = pp.VerifyclickPremiseLocationPage();
			Assert.assertEquals(PremiseLocationVerification, true,
					ANSI_RED + "Premise Location page validation failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise Location page is successfully verified " + ANSI_RESET);
		}

		
		
		@Test(priority = 14, description="1.clicked premise weather Icon <br> 2. verified Premise weather Page is displaying by clicking Premise weather icon" )
		public void PremiseWeatherPageTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean weatherValidation = pp.VerifyclickPremiseWeatherPage();
			Assert.assertEquals(weatherValidation, true, ANSI_RED + "weather info page validation failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "WeatherInfo Title is displayed , hence verified" + ANSI_RESET);
		}
		
		@Test(priority = 15, description="1.clicked premise weather Icon <br> 2. verified Premise weather Pae is the details of the weather" )
		public void PremiseWeatherPageDetailsTest() throws InterruptedException {
			PremiseArabicPage pp = new PremiseArabicPage(driver);
			boolean PremiseWeatherInfopageDetails = pp.VerifyWeatherinfopageDetails();
			Assert.assertEquals(PremiseWeatherInfopageDetails, true,
					ANSI_RED + "Premise Weather info details page validation failed" + ANSI_RESET);
			System.out.println(ANSI_GREEN + "Premise Weather info details is verified successfully" + ANSI_RESET);
		}

		@AfterClass                                        // annotated method placed in the beginning.  
		public void after_test()  
		{  
			System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
		}  


}
