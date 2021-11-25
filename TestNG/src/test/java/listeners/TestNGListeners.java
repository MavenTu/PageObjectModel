package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.CustomListeners.class)
public class TestNGListeners {
	
	@Test 
	void test1() {
		
		System.out.println("execute the test1");
		Assert.assertEquals(false,true);
	}
	@Test 
	 void test2() {
		
		System.out.println("execute the test2");
		Assert.assertEquals(true,true );
	}
	@Test 
	 void test3() {
		
		System.out.println("execute the test3");
		throw new SkipException("this is skip excepsion...");
	}
	
}
