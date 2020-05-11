package RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\manigandang\\Desktop\\Sample\\Testing\\FeatureFiles\\rapid.feature",
		glue = "Stepdef",
		tags = "@positive1,@positive2",
	    plugin ={"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\manigandang\\Desktop\\Sample\\Testing\\ExtentReport\\ReportFile.html"}
		)
public class Runner 
{
   
}
