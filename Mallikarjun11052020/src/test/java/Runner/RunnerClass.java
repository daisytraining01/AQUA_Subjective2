package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "D:\\MavenProject\\MavericTest04052020\\FeatureFile\\",
	//glue = "StepDef" ,
	glue = "StepDef",
	//tags = "@Scenario1,@Scenario2,@Scenario3"
	tags = "@Scenario1A"
		
		)
public class RunnerClass
{
	
}
