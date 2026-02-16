package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LanguagePage {
	WebDriver driver;

	public LanguagePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement english(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='English']")));
	}
	
	public void clickOnEnglish(){
	    english().click();
	}
	
	public WebElement francais(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Français']")));
	}
	
	public void clickOnFrancais(){
	    francais().click();
	}

}
