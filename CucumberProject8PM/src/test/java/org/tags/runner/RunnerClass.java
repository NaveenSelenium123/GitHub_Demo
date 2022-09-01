package org.tags.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JVMReports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FacebookTag.feature",
glue="org.tags.step",
tags= {"@Regression"},dryRun=false,plugin= {"json:\\src\\test\\resources\\Facebook\\fb.json"})
public class RunnerClass {
	@AfterClass
	public static void report() {
	JVMReports.cucumberReport("\\src\\test\\resources\\Facebook\\fb.json");	

	}

}
