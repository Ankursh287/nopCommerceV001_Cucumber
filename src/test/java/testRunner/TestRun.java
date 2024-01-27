package testRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Customers.feature", 
				 glue = "stepDefinitions", 
				 dryRun = false, 
				 plugin = {"pretty", 
						   "html:test-output",
						   "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, 
				 monochrome = true)
public class TestRun {
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("config/report.xml"));
	}
}
