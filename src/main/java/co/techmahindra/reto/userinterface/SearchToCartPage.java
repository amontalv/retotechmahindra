package co.techmahindra.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SearchToCartPage {

    public static final Target BTN_CART = Target.the("button for search to cart").locatedBy("//a[@id = 'cartur']");
    public static final Target TXT_VALIDATE_ELEMENT = Target.the("Text element").locatedBy("//td[contains(.,'MacBook Pro')]");
    public static final Target BTN_PLACE_OLDER = Target.the("button placer order").locatedBy("//button[contains(.,'Place Order')]");
    public static final Target TXT_NAME = Target.the("text name").locatedBy("//input[@id= 'name']");
    public static final Target TXT_COUNTRY = Target.the("text country").locatedBy("//input[@id= 'country']");
    public static final Target TXT_CITY = Target.the("text city").locatedBy("//input[@id= 'city']");
    public static final Target TXT_CARD = Target.the("text card").locatedBy("//input[@id= 'card']");
    public static final Target TXT_MONTH = Target.the("text month").locatedBy("//input[@id= 'month']");
    public static final Target TXT_YEAR = Target.the("text year").locatedBy("//input[@id= 'year']");
    public static final Target BTN_PURCHASE = Target.the("Button purchase").locatedBy("//button[contains(.,'Purchase')]");
    public static final Target TXT_RESPONSE = Target.the("Texto response").locatedBy("//h2[contains(.,'Thank you for your purchase!')]");
}
