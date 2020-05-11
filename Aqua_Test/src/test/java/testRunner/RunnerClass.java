package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"C:\\Users\\User\\eclipse-workspace\\Aqua_Test\\src\\test\\java\\testpro\\Aqua_Test\\Resource\\Cucumber.feature" },
 glue={"C:\\Users\\User\\eclipse-workspace\\Aqua_Test\\src\\test\\java\\stepDef"},
 tags= "@smoke01",
 strict = true,dryRun=false,
	monochrome=true,
			plugin = {"junit:target/cucumber.xml","rerun:target/rerun.txt"}
		 
 )

public class RunnerClass {

}
