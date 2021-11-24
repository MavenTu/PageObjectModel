package crossBrowserPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CrossBrowerTest.HomePage;
import CrossBrowerTest.loginPage;

public class logintest extends Testcase1 {
	
	
	@Test
	public void init() throws InterruptedException {
		
		loginPage loginpage =PageFactory.initElements(driver,loginPage.class);
		loginpage.clickOnSigninButton();
		Thread.sleep(4000);
		loginpage.setEmail("soham.dutta@codelogicx.com");
		Thread.sleep(4000);
		loginpage.setPassword("Soham@100");
		Thread.sleep(4000);
		loginpage.clickOnLoginButton();
		
		HomePage homepage = PageFactory.initElements(driver, HomePage.class);
		homepage.clickOnAccountDropdown();
		Thread.sleep(4000);
		homepage.clickOnLogoutLink();
		
		
	}

}


