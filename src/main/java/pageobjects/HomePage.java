package pageobjects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import utils.StringUtil;


public class HomePage {
	
	WebElement element;
	WebDriver driver;
	
	@FindBy(id = "bAdd")
	private WebElement btnCreate;	
	
	@FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[1]/input")
	private WebElement txtFirstName;
	
	@FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[2]/input")
	private WebElement txtLastName; 
	
	@FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[3]/input")
	private WebElement txtStartDate;  
	
	@FindBy(xpath = "/html/body/div/div/div/form/fieldset/label[4]/input")
	private WebElement txtEmail;  	

	@FindBy(xpath = "//button[contains(text(),\"Add\")]")
	private WebElement btnAdd;  
	
	@FindBy(xpath = "//li[contains(text(),\"fName\")]")
	private WebElement linkAddedItem;
	
	@FindBy(id = "bDelete")
	private WebElement btnDelete;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	
	public void clickOnCreateButton() {
		btnCreate.click();
	}
	
	public void setEmployeeData(DataTable args) {
		StringUtil util = new StringUtil();
		List<String> list = args.asList(String.class); 
		String firstName = list.get(1)+util.getRandomString(2);
		String lastName = list.get(3)+util.getRandomString(2);
		String date = list.get(5);
		String email = list.get(7);
		System.out.println(firstName+" - "+lastName+" - "+date+" - "+email); 		
		
		txtFirstName.sendKeys(firstName.trim());
		txtLastName.sendKeys(lastName.trim());
		txtStartDate.sendKeys(date.trim());
		txtEmail.sendKeys(email.trim());
	}
	
	public void clickOnAddButton() {
		btnAdd.click(); 
		assertTrue(linkAddedItem.isDisplayed());
	}
	
	public void isItemDeleted() {
		assertFalse(linkAddedItem.isDisplayed());
	}
	
	public void clickOnAddedItem() {		
		linkAddedItem.click();
	}
	
	public void clickOnDelete() {
		if(!linkAddedItem.isSelected())
			linkAddedItem.click();
		btnDelete.click();
	}
	
	public void acceptAlert() {
		driver.switchTo().alert().accept();  
	}
	
	public boolean isAlertAppeared() {
		try 
	    { 
	        driver.switchTo().alert(); 
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}

}
