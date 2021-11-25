package co.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://accounts.zoho.in/signin?servicename=AaaServer&serviceurl=https%3A%2F%2Faccounts.zoho.in%2Fu%2Fh");
		Thread.sleep(4000);
		
	
		   WebElement ele1 = driver.findElement(By.xpath("//input[@id='login_id']"));
		   ele1.sendKeys("duttasoham100@gmail.com");
		   Thread.sleep(4000);
		   
		   WebElement ele3 = driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']"));
		   ele3.click();
		   Thread.sleep(4000);

		   WebElement reg1 = driver.findElement(By.xpath("//input[@id='password']"));
		   reg1.sendKeys("sohamdutta");
		   Thread.sleep(3000);
		   
		   WebElement submit = driver.findElement(By.xpath("//form[@id='login']//button[@id='nextbtn']"));
		   submit.click();
		   Thread.sleep(3000);
		   
		   WebElement profile = driver.findElement(By.xpath("//img[@id='headder_thumb_pic']"));
		   profile.click();
		   Thread.sleep(3000);
		   
		   
		   WebElement signout = driver.findElement(By.xpath("//div[@class='pp_expand_signout']"));
		   signout.click();
		   Thread.sleep(3000);
		   
		   
		   driver.close();
	}

}
