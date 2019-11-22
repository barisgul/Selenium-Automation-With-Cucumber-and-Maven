package pomBase;
 
import managers.PageManager;
import managers.DriverManager;
 
public class Context {
	private DriverManager driverManager; 
	private PageManager pageObjectManager;
	
	public Context(){
		driverManager = new DriverManager();
		pageObjectManager = new PageManager(driverManager.getDriver());
	}
	
	public DriverManager getWebDriverManager() {
		return driverManager;
	}
	
	public PageManager getPageObjectManager() {
		return pageObjectManager;
	} 
}