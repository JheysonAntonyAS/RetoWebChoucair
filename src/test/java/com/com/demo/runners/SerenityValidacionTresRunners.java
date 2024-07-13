package com.com.demo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ValidacionTres.feature",
        glue = "com.com.demo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class SerenityValidacionTresRunners {
}
