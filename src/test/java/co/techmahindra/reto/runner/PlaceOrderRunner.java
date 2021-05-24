package co.techmahindra.reto.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/feature/placeorder.feature"},
        glue = {"co.techmahindra.reto.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PlaceOrderRunner {
}
