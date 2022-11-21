$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/DemoBlaze.feature");
formatter.feature({
  "name": "Autentificación y compra de productos en Demo Blaze",
  "description": "",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@DemoBlaze"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validar el funcionamiento de la creacion de una cuenta por mensaje",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@DemoBlaze"
    },
    {
      "name": "@Escenario004_ExistingUserValidation"
    }
  ]
});
formatter.step({
  "name": "que el usuario ingresa a la pagina demoblaze en el navegador de \"\u003cBrowser\u003e\"",
  "keyword": "Dado "
});
formatter.step({
  "name": "el usuario hace click en el boton Singn up",
  "keyword": "Cuando "
});
formatter.step({
  "name": "digita el nombre del cliente \"\u003c$Username\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "digita la clave del cliente \"\u003c$Password\u003e\"",
  "keyword": "Y "
});
formatter.step({
  "name": "hace click en el boton Singn up",
  "keyword": "Y "
});
formatter.step({
  "name": "Valida la creacion de la cuenta mostrando un mensaje \"\u003cMessage\u003e\" Y hace click en Aceptar",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "Browser",
        "$Username",
        "$Password",
        "Message"
      ]
    },
    {
      "cells": [
        "chrome",
        "dasa15",
        "ror15",
        "This user already exist"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validar el funcionamiento de la creacion de una cuenta por mensaje",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@DemoBlaze"
    },
    {
      "name": "@DemoBlaze"
    },
    {
      "name": "@Escenario004_ExistingUserValidation"
    }
  ]
});
formatter.step({
  "name": "que el usuario ingresa a la pagina demoblaze en el navegador de \"chrome\"",
  "keyword": "Dado "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.queElUsuarioIngresaALaPaginaDemoblazeEnElNavegadorDe(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario hace click en el boton Singn up",
  "keyword": "Cuando "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.elUsuarioHaceClickEnElBotonSingnUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digita el nombre del cliente \"dasa15\"",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.digitaElNombreDelCliente(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digita la clave del cliente \"ror15\"",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.digitaLaClaveDelCliente(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hace click en el boton Singn up",
  "keyword": "Y "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.haceClickEnElBotonSingnUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valida la creacion de la cuenta mostrando un mensaje \"This user already exist\" Y hace click en Aceptar",
  "keyword": "Entonces "
});
formatter.match({
  "location": "DemoBlazeStepDefinition.validaLaCreacionDeLaCuentaMostrandoUnMensajeYHaceClickEnAceptar(String)"
});
formatter.result({
  "status": "passed"
});
});