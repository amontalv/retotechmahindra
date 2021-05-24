package co.techmahindra.reto.questions;

import co.techmahindra.reto.userinterface.SearchToCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateResponse implements Question<Boolean> {
    private String message;

    public ValidateResponse(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(SearchToCartPage.TXT_RESPONSE).asAString().answeredBy(actor).equalsIgnoreCase(message);
    }

    public static ValidateResponse withMessage(String messsage){
        return new ValidateResponse(messsage);
    }
}
