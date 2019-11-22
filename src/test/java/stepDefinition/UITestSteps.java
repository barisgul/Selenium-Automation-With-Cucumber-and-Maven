package stepDefinition;

import static org.junit.Assert.assertTrue;
 
import java.util.List; 
import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.BasePage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pomBase.Context; 

public class UITestSteps {
	
	static WebDriver driver;
	Context testContext;
	BasePage basePage;
	LoginPage loginPage;
	HomePage homePage;

	public UITestSteps(Context context) {
		testContext = context;
		basePage = testContext.getPageObjectManager().getBasePage();
		homePage = testContext.getPageObjectManager().getHomePage();
		loginPage = testContext.getPageObjectManager().getLoginPage();		
	}
	
	@Given("^user is on Home Page$")
	public void userIsOnHomePage(){
		basePage.navigateTo_HomePage();
	}
 
	@Given("^I am a user of http://cafetownsend-angular-rails.herokuapp.com/login$")
	public void userOfCafetownsend(){
		basePage.navigateTo_HomePage();
	}
	
	@When("I log in using valid credentials")
	public void loginWithCredentials(DataTable args) throws InterruptedException  {
		List<String> list = args.asList(String.class);
		String uName = list.get(1);
		String pw = list.get(3); 
		System.out.println(uName+"  --"+pw); 
		 
		loginPage.loginToCheckOut(uName,pw); 
	} 
	
	@Then("I should be logged in$")
	public void successLogon()  {
		assertTrue(loginPage.isPageOpened());		
	} 
	
	@Then("I click on Logout button$")
	public void logout()  {
		loginPage.logOut();		
	} 
	
	@Then("I click to Create button$")
	public void clickOnCreate() {
		homePage.clickOnCreateButton();
	}
	
	@Then("I fill the employee fields with below criterias$")
	public void setEmployeeData(DataTable args) {
		homePage.setEmployeeData(args);
	}
	
	@When("I click to Add button employee should be added$")
	public void clickOnAdd() {
		homePage.clickOnAddButton();
	}
	
	@Then("i click to my added item$")
	public void clickOnAddedItemFromList() {
		homePage.clickOnAddedItem();
	}
	
	@When("i click to delete button$")
	public void clickOnDelete() {
		homePage.clickOnDelete();
	}
	
	@Then("popup message should be appeared$")
	public void popupMessageShouldBeAppeared() {
		assertTrue(homePage.isAlertAppeared());		
	}
	
	@Then("i click to OK button$")
	public void clickOnPopupOk() {
		homePage.acceptAlert();
	}  
	
	@Then("I should logout successfully$")
	public void logoutIsSucceed()  {
		//assertTrue(loginPage.isLoggedOut());				
	} 	 
	
	@Then("I close browser$")
	public void closeBrowser()  {		
		basePage.closeBrowser();
	} 

}
