package qatarlivestock.testcases1;
 
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
import qatarlivestock.pagefactory.android1.ArabicLanguageSwitchElements;
import qatarlivestock.pagefactory.android1.SuccessfullLoginArabicElements;
import qatarlivestock.pagefactory.android.SuccessfullLoginElements;
import qatarlivestock.pagefactory.utils.BaseTest;
 
 
public class SuccessfullLoginArabicTest extends BaseTest{
	Class<SuccessfullLoginArabicTest> classNameInstance = SuccessfullLoginArabicTest.class;
	String className = classNameInstance.getSimpleName();
	@BeforeClass                                             // annotated method placed in the beginning.  
	public void before_test()  
	{  
		System.out.println("\n\033[1m"+className+" started executing\033[0m\n"); 
	}  
	@Test(priority=1, description = "1.Verify livestock logo in homepage.<br>2.Click login button.<br>3.Click premise name.")
	public void Login() throws InterruptedException
	{
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		String premisename = prop.getProperty("premiseName"); 
		String premiseid = prop.getProperty("premiseId");
	//	String usernameNAS = prop.getProperty("emailNAS"); 
	//	String passwordNAS = prop.getProperty("passwordNAS");
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
	}
	@Test(priority=3, description = "1.Verify the premise opened is the same from the hamberger menu.")
	public void VerifyHambergerPremiseName() throws InterruptedException
	{	
		SuccessfullLoginElements login = new SuccessfullLoginElements(driver);
		String premisename = prop.getProperty("premiseName");
		boolean hambrgr = login.checkpremisenameinhambrgr(premisename);
		Assert.assertEquals(hambrgr, true, "The premise name in hamburger menu is wrong");
		System.out.println("Premise names match");	
	}
	@Test(priority=4, description = "1.Switch language to Arabic")
	public void LangSwitch() throws InterruptedException
	{
		qatarlivestock.pagefactory.android1.ArabicLanguageSwitchElements lang = new qatarlivestock.pagefactory.android1.ArabicLanguageSwitchElements(driver);
		boolean langswitch = lang.switchLanguage();
		Assert.assertEquals(langswitch, true, "Unable to switch to Arabic");
		System.out.println("App language switched to Arabic");
	}
	@Test(priority=5, description = "1.Click logout button.<br>2.Click login button.<br>3.Verify premise page title.<br>"
			+ "4.Click premise name.")
	public void LoginArabic() throws InterruptedException
	{
		SuccessfullLoginArabicElements login = new SuccessfullLoginArabicElements(driver);
		String premisename = prop.getProperty("premiseNameArabic"); 
		String premiseid = prop.getProperty("premiseId");
		String usernameNAS = prop.getProperty("emailNAS"); 
		String passwordNAS = prop.getProperty("passwordNAS");
		boolean logo = login.logout();
		Assert.assertEquals(logo, true,"User unable to logout");
		System.out.println("User logged out successfully");
		boolean val1 = login.clickloginbtn(usernameNAS, passwordNAS);
		Assert.assertEquals(val1, true, "Login button is not displayed");
		System.out.println("Login button is clicked");
		boolean title = login.premisetitleverification();
		Assert.assertEquals(title, true,"Premise page title is not displayed in the page");
		System.out.println("Premise page title is displayed in the page");
		int result = login.clickpremisename(premisename, premiseid);
		Assert.assertEquals(result, 1 , "Premise name is not found");
		System.out.println(premisename + " with id "+ premiseid +" is clicked");
	}
	@Test(priority=6, description = "1.Verify the premise opened is the same from the hamberger menu")
	public void VerifyHambergerPremiseNameArabic() throws InterruptedException
	{	
		SuccessfullLoginArabicElements login = new SuccessfullLoginArabicElements(driver);
		String premisename = prop.getProperty("premiseNameArabic");
		boolean hambrgr = login.checkpremisenameinhambrgr(premisename);
		Assert.assertEquals(hambrgr, true, "The premise name in hamburger menu is wrong");
		System.out.println("Premise names match");	
	}
	@AfterClass                                        // annotated method placed in the beginning.  
	public void after_test()  
	{  
		System.out.println("\n\033[1m"+className+" finished executing\033[0m\n"); 
	}  
}