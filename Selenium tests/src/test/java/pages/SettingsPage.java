package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsPage {
	WebDriver driver;

	public SettingsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement settings(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Settings']")));
	}
	
	public void clickOnSettings(){
		settings().click();
	}
	
	public WebElement firstName(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
	}
	
	public WebElement lastName(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
	}
	
	public WebElement email(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	}
	
	public WebElement language(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("langKey")));
	}
	public void setLanguage(String language){
		Select dropdown = new Select(language());
		dropdown.deselectAll();
		dropdown.selectByVisibleText(language);
	}
	
	public WebElement save(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	}
	
	public void clickOnSave(){
		save().click();
	}
	
	

}
