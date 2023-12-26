package com.autonium.pe.definitions;

import com.autonium.pe.steps.LoginStep;
import com.autonium.pe.steps.ValidationStep;
import com.autonium.pe.utilities.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

public class LoginDefinitionStep {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @Steps(shared = true)
    ValidationStep validation;

    @When("ingresa con credenciales validas")
    public void userLoginWithValidCredentials() {
        login.typeUser("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }

    @Then("la aplicacion debera mostrar el modulo principal de productos")
    public void systemShowProductModule() {
        Assert.assertTrue(validation.titleIsVsible());
    }

    @When("ingresa con credenciales invalidas")
    public void userLoginWithInvalidCredentials() {
        login.typeUser("standard_user");
        login.typePassword("secret-sauce");
        login.clickLogin();
    }

    @Then("la aplicacion debera mostrar un mensaje de error")
    public void systemShowErrorMessage() {
        Assert.assertTrue(validation.errorMessageIsDisplayed());
    }
}
