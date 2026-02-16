package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement linkSignIn(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.linkText("sign in")));
	}
	
	public void clickOnLinkSignIn(){
		linkSignIn().click();
	}
	
	public String loginAdminMessage(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='You are logged in as user \"admin\".']"))).getText();
	}
	
	public String loginUserMessage(String username){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='You are logged in as user \""+username+"\".']"))).getText();
	}
	  
	public WebElement linkRegisterANewAccount(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.linkText("Register a new account")));
		
	}
	public void clickOnLinkRegisterANewAccount(){
		linkRegisterANewAccount().click();
	}
	

}
