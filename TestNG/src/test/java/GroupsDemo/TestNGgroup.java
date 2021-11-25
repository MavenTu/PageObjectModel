package GroupsDemo;

import org.testng.annotations.Test;

public class TestNGgroup {

	//testNG2.xml
	@Test(groups= {"sanity"})
	public void test1() {
		
		System.out.println("execute the test1");
	}
	@Test(groups= {"sanity","smoke"})
	public void test2() {
		
		System.out.println("execute the test2");
	}
	@Test(groups= {"sanity","regression"})
	public void test3() {
		
		System.out.println("execute the test3");
	}
	@Test
	public void test4() {
		
		System.out.println("execute the test4");
	}
}

