# Práctica de Automatización - SauceDemo

Este proyecto consiste en la automatización de pruebas para la web de pruebas **SauceDemo** utilizando **Selenium WebDriver**, **Java** y **JUnit 5**, aplicando el patrón de diseño **Page Object Model (POM)**.

---

## 🚀 Estructura del Proyecto

El proyecto está organizado siguiendo el patrón POM para separar la lógica de las páginas de la lógica de los tests:

* **`src/main/java/pages/`**: Contiene las clases que representan las páginas web.
    * `LoginPage`: Localizadores y métodos para el inicio de sesión.
    * `InventoryPage`: Localizadores y métodos para la gestión de productos y carrito.
* **`src/test/java/tests/`**: Contiene los casos de prueba automatizados.
    * `LoginTest`: Validaciones de acceso correcto e incorrecto.
    * `InventoryTest`: Validaciones de flujo de compra y carrito.

---

## 🛠️ Tecnologías Utilizadas

* **Java 17**: Lenguaje de programación.
* **Selenium WebDriver**: Herramienta para la automatización del navegador.
* **JUnit 5**: Framework para la ejecución de pruebas y aserciones.
* **Maven**: Gestor de dependencias (archivo `pom.xml`).

---

## 🧪 Pruebas Automatizadas (5 Tests)

1.  **loginCorrecto**: Verifica que un usuario válido puede acceder y es redirigido a la página de inventario.
2.  **loginIncorrecto**: Valida que aparece un mensaje de error al introducir credenciales erróneas.
3.  **anadirUnProductoAlCarrito**: Comprueba que el contador del carrito se actualiza a "1" al añadir un producto.
4.  **anadirDosProductosAlCarrito**: Comprueba que el contador del carrito se actualiza a "2" al añadir dos productos distintos.
5.  **botonCambiaTrasAnadirProducto**: Verifica que el texto del botón cambia de "Add to cart" a "Remove" al interactuar con un producto.

---

##  Reflexión Personal

Para ser honesto, al principio me agobié un poco. Me parecía que separar todo en tantas clases y carpetas era complicarse la vida sin necesidad, pero cuando tuve que añadir el cuarto y quinto test, me di cuenta de que el Page Object Model es una salvación. Tener la "libreta de direcciones" de la web en un lado y las pruebas en otro te quita un peso de encima enorme.

Lo más satisfactorio fue el momento de las aserciones. Ver que el test sale correcto, me dio mucha seguridad.He tenido probloemas con algún selector que se me resistía, pero ver todos los checks en verde al final hace que el esfuerzo valga la pena. Me quedo con que automatizar bien no es solo que el ratón se mueva solo, sino escribir un código que no sea un rompecabezas para el que venga detrás.


---
## Comprobación
<img width="353" height="105" alt="image" src="https://github.com/user-attachments/assets/7d71b8ee-c993-4cc4-9343-8af27c3fc356" />
<img width="350" height="76" alt="image" src="https://github.com/user-attachments/assets/74d71313-aa0e-4ee1-9b63-d27d71c8efd1" />


---
**Autor:** [Jose Luis Martin Blanco / jmb0049-code]
