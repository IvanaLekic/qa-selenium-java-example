package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PredmetiPage {
	WebDriver driver;

	public PredmetiPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement predmeti(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Predmeti']")));
	}
	
	public void clickOnPredmeti(){
		predmeti().click();
	}
	
	public WebElement linkCreateNew(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create a new Predmeti']")));
	}
	
	public void clickOnLinkCreateNew(){
		linkCreateNew().click();
	}
	
	public WebElement naziv(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_naziv")));
	}
	
	public void setNaziv(String naziv){
		naziv().clear();
		naziv().sendKeys(naziv);
	}
	
	public WebElement student(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_studenti")));
	}
	
	public void setStudent(String imeIPrezime) {
		Select dropdown = new Select(student());
		dropdown.selectByVisibleText(imeIPrezime);
		
     
		
	}
	
	public WebElement nastavnik(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_nastavnici")));
	}
	
	public void setNastavnik(String imeIPrezime){
		Select dropdown = new Select(nastavnik());
		dropdown.selectByVisibleText(imeIPrezime);
	}
	
	public WebElement save(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']")));
	}
	
	public void clickOnSave(){
		save().click();
	}
	
	public void createSubject(String naziv, String student, String nastavnik){
		setNaziv(naziv);
		setStudent(student);
		setNastavnik(nastavnik);
		clickOnSave();
		
	}
	
	public String getTextNaziv(String naziv){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='"+naziv+"']"))).getText();
	}
	

}
