package task.framework.steps;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "task.framework.steps",
        tags = "@all")

public class RunTest extends AbstractTestNGCucumberTests {
}
