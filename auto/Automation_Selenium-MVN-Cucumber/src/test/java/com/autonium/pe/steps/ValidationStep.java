package com.autonium.pe.steps;

import com.autonium.pe.pages.ValidationPage;
import net.serenitybdd.annotations.Step;

public class ValidationStep extends ValidationPage {
    @Step("Validar visualizacion del modulo de productos")
    public Boolean titleIsVsible(){
        return lbl_product.isDisplayed();
    }
    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }
}
