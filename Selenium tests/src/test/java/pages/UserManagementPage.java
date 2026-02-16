package pages;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserManagementPage {
	
	WebDriver driver;

	public UserManagementPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement userManagement(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='User management']")));
		
	}
	
	public void clickOnUserManagement(){
		userManagement().click();
	}
	
	public WebElement edit(String username){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[td[text()='"+username+"']]//button[@href='#/user-management/"+username+"/edit']")));
	}
	
	public void clickOnEdit(String username){
		edit(username).click();
	}
	
	public WebElement activated(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//input[@id='activated']")));
	}
	
	public void clickOnActivated(){
		activated().click();
	}
	
	public WebElement firstName(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));
	}
	
	 public void setFirstName(String firstName){
		 firstName().clear();
		 firstName().sendKeys(firstName);
	 }
	 
	 public WebElement lastName(){
			return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.name("lastName")));
	 }
	 
     public void setLastName(String lastName){
			 lastName().clear();
			 lastName().sendKeys(lastName);
	 }
	
     public WebElement profiles(){
    	 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.name("authority")));
     }
     
     public void selectBothProfiles(){
    	 Select s = new Select(profiles());
    	 s.deselectAll();
    	 ArrayList <WebElement> options = (ArrayList<WebElement>) profiles().findElements(By.xpath("//select[@name='authority']//option"));
    	 Actions act = new Actions(driver);
    	 act.keyDown(Keys.CONTROL).click(options.get(0)).click(options.get(1)).build().perform();
    	 act.keyUp(Keys.CONTROL).build().perform();
    	 
     }
     
     public WebElement email(){
    	 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
     }
     
     public void editEmail(String email){
    	 email().sendKeys(email);
     }
     
     
     public void setEmail(String email){
    	 email().clear();
    	 email().sendKeys(email);
     }
     
     public void clickOnSave(){
    	 (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']"))).click();;
    	 
     }
     
     
	
	

}
