package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private final WebDriver driver;
	public WebElement textUsername;
	public WebElement textPassword;
		
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	
	}
public void login()
	{
		textUsername = driver.findElement(By.name("uid")); 
		textPassword = driver.findElement(By.name("password"));
				
	}
}
