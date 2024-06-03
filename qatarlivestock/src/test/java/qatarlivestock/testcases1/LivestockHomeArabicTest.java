package qatarlivestock.testcases1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.android1.ArabicLanguageSwitchElements;
import qatarlivestock.pagefactory.android1.LivestockHomeArabicElements;
import qatarlivestock.pagefactory.android1.LoginArabicPage;
import qatarlivestock.pagefactory.android1.SuccessfullLoginArabicElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class LivestockHomeArabicTest extends BaseTest {			
			
	Class<LivestockHomeArabicTest> classNameInstance = LivestockHomeArabicTest.class;
	String className = classNameInstance.getSimpleName();
	
	@BeforeClass                                            // annotated method placed in the beginning.  
	public void before_test()  
	{  
		System.out.println("\n\033[1m"+className+" started executing\033[0m\n"); 
	}  
	
	@Test(priority=1, description = "1.Verify livestock homepage logo.<br>2.Click login button.<br>3.Click premise name.<br>"
			+ "4.Allow location permission, call permission, calender and notifications permissions.<br>5.Verify the premise opened is the same from the hamberger menu.")
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
		
		boolean hambrgr = login.checkpremisenameinhambrgr(premisename);
		Assert.assertEquals(hambrgr, true, "The premise name in hamburger menu is wrong");
		System.out.println("Premise names match");	
		
		
	
		Thread.sleep(5000);
		
	}
	
	@Test(priority=2, description = "1.Switch language to Arabic.<br>2.Verify livestock module.<br>"
			+ "3.Verify tagging module.<br>4.Verify appointment module.<br>5.Verify premise module.")
	public void ModuleVerification() throws InterruptedException
	{
		LivestockHomeArabicElements livestock = new LivestockHomeArabicElements(driver);
		ArabicLanguageSwitchElements lang = new ArabicLanguageSwitchElements(driver);
		
		boolean langswitch = lang.switchLanguage();
		Assert.assertEquals(langswitch, true, "Unable to switch to Arabic");
		System.out.println("App language switched to Arabic");
		
		boolean livestockmdl = livestock.livestockmoduleverification();
		Assert.assertEquals(livestockmdl, true, "Livestock module not displayed");
		System.out.println("Livestock module verified");
		
		boolean taggingmdl = livestock.taggingmoduleverification();
		Assert.assertEquals(taggingmdl, true, "Tagging module not listed in the page");
		System.out.println("Tagging module verified");

		boolean appointmentmdl = livestock.appointmentmoduleverification();
		Assert.assertEquals(appointmentmdl, true, "Appointment module not listed in the page");
		System.out.println("Appointment module verified");

		boolean premisemdl = livestock.premisemoduleverification();
		Assert.assertEquals(premisemdl, true, "Premise module not listed in the page");
		System.out.println("Premise module verified");
	}
	
	@Test(priority=3, description = "1.Verify Qatar livestock title.")
	public void LivestockPageTitleVerification() throws InterruptedException
	{
		LivestockHomeArabicElements livestock = new LivestockHomeArabicElements(driver);
		
		boolean qatartitle = livestock.qatarlivestocktitleverification();
		Assert.assertEquals(qatartitle, true, "Qatar Livestock title is not displayed");
		System.out.println("Qatar Livestock title displayed");
	}
	
	@Test(priority=4, description = "1.Verify owner name listed properly under Qatar Livestock title.")
	public void OwnerNameVerification() throws InterruptedException
	{
		LivestockHomeArabicElements livestock = new LivestockHomeArabicElements(driver);
		String premiseownername = prop.getProperty("premiseOwnerNameArabic");
		
		boolean owner = livestock.ownernameverification(premiseownername);
		Assert.assertEquals(owner, true, "Owner name not displayed correctly");
		System.out.println("Owner name displayed correctly");
	}

	@Test(priority=5, description = "1.Verify associated animals title.<br>2.Verify all species listed under associated animals.")
	public void AssociatedAnimalsVerification() throws InterruptedException
	{
		LivestockHomeArabicElements livestock = new LivestockHomeArabicElements(driver);
		
		boolean animaltitle = livestock.associatedanimalverification();
		Assert.assertEquals(animaltitle, true, "Associated animal title is not displayed");
		System.out.println("Associated animal title is displayed");
		
		boolean species = livestock.speciesdetailsverification();
		Assert.assertEquals(species, true,"Species details not displayed correctly");
		System.out.println("Species details are verified");
	}

	@Test(priority=6, description = "1.Verify hamberger menu.<br>2.Verify premise owner name in hamberger menu.")
	public void HambergerVerification() throws InterruptedException
	{
		LivestockHomeArabicElements livestock = new LivestockHomeArabicElements(driver);
		String premiseownername = prop.getProperty("premiseOwnerNameArabic");

		boolean hambergername = livestock.hambergerusername(premiseownername);
		Assert.assertEquals(hambergername, true, "Premise owner name is not right in hamberger");
		System.out.println("Premise owner name is correct in hamberger");
		
		
	}
	
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
}