package pack2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(monochrome=true,plugin={"pretty","html:cumRepot"})
//@CucumberOptions(monochrome=true,plugin={"pretty","junit:cumRepot.xml"})
@CucumberOptions(monochrome=true,tags={"@smoke,@user,@scale"})
public class Run {

}
