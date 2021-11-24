package CrossBrowerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
	
	WebDriver driver;
	public void LoginPage(WebDriver driver) {
		this.driver=driver;
	}	
		
		
		   @FindBy(xpath="//span[contains(text(),'Sign in')]")  WebElement Hpage;
	
		   @FindBy(id="idToken1")  WebElement emailTextBox;
			
		   @FindBy(id="idToken2")  WebElement  passwordTextBox;
		   
		   @FindBy(id="loginButton_0") @CacheLookup WebElement signinButton;
			
          public void clickOnSigninButton() {
               Hpage.click();
             
   }
           
           public void setEmail(String strEmail) {
        	   emailTextBox .sendKeys(strEmail);
          
}
           public void setPassword(String strPassword) {
        	   passwordTextBox.sendKeys(strPassword);
}
           public void clickOnLoginButton() {
        	 
        	   signinButton.click();

           }
           
}
           
/*
//input[@id='idToken1']          1 of 1
 * //input[@name='callback_0']   1 of 1   --> email text box
 * //input[@type='text']         1 of 2
 * 
 * //input[@id='idToken2']                        1 of 1
 * //input[@type='password']                      1 of 1  --> password
 * //input[@class='form-control login__input']    1 of 2
 * 
 * 
 * //input[@id='loginButton_0']     1 of 1
 * //input[@name='callback_2']      1 of 1   --> login button
 * //input[@type='submit']          1 of 1
 */
           

