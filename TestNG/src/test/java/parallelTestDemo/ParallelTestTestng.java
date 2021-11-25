package parallelTestDemo;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestTestng {
	WebDriver driver=null;

@Test	
public void test1() throws InterruptedException {
	
	Date d=new Date();
	System.out.println("i am inside the test1 |"+Thread.currentThread().getId()+"---"+d);
	
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	String url = "https://google.com/";
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
}

@Test
public void test2() throws InterruptedException {
	
	Date d=new Date();
	System.out.println("i am inside the test2 |"+Thread.currentThread().getId()+"---"+d);
	
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	String url = "https://gmail.com/";
	Thread.sleep(3000);
	driver.close();
}
@Test	
public void test3() throws InterruptedException {
	Date d=new Date();
	System.out.println("i am inside the test3 |"+Thread.currentThread().getId()+"---"+d);
	
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	String url = "https://demoqa.com/";
	Thread.sleep(3000);
	driver.close();
}
@Test	
public void test4() throws InterruptedException {
	Date d=new Date();
	System.out.println("i am inside the test4 |"+Thread.currentThread().getId()+"---"+d);
	
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	String url = "https://youtube.com/";
	Thread.sleep(3000);
	driver.close();
}
}
