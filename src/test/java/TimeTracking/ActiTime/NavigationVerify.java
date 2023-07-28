package TimeTracking.ActiTime;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ActiTime.TestData.BaseTest;
import Actitime.pageObject.ActiTime_LoginPage;
import Actitime.pageObject.CommonMethodApp;
import Actitime.pageObject.EnterTimeTrack;

public class NavigationVerify extends BaseTest{
  @Test
  public void navigateAllMethod() throws InterruptedException {
	  ActiTime_LoginPage actlp=new ActiTime_LoginPage(driver);
	  actlp.goToUrl();
	  actlp.loginActitime("admin", "manager");
	  CommonMethodApp cma=new CommonMethodApp(driver);
	  cma.clickOnTaskTab();
	  cma.clickOnReportTab();
	  cma.clickOnUserTab();
	  cma.clickOnCalTab();
	  cma.clickOnNotifiTab();
  }
}
