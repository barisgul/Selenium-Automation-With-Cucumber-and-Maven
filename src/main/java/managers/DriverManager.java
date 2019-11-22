package managers;
  
import org.openqa.selenium.WebDriver; 

import enums.DriverType;
import reader.FileReaderFactory;
 
public class DriverManager {
	private WebDriver driver;
	private static DriverType driverType; 
 
	public DriverManager() {
		driverType = FileReaderFactory.getInstance().getConfigReader().getBrowser();
	}
 
	public WebDriver getDriver() {
		if(driver == null) driver = createDriver();
		return driver;
	}  
 
	private WebDriver createDriver() {
		DriverFactory driverFactory = new DriverFactory(driver);
		if(driverType.equals(DriverType.CHROME)) {
			driver= driverFactory.chromeDriver(); 
		}
			
		else if(driverType.equals(DriverType.FIREFOX)) {
			driver= driverFactory.firefoxDriver(); 
		}  
         
		return driver;
	}	
 
	public void closeDriver() {
		driver.close();
		driver.quit();
	}	
 
}