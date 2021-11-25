package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbLogin {
	
	WebDriver driver;
	public void FbLoginPage(WebDriver driver) {
		this.driver=driver;
	}
           @FindBy(how=How.XPATH, using="//*[@id=\"email\"]") @CacheLookup WebElement emailTextBox;
           @FindBy(how=How.XPATH, using="//*[@id=\"pass\"]")@CacheLookup WebElement passwordTextBox;
           @FindBy(how=How.NAME, using="login")@CacheLookup WebElement signinButton;
           
           public void setEmail(String strEmail) {
            emailTextBox.sendKeys(strEmail);
          
}
           public void setPassword(String strPassword) {
        	   passwordTextBox.sendKeys(strPassword);
}
           public void clickOnLoginButton() {
        	 
        	   signinButton.click();
}
           
}

           
