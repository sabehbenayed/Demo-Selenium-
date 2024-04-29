package com.e2etests.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		//configuration
		//le chemin des cas de test
		features={"src/spec/features"},
		//le chemin du rapport cucumber
		plugin= {"pretty","html:target/cucumber_report.html"},
		tags=("@login-config-file"),
		//pour bien nathmou console
		monochrome=true,
		snippets=SnippetType.CAMELCASE
		)

public class RunWebSuiteTest {
	

}
