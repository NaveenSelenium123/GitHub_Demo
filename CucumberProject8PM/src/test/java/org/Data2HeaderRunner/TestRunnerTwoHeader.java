package org.Data2HeaderRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Facebook2DHeader.feature",glue="org.Data2HeaderStep",monochrome=true)
public class TestRunnerTwoHeader {

}
