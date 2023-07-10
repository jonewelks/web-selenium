package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = "steps",
		tags = "@automation",
		dryRun = false  ,
		plugin = {"pretty", "html:evidenciasHTML/automation-Bunge-report.html", "json:evidenciasJson/report.json"},
		snippets = CucumberOptions.SnippetType.CAMELCASE,
		monochrome = false
)
public class Runner {
}
