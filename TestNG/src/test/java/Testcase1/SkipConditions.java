package Testcase1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipConditions {
	@Test
	public void skipSetup() {
		
		throw new SkipException("Skip the test execution forcefully");
	}

}
