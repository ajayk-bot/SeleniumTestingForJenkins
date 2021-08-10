package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//tags = {"@Search-Cars"},
@CucumberOptions(
      plugin = {"json:target/RunCuke/cucumber.json", "pretty"},
      features = "src/test/resources/features/",
      glue = "stepDefinitions",
      monochrome = true
      )
public class RunCuke extends AbstractTestNGCucumberTests{ 

	}


