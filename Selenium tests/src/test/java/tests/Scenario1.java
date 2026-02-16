package tests;

import org.testng.annotations.Test;

import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MenuPage;
import pages.NastavniciPage;
import pages.PredmetiPage;
import pages.SettingsPage;
import pages.StudentiPage;

import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Scenario1 {
	
    WebDriver driver;
	
	MenuPage menuPage;
	HomePage homePage;
	LoginPage loginPage;
	NastavniciPage nastavniciPage;
	SettingsPage settingsPage;
	StudentiPage studentiPage;
	PredmetiPage predmetiPage;
	AccountPage accountPage;
	
	
  @Test(priority=0)
   public void loginUser() {
		  homePage.clickOnLinkSignIn();
		  loginPage.login("user", "user");
		  assertTrue(homePage.loginUserMessage("user").contains("You are logged in as user \"user\"."));
  }
  
  @Test( priority=1)
  public void addTeacher(){
	  menuPage.clickOnEntities();
	 
	  nastavniciPage.clickOnNastavnici();
	 
	  nastavniciPage.clickOnLinkCreateNew();
	  
	
	  
	  nastavniciPage.createTeacher("Milan", "Milankovic", "Profesor strucnog testiranja");
	 
	  assertTrue(nastavniciPage.getImePrezimeZvanje("Milan", "Milankovic", "Profesor strucnog testiranja").contains("Milan Milankovic Profesor strucnog testiranja"));
	  
  }
  
  @Test(priority=2)
  public void changeLanguage(){
	  menuPage.clickOnAccount();
	  settingsPage.clickOnSettings();
	  settingsPage.setLanguage("Français");
	  settingsPage.clickOnSave();
	  
  }
  
  @Test( priority=3)
  public void addStudent() throws InterruptedException{
	  menuPage.clickOnEntities();
	  studentiPage.clickOnStudenti();
	  
	  for(int i=0; i<3; i++){
		  Thread.sleep(1000);
		  studentiPage.clickOnLinkCreateNew();
		  studentiPage.createStudent("RA"+(i+1), "ImeStudenta"+(i+1), "PrezimeStudenta"+(i+1), "grad"+(i+1));
		  
	  }
	 
  }
  
  
  @Test(priority=4)
  public void addSubject() throws InterruptedException{
	  menuPage.clickOnEntities();
	  predmetiPage.clickOnPredmeti();

	  predmetiPage.clickOnLinkCreateNew();
	 
	  predmetiPage.createSubject("Fizikus", "ImeStudenta1", "Milan Milankovic");
	  
}
  
  @Test(priority=5)
  public void deleteStudent() throws InterruptedException{
	  
	  for(int i=1; i<2; i++){
		    Thread.sleep(2000);
			studentiPage.deleteStudent("RA"+i);
	  }
	  
	  
	  for(int i=1; i<2; i++ ){
		  try{
			  studentiPage.selectStudentIndeks("RA"+i);
			  assertTrue(false, "Student E"+i+" nije obrisan ");
		  }catch (Exception e){
			  
		  }
	  }
	  
	  
  }
  
  @Test( priority=6)
  public void logoutUser(){
	  menuPage.clickOnAccount();
	  accountPage.clickOnSignOut();
	  
  }
  
 
  
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver");
	  driver= new ChromeDriver();
	  menuPage = new MenuPage(driver);
	  homePage = new HomePage(driver);
	  loginPage = new LoginPage(driver);
	  nastavniciPage = new NastavniciPage(driver);
	  settingsPage = new SettingsPage(driver);
	  studentiPage = new StudentiPage(driver);
	  predmetiPage = new PredmetiPage(driver);
	  accountPage = new AccountPage(driver);
	  
	  
	  driver.manage().deleteAllCookies(); 
	  driver.manage().window().maximize(); 
	  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	  driver.get("http://localhost:8080/#/"); 
	  
	  
  }

  @AfterSuite
  public void afterSuite() {
	 driver.close();
  }

}
