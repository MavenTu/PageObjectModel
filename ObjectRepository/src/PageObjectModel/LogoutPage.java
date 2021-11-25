package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	
	private final WebDriver driver;
	public WebElement buttonLogOut;
	
	public LogoutPage (WebDriver driver)
	{
		this.driver = driver;
	}
public void logOut()
	{
		buttonLogOut = driver.findElement(By.linkText("Log out"));


}
}
