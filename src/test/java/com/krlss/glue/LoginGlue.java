package com.krlss.glue;

import com.krlss.tasks.AddProductPage;
import com.krlss.tasks.OpenPage;
import com.krlss.tasks.PurchaseFormPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginGlue {

    private static final String ACTOR_NAME = "USer";

    @Before
    public void setTheStag() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) estoy en la pagina opencart$")
    public void login(String actor){
        theActorCalled(actor).attemptsTo(
                OpenPage.loadPage()
        );
    }

    @When("selecciono un producto del catalogo$")
    public void selectProduct(){
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                AddProductPage.addProductsToCart()
        );
    }

    @Then("agrego el producto al carrito$")
    public void addProduct(){

    }

    @And("veo el carrito$")
    public void viewCart(){

    }

    @When("^ingreso datos (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
    public void form(
            String firstname,
            String lastname,
            String email,
            String telephone,
            String company,
            String address_1,
            String city,
            String postcode,
            String country,
            String region
        ){

        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.withData(
                        firstname,
                        lastname,
                        email,
                        telephone,
                        company,
                        address_1,
                        city,
                        postcode,
                        country,
                        region
                )
        );

    }


    @Then("veo nuevo formulario")
    public void next(){

    }

}
