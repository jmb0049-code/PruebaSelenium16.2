package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By userInput = By.id("user-name");
    private By passInput = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMsg = By.cssSelector("h3[data-test='error']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void escribirUsuario(String usuario) {
        driver.findElement(userInput).sendKeys(usuario);
    }

    public void escribirPassword(String pass) {
        driver.findElement(passInput).sendKeys(pass);
    }

    public void pulsarLogin() {
        driver.findElement(loginBtn).click();
    }

    public void loginCompleto(String usuario, String pass) {
        escribirUsuario(usuario);
        escribirPassword(pass);
        pulsarLogin();
    }

    public String obtenerMensajeError() {
        return driver.findElement(errorMsg).getText();
    }
}