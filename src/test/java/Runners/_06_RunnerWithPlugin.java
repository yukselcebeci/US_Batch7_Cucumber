package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = "html:target/size/cucumber-pretty.html"
)

public class _06_RunnerWithPlugin extends AbstractTestNGCucumberTests {
}
