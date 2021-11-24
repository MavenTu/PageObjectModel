package CrossBrowerTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;
	public  HomePage(WebDriver driver) {
		this.driver=driver;
}
	@FindBy(xpath="//div[@data-qa='nav-account']//button[@type='button']")@CacheLookup WebElement AccountDropdown;
	@FindBy(xpath="//ul[@role='menu']//span[contains(text(),'Log out')]")@CacheLookup WebElement logoutlink;
	
	public void clickOnAccountDropdown() {
	AccountDropdown.click();	
		}
	public void clickOnLogoutLink() {
		logoutlink.click();
		
	}
}

/*{//button[@type='button']      1 of 14

//button[@type='button'][@class='Buttons__btn__3yodQ SidebarToggleV2__wrapper__2pC4J Buttons__btn-action-inv__Np8dr']
1 of 1   --> but not acceptable.

//div[@data-qa='nav-account']//button[@type='button']   1 of 1
 but its shows no such element / this xpath always changed.
 */



