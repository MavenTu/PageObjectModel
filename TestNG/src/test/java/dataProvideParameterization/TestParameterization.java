package dataProvideParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String password) {
		
		System.out.println(username+"---"+password);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="duttasoham20@gmail.com";
		data[0][1]="1234";
		
		data[1][0]="duttasoham100@gmail.com";
		data[1][1]="12345";
		
		data[2][0]="duttasoham100@gmail.com";
		data[2][1]="123456";
		return data;
	}

}
