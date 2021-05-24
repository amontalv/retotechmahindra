package co.techmahindra.reto.runner;


import co.techmahindra.reto.utilities.dataexcel.BeforeSuite;
import co.techmahindra.reto.utilities.dataexcel.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = {"src/test/resources/feature/placeorder.feature"},
        glue = {"co.techmahindra.reto.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class PlaceOrderRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException, com.ibm.icu.impl.InvalidFormatException {
        DataToFeature.overrideFeatureFiles("src/test/resources/feature/placeorder.feature");
    }
}
