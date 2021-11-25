package co.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchShowParentWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demoqa.com/browser-windows");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
		element.click();
		Thread.sleep(4000);
	
	    WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
	    ele1.click();
	    Thread.sleep(3000);
	    
	    WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]"));
	    ele2.click();
	    Thread.sleep(4000);
	    
	    Set<String>windowhandle  = driver.getWindowHandles();
	    System.out.println(windowhandle);
	    
	    Iterator<String> iterator = windowhandle.iterator();
	    
	    String parentwindow = iterator.next();
	    System.out.println(parentwindow);
	    
	    while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            
                String mainWindowHandle = iterator.next();
                
				if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                
                driver.close();
                System.out.println("Child window closed");
            }
        }    
        driver.switchTo().window(parentwindow);
        driver.quit();
    }	    

	}


