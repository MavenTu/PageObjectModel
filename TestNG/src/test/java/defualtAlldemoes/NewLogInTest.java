package defualtAlldemoes;
import org.testng.annotations.Test;

public class NewLogInTest {
	@Test(dataProviderClass=MultipleDataProviders.class,dataProvider="dp1")
	public void testData(String username,String password){
		
		System.out.println(username+"----"+password);
	}

}
