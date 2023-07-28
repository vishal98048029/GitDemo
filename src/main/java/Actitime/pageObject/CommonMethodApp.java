package Actitime.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actitime.common.CommonData;

public class CommonMethodApp extends CommonData{
	public WebDriver driver;
	
	@FindBy(id="logoutLink")
	private WebElement logoutbutton;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement questionButton; 
	
	@FindBy(partialLinkText = "About")
	private WebElement about;
	
	@FindBy(xpath = "//span[@class='productVersion']")
	private WebElement prodVersion;
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement taskTab;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement reportTab;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement userTab;
	
	@FindBy(xpath="//a[@class='content calendar']")
	private WebElement calendarTab;
	
	@FindBy(xpath="//a[@class='content notifications']")
	private WebElement notificationTab;
	
	public CommonMethodApp(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnLogout() {
		logoutbutton.click();
	}
	public void clickonQuestion() {
		questionButton.click();
	}
	public String getVersionDetails() {
		mouseClick(about);
		waitForElementToAppear(prodVersion);
	  return prodVersion.getText();
	}
	public void clickOnTaskTab() {
		taskTab.click();
	}
	public void clickOnReportTab() {
		reportTab.click();
	}
	public void clickOnUserTab() {
		userTab.click();
	}
	public void clickOnCalTab() {
		calendarTab.click();
	}
	public void clickOnNotifiTab() {
		notificationTab.click();
	}
}
