package runners;



import org.junit.platform.suite.api.*;
import org.yaml.snakeyaml.scanner.Constant;

@Suite
@IncludeEngines("cucumber")
//@SelectClasspathResource("wip")
@ConfigurationParameter(key = "cucumber.features", value = "src/test/resources/features/wip")
@ConfigurationParameter(key = "cucumber.glue", value = "stepDefinitions")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty")

public class Runner {
}
