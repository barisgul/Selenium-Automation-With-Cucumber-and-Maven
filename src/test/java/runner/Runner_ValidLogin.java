
package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/LoginTest.feature",
				glue= {"stepDefinition"},
				dryRun = false,
				monochrome = true, 
				tags="@validLogin",
				format = {"pretty", "html:TestReports", "json:TestReports/cucumber.json", "junit:TestReports/cucumber.xml"}
				
		)
public class Runner_ValidLogin {
}