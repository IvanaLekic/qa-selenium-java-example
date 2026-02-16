package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IspitniRokoviPage {
	
	WebDriver driver;

	public IspitniRokoviPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	 public WebElement ispitniRokovi(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='IspitniRokovi']")));
	 }
	 
	 public void clickOnIspitniRokovi(){
		 ispitniRokovi().click();
	 }
	 
	 public WebElement linkCreateNew(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create a new IspitniRokovi']")));
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
	 
	 public WebElement pocetak(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_pocetak")));
	 }
	 
	 public void setPocetak(String godina, String mesec, String dan){
			pocetak().clear();
			pocetak().sendKeys(godina + "-" + mesec + "-" + dan);
     }
	 
	 public WebElement kraj(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_kraj")));
	 }
	 
	 public void setKraj(String godina, String mesec, String dan){
			kraj().clear();
			kraj().sendKeys(godina + "-" + mesec + "-" + dan);
     }
	 
	 public WebElement save(){
			return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Save']")));
	 }
		
	 public void clickOnSave(){
			save().click();
	 }
	 
	 public void createExamPeriod(String naziv, String pocetakGodina,String pocetakMesec, String pocetakDan, String krajGodina, String krajMesec, String krajDan){
		 setNaziv(naziv);
		 setPocetak(pocetakGodina, pocetakMesec, pocetakDan);
		 setKraj(krajGodina, krajMesec, krajDan);
		 clickOnSave();
	 }
	 
	 public String getTextNaziv(String naziv){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='"+naziv+"']"))).getText();
	 }

}
