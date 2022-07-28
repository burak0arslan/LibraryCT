package libraryCT.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "pretty",
                    "json:target/cucumber.json",
                    "html:target/cucumber-libraryCT-project-report.html",
                    "rerun:target/rerun.txt",
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber"

            },

            features = "src/test/resources/features",
            glue = "libraryCT/stepDefinitions",
            dryRun = false,
            tags = "",
            publish = true


    )
    public class CukesRunner {
}
