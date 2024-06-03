package qatarlivestock.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.LivestockHomeElements;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;

public class LivestockHomeTest extends BaseTest {			
			
	Class<LivestockHomeTest> classNameInstance = LivestockHomeTest.class;
	String className = classNameInstance.getSimpleName();
	
	@BeforeClass                                             // annotated method placed in the beginning.  
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
	
	@Test(priority=2, description = "1.Allow location permission, call permission, calender and notifications permissions.<br>.Check premise name in hamburger.")
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
		
		String premisename = prop.getProperty("premiseName");
				
		boolean hambrgr = login.checkpremisenameinhambrgr(premisename);
		Assert.assertEquals(hambrgr, true, "The premise name in hamburger menu is wrong");
		System.out.println("Premise names match");	
		
	}
	
	@Test(priority=3, description = "1.Verify livestock module.<br>2.Verify tagging module.<br>3.Verify appointment module.<br>"
			+ "4.Verify premise module.")
	public void ModuleVerification() throws InterruptedException
	{
		LivestockHomeElements livestock = new LivestockHomeElements(driver);
		
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
	
	@Test(priority=4, description = "1.Verify Qatar Livestock title.")
	public void LivestockPageTitleVerification() throws InterruptedException
	{
		LivestockHomeElements livestock = new LivestockHomeElements(driver);
		
		boolean qatartitle = livestock.qatarlivestocktitleverification();
		Assert.assertEquals(qatartitle, true, "Qatar Livestock title is not  displayed");
		System.out.println("Qatar Livestock title displayed");
	}
	
	@Test(priority=5, description = "1.Verify owner name listed properly under Qatar Livestock title")
	public void OwnerNameVerification() throws InterruptedException
	{
		LivestockHomeElements livestock = new LivestockHomeElements(driver);
		String premiseownername = prop.getProperty("premiseownername");
		
		boolean owner = livestock.ownernameverification(premiseownername);
		Assert.assertEquals(owner, true, "Owner name not displayed correctly");
		System.out.println("Owner name displayed correctly");
	}

	@Test(priority=6, description = "1.Verify associated animals title.<br>2.Verify all species listed under associated animals.")
	public void AssociatedAnimalsVerification() throws InterruptedException
	{
		LivestockHomeElements livestock = new LivestockHomeElements(driver);
		
		boolean animaltitle = livestock.associatedanimalverification();
		Assert.assertEquals(animaltitle, true, "Associated animal title is not displayed");
		System.out.println("Associated animal title is displayed");
		
		boolean species = livestock.speciesdetailsverification();
		Assert.assertEquals(species, true,"Species details not displayed correctly");
		System.out.println("Species details are verified");
	}

	@Test(priority=7, description = "1.Verify hamberger menu.<br>2.Verify premise owner name in hamberger menu.")
	public void HambergerVerification() throws InterruptedException
	{
		LivestockHomeElements livestock = new LivestockHomeElements(driver);
		String premiseownername = prop.getProperty("premiseownername");
		
		boolean hamberger = livestock.hambergerdisplayed();
		Assert.assertEquals(hamberger, true, "Hamberger menu is not displayed");
		System.out.println("Hamberger menu is displayed");

		boolean hambergername = livestock.hambergerusername(premiseownername);
		Assert.assertEquals(hambergername, true, "Premise owner name is not right in hamberger");
		System.out.println("Premise owner name is correct in hamberger");
	}
	
	@AfterClass                                         // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
}