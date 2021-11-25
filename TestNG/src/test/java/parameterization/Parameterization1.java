package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization1 {
    @Parameters({"URL","APIKey/username"})
	@Test
	public void test1(String urlname,String Key) {
		
		System.out.println("execute the test1");
		System.out.println(urlname);
		System.out.println(Key);

	}
	@Test
	public void test2() {
		
		System.out.println("execute the test2");
	}
	@Test
	public void test3() {
		
		System.out.println("execute the test3");
	}
	@Test
	public void test4() {
		
		System.out.println("execute the test4");
	}
}



