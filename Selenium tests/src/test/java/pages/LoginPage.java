package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement username(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		
	}
	
	public void setUsername(String username){
		username().clear();
		username().sendKeys(username);
	}
	
	public WebElement password(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
	}
	
	public void setPassword(String password){
		password().clear();
		password().sendKeys(password);
	}
	
	public WebElement button(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	}
	
	public void clickOnButton(){
		button().click();
	}
	
	public void login(String username, String password){
		setUsername(username);
		setPassword(password);
		clickOnButton();
	}

}
