package Package2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//resources//Features//Login.feature",glue="LaunchingBooks",
		plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",}
		,monochrome=true)

public class RunnerClass {

}
