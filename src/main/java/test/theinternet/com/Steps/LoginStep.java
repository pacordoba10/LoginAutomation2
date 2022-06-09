package test.theinternet.com.Steps;


import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import test.theinternet.com.PageObject.LoginPageObject;

public class LoginStep extends PageObject {

    LoginPageObject loginPageObject = new LoginPageObject();

    @Step
    public void ingresarPaginaLogin(){
        loginPageObject.open();
    }

    @Step
    public void ingresarUsuario(){
        loginPageObject.getDriver().findElement(loginPageObject.getTxtUsername()).sendKeys("tomsmith");
    }

    @Step
    public void ingresarContraseña(){
        loginPageObject.getDriver().findElement(loginPageObject.getTxtPassword()).sendKeys("SuperSecretPassword!");
    }

    @Step
    public void darClicEnLogin(){
        loginPageObject.getDriver().findElement(loginPageObject.getBtnLogin()).click();
    }

    @Step
    public void validarMensajeLogueoExitoso(){
        loginPageObject.getDriver().findElement(loginPageObject.getTxtLoggedInto()).equals("You logged into a secure area!");
    }
}
