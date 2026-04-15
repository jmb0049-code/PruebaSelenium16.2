package test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginCorrecto() {
        loginPage.loginCompleto("standard_user", "secret_sauce");
        assertTrue(driver.getCurrentUrl().contains("inventory"), "La URL no es la correcta tras el login");
    }

    @Test
    public void loginIncorrecto() {
        loginPage.loginCompleto("usuario_falso", "clave_erronea");
        String error = loginPage.obtenerMensajeError();
        assertTrue(error.contains("Username and password do not match"), "El mensaje de error no es el esperado");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}