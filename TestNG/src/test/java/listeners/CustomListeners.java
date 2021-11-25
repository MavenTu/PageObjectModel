package listeners;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//testNG3.xml

public class CustomListeners implements ITestListener{
       
 //public void onTestStart(ITestResult arg){
		
	   // System.out.println("start test execution..."+arg.getName());
	  //}
	 
	 public void onFinish(ITestContext arg) {
		 System.out.println("finish test execution..."+arg.getName());
		
		  }
	 public void onStart(ITestContext arg0) {
		 System.out.println("start test execution..."+arg0.getName());
		    
		  }

	 public void onTestSkipped(ITestResult arg0) {
		 System.out.println("skipped test..."+arg0.getName());
		    
		  }
	 public void onTestSuccess(ITestResult arg0) {
		 System.out.println("successfully run..."+arg0.getName());
		    
		  }
	 public void onTestFailure(ITestResult arg0) {
		 System.out.println("failled test execution..."+arg0.getName());
		    
		  }

		 
	 
		 
		}

 /*<listeners>
<listener class-name="listeners.CustomListeners"></listener>
<listener class-name="org.uncommons.reportng.HTMLReportor"></listener>
</listeners>
*/

