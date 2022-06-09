package test.theinternet.com.PageObject;

import org.openqa.selenium.By;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://the-internet.herokuapp.com/login")

public class LoginPageObject extends PageObject {

    By txtUsername = By.xpath("//*[@id=\"username\"]");
    By txtPassword = By.xpath("//*[@id=\"password\"]");
    By btnLogin = By.xpath("//*[@id=\"login\"]/button/i");

    By txtLoggedInto = By.xpath("//*[@id=\"flash\"]");

    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getTxtLoggedInto() {
        return txtLoggedInto;
    }
}
