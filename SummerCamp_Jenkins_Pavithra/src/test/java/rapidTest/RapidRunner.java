package rapidTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/rapidTest/rapidTest.feature",
		glue={"rapidTest"},
		tags={"@Withdrawal"},
		monochrome=false,
		strict=true,
		dryRun=false
		)



public class RapidRunner {

}
