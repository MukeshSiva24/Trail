package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\mukes\\eclipse-workspace\\Ntuc\\src\\test\\resources\\NTUC.feature",
		glue = "StepDefinition",
		tags = "@Smoke",
//		plugin = {"html:target/Report.html","json:target/report.json"},
		dryRun = false,
		monochrome = true
		
		)
public class Runner {

}
