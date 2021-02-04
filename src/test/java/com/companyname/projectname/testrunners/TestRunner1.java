package com.companyname.projectname.testrunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
                 glue = "com.companyname.projectname.steps",
                 tags="@bhavani1",
                 plugin = {"pretty", "junit:target/test-runner1-results.xml",
                         "json:target/test-runner1-cucumber-reports.json", "html:target/TestRunner1"})
public class TestRunner1 {
}
