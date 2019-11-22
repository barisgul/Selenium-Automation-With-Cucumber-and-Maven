package managers;
  
import org.openqa.selenium.WebDriver;
 
import pageobjects.BasePage;
import pageobjects.HomePage;
import pageobjects.LoginPage; 

public class PageManager {
 
	private WebDriver driver;
	private BasePage basePage;
	private LoginPage loginPage; 
	private HomePage homePage;

 
	public PageManager(WebDriver driver) { 
		this.driver = driver;
	}
 
	public BasePage getBasePage(){ 
		return (basePage == null) ? basePage = new BasePage(driver) : basePage; 
	}
	
	public LoginPage getLoginPage() {		 
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage; 
	}
	
	public HomePage getHomePage(){ 
		return (homePage == null) ? homePage = new HomePage(driver) : homePage; 
	}
}