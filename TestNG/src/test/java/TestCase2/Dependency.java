package TestCase2;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependency {
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("google.com(BEFOREMETHOD)");
	}
	@AfterMethod
	public void closeBrowse() {
		System.out.println("google.com.close(AFTERMETHOD)");
	}
	@BeforeTest
	public void setupTest() {
		System.out.println("TestNg.Setup(BEFORETEST)");
	}
	@AfterTest
	public void closeTest() {
		System.out.println("TestNg.close(AFTERTEST)");
	}
	
	@Test(priority=1,dependsOnMethods="doregister")
	public void dologin() {
		
		System.out.println("Soham(TEST)");
		
	}
	 
	@Test(priority=2)
	public void doregister() {
		
		System.out.println("Dutta()TEST");
		Assert.fail("user not register successful");
	}
	
	@Test(priority=3,dependsOnMethods= "doregister",alwaysRun=true)
	public void thirdtest() {
		
		System.out.println("execute 3");
		
	}
	@Test(priority=4,dependsOnMethods= "doregister")
	public void fourthtest() {
		
		System.out.println("execute 4");
		
	}
}



