package Testcase1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class basicProgram2  extends BaseTest {
	
	@Test
	public void validatesTitle() {
		String expected_title="Google.com";
		String actual_title="Yahoo.com";
		/* if(expected_title.equals(actual_title)) {
			System.out.println("pass");
		}else {                                      /*  if and else can't verify failed validates.
			System.out.println("fail");
		}*/
		Assert.assertEquals(expected_title, actual_title);

		
	}

}
