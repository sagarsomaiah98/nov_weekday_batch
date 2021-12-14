import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-html-report"},
		features="src\\main\\java\\Features\\Login.feature",
		glue = {"StepDefintions"},

	tags="@Smoke")
public class RunnerTest {

}
