package com.freetogame;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ObtenerDatos {

    private static String GET_GAME = "https://www.freetogame.com/api/games?";

    @Step("")
    public void ObtenerGame(String platform, String category){
        SerenityRest.given()
                .contentType("application/json")
                .get(GET_GAME+"platform="+platform+"&category="+category);
    }

}