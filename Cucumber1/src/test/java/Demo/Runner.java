package Demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin={"pretty","html:CucumberReport"})
//@CucumberOptions(monochrome=true,plugin={"pretty","junit:CucumberReport.xml"})
//@CucumberOptions(monochrome=true,plugin={"pretty","json:CucumberReport.json"})
public class Runner {

}
