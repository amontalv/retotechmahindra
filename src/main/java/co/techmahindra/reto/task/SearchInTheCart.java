package co.techmahindra.reto.task;

import co.techmahindra.reto.userinterface.SearchToCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class SearchInTheCart implements Task {
    private List<String> data;

    public SearchInTheCart(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchToCartPage.BTN_CART));
        if (SearchToCartPage.TXT_VALIDATE_ELEMENT.resolveFor(actor).isPresent()){
            actor.attemptsTo(Click.on(SearchToCartPage.BTN_PLACE_OLDER),
                    WaitUntil.the(SearchToCartPage.TXT_NAME, WebElementStateMatchers.isPresent()),
                    Enter.theValue(data.get(1)).into(SearchToCartPage.TXT_NAME),
                    Enter.theValue(data.get(2)).into(SearchToCartPage.TXT_COUNTRY),
                    Enter.theValue(data.get(3)).into(SearchToCartPage.TXT_CITY),
                    Enter.theValue(data.get(4)).into(SearchToCartPage.TXT_CARD),
                    Scroll.to(SearchToCartPage.BTN_PURCHASE),
                    Enter.theValue(data.get(5)).into(SearchToCartPage.TXT_MONTH),
                    Enter.theValue(data.get(6)).into(SearchToCartPage.TXT_YEAR),
                    Click.on(SearchToCartPage.BTN_PURCHASE));
        }
    }

    public static SearchInTheCart withData(List<String> data){
        return Tasks.instrumented(SearchInTheCart.class,data);
    }
}
