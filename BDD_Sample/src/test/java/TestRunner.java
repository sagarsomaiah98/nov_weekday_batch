import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)	

@CucumberOptions(plugin = { "html:target/cucumber-html-report"},
features={"D:\\JANBASK\\NOV WEEKDAY BATCH\\BDD_Sample\\src\\main\\java\\Features" },
glue={"StepDefinition"})
public class TestRunner {

}
