package co.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonCommand {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		 WebDriver driver;

		 //Launch new Browser

         System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

         driver = new ChromeDriver();

         driver.get("https://courses.letskodeit.com/practice");
         
         driver.manage().window().maximize();

       WebElement bmw = driver.findElement(By.xpath("//input[@id= 'bmwradio']"));

       bmw.click();
       
       Thread.sleep(3000);

         List<WebElement> buttonradio = driver.findElements(By.name("cars"));

         int isize = buttonradio.size();
         Thread.sleep(3000);
         
         System.out.println(isize);
         
         for (int i=0;i<isize;i++) {

                String radiocar =  buttonradio.get(i).getAttribute("value");

                System.out.println(radiocar);
         }
         boolean value = false;

         value = buttonradio.get(0).isSelected();

         if (value == true) {

                buttonradio.get(2).click();

         }

         else {

                buttonradio.get(1).click();
                
          driver.close();
         }

	}

}
