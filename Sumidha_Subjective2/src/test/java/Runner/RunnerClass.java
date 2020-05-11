package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/sumidhan/Desktop/Workspace/TrainingSumidha/FeatureFiles",
		glue = "StepDef",
		tags = "@Scenario1,@Scenario2,@Scenario2"
		
		)
public class RunnerClass {




}
