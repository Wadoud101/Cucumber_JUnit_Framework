package runners;

/*

import org.junit.platform.suite.api.*;
import org.yaml.snakeyaml.scanner.Constant;

@Suite
@IncludeEngines("cucumber")
//@SelectClasspathResource("wip")
@ConfigurationParameter(key = "cucumber.features", value = "src/test/resources/features/wip")
@ConfigurationParameter(key = "cucumber.glue", value = "stepDefinitions")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty")   */


import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.*;

import java.security.Key;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("src/test/java")   // folder under src/test/resources/features  - "features/wip"
@ConfigurationParameter(key = FEATURES_PROPERTY_NAME, value = "src/test/resources/features/wip")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefinitions")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@wip")
@ConfigurationParameter(key = EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false")

@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html")
// @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html")
public class Runner {


}
