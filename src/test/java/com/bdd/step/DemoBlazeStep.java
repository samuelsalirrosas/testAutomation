package com.bdd.step;

import com.bdd.page.DemoBlazePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * @author
 */
public class DemoBlazeStep extends ScenarioSteps {
    DemoBlazePage demoBlazePage;

    @Step
    public void queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(String navegador) {
        demoBlazePage.queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(navegador);
    }

    @Step
    public void elUsuarioHaceClickEnElBotonSingnUp() throws Throwable {
        demoBlazePage.elUsuarioHaceClickEnElBotonSingnUp();
    }

    @Step
    public void ingresaElNombreDelUsuarioYLaClave(String name, String password) throws Throwable {
        demoBlazePage.ingresaElNombreDelUsuarioYLaClave(name, password);
    }

    @Step
    public void haceClickEnElBotonSingnUp() throws Throwable {
        demoBlazePage.haceClickEnElBotonSingnUp();
    }

    @Step
    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(String mensaje) throws InterruptedException {
        demoBlazePage.validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(mensaje);

    }

    @Step
    public void validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar() {
        demoBlazePage.validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar();
    }
    @Step
    public void pressButtonLogin() throws InterruptedException {
        demoBlazePage.pressButtonLogin();
    }
    @Step
    public void enterUser(String username) throws InterruptedException {
        demoBlazePage.enterUser(username);
    }
    @Step
    public void enterPassword(String password) throws InterruptedException {
        demoBlazePage.enterPassword(password);
    }
    @Step
    public void validateUsername(String username) throws InterruptedException {
        demoBlazePage.validateUsername(username);
    }
    @Step
    public void pressMenuLogin() throws InterruptedException {
        demoBlazePage.pressMenuLogin();
    }
    @Step
    public void validateWrongUser(String message) throws InterruptedException {
        demoBlazePage.validateWrongUser(message);
    }
    @Step
    public void validateWrongPassword(String message) throws InterruptedException {
        demoBlazePage.validateWrongPassword(message);
    }

    public void chooseProduct(String product) throws InterruptedException {
        demoBlazePage.chooseProduct(product);
    }

    public void pressButtonAddCart() throws InterruptedException {
        demoBlazePage.pressButtonAddCart();
    }

    public void validateProductAdd(String message) throws InterruptedException {
        demoBlazePage.validateProductAdd(message);
    }

    public void clickProduct() throws InterruptedException {
        demoBlazePage.clickProduct();
    }

    public void inputPassClient(String password) throws InterruptedException {
        demoBlazePage.inputPassClient(password);
    }

    public void inputUserClient(String user) throws InterruptedException {
        demoBlazePage.inputUserClient(user);
    }
}
