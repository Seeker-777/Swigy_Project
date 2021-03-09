package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		
		monochrome = true,
		plugin = {"pretty", "html:target/swigy-html", "json:target/swigy.json"},
		features = "src/test/java/feature",
		glue = "test"	
		
		
		)


public class TestRunner {

}
