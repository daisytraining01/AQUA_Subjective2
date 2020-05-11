package RunnerClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features= "C:\\Users\\RM MANI\\eclipse-workspace\\SubjectiveMaheswari\\FeatureFile\\Fundtransfer.feature",
			glue="StepDefinition",
		    tags="@test1,@test2"
			)	
public class RunnerClass 
{
       }
