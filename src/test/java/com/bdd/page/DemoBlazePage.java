package com.bdd.page;

import base.Browser;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Samuel Salirrosas
 * @version 1.0
 */
@DefaultUrl("https://www.demoblaze.com/index.html")
public class DemoBlazePage extends PageObject {

    @FindBy(xpath = "//a[text()='Sign up']")
    WebElement btonSignup;

    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement txtusername;

    @FindBy(xpath = "//input[@id='loginusername']")
    WebElement inputUserLogin;

    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement txtpassword;

    @FindBy(xpath = "//input[@id='loginpassword']")
    WebElement inputPasswordLogin;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    WebElement btncrear;

    @FindBy(xpath = "//a[@id='login2']")
    WebElement menuLogin;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement btnLogin;

    @FindBy(xpath = "//a[@id='nameofuser']")
    WebElement labelUsername;

    @FindBy(xpath = "//div[@id='tbodyid']/div/div/a/../div/h4/a")
    WebElement txtProduct;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    WebElement btnAddProduct;

    /**
     * El cliente va abrir el navegador Chrome e ingresar al dominio de la pagina web.
     * @param navegador en este caso estamos trabajando con Chrome.
     */
    public void queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(String navegador) {
        Browser.Start(this, navegador);
    }

    /**
     * El cliente va a dar clic en el botón Sign Up.
     * @throws Throwable tiempo de espera
     */
    public void elUsuarioHaceClickEnElBotonSingnUp() throws Throwable {
        Thread.sleep(1000);
        if (btonSignup.isEnabled()) {
            btonSignup.click();
        } else {
            System.out.println("No se encontro el elemento");
        }

    }

    public void ingresaElNombreDelUsuarioYLaClave(String name, String password) throws Throwable {
        Thread.sleep(2000);
        txtusername.sendKeys(name);
        txtpassword.sendKeys(password);
    }

    /**
     * El cliente va hacer clic en el botón Sign Up después de haber rellenado su usuario y contraseña
     * @throws Throwable
     */
    public void haceClickEnElBotonSingnUp() throws InterruptedException {
        Thread.sleep(3000);
        btncrear.click();
    }


    /**
     * Se mostrará un mensaje en forma de alerta cuando se valida que el usuario ya se encuentra registrado.
     * @param mensaje es el mensaje que se mostrará en la página web.
     * @throws Throwable tiempo de espera
     */
    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(String mensaje) throws InterruptedException {
        Thread.sleep(2000);
        Alert alert = this.getDriver().switchTo().alert();
        String alertMensaje = alert.getText().toLowerCase();
        try {
            if (alertMensaje.contains(mensaje.toLowerCase())) {
                alert.accept();
                Assert.assertTrue(true);
            } else {
                alert.accept();
                Assert.fail("El mensaje no es el esperado");
            }
        } catch (Exception e) {
            System.out.println("");
        }
        getDriver().close();
    }

    /**
     * Aquí vamos a validar si existe o no el cliente que ingresamos.
     */

    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar() {
        Alert alert = this.getDriver().switchTo().alert();
        String alertMensaje = alert.getText().toLowerCase();
        if (alertMensaje.contains("successful")) {
            alert.accept();
            Assert.assertTrue("validacion realizada", true);
        } else {
            alert.accept();
            Assert.fail("El usuario esta registrado y/o no se ingresaron los datos correctos");
        }
        getDriver().close();
    }

    /**
     * Aquí ingresamo nuestro usuario para iniciar sesión.
     * @param username Nombre del usuario.
     * @throws InterruptedException tiempo de espera
     */

    public void enterUser(String username) throws InterruptedException {
        Thread.sleep(2000);
        inputUserLogin.sendKeys(username);
    }

    /**
     * Aquí vamos a ingresar nuestra contraseña para iniciar sesión.
     * @param password contraseña
     * @throws InterruptedException tiempo de espera
     */
    public void enterPassword(String password) throws InterruptedException {
        Thread.sleep(2000);
        inputPasswordLogin.sendKeys(password);
    }

    /**
     * Aquí vamos a corroborar que hemos iniciado sesión porque podremos ver nuestro nombre de usuario.
     * @param username nombre de usuario logueado.
     * @return retorna en caso que no ingresa exitosamente.
     * @throws InterruptedException
     */
    public boolean validateUsername(String username) throws InterruptedException {
        Thread.sleep(2000);
        if(labelUsername.getText().equals(username)){
            return true;
        }
        return false;
    }

