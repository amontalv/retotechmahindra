package co.techmahindra.reto.stepdefinitions;

import co.techmahindra.reto.models.Autentication;
import co.techmahindra.reto.utils.Constantes;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class Hook {
    @Before
    public void inicializarActor(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Actor");
    }

    @Dado("^the user in the application$")
    public void theUserInTheApplication() {
         OnStage.theActorInTheSpotlight().attemptsTo(Open.url(Constantes.URL));
    }
}
