package FacebookTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Facebook.FbHomePage;
import Facebook.FbLogin;

public class LoginTest extends Testcases {
	@Test
	public void init() throws Exception {
		
		FbLogin loginpage =PageFactory.initElements(driver,FbLogin.class);
		loginpage.setEmail("godofwar000125@gmail.com");
		loginpage.setPassword("soham@20");
		loginpage.clickOnLoginButton();
		
		FbHomePage homepage = PageFactory.initElements(driver, FbHomePage.class);
		Thread.sleep(4000);
		homepage.clickOnprofileDropdown();
		Thread.sleep(4000);
		homepage.clickOnLogoutLink();
		
		
	}

}
