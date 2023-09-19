# Desarrollo y testeo de un chatbot informativo a alumnos de nuevo ingreso en la EPS de la Universidad de Alcalá
Repositorio del TFG de María Chantal

## Resumen
En este repositorio se encuentra tanto el código fuente que permite la ejecución de las pruebas automatizadas como
las clases .html y .css que dan forma a la web desarrollada para el proyecto

## Configuración de las herramientas necesarias 

- Consultar la memoria del proyecto en la carpeta src/main/web/docs para una explicación completa de la instalación de las herramientas y las dependencias

## Java
Las pruebas automatizadas se han desarrollado con Java17. Será necesario comprobar que las variables de usuario están configuradas de forma que acepten Java17 como lenguauje principal

## Maven 
Será necesario instalar la versión 3.9.2 de Maven a través este [enlace](https://maven.apache.org/download.cgi)

## Cucumber y Selenium
Para las pruebas automatizadas, se deberán instalar las dependencias de [Cucumber](https://mvnrepository.com/artifact/io.cucumber/cucumber-java) y de [Selenium Web Driver](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
en la clase pom.xml 

Para poder abrir el navegador de Google Chrome, en la carpeta /src/main/resources, se encuentra el driver de la última versión compatible de Google Chrome. 
En el caso de que este driver qudase obsoleto, sería necesario buscar la nueva versión compatible [en esta web](https://chromedriver.chromium.org/downloads)

### Escenarios Cucumber
Los escenarios de Cucumber se encuentran definidos en la carpeta src/main/test/java bajo el nombre de chatbot.feature. 
Estos escenarios definen una serie de pasos a seguir para llevar las pruebas a cabo, siguiendo un lenguaje natural para que el usuario 
pueda comprender de manera sencilla su funcionamiento

### Métodos Selenium 
Selenium Web Driver es la herramienta encargada de interpretar los escenarios creados en Cucumber y enlazarlos con el driver de Google Chrome
para así poder inspeccionar la página e interactuar con el chatbot y su entorno. 

Se diferencian dos clases para Selenium
- ChatbotPage: aquí se definirán los identificadores sacados del navegador para cada interacción. De esta forma y a través de métodos get, podrán ser llamados por la clase ChatbotDefs
- ChatbotDefs: aquí se programarán los métodos necesarios para abrir el driver, interactuar con el chatbot y comprobar que las respuestas son las esperadas. 

## Cómo lanzar las pruebas
En la clase chatbot.feature se encuentran los diversos escenarios programados para el proyecto. Para lanzar cada uno de estos
escenarios de forma individual, simplemente será necesario hacer click en la doble flecha verde al lado del nombre de cada
escenario para posteriormente pulsar en "Run scenario"

## Dónde se aloja el chatbot
La web SAP Conversational AI proporciona un scrip para insertar directamente en la clase donde configuremos la web
```
<script
    src="https://cdn.cai.tools.sap/webchat/webchat.js"
    channelId="63b1b2bb-9a9e-4501-b6b9-52938e02b23b"
    token="5e224a04be62627ce489b3100dbd73b3"
    id="cai-webchat">
</script>
```
Este script se puede encontrar en todas las clases .html definidas para este proyecto. 
