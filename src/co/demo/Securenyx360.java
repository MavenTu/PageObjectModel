package co.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Securenyx360 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://dev.the360.in/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("surajbiswas@yopmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("suraj8877");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@name='button'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/header[1]/nav[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[normalize-space()='Flat Owners']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[4]/span[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//img[@alt='User Image']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='Sign out']")).click();
		Thread.sleep(4000);
		driver.close();

		

	}

}
