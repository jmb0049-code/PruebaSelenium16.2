package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;

    // Locators genéricos y específicos
    private By cartBadge = By.className("shopping_cart_badge");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void añadirProducto(String nombreProducto) {
        // Formateamos el ID basándonos en cómo SauceDemo nombra sus botones
        String idBoton = "add-to-cart-" + nombreProducto.toLowerCase().replace(" ", "-");
        driver.findElement(By.id(idBoton)).click();
    }

    public String obtenerTextoBoton(String nombreProducto) {
        String idBoton = "remove-" + nombreProducto.toLowerCase().replace(" ", "-");
        return driver.findElement(By.id(idBoton)).getText();
    }

    public String obtenerContadorCarrito() {
        return driver.findElement(cartBadge).getText();
    }

    public String obtenerUrl() {
        return driver.getCurrentUrl();
    }
}
