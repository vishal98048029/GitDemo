package TimeTracking.ActiTime;

import org.testng.annotations.Test;

import ActiTime.TestData.BaseTest;
import Actitime.pageObject.ActiTimeUserListPage;
import Actitime.pageObject.ActiTime_LoginPage;
import Actitime.pageObject.CommonMethodApp;

public class CreateAndDeleteUser extends BaseTest{
	
	@Test
	public void createUser() throws InterruptedException {
		ActiTime_LoginPage atlp=new ActiTime_LoginPage(driver);
		atlp.goToUrl();
		atlp.loginActitime("admin", "manager");
		CommonMethodApp cmapp=new CommonMethodApp(driver);
		cmapp.clickOnUserTab();
		ActiTimeUserListPage actuser=new ActiTimeUserListPage(driver);
		actuser.clickOnAddUser();
		actuser.providUserDetails("Alister", "Suri", "alister", "manager", "manager");
		actuser.selectNewDepartment();
		actuser.provideNewDepartmentName("Dev");
		actuser.provideReleaseDate();
		actuser.createUserButton();
	}
	
	

}
