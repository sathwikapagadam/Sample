package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Feature",
glue = {"StepDefinition","com.learn.Hooks"},
plugin = {"pretty","html:target/cucumberreport/report2.html"},
//tags=("@SmokeTest or @SystemTest")
monochrome=true)


public class DemoNG extends AbstractTestNGCucumberTests{

}
