package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IspitnePrijavePage {
	
	WebDriver driver;

	public IspitnePrijavePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement ispitnePrijave(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='IspitnePrijave']")));
	 }
	 
	 public void clickOnIspitnePrijave(){
		 ispitnePrijave().click();
	 }
	 
	 public WebElement linkCreateNew(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create a new IspitnePrijave']")));
	 }
	 
	 
	 public void clickOnLinkCreateNew(){
		 linkCreateNew().click();
	 }
	 
	 public WebElement teorija(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_teorija")));
	 }
	 
	 public void setTeorija(String teorija){
			teorija().clear();
			teorija().sendKeys(teorija);
     }
	 
	 public WebElement zadaci(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_zadaci")));
	 }
	 
	 public void setZadaci(String zadaci){
			zadaci().clear();
			zadaci().sendKeys(zadaci);
     }
	 
	 public WebElement ispitniRok(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_ispitniRok")));
	 }
	 
	 public void setIspitniRok(String ispitniRok){
		 Select dropdown = new Select(ispitniRok());
		 dropdown.selectByVisibleText(ispitniRok);
		 
	 }
	 
	 public WebElement student(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_student")));
	 }
	 
	 public void setStudent(String indeksIStudent){
		 Select dropdown = new Select(student());
		 dropdown.selectByVisibleText(indeksIStudent);
		 
	 }
	 
	 public WebElement predmet(){
		 return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_predmet")));
	 }
	 
	 public void setPredmet(String predmet){
		 Select dropdown = new Select(predmet());
		 dropdown.selectByVisibleText(predmet);
		 
	 }
	 
	 public WebElement save(){
			return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']")));
	 }
		
	 public void clickOnSave(){
			save().click();
	 }
	 
	 public void createExam(String teorija, String zadaci, String ispitniRok, String indeksIStudent, String predmet){
		 setTeorija(teorija);
		 setZadaci(zadaci);
		 setIspitniRok(ispitniRok);
		 setStudent(indeksIStudent);
		 setPredmet(predmet);
		 clickOnSave();
	 }
	 
	 public String getTextIndeksStudentPredmet(String indeksIStudent, String predmet){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='"+indeksIStudent+"']"))).getText() + " " +
				(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[td/a[text()='"+indeksIStudent+"']]//a[text()='"+predmet+"']"))).getText();
	 }
	 
	 

	

}
