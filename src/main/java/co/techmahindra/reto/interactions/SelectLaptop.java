package co.techmahindra.reto.interactions;

import co.techmahindra.reto.userinterface.AddToCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectLaptop implements Interaction {
    private String optionLaptop;

    public SelectLaptop(String optionLaptop) {
        this.optionLaptop = optionLaptop;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AddToCartPage.BTN_PREVIUS));
        if (!AddToCartPage.BTN_OPTION_LAPTOPS.of(optionLaptop).resolveFor(actor).isPresent()){
            actor.attemptsTo(Click.on(AddToCartPage.BTN_NEXT),
                    Click.on(AddToCartPage.BTN_OPTION_LAPTOPS.of(optionLaptop)));
        }
    }

    public static SelectLaptop withData(String optionLaptop){
        return Tasks.instrumented(SelectLaptop.class,optionLaptop);
    }
}
