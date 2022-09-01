package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Facebook.feature",glue="org.step",monochrome=true,
plugin="json:src\\test\\resources\\Facebook\\fb.json",dryRun=false,strict=true,snippets=SnippetType.UNDERSCORE)
public class TestRunner {

}
