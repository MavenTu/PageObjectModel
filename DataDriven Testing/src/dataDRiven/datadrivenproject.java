package dataDRiven;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadrivenproject {

	public static void main(String[] args) throws IOException, BiffException, InterruptedException {
	 
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	     driver = new ChromeDriver();
	     
	     
	     Sheet s;
	     FileInputStream  fis = new  FileInputStream("C:\\Users\\hp\\Desktop\\Login.xls");
	     
	     Workbook wb = Workbook.getWorkbook(fis);
	     
	     s =wb.getSheet(0);
	     int z =s.getRows();
	     
	     System.out.println(z);
	     
	     //open url
	     driver.get("http://demo.guru99.com/v4/");
	     driver.manage().window().maximize();



	     for(int row=0; row <s.getRows();row++) {

	     String username = s.getCell(0, row).getContents();
	     System.out.println("Username "+username);

	     driver.findElement(By.name("uid")).clear();
	     driver.findElement(By.name("uid")).sendKeys(username);

	     String password = s.getCell(1, row).getContents();
	     System.out.println("password "+password);

	     driver.findElement(By.xpath("//input[@name='password']")).clear();
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

	     driver.findElement(By.name("btnLogin")).click();
	     Thread.sleep(2000);

	     driver.findElement(By.linkText("Log out")).click();
	     Thread.sleep(2000);

	     Alert txt = driver.switchTo().alert();
	     txt.accept();

	     }

	     driver.close();


	     }   

	}


