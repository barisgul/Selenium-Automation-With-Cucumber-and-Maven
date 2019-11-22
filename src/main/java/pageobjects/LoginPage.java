package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebElement element;
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/label[1]/input")
	private WebElement txtUsername;	
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/label[2]/input")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/button")
	private WebElement btnLogin; 
	
	@FindBy(xpath = "//*[@id=\"greetings\"]")
	private WebElement lblHelloMessage;  
	
	@FindBy(className = "main-button")
	private WebElement btnLogout;  
	 
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private void enterUsername(String userName){
		txtUsername.sendKeys(userName);
	}
	
	private void enterPassword(String password){
		txtPassword.sendKeys(password);
	}
	
	private void clickOnSignIn() throws InterruptedException{
		
		btnLogin.click();
	} 
	
	public String getLoginMessage()
	{ 
		String text = lblHelloMessage.getAttribute("innertext").trim();
		System.out.println(text);
		 
		return text;
	}
	
	public boolean isPageOpened() {
		return btnLogout.isEnabled();
	}
	
	public boolean isLoginSuccess() {
		if(getLoginMessage().contains("Hello"))
			return true;
		return false;
	}
	
	public void loginToCheckOut(String userName, String password) throws InterruptedException{
		enterUsername(userName); 
		enterPassword(password);
		clickOnSignIn(); 
	}
	
	public void logOut() {
		//btnLogout.click();
	}

}
