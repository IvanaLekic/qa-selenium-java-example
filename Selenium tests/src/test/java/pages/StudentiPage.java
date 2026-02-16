package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentiPage {
	WebDriver driver;

	public StudentiPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement studenti(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Studenti']")));
	}
	
	public void clickOnStudenti(){
		studenti().click();
	}
	
	public WebElement linkCreateNew(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Create a new Studenti']")));
		
	}
	
	public void clickOnLinkCreateNew(){
		linkCreateNew().click();
	}
	
	public WebElement indeks(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_indeks")));
	}
	
	public void setIndeks(String indeks){
		indeks().clear();
		indeks().sendKeys(indeks);
		
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
	
	public WebElement grad(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("field_grad")));
	}
	
	public void setGrad(String grad){
		grad().clear();
		grad().sendKeys(grad);
		
	}
	
	public WebElement save(){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Save']")));
	}
	
	public void clickOnSave(){
		save().click();
	}
	
	public void createStudent(String indeks, String ime, String prezime, String grad ){
		setIndeks(indeks);
		setIme(ime);
		setPrezime(prezime);
		setGrad(grad);
		clickOnSave();
	}
	
	public WebElement selectStudentIndeks(String indeks){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='"+indeks+"']")));
	}
	
	public String getIndeksText(String indeks){
		return selectStudentIndeks(indeks).getText();
	}
	
	
	public WebElement editStudent(String indeks){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[td/a[text()='"+indeks+"']]//span[text()='Edit']")));
	}
	
	public void clickOnEdit(String indeks){
		editStudent(indeks).click();
	}
	
	public String getGrad(String indeks){
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[td/a[text()='"+indeks+"']]//td[4]"))).getText();
	}
	
	public void deleteStudent(String indeks) throws InterruptedException{
		WebElement d = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[td/a[text()='"+indeks+"']]//span[text()='Delete']")));
		
		d.click();
		WebElement d1 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//form//span[text()='Delete']")));
		d1.click();
	}
	
	public int countStudents(){
		ArrayList <WebElement> lista = (ArrayList<WebElement>) (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//td[a[@ui-sref='studenti.detail({id:studenti.id})']]")));
		return lista.size();
		
	}
	
	

}
