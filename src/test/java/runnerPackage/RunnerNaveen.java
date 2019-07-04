package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"E:\\java\\com.bddCucumberDemo2\\src\\test\\java\\features\\addToCart.feature"},
		glue={"stepDefinations"},
		dryRun=false,
		monochrome=true,
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		
				/*plugin ={"pretty" , "html:target/CucumberResults",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}*/
		
		//plugin={}
		)
public class RunnerNaveen {

}
