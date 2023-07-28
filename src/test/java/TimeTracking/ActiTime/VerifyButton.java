package TimeTracking.ActiTime;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ActiTime.TestData.BaseTest;
import Actitime.pageObject.ActiTime_LoginPage;
import Actitime.pageObject.CommonMethodApp;
import Actitime.pageObject.EnterTimeTrack;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyButton extends BaseTest{
	@Test(dataProvider = "getData")
	public void validatelogoutbutton(HashMap<String, String> input) throws InterruptedException {	
		ActiTime_LoginPage actlp=new ActiTime_LoginPage(driver);
		actlp.goToUrl();
		actlp.loginActitime(input.get("username"), input.get("password"));
		String title=driver.getTitle();
		System.out.println(title);
		CommonMethodApp cma2=new CommonMethodApp(driver);
		cma2.clickOnLogout();		
	}
	
	@Test(groups = {"smoke"})
	public void verifyVersion() throws InterruptedException {
		ActiTime_LoginPage actlp=new ActiTime_LoginPage(driver);
		actlp.goToUrl();
		actlp.loginActitime("admin", "manager");
		CommonMethodApp cma= new CommonMethodApp(driver);
		cma.clickonQuestion();
		String details=cma.getVersionDetails();
		System.out.println(details);
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data= getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//ActiTime//Data/LoginCredentialDetails.json");
		return new Object[][] {{data.get(0)}};
	}


//	@DataProvider
//	public Object[][] getData() {
//		return new Object[][] {{"admin","manager"}};
//	}

}
