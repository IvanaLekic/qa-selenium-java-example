package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement username(){
		return (new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//input[@id='login']"))));
		
	}
	

	public void setUsername(String username){
		username().clear();
		username().sendKeys(username);
		
	}
	
	public WebElement email(){
		return (new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//input[@id='email']"))));
		
	}
	
	public void setEmail(String email){
		email().clear();
		email().sendKeys(email);
		
	}
	
	public WebElement password(){
		return (new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//input[@id='password']"))));
		
	}
	
	public void setPassword(String password){
		password().clear();
		password().sendKeys(password);
		
	}
	
	public WebElement confirmPassword(){
		return (new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form//input[@id='confirmPassword']"))));
		
	}
	
	
	public void setConfirmPassword(String password){
		confirmPassword().clear();
		confirmPassword().sendKeys(password);
		
	}
	
	public WebElement button(){
		return (new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.xpath("//form//button[@type='submit']"))));
		
	}
	
	public void clickOnButton(){
		button().click();
		
	}
	
	public void registerNewUser(String username, String email, String password, String confirmPassword){
		setUsername(username);
		setEmail(email);
		setPassword(password);
		setConfirmPassword(confirmPassword);
		clickOnButton();
		
	}
	
	public String registerMessage(){
		return (new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//strong[text()='Registration saved!']")))).getText();
	}
	
	
	
	

}
