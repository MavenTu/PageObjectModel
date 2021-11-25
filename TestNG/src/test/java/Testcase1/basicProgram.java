package Testcase1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicProgram  extends BaseTest {
	
	
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
	
	@Test(priority=2)
	public void dologin() {
		
		System.out.println("Soham(TEST)");
	}
	 
	@Test(priority=1)
	public void doregister() {
		
		System.out.println("Dutta()TEST");
	}
	

}
