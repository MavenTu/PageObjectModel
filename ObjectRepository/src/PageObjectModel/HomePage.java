package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
private final WebDriver driver;
	
	public WebElement buttonLogin;
	
	public HomePage (WebDriver driver)
	{
		this.driver = driver;
	}
	
public void signIn() {
		
		buttonLogin =driver.findElement(By.name("btnLogin"));


}
}
