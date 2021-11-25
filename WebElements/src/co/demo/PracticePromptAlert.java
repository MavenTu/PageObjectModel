package co.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePromptAlert {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertBox")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println(simpleAlert.getText());
		Thread.sleep(3000);
		simpleAlert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmBox")).click();
		Alert ConfermationAlert = driver.switchTo().alert();
		System.out.println(ConfermationAlert.getText());
		Thread.sleep(3000);
		ConfermationAlert.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("output")).getText());
		
		driver.findElement(By.id("promptBox")).click();
		Alert PromptAlert = driver.switchTo().alert();
		System.out.println( PromptAlert.getText());
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		PromptAlert.sendKeys("gublu");
		PromptAlert.accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("output")).getText());
		
		driver.quit();
		

		

	}

}
