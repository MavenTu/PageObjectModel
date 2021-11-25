package defualtAlldemoes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataProviders {
	@Test(dataProvider="dp1")
	public void testData(String username,String password){
		
		System.out.println(username+" "+password);
	}
	@DataProvider(name="dp1")
	public static Object[][] getData(){
		
		Object[][] data= new Object[2][2];
		
		data[0][0]="poltu";
		data[0][1]="123465";
		
		data[1][0]="laltu";
		data[1][1]="123456";
		
		return data;

		
	}

}
