package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features ="src/test/resources/features",
        glue ="com/cydeo/step_definition",
        dryRun = true,
        tags = "@063"


)

public class Cukesrunner {


}
