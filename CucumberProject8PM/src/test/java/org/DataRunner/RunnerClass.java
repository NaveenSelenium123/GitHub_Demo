package org.DataRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FacebookData1D.feature",glue="org.DataStep",monochrome=true)

public class RunnerClass {

}
