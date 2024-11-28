package StepDefenitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\LoginTest.feature", glue = { "StepDefenitions" })

public class TestRunner {

}
