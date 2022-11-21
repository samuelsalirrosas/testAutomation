package com.bdd.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty",
        "json:target/build/cucumber.json"},
        junit = {"--step-notifications"},
        features = {"src/test/resources/feature/"},
        glue = {"com.bdd.stepDefinition"},
        tags = {"@DemoBlaze"}
)
public class RunnerTest {
}
