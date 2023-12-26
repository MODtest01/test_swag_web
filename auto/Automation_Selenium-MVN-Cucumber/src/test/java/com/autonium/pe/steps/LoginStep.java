package com.autonium.pe.steps;

import com.autonium.pe.pages.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginStep extends LoginPage {
    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }
    @Step("Ingresar Usuario")
    public void typeUser(String username){
        txt_username.sendKeys(username);
    }
    @Step("Click en el boton login")
    public void clickLogin(){
        btn_login.click();
    }
}
