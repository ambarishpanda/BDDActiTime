package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = {"stepDefinition","com.actitime.utility"},monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
