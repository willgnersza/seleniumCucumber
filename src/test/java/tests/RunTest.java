package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import util.CommonResources;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/teste.feature",
        tags = "@run",
        plugin = {
                "html:cucumber-report" // Gera o relatório em HTML
        },
        glue = {""}
)
public class RunTest {
    @ClassRule
    public static CommonResources commonResources = new CommonResources();
}
