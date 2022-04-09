package co.com.clothesstore.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/agregar_articulo.feature"
        , glue = "co.com.clothesstore.certificacion.stepdefinitions"
        , snippets = SnippetType.CAMELCASE)
public class AgregarArticuloRunner {
}
