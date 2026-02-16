package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {
	WebDriver driver;

	public AccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement signOut(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Sign out']")));
	}
	
	public void clickOnSignOut(){
		signOut().click();
	}

}
