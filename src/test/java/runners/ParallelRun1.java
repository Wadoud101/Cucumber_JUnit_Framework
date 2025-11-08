package runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("src/test/java")   // folder under src/test/resources/features  - "features/wip"
@ConfigurationParameter(key = FEATURES_PROPERTY_NAME, value = "src/test/resources/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefinitions")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@parallel1")
@ConfigurationParameter(key = EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false")

//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/html-report/cucumber-report1.html")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/json-reports/cucumberReport1.json")
//@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, junit:target/xml-report/cucumber1.xml")
public class ParallelRun1 {


}
