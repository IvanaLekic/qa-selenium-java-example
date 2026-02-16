package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NastavniciPage {
	
	WebDriver driver;

	public NastavniciPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement nastavnici(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Nastavnici']")));
	}
	
	public void clickOnNastavnici(){
		nastavnici().click();
	}
	
	public WebElement linkCreateNew(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create a new Nastavnici']")));
	}
	
	public void clickOnLinkCreateNew(){
		linkCreateNew().click();
	}
	
	public WebElement ime(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_ime")));
	}
	
	 public void setIme(String ime){
		 ime().clear();
		 ime().sendKeys(ime);
	 }
	 
	 public WebElement prezime(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_prezime")));
	 }
	 
	 public void setPrezime(String prezime){
		 prezime().clear();
		 prezime().sendKeys(prezime);
	 }
	 
	 public WebElement zvanje(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_zvanje")));
	 }
	 
	 public void setZvanje(String zvanje){
		 zvanje().clear();
		 zvanje().sendKeys(zvanje);
	 }
	 
	 public WebElement save(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']")));
	 }
	 
	 public void clickOnSave(){
		 save().click();
	 }
	 
	 public void createTeacher(String ime, String prezime, String zvanje){
		 setIme(ime);
		 setPrezime(prezime);
		 setZvanje(zvanje);
		 clickOnSave();
	 }
	 
	 public String getImePrezimeZvanje(String ime, String prezime, String zvanje){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='"+ime+"']"))).getText() + " " +
				 (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[td/a[text()='"+ime+"']]/td[text()='"+prezime+"']"))).getText() + " " +
				 (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[td/a[text()='"+ime+"']and td[text()='"+prezime+"']]/td[text()='"+zvanje+"']"))).getText();
	 }

}
