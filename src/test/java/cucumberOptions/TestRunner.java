package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features",
		glue= "stepDefinations",
		strict = true,
//		dryRun = true,
		monochrome = true,
		tags = "@test2",
		plugin = {"pretty","html:reports/Selenium",
				"json:reports/Selenium/cucu.json",
				"junit:reports/Selenium/cuke.xml"}
		)



public class TestRunner {

}
