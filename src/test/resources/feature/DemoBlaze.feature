# new feature
# Tags: optional
# language: es
@DemoBlaze
Característica: Autentificación y compra de productos en Demo Blaze

    @DemoBlaze @Escenario001_LoginBlazeSuccessful
    Esquema del escenario: Validar el ingreso con usuario y contraseña correcta a la web de Demo Blaze
    Dado que el usuario ingresa a la pagina demoblaze en el navegador de "<Browser>"
    Cuando el usuario hace click en el menu Log in
    Y digita el nombre del usuario "<$Username>"
    Y digita la clave "<$Password>"
    Y presiona en el boton Log in
    Entonces valido la creacion de la cuenta mostrando la etiqueta del "<Username>"
    Ejemplos:
        | Browser | $Username   | $Password | Username            |
        | chrome  | MayailaZJ33 | ror15     | Welcome MayailaZJ33 |

    @DemoBlaze @Escenario002_LoginBlazeWrongUser
    Esquema del escenario: Validar el ingreso con usuario incorrecto a la web de Demo Blaze
    Dado que el usuario ingresa a la pagina demoblaze en el navegador de "<Browser>"
    Cuando el usuario hace click en el menu Log in
    Y digita el nombre del usuario "<$Username>"
    Y digita la clave "<$Password>"
    Y presiona en el boton Log in
    Entonces valido que el usuario esta errado con un mensaje "<Message>"
    Ejemplos:
        | Browser | $Username  | $Password | Message              |
        | chrome  | MayailaZJ3 | ror15     | User does not exist. |

    @DemoBlaze @Escenario003_LoginBlazeWrongPassword
    Esquema del escenario: Validar el ingreso con contraseña incorrecta a la web de Demo Blaze
    Dado que el usuario ingresa a la pagina demoblaze en el navegador de "<Browser>"
    Cuando el usuario hace click en el menu Log in
    Y digita el nombre del usuario "<$Username>"
    Y digita la clave "<$Password>"
    Y presiona en el boton Log in
    Entonces valido que la contraseña esta errada con un mensaje "<Message>"
    Ejemplos:
        | Browser | $Username  | $Password | Message           |
        | chrome  | MayailaZJ33 | ror156     | Wrong password. |


    @DemoBlaze @Escenario004_ExistingUserValidation
    Esquema del escenario: Validar el funcionamiento de la creacion de una cuenta por mensaje
    Dado que el usuario ingresa a la pagina demoblaze en el navegador de "<Browser>"
    Cuando el usuario hace click en el boton Singn up
    Y digita el nombre del cliente "<$Username>"
    Y digita la clave del cliente "<$Password>"
    Y hace click en el boton Singn up
    Entonces Valida la creacion de la cuenta mostrando un mensaje "<Message>" Y hace click en Aceptar
    Ejemplos:
        | Browser | $Username   | $Password | Message                 |
        | chrome  | dasa15      | ror15     | This user already exist |

    @DemoBlaze @Escenario005_SuccessfulPurchase
    Esquema del escenario: Validar una compra exitosa
    Dado que el usuario ingresa a la pagina demoblaze en el navegador de "<Browser>"
    Cuando hace click en el producto
    Y presiona el boton Add to cart
    Entonces valido que el producto se agrego mostrando el "<Message>" y hace click en Aceptar
    Ejemplos:
        | Browser | Message       |
        | chrome  | Product added |


