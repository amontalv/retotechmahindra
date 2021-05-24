package co.techmahindra.reto.task;

import co.techmahindra.reto.models.Autentication;
import co.techmahindra.reto.userinterface.AutenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AutenticationInThePage implements Task {
    private String username;
    private String password;

    public AutenticationInThePage(String username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AutenticationPage.LOGIN),
                WaitUntil.the(AutenticationPage.USERNAME, WebElementStateMatchers.isEnabled()),
                Enter.theValue(username).into(AutenticationPage.USERNAME),
                WaitUntil.the(AutenticationPage.PASSWORD,WebElementStateMatchers.isEnabled()),
                Enter.theValue(password).into(AutenticationPage.PASSWORD),
                Click.on(AutenticationPage.BTN_LOGIN));
    }

    public static AutenticationInThePage withData(String username){
        return Tasks.instrumented(AutenticationInThePage.class,username);
    }

    public AutenticationInThePage withPassword(String password){
        this.password = password;
        return this;
    }
}
