package com.bdd.stepDefinition;

import com.bdd.step.DemoBlazeStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class DemoBlazeStepDefinition {

    @Steps
    DemoBlazeStep demoBlazeStep;

    @Dado("^que el usuario ingresa a la pagina demoblaze en el navegador de \"([^\"]*)\"$")
    public void queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(String navegador) throws Throwable {
        demoBlazeStep.queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(navegador);
    }

    @Cuando("^el usuario hace click en el boton Singn up$")
    public void elUsuarioHaceClickEnElBotonSingnUp() throws Throwable {
        demoBlazeStep.elUsuarioHaceClickEnElBotonSingnUp();
    }

     @Y("^hace click en el boton Singn up$")
    public void haceClickEnElBotonSingnUp() throws Throwable {
        demoBlazeStep.haceClickEnElBotonSingnUp();
    }

    @Entonces("^Valida la creacion de la cuenta mostrando un mensaje \"([^\"]*)\" Y hace click en Aceptar$")
    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(String mensaje) throws Throwable {
        demoBlazeStep.validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(mensaje);
    }

    @Entonces("^Valida la creacion de la cuenta mostrando un mensaje y hace click en Aceptar$")
    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar() {
        demoBlazeStep.validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar();
    }

    @Cuando("^el usuario hace click en el boton Log in$")
    public void elUsuarioHaceClickEnElBotonLogIn() throws InterruptedException {
        demoBlazeStep.pressButtonLogin();
    }

    @Y("^digita el nombre del usuario \"([^\"]*)\"$")
    public void digitaElNombreDelUsuario(String username) throws Throwable {
        demoBlazeStep.enterUser(username);
    }

    @Y("^digita la clave \"([^\"]*)\"$")
    public void digitaLaClave(String password) throws Throwable {
        demoBlazeStep.enterPassword(password);
    }

    @Y("^presiona en el boton Log in$")
    public void presionaEnElBotonLogIn() throws InterruptedException {
        demoBlazeStep.pressButtonLogin();
    }

    @Cuando("^el usuario hace click en el menu Log in$")
    public void elUsuarioHaceClickEnElMenuLogIn() throws InterruptedException {
        demoBlazeStep.pressMenuLogin();
    }

    @Entonces("^valido la creacion de la cuenta mostrando la etiqueta del \"([^\"]*)\"$")
    public void validoLaCreacionDeLaCuentaMostrandoLaEtiquetaDel(String username) throws Throwable {
        demoBlazeStep.validateUsername(username);
    }

    @Entonces("^valido que el usuario esta errado con un mensaje \"([^\"]*)\"$")
    public void validoQueElUsuarioEstaErradoConUnMensaje(String message) throws Throwable {
        demoBlazeStep.validateWrongUser(message);
    }

    @Entonces("^valido que la contraseña esta errada con un mensaje \"([^\"]*)\"$")
    public void validoQueLaContraseñaEstaErradaConUnMensaje(String message) throws Throwable {
        demoBlazeStep.validateWrongPassword(message);
    }

    @Y("^presiona el boton Add to cart$")
    public void presionaElBotonAddToCart() throws InterruptedException {
        demoBlazeStep.pressButtonAddCart();
    }

    @Entonces("^valido que el producto se agrego mostrando el \"([^\"]*)\" y hace click en Aceptar$")
    public void validoQueElProductoSeAgregoMostrandoElYHaceClickEnAceptar(String message) throws Throwable {
        demoBlazeStep.validateProductAdd(message);
    }

    @Y("^hace click en el producto$")
    public void haceClickEnElProducto() throws InterruptedException {
        demoBlazeStep.clickProduct();
    }

    @Y("^digita la clave del cliente \"([^\"]*)\"$")
    public void digitaLaClaveDelCliente(String password) throws Throwable {
        demoBlazeStep.inputPassClient(password);
    }

    @Y("^digita el nombre del cliente \"([^\"]*)\"$")
    public void digitaElNombreDelCliente(String user) throws Throwable {
        demoBlazeStep.inputUserClient(user);
    }
}

