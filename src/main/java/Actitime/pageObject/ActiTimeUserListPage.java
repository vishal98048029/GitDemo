package Actitime.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actitime.common.CommonData;

public class ActiTimeUserListPage extends CommonData{
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@id='ext-comp-1003']")
	private WebElement addUserButton;
	
	//Windows
	@FindBy(name = "firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="passwordCopy")
	private WebElement reTypePassword;
	
	@FindBy(id="ext-gen36")
	private WebElement department;
	
	@FindBy(xpath="(//a[contains(text(),'-- new department --')])[last()]")
	private WebElement selectNewDepartment;
	
	@FindBy(id="//a")
	private WebElement e;
	
	@FindBy(id="userDataLightBox_newUserGroupNameField")
	private WebElement newDepartmentTxt;
	
	//Handle Date
	@FindBy(id="ext-gen73")
	private WebElement releaseDate;
	
	@FindBy(xpath="(//button[@class='x-btn-text'])[last()]")
	private WebElement monthSelection;
	
	@FindBy(xpath="//a[contains(text(),'2025')]")
	private WebElement selectYear;
	
	
	@FindBy(xpath="//a[contains(text(),'Nov')]")
	private WebElement selectMonth;
	
	@FindBy(xpath="(//button[@class='x-date-mp-ok'])[last()]")
	private WebElement selectOK;
	
	@FindBy(xpath="(//span[contains(text(),'21')])[last()]")
	private WebElement selectDate;
	
	@FindBy(xpath="(//button[contains(text(),'OK')])[last()]")
	private WebElement select2OK;
	
	@FindBy(id="userDataLightBox_commitBtn")
	private WebElement createUserBttn;
	
	//Handle Clander
	
	//Ending of form
	
	public ActiTimeUserListPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddUser() {
		addUserButton.click();
		waitForElementToAppear(fname);
	}
	public void providUserDetails(String name,String lastname,String username,String pass1,String passFinal) {
		fname.sendKeys(name);
		lname.sendKeys(lastname);
		uname.sendKeys(username);
		password.sendKeys(pass1);
		reTypePassword.sendKeys(passFinal);
	}
	public void selectNewDepartment() throws InterruptedException {		
		department.click();
		waitForElementToAppear(selectNewDepartment);
//		department.sendKeys(Keys.ARROW_DOWN);
//		department.sendKeys(Keys.ARROW_DOWN);
//		department.sendKeys(Keys.ENTER);
		selectNewDepartment.click();
	}
	public void provideNewDepartmentName(String newDept) {
		newDepartmentTxt.sendKeys(newDept);
	}
	public void provideReleaseDate() {
		releaseDate.click();
//		waitForElementToAppear(monthSelection);
		monthSelection.click();
		selectYear.click();
		selectMonth.click();
		selectOK.click();
		selectDate.click();
		select2OK.click();		
	}
	public void createUserButton() {
		createUserBttn.click();
	}
	
	
	
}
