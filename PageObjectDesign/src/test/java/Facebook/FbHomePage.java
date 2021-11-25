package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbHomePage {
	
	WebDriver driver;
	public  FbHomePage(WebDriver driver) {
		this.driver=driver;
}
	@FindBy(how=How.XPATH,using="//div[@aria-label='Account']")WebElement profileDropdown;
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Log Out']") WebElement logoutlink;
	
	public void clickOnprofileDropdown() {
	profileDropdown.click();	
		}
	public void clickOnLogoutLink() {
		logoutlink.click();
		
	}
}
