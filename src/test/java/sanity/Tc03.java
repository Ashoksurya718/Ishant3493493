package sanity;

import org.testng.annotations.Test;

import DataEntryform.Dataentryfields;
import utility.Base;
import utility.retrylogic;

public class Tc03 extends Base{
	
	@Test(retryAnalyzer=retrylogic.class)
	
	public void Tc03() throws InterruptedException
	{
		Dataentryfields DF1 =new Dataentryfields(driver);
		DF1.Name();
		DF1.Email();
		DF1.Phone();
	}

}
