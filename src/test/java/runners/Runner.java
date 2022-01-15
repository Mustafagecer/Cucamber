package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "src/test/resources/features",
        glue = "stepdefination",
        tags = "@CH1" ,

        dryRun = false
        //dryRun=true dedigimizde testi calistirmadan bize eksik adimi verir
        //false yaparsak testi calistiri, eksik bir adimla karsilasirsa
        //test failed olur ve bize eksik adimi raporlar
)


public class Runner {
}
