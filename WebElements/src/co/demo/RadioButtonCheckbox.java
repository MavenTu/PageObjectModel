package co.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;

		//Launch new Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.get("https://courses.letskodeit.com/practice");


		List<WebElement> buttoncheckbox = driver.findElements(By.xpath("//input[@type= 'checkbox']"));

		int checkbtn = buttoncheckbox.size();
		System.out.println(checkbtn);

		for (int j=0;j<checkbtn;j++) {

		String checkboxcar =  buttoncheckbox.get(j).getAttribute("value");
		System.out.println(checkboxcar);

		if(checkboxcar.equalsIgnoreCase("honda")) {
		buttoncheckbox.get(j).click();
		break;
		}

		}



		}

	}
