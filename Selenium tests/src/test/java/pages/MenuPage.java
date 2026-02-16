package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {
	WebDriver driver;

	public MenuPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement entities(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Entities']")));
	}
	
	public void clickOnEntities(){
		entities().click();
	}
	
	public WebElement administration(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Administration']")));
	}
	
	public void clickOnAdministration(){
		administration().click();
	}
	
	public WebElement account(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Account']")));
	}
	
	public void clickOnAccount(){
	    account().click();
	}
	
	public WebElement language(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Language']")));
	}
	
	public void clickOnLanguage(){
	    language().click();
	}
	

}
