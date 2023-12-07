package com.krlss.userinterfaces;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PurchasePageInterface {

    public static final Target INP_FIRST_NAME = Target.the("Input name").located(By.name("firstname"));
    public static final Target INP_LAST_NAME = Target.the("Input lastname").located(By.name("lastname"));
    public static final Target INP_EMAIL = Target.the("Input email").located(By.xpath("//*[@id=\"input-payment-email\"]"));
    public static final Target INP_PHONE = Target.the("Input telephone").located(By.name("telephone"));
    public static final Target INP_COMPANY = Target.the("Input company").located(By.name("company"));
    public static final Target INP_ADDRESS = Target.the("Input address").located(By.name("address_1"));
    public static final Target INP_CITY = Target.the("Input city").located(By.name("city"));
    public static final Target INP_POST_CODE = Target.the("Input post code").located(By.name("postcode"));

    public static final Target INP_COUNTRY = Target.the("Input country").located(By.xpath("//*[@id='input-payment-country']"));
    public static final Target INP_REGION = Target.the("Input region").located(By.xpath("//*[@id='input-payment-zone']"));
    public static final Target OPT_REGION = Target.the("Input region").located(By.xpath("//*[@id='input-payment-zone']/option[6]"));

    public static final Target BTN_CONTINUE = Target.the("Button continue").located(By.xpath("//*[@id='button-guest']"));

    public static final Target BTN_SHIPPING = Target.the("Button shipping").located(By.xpath("//*[@id='button-shipping-method']"));
    public static final Target BTN_TERMS = Target.the("Btn terms").located(By.xpath("//*[@id='collapse-payment-method']/div/div[3]/div/input[1]"));

    public static final Target BTN_CONTINUE2 = Target.the("Btn CONTI2").located(By.xpath("//*[@id='button-payment-method']"));

    public static final Target BTN_CONF = Target.the("Btn CONF").located(By.xpath("//*[@id='button-confirm']"));

    public static final Target btn_final = Target.the("Btn FINAL").located(By.xpath("//*[@id='content']/div/div/a"));


}
