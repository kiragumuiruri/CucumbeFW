package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:\\Users\\hp\\eclipse-workspace\\CucumbeFW\\src\\main\\java\\features",
		glue = "stepDefinition",
		dryRun = false ,
		plugin = {"pretty" , "junit:target/myReport/report.xml"}
		)
		

public class TestRunner {
	

}
