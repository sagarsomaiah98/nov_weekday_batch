package com.sauce.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				



@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
features={"D:\\JANBASK\\OCT_WEEKDAY_BATCH\\BDD_FRAMEWOK\\src\\main\\java\\Features" },
glue={"StepDefinition"})

public class TestRunner {

}
