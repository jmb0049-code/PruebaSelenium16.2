package test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.InventoryPage;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {
    private WebDriver driver;
    private InventoryPage inventoryPage;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        LoginPage login = new LoginPage(driver);
        login.loginCompleto("standard_user", "secret_sauce");
        inventoryPage = new InventoryPage(driver);
    }

    @Test
    public void anadirUnProductoAlCarrito() {
        inventoryPage.añadirProducto("Sauce Labs Backpack");
        assertEquals("1", inventoryPage.obtenerContadorCarrito());
    }

    @Test
    public void anadirDosProductosAlCarrito() {
        inventoryPage.añadirProducto("Sauce Labs Backpack");
        inventoryPage.añadirProducto("Sauce Labs Bike Light");
        assertEquals("2", inventoryPage.obtenerContadorCarrito());
    }

    @Test
    public void botonCambiaTrasAnadirProducto() {
        String producto = "Sauce Labs Backpack";
        inventoryPage.añadirProducto(producto);
        assertEquals("Remove", inventoryPage.obtenerTextoBoton(producto));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}