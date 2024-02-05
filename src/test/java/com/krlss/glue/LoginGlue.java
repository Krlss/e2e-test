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

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;


public class LoginGlue {

    private static final String ACTOR_NAME = "USer";
    private Map<String, String> formData;


    @Before
    public void setTheStag() throws IOException {
        OnStage.setTheStage(new OnlineCast());
        loadFormData("src/test/resources/testDataResources/dataset1.json");
    }

    private void loadFormData(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        formData = objectMapper.readValue(new File(filePath), new TypeReference<Map<String, String>>() {});
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

    //@When("^ingreso datos (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
//    public void form(
//            String firstname,
//            String lastname,
//            String email,
//            String telephone,
//            String company,
//            String address_1,
//            String city,
//            String postcode,
//            String country,
//            String region
//        ){
//
//        theActorInTheSpotlight().attemptsTo(
//                PurchaseFormPage.withData(
//                        firstname,
//                        lastname,
//                        email,
//                        telephone,
//                        company,
//                        address_1,
//                        city,
//                        postcode,
//                        country,
//                        region
//                )
//        );
//
//    }


    @When("^ingreso datos desde el archivo named \"([^\"]*)\"$")
    public void formFromJson(String filePath){
        theActorInTheSpotlight().attemptsTo(
                PurchaseFormPage.withData(
                        formData.get("firstname"),
                        formData.get("lastname"),
                        formData.get("email"),
                        formData.get("telephone"),
                        formData.get("company"),
                        formData.get("address_1"),
                        formData.get("city"),
                        formData.get("postcode"),
                        formData.get("country"),
                        formData.get("region")
                )
        );
    }


    @Then("veo nuevo formulario")
    public void next(){

    }

}
