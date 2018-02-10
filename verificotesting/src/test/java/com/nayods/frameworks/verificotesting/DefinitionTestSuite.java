package com.nayods.frameworks.verificotesting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features"}, snippets= SnippetType.CAMELCASE,
tags= {"~@ignore","~@tag"},
plugin= {"pretty","json:testData/cucumber.json"})
public class DefinitionTestSuite {}
