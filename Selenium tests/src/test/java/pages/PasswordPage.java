package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasswordPage {
	WebDriver driver;

	public PasswordPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement password(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Password']")));
	}
	
	public void clickOnPassword(){
	    password().click();
	}
	
	public WebElement newPassword(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.id("password")));
	}
	 public void setNewPassword(String newPassword){
		 newPassword().clear();
		 newPassword().sendKeys(newPassword);
	 }
	 
	 public WebElement confirmNewPassword(){
			return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.id("confirmPassword")));
		}
	 
	 
	 public void setConfirmNewPassword(String confirmNewPassword){
			 confirmNewPassword().clear();
			 confirmNewPassword().sendKeys(confirmNewPassword);
	 }
	 
	 public void clickOnSave(){
		 (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Save']")));
	 }
	 
	 public void changePassword(String newPassword, String confirmNewPassword){
		 setNewPassword(newPassword);
		 setConfirmNewPassword(confirmNewPassword);
		 clickOnSave();
		 
	 }
	

}
