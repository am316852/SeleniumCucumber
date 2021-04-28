package myrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/fetures/"},
glue= {"stepdefinations","apphooks"},
plugin= {"pretty",
"html:target/cucumber-reports"},
publish=true,
monochrome=true
)
public class AccountPageTest {

}