    /**
     * Aquí damos clic al menu Ingresar Sesión
     * @throws InterruptedException
     */
    public void pressMenuLogin() throws InterruptedException {
        Thread.sleep(3000);
        menuLogin.click();
    }

    /**
     * El cliente va hacer clic en el botón de Iniciar Sesión.
     * @throws InterruptedException tiempo de espera para ubicar al botón.
     */
    public void pressButtonLogin() throws InterruptedException {
        Thread.sleep(3000);
        btnLogin.click();
    }

    /**
     * Aquí validamos que el usuario es incorrecto y no se encuentra registrado.
     * @param message mensaje de alerta que indica que el usuario es incorrecto.
     * @throws InterruptedException
     */

    public void validateWrongUser(String message) throws InterruptedException {
        Thread.sleep(2000);
        Alert alert = this.getDriver().switchTo().alert();
        String alertMensaje = alert.getText().toLowerCase();
        try {
            if (alertMensaje.contains(message.toLowerCase())) {
                alert.accept();
                Assert.assertTrue(true);
            } else {
                alert.accept();
                Assert.fail("El mensaje no es el esperado");
            }
        } catch (Exception e) {
            System.out.println("");
        }
        getDriver().close();
    }

    /**
     * Aqui observamos en el mensaje que la contraseña es incorrecta.
     * @param message mensaje de alerta que indica que la contraseña es incorrecta.
     * @throws InterruptedException
     */
    public void validateWrongPassword(String message) throws InterruptedException {
        Thread.sleep(2000);
        Alert alert = this.getDriver().switchTo().alert();
        String alertMensaje = alert.getText().toLowerCase();
        try {
            if (alertMensaje.contains(message.toLowerCase())) {
                alert.accept();
                Assert.assertTrue(true);
            } else {
                alert.accept();
                Assert.fail("El mensaje no es el esperado");
            }
        } catch (Exception e) {
            System.out.println("");
        }
        getDriver().close();
    }

    /**
     * El cliente va a seleccionar un producto y darle clic.
     * @param product Este es el producto seleccionado
     * @throws InterruptedException tiempo de espera
     */
    public void chooseProduct(String product) throws InterruptedException {
        txtProduct.sendKeys(product);
    }

    /**
     * Presionamos el botón Add to Cart para agregar un producto a nuestra canasta.
     * @throws InterruptedException tiempo de espera
     */
    public void pressButtonAddCart() throws InterruptedException {
        Thread.sleep(2000);
        btnAddProduct.click();
    }

    /**
     * En este método vamos a agregar un producto a nuestra canasta.
     * @param message Aquí nos mostrará un mensaje de confirmación que el producto ha sido agregado con éxito.
     * @throws InterruptedException
     */
    public void validateProductAdd(String message) throws InterruptedException {
        Thread.sleep(2000);
        Alert alert = this.getDriver().switchTo().alert();
        String alertMensaje = alert.getText().toLowerCase();
        try {
            if (alertMensaje.contains(message.toLowerCase())) {
                alert.accept();
                Assert.assertTrue(true);
            } else {
                alert.accept();
                Assert.fail("El mensaje no es el esperado");
            }
        } catch (Exception e) {
            System.out.println("");
        }
        getDriver().close();
    }

    /**
     * Seleccionamos un producto que deseamos comprar.
     * @throws InterruptedException
     */
    public void clickProduct() throws InterruptedException {
        Thread.sleep(3000);
        txtProduct.click();

    }

    /**
     * Ingresamos la contraseña para corroborar que el usuario ya exista.
     * @param password contraseña
     * @throws InterruptedException tiempo de espera
     */

    public void inputPassClient(String password) throws InterruptedException {
        Thread.sleep(2000);
        txtpassword.sendKeys(password);
    }

    /**
     * Aquí ingresamos nuestro nombre de usuario para corroborar que el usuario ya exista o se encuentre registrado.
     * @param user nombre de usuario
     * @throws InterruptedException tiempo de espera
     */
    public void inputUserClient(String user) throws InterruptedException {
        Thread.sleep(2000);
        txtusername.sendKeys(user);
    }
}
