package co.techmahindra.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddToCartPage {
    public static final Target BTN_MENU = Target.the("button for menu laptops").locatedBy("//a[text()='Laptops']");
    public static final Target BTN_OPTION_LAPTOPS = Target.the("button select laptops").locatedBy("//a[contains(.,'{0}')]");
    public static final Target BTN_ADD_TO_CART = Target.the("button add to cart").locatedBy("//a[contains(.,'Add to cart')]");
    public static final Target BTN_PREVIUS = Target.the("button previus").locatedBy("//button[contains(.,'Previous')]");
    public static final Target BTN_NEXT = Target.the("button next").locatedBy("//button[contains(.,'Next')]");
}
