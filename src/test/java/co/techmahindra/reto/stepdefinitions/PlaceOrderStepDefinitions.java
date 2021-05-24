package co.techmahindra.reto.stepdefinitions;

import co.techmahindra.reto.models.Autentication;
import co.techmahindra.reto.models.BuyLaptop;
import co.techmahindra.reto.questions.ValidateResponse;
import co.techmahindra.reto.task.AddToCart;
import co.techmahindra.reto.task.AutenticationInThePage;
import co.techmahindra.reto.task.SearchInTheCart;
import co.techmahindra.reto.utils.Constantes;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


import java.util.List;

public class PlaceOrderStepDefinitions {
    @Dado("the user login in the application")
    public void theUserLoginInTheApplication(io.cucumber.datatable.DataTable dataTable) {
        List<String> data = dataTable.asList();
        OnStage.theActorInTheSpotlight().attemptsTo(AutenticationInThePage.withData(data.get(0)).withPassword(data.get(1)));

    }

    @Cuando("the user buy laptop")
    public void theUserBuyLaptop(io.cucumber.datatable.DataTable dataTable) {
        List<String> data = dataTable.asList();
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.withSelect(data.get(0)), SearchInTheCart.withData(data));
    }


    @Entonces("user view message")
    public void userViewMessage(io.cucumber.datatable.DataTable dataTable) {
        List<String> message = dataTable.asList();
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateResponse.withMessage(message.get(0))));
    }


}
