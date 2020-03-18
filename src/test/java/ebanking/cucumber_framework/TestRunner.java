package ebanking.cucumber_framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/features/branch.feature" }, 
	glue = { "stepdefinitions" }, 
	dryRun = false,
	monochrome = true,
//	tags = {"@dd_json"},
	plugin = {"pretty", "html:target/report"}
)
public class TestRunner {

}
