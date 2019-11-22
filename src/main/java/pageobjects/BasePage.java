package pageobjects; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.support.PageFactory;
 
import reader.FileReaderFactory;


public class BasePage {
	WebDriver driver; 	 
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_HomePage() {
		driver.get(FileReaderFactory.getInstance().getConfigReader().getApplicationUrl());
	} 

	public void closeBrowser() {
		driver.close();		
		driver.quit();
	}	
}
	
