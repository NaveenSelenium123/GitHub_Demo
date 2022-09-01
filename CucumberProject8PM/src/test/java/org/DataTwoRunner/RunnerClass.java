package org.DataTwoRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FacebookData2D.feature",glue="org.DataTwoStep",monochrome=true)
public class RunnerClass {

}
