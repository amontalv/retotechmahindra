package co.techmahindra.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AutenticationPage {
    public static final Target LOGIN = Target.the("button of login").locatedBy("//a[@id='login2']");
    public static final Target USERNAME = Target.the("Text for username").locatedBy("//input[@id='loginusername']");
    public static final Target PASSWORD = Target.the("Text Password").locatedBy("//input[@id='loginpassword']");
    public static final Target BTN_LOGIN = Target.the("button login").locatedBy("//button[@class ='btn btn-primary' and contains(.,'Log in')]");
}
