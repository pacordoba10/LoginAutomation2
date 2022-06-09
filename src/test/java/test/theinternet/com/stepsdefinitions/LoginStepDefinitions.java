package test.theinternet.com.stepsdefinitions;

import cucumber.api.java.en.*;
import test.theinternet.com.Steps.LoginStep;


public class LoginStepDefinitions {

    LoginStep loginStep;

    @Given("^El usuario ingresa a la pagina the internet$")
    public void elUsuarioIngresaALaPaginaTheInternet() {
            loginStep.ingresarPaginaLogin();

    }


    @When("^el usuario ingresa usuario y clave$")
    public void elUsuarioIngresaUsuarioYClave() {
        loginStep.ingresarUsuario();
        loginStep.ingresarContraseña();
        loginStep.darClicEnLogin();

    }

    @Then("^el usuario se ingresa al portal correctamente$")
    public void elUsuarioSeIngresaAlPortalCorrectamente() {
        loginStep.validarMensajeLogueoExitoso();


    }
}
