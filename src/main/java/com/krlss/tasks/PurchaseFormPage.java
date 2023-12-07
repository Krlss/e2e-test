package com.krlss.tasks;

import com.krlss.userinterfaces.PurchasePageInterface;
import com.krlss.userinterfaces.ShopPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFormPage implements Task {

    public final String firstname;
    public final String lastname;
    public final String email;
    public final String telephone;
    public final String company;
    public final String address_1;
    public final String city;
    public final String postcode;
    public final String country;
    public final String region;

    public PurchaseFormPage(String firstname, String lastname, String email, String telephone, String company, String address_1, String city, String postcode, String country, String region) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.company = company;
        this.address_1 = address_1;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
        this.region = region;
    }

    public static Performable withData(String firstname, String lastname, String email, String telephone, String company, String address1, String city, String postcode, String countryId, String regionId) {
        return instrumented(PurchaseFormPage.class, firstname, lastname, email, telephone, company, address1, city, postcode, countryId, regionId);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PurchasePageInterface.INP_FIRST_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(firstname).into(PurchasePageInterface.INP_FIRST_NAME),

                WaitUntil.the(PurchasePageInterface.INP_LAST_NAME, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(lastname).into(PurchasePageInterface.INP_LAST_NAME),

                WaitUntil.the(PurchasePageInterface.INP_EMAIL, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(email).into(PurchasePageInterface.INP_EMAIL),

                WaitUntil.the(PurchasePageInterface.INP_PHONE, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(telephone).into(PurchasePageInterface.INP_PHONE),

                WaitUntil.the(PurchasePageInterface.INP_COMPANY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(company).into(PurchasePageInterface.INP_COMPANY),

                WaitUntil.the(PurchasePageInterface.INP_ADDRESS, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(address_1).into(PurchasePageInterface.INP_ADDRESS),

                WaitUntil.the(PurchasePageInterface.INP_CITY, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(city).into(PurchasePageInterface.INP_CITY),

                WaitUntil.the(PurchasePageInterface.INP_POST_CODE, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(postcode).into(PurchasePageInterface.INP_POST_CODE),

                Scroll.to(PurchasePageInterface.OPT_REGION),

                WaitUntil.the(PurchasePageInterface.INP_COUNTRY, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.INP_COUNTRY),

                WaitUntil.the(PurchasePageInterface.INP_REGION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.INP_REGION),

                WaitUntil.the(PurchasePageInterface.OPT_REGION, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.OPT_REGION),

                WaitUntil.the(PurchasePageInterface.BTN_CONTINUE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_CONTINUE),

                WaitUntil.the(PurchasePageInterface.BTN_SHIPPING, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_SHIPPING),

                WaitUntil.the(PurchasePageInterface.BTN_TERMS, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_TERMS),

                WaitUntil.the(PurchasePageInterface.BTN_CONTINUE2, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_CONTINUE2),

                WaitUntil.the(PurchasePageInterface.BTN_CONF, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.BTN_CONF),

                WaitUntil.the(PurchasePageInterface.btn_final, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(PurchasePageInterface.btn_final)

                );
    }

}
