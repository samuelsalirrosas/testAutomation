package com.bdd.stepDefinition;

import com.bdd.step.LoginStep;
import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {
    @Steps
    LoginStep loginStep;

    @Dado("^que el usuario ingresa a la web Linio en el navegador de \"([^\"]*)\"$")
    public void queElUsuarioIngresaALaWebLinioEnElNavegadorDe(String browser) throws Throwable {
        loginStep.openWebSite(browser);
    }

    @Cuando("^presiono la etiqueta Iniciar Sesion$")
    public void presionoLaEtiquetaIniciarSesion() throws InterruptedException {
        loginStep.pressLogin();
    }

    @Y("^digito el correo electronico \"([^\"]*)\"$")
    public void digitoElCorreoElectronico(String email) throws Throwable {
        loginStep.typeEmail(email);
    }

    @Y("^digito la contraseña \"([^\"]*)\"$")
    public void digitoLaContraseña(String password) throws Throwable {
        loginStep.typePassword(password);
    }

    @Y("^presiono el boton Iniciar sesion segura$")
    public void presionoElBotonIniciarSesionSegura() throws InterruptedException {
        loginStep.pressButtonLogin();
    }

    @Entonces("^valido el ingreso a la cuenta mostrando mi nombre de usuario \"([^\"]*)\"$")
    public void validoElIngresoALaCuentaMostrandoMiNombreDeUsuario(String username) throws Throwable {
        loginStep.validateUsername(username);
    }

    @Y("^observo que mi contraseña sea correcta$")
    public void observoQueMiContraseñaSeaCorrecta() throws InterruptedException {
        loginStep.showPassword();
    }

    @Entonces("^valido la alerta de error \"([^\"]*)\"$")
    public void validoLaAlertaDeError(String alert) throws Throwable {
        loginStep.validateAlertError(alert);
    }

    @Y("^precioso el boton Cerrar$")
    public void preciosoElBotonCerrar() throws InterruptedException {
        loginStep.pressButtonClose();
    }
}
