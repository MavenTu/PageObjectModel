package co.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException  {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable/");
		
		Actions action = new Actions(driver);
		
		 WebElement DragMe = driver.findElement(By.id("draggable"));
		 
		 WebElement DropHere  = driver.findElement(By.id("droppable"));
		 
		 action.dragAndDrop(DragMe,DropHere).perform();
		 Thread.sleep(3000);
		 
		 String textTo = DropHere.getText();
		 Thread.sleep(3000);
		 
		 if(textTo.equals("Dropped!")) {
			 System.out.println("Successful");
			 }else {
			 System.out.println("Fail");
			 }
			 
		 
		 driver.close();
		 
		 

	}

}
