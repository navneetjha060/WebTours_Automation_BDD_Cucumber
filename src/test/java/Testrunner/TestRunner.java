package Testrunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\test\\resources\\Features",    // Path to feature files
    glue = {"StepDefenitions","Hooks"},             // Path to step definitions
    plugin = {                             // Report plugins
        "pretty", 
        "html:target/cucumber-reports.html", 
        "json:target/cucumber-reports.json"
    },
    monochrome = true,                      // Makes console output readable
    tags = "@SmokeTest"                     // Specify tags to run specific scenarios
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
