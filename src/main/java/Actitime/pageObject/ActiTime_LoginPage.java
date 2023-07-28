package Actitime.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actitime.common.CommonData;

public class ActiTime_LoginPage extends CommonData{
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	@FindBy(xpath = "(//div[contains(text(),'Login')])[1]")
	private WebElement logButton;
	
	@FindBy(xpath = "(//span[@class='errormsg'])[1]")
	private WebElement errorMessage;
	
	By logoutButton=By.id("logoutLink");
	
	public ActiTime_LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginActitime(String user, String pwd) throws InterruptedException {
		username.sendKeys(user);
		password.sendKeys(pwd);
		logButton.click();
//		waitForElementToAppear(logoutButton);
		Thread.sleep(1000);
	}
	public void goToUrl() {
		driver.navigate().to("http://localhost/login.do");
	}
	public boolean getErrorMessage() {
		boolean message=errorMessage.getText().equalsIgnoreCase("Username or Password is invalid. Please try again.");
		return message;
	}

}
