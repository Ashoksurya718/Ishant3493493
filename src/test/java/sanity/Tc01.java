package sanity;

import org.testng.annotations.Test;

import DataEntryform.Dataentryfields;
import utility.Base;
import utility.retrylogic;

public class Tc01 extends Base {
	
	@Test(retryAnalyzer=retrylogic.class)
	
	public void Test1() throws InterruptedException
	{
		Dataentryfields DF1 =new  Dataentryfields(driver);
		DF1.Name();
	}

}
