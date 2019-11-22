package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import reader.FileReaderFactory;

public class DriverFactory {
	WebDriver driver;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	public DriverFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	public ChromeDriver chromeDriver() {
		System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderFactory.getInstance().getConfigReader().getDriverPath());
		driver = new ChromeDriver();
		setBrowserProperties(driver);
		return (ChromeDriver) driver;
	}
	
	public FirefoxDriver firefoxDriver() {
		driver = new FirefoxDriver();
		setBrowserProperties(driver);
		return (FirefoxDriver) driver; 
	}
	
	private void setBrowserProperties(WebDriver driver) {		 	
		 if(FileReaderFactory.getInstance().getConfigReader().getBrowserWindowSize()) 
			{
			 driver.manage().window().maximize();
			}
	     driver.manage().timeouts().implicitlyWait(FileReaderFactory.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);			 
	}

}
