package co.demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropboxPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	     String url = "https://demoqa.com/select-menu";
	     driver.get(url);
	     driver.manage().window().maximize();
	     WebElement ele = driver.findElement(By.id("oldSelectMenu"));
	     Select select = new Select(ele);
	     List<WebElement> dropdown = select.getOptions();
	     System.out.println("Dropdown values are: ");
	     for(WebElement option : dropdown)

	    	 System.out.println(option.getText());

	    	 select.selectByIndex(4);
	    	 Thread.sleep(2000);
	    	 System.out.println("Select value is: " + select.getFirstSelectedOption().getText());



	    	 select.selectByVisibleText("Magenta");
	    	 Thread.sleep(2000);
	    	 System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

	    	 select.selectByValue("7");
	    	 Thread.sleep(2000);
	    	 System.out.println("Select value is: " + select.getFirstSelectedOption().getText());

	    	 driver.close();

	    	 driver.quit();


}
	}