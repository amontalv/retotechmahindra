package co.techmahindra.reto.task;

import co.techmahindra.reto.interactions.SelectLaptop;
import co.techmahindra.reto.userinterface.AddToCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class AddToCart implements Task {
    private String selectOption;

    public AddToCart(String selectOption) {
        this.selectOption = selectOption;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AddToCartPage.BTN_MENU),
                SelectLaptop.withData(selectOption),
                WaitUntil.the(AddToCartPage.BTN_ADD_TO_CART, WebElementStateMatchers.isPresent()),
                Click.on(AddToCartPage.BTN_ADD_TO_CART));
        BrowseTheWeb.as(actor).getAlert().accept();
    }

    public static AddToCart withSelect(String selectOption){
        return Tasks.instrumented(AddToCart.class,selectOption);
    }
}
