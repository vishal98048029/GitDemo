package TimeTracking.ActiTime;

import org.testng.Assert;
import org.testng.annotations.Test;

import ActiTime.TestData.BaseTest;
import Actitime.pageObject.ActiTime_LoginPage;

public class ErrorValidation extends BaseTest{
	
	@Test(groups = {"smoke"})
	public void verifyLoginErrorMessage() throws InterruptedException {
		ActiTime_LoginPage actlp=new ActiTime_LoginPage(driver);
		actlp.goToUrl();
		actlp.loginActitime("admin", "manag");
		Boolean match=actlp.getErrorMessage();
		Assert.assertTrue(match);
	}

}
