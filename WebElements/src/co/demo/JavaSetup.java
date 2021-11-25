package co.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSetup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		
		 element.sendKeys("duttasoham20@gmail.com");
		 
		 WebElement element1= driver.findElement(By.xpath("//*[@id=\"identifierNext\"]"));
		 element1.click();
		 

	}

}
