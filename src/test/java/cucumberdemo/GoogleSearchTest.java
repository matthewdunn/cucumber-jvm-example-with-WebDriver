package cucumberdemo;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report/foo"}, dotcucumber = ".cucumber")
public class GoogleSearchTest {
}