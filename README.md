# Proyecto de Prueba de Automatización de un E-Commerce

## Estructura del Proyecto
1. Page: Contiene localizadores y métodos relacionados con la página web.
2. Step: Contiene archivos para asociarlos con el page.
3. StepDefinition: Son archivos en el lenguaje de programación usado, donde Cucumber va a poder asociar qué acciones ejecutar asociadas a cada paso de cada criterio de aceptación definido en las distintas features.
4. Feature: Es el archivo de texto donde se escriben los criterios de aceptación en formato Gherkin.

## 1.1 Modo de Ejecución
<p>Ejecuta el siguiente comando para compilar el proyecto:</p>

````
mvn clean install verify -D cucumber.options="--tags @DemoBlaze"
````
## 1.2 Ruta de Reporte``
<p>En la siguiente ruta puedes encontrar el reporte de tus casos de pruebas, unas vez que hayas ejecutacdo el comando de compilación.</p>

````
/target/site/serenity/index.html
```` 

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8
