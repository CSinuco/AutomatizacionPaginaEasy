package com.co.easy.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@regresion",
        glue = "com.co.easy.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class AgregarProductoRunner {
}
