# new feature
# Tags: optional
# language: es
@DemoLinio
Característica: Autenticacion Linio

  @DemoLinio @Escenario001_LoginSuccessful
  Esquema del escenario: Validar el ingreso exitoso a la web de Linio
    Dado que el usuario ingresa a la web Linio en el navegador de "<Navegador>"
    Cuando presiono la etiqueta Iniciar Sesion
    Y digito el correo electronico "<$Email>"
    Y digito la contraseña "<$Password>"
    Y observo que mi contraseña sea correcta
    Y presiono el boton Iniciar sesion segura
    Entonces valido el ingreso a la cuenta mostrando mi nombre de usuario "<Username>"
    Ejemplos:
      | Navegador | $Email                      | $Password | Username |
      | chrome    | samuelsalirrosas@gmail.com  | samuel05* | Samuel   |

  @DemoLinio @Escenario002_LoginWrongEmail
  Esquema del escenario: Validar el ingreso con usuario incorrecto a la web de Linio
    Dado que el usuario ingresa a la web Linio en el navegador de "<Navegador>"
    Cuando presiono la etiqueta Iniciar Sesion
    Y digito el correo electronico "<$Email>"
    Y digito la contraseña "<$Password>"
    Y presiono el boton Iniciar sesion segura
    Entonces valido la alerta de error "<Alert>"
    Y precioso el boton Cerrar
    Ejemplos:
      | Navegador | $Email                      | $Password | Alert
      | chrome    | samuelsalirrosas@gmail.con  | samuel05* | El correo electrónico o la contraseña son incorrectas. Vuelve a intentarlo.

  @DemoLinio @Escenario003_LoginWrongPassword
  Esquema del escenario: Validar el ingreso con usuario incorrecto a la web de Linio
    Dado que el usuario ingresa a la web Linio en el navegador de "<Navegador>"
    Cuando presiono la etiqueta Iniciar Sesion
    Y digito el correo electronico "<$Email>"
    Y digito la contraseña "<$Password>"
    Y presiono el boton Iniciar sesion segura
    Entonces valido la alerta de error "<Alert>"
    Y precioso el boton Cerrar

    Ejemplos:
      | Navegador | $Email                      | $Password | Alert
      | chrome    | samuelsalirrosas@gmail.com  | samuel05 | El correo electrónico o la contraseña son incorrectas. Vuelve a intentarlo.



