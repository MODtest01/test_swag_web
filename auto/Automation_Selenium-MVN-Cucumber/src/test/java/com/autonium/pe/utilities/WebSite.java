package com.autonium.pe.utilities;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.thucydides.core.pages.PageObject;

public class WebSite {
    @Steps(shared = true)
    PageObject swag;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
