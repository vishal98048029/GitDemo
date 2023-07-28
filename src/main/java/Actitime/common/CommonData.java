package Actitime.common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonData {
	public WebDriver driver;
	public WebDriverWait wait;
	

	
	public CommonData(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitForElementToAppear(By ele) {	
	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(ele)));
	}
	public void waitForElementToAppear(WebElement ele2) {	
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele2));
		}


	public void mouseClick(WebElement e) {
		Actions action = new Actions(driver);
		action.moveToElement(e).click().perform();
	}
}
