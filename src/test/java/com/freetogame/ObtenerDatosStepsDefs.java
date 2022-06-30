package com.freetogame;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ObtenerDatosStepsDefs {

    @Steps
    ObtenerDatos obtenerDatos;

    @When("solicito el platform {string} , category {string}")
    public void solicitarParametros(String platform, String category){
        obtenerDatos.ObtenerGame(platform,category);
    }

    @Then("el código de respuesta es {int}")
    public void CodigoRespuesta(int statusCode){
        restAssuredThat(response -> response.statusCode(statusCode));
    }

}
