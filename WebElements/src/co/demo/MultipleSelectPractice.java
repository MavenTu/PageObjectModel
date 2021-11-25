package co.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	     String url = "https://demoqa.com/select-menu";
	     driver.get(url);
	     driver.manage().window().maximize();
	     Select select = new Select(driver.findElement(By.id("cars")));
	        System.out.println("The dropdown options are -");

	        List<WebElement> options = select.getOptions();

	        for(WebElement option: options)
	            System.out.println(option.getText());

	        if(select.isMultiple()){
	        	
	            System.out.println("Select option Opel by Index");
	            select.selectByIndex(2);
	            Thread.sleep(3000);
	            System.out.println("Select option saab by Value");
	            select.selectByValue("saab");
	            Thread.sleep(4000);
	            System.out.println("Select option Audi by Text");
	            select.selectByVisibleText("Audi");
	            System.out.println("The selected values in the dropdown options are -");

	            List<WebElement> selectedOptions = select.getAllSelectedOptions();

	            for(WebElement selectedOption: selectedOptions)
	                System.out.println(selectedOption.getText());
	            System.out.println("DeSelect option Audi by Index");
	            select.deselectByIndex(3);
	            Thread.sleep(4000);
	            System.out.println("Select option Opel by Text");
	            select.deselectByVisibleText("Opel");
	            Thread.sleep(4000);
	            System.out.println("The selected values after deselect in the dropdown options are -");
	            List<WebElement> selectedOptionsAfterDeselect = select.getAllSelectedOptions();

	            for(WebElement selectedOptionAfterDeselect: selectedOptionsAfterDeselect)
	                System.out.println(selectedOptionAfterDeselect.getText());
	            select.deselectAll();
	        }

	        driver.quit();
	}
}

