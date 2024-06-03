package qatarlivestock.testcases;

import org.testng.annotations.Test;

import qatarlivestock.pagefactory.android.LoginPage;
import qatarlivestock.pagefactory.utils.BaseTest;

public class LoginTest extends BaseTest{

	@Test
	public void LoginPageTest() throws InterruptedException {

		String ANSI_RESET = "\u001B[0m";
		String ANSI_PURPLE = "\u001B[35m";

		System.out.println(ANSI_PURPLE + "LoginPage Test" + ANSI_RESET);

		LoginPage Lp = new LoginPage(driver);
		Lp.LogoVerification();
	}

}
