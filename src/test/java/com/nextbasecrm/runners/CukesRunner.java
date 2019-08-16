package com.nextbasecrm.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports"
        },
        tags = {},
        features = {"src/test/resources/features"},
        glue = {"com/nextbasecrm/step_definitions"},

        dryRun = false

)

public class CukesRunner {
}
