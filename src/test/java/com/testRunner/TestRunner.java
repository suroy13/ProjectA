package com.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/features"}
		,glue={"com/CucumberSteps"},monochrome=true
		,plugin= {"pretty","html:target/CucumberReports/CucumberExecution.html"}
				
		)
public class TestRunner {
}
