package stepdefs;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ChatbotPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ChatbotDefs {

    private ChromeDriver driver;

    private ChatbotPage chp;

    /* METODOS LLAMADAS DE MENSAJES */

    public WebElement getMessage(int i) {
        WebElement message = driver.findElement(By.xpath("//*[@id=\"cai-webchat-div\"]/div/div[2]/div[2]/div[1]/div/div["+i+"]/div/div"));
        return message;
    }
    public WebElement getSingleMessage(int i) {
        WebElement message = driver.findElement(By.xpath("//*[@id=\"cai-webchat-div\"]/div/div[2]/div[2]/div[1]/div/div["+i+"]/div/div/div/div"));
        return message;
    }

    public WebElement getButton(int i, int j){
        WebElement button = driver.findElement(By.xpath("//*[@id=\"cai-webchat-div\"]/div/div[2]/div[2]/div[1]/div/div["+i+"]/div/div/div/div["+j+"]"));
        return button;
    }

    public WebElement getLinkMessage(int i, int j) {
        WebElement message = driver.findElement(By.xpath("//*[@id=\"cai-webchat-div\"]/div/div[2]/div[2]/div[1]/div/div["+i+"]/div/div/div/a["+j+"]"));
        return message;
    }

    public WebElement getSingleLinkMessage(int i) {
        WebElement message = driver.findElement(By.xpath("//*[@id=\"cai-webchat-div\"]/div/div[2]/div[2]/div[1]/div/div["+i+"]/div/div/div/a"));
        return message;
    }
    public void waitMethod() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    /*
     *** BACKGROUND ***
    */
    @Given("^I am in the main page$")
    public void mainpage() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Usuario\\Desktop\\TFG\\tfg\\src\\main\\resources\\drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("http://www.mariachantaltfg.es/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.chp = new ChatbotPage();
    }

    @Then("^I click on the bot$")
    public void clickonbot() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(chp.getBotonBot()).click();
    }


    @When("^I say hola to the chatbot$")
    public void iSayHi(){
        driver.findElement(chp.getEscribir()).click();
        driver.findElement(chp.getEscribir()).sendKeys("Hola");
        driver.findElement(chp.getEnter()).click();
    }

    @Then("^the bot gives me a welcome greeting$")
    public void welcomeGreeting(){
        driver.findElement(chp.getMensaje()).toString().substring(0, 31)
                .equals(("¡Bienvenid@! Esto es un chatbot"));
    }






    /*
    ******* SELECCION ESCRITA *******
    */
    @Then("^I write ([^\"]*)$")
    public void queOfrece(String sel){
        waitMethod();
        driver.findElement(chp.getEscribir()).click();
        switch (sel) {
            case "que ofrece":
                driver.findElement(chp.getEscribir()).sendKeys("quiero saber que ofrece la eps");
                driver.findElement(chp.getEnter()).click();
                break;
            case "masters":
                driver.findElement(chp.getEscribir()).sendKeys("por favor dime el listado de masters");
                driver.findElement(chp.getEnter()).click();
                break;
            case "doctorados":
                driver.findElement(chp.getEscribir()).sendKeys("quiero cursar un doctorado");
                driver.findElement(chp.getEnter()).click();
                break;
            case "TUI":
                driver.findElement(chp.getEscribir()).sendKeys("necesito una tarjeta para entrar a la universidad");
                driver.findElement(chp.getEnter()).click();
                break;
            case "cursos cero":
                driver.findElement(chp.getEscribir()).sendKeys("Hay algun curso de introduccion?");
                driver.findElement(chp.getEnter()).click();
                break;
            case "departamentos":
                driver.findElement(chp.getEscribir()).sendKeys("departamento de ciencias de la computacion");
                driver.findElement(chp.getEnter()).click();
                break;
            case "fechas examenes":
                driver.findElement(chp.getEscribir()).sendKeys("Mostrar calendario de examenes");
                driver.findElement(chp.getEnter()).click();
                break;
            case "erasmus":
                driver.findElement(chp.getEscribir()).sendKeys("me puedes decir el listado de paises de erasmus");
                driver.findElement(chp.getEnter()).click();
                break;
            case "delegacion":
                driver.findElement(chp.getEscribir()).sendKeys("quiero saber quien representa a los estudiantes");
                driver.findElement(chp.getEnter()).click();
                break;
            case "becas":
                driver.findElement(chp.getEscribir()).sendKeys("que becas hay disponibles");
                driver.findElement(chp.getEnter()).click();
                break;
            case "cafeteria":
                driver.findElement(chp.getEscribir()).sendKeys("donde esta la cafeteria");
                driver.findElement(chp.getEnter()).click();
                break;
            case "reprografia":
                driver.findElement(chp.getEscribir()).sendKeys("donde puedo imprimir");
                driver.findElement(chp.getEnter()).click();
                break;
            case "matricula":
                driver.findElement(chp.getEscribir()).sendKeys("me podrias decir como se hace la matricula");
                driver.findElement(chp.getEnter()).click();
                break;
            case "cambio de grupo grande":
                driver.findElement(chp.getEscribir()).sendKeys("como puedo cambiarme de grupo");
                driver.findElement(chp.getEnter()).click();
                break;
            case "wifi":
                driver.findElement(chp.getEscribir()).sendKeys("por favor dime como conectarme al wifi");
                driver.findElement(chp.getEnter()).click();
                break;
            case "donde esta":
                driver.findElement(chp.getEscribir()).sendKeys("quiero saber como ir a la universidad");
                driver.findElement(chp.getEnter()).click();
                break;
            case "laboratorios":
                driver.findElement(chp.getEscribir()).sendKeys("¿Donde estan las clases de laboratorio?");
                driver.findElement(chp.getEnter()).click();
                break;
        }

    }

    @And("^I receive the ([^\"]*) response$")
    public void queOfreceAnswer(String sel) throws InterruptedException {

        switch (sel) {
            case "que ofrece":
                driver.findElement(chp.getMensaje()).toString().substring(0, 33).equals("En la Escuela Politécnica Superior");
                break;
            case "masters":
                driver.findElement(chp.getMensaje()).equals("La Escuela Politécnica Superior ofrece una gran diversidad de másters para cursar");
                break;
            case "doctorados":
                driver.findElement(chp.getMensaje()).equals("La Escuela Politécnica Superior ofrece las siguientes opciones de doctorados ");
                break;
            case "TUI":
                driver.findElement(chp.getMensaje()).toString().substring(0, 74).equals("¿Qué es lo primero que tienes que hacer al matricularte en la Universidad?");
                break;
            case "cursos cero":
                driver.findElement(chp.getMensaje()).toString().substring(0, 45).equals("Para poder tomar los cursos cero de iniciación");
                break;
            case "departamentos":
                driver.findElement(chp.getMensaje()).toString().substring(0, 37).equals("Los departamentos son las agrupaciones");
                break;
            case "fechas examenes":
                driver.findElement(chp.getMensaje()).toString().substring(0, 64).equals("En el siguiente enlace podrás encontrar el calendario de exámenes");
                break;
            case "erasmus":
                driver.findElement(chp.getMensaje()).toString().substring(0, 86).equals("Aquí podrás encontrar toda la información necesaria sobre los programas internacionales");
                break;
            case "delegacion":
                driver.findElement(chp.getMensaje()).toString().substring(0, 63).equals("La delegación de estudiantes es el lugar al que debes ir cuando");
                break;
            case "becas":
                driver.findElement(chp.getMensaje()).toString().substring(0, 73).equals("Aquí encontrarás toda la información necesaria sobre las becas disponibles");
                break;
            case "cafeteria":
                driver.findElement(chp.getMensaje()).toString().substring(0, 46).equals("La cafetería de la Escuela Politécnica Superior");
                break;
            case "reprografia":
                driver.findElement(chp.getMensaje()).toString().substring(0, 85).equals("Actualmente, la Escuela Politécnica Superior no cuenta con un servicio de reprografía.");
                break;
            case "matricula":
                driver.findElement(chp.getMensaje()).toString().substring(0, 56).equals("Hacer la matrícula puede ser un proceso bastante complejo");
                break;
            case "cambio de grupo grande":
                driver.findElement(chp.getMensaje()).toString().substring(0, 30).equals("El objeto de este procedimiento");
                break;
            case "wifi":
                driver.findElement(chp.getMensaje()).toString().substring(0, 43).equals("El WiFi de la Universidad se llama \"Eduroam\"");
                break;
            case "donde esta":
                driver.findElement(chp.getMensaje()).toString().substring(0, 59).equals("La Escuela Politécnica Superior se encuentra en la carretera");
                break;
            case "laboratorios":
                driver.findElement(chp.getMensaje()).toString().substring(0, 64).equals("Los laboratorios son las aulas donde realizarás la parte práctica");
                break;
        }
        Thread.sleep(1500);
        driver.close();
    }

    /*
     ******* PREGUNTAS FRECUENTES *******
     */
    @Then("^I click on the preguntas frecuentes button$")
    public void preguntasFrecuentes() {
        getButton(3,1).click();
   }


    @And("^I search until I find my destiny in ([^\"]*)$")
    public void findingPreguntasFrecuentes(String sel) throws InterruptedException {
        switch (sel) {
            case "informacion general":
                getButton(5,1).click();
                waitMethod();
                getButton(7, 3).click();
                waitMethod();
                getButton(9,1).click();
                waitMethod();
                getButton(11,1).click();
                waitMethod();
                getSingleLinkMessage(13).click();
                break;
            case "normativa":
                getButton(5,1).click();
                waitMethod();
                getButton(7, 3).click();
                waitMethod();
                getButton(9,3).click();
                waitMethod();
                getButton(11,1).click();
                waitMethod();
                getSingleLinkMessage(13).click();
                break;
            case "correo electronico":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 1).click();
                waitMethod();
                getButton(9,1).click();
                waitMethod();
                getLinkMessage(11,2).click();
                break;
            case "cuenta usuario":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 1).click();
                waitMethod();
                getButton(9,1).click();
                waitMethod();
                getSingleMessage(11).click();
                waitMethod();
                getLinkMessage(13,1).click();
                break;
            case "curso cero ADE":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 1).click();
                waitMethod();
                getButton(9,2).click();
                waitMethod();
                getButton(11,2).click();
                waitMethod();
                getLinkMessage(13,1).click();
                break;
            case "panorama universitario":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 1).click();
                waitMethod();
                getButton(9,3).click();
                waitMethod();
                getButton(11,1).click();
                waitMethod();
                getSingleLinkMessage(13).click();
                break;
            case "asignaturas":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 1).click();
                waitMethod();
                getButton(9,3).click();
                waitMethod();
                getButton(11,2).click();
                waitMethod();
                getLinkMessage(13, 1).click();
                break;
            case "horario":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 1).click();
                waitMethod();
                getButton(9,3).click();
                waitMethod();
                getButton(11,2).click();
                waitMethod();
                getLinkMessage(13, 2).click();
                break;
            case "practicas":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 2).click();
                waitMethod();
                getButton(9,1).click();
                waitMethod();
                getLinkMessage(11, 1).click();
                break;
            case "tfg":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 2).click();
                waitMethod();
                getButton(9,3).click();
                waitMethod();
                getButton(11,3).click();
                waitMethod();
                getButton(13,1).click();
                waitMethod();
                getSingleLinkMessage(15).click();
                break;
            case "grupos investigacion":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 2).click();
                waitMethod();
                getButton(9,3).click();
                waitMethod();
                getButton(11,3).click();
                waitMethod();
                getButton(13,3).click();
                waitMethod();
                getButton(15,2).click();
                waitMethod();
                getLinkMessage(17,1).click();
                break;
            case "biblioteca":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 3).click();
                waitMethod();
                getButton(9,1).click();
                waitMethod();
                getSingleLinkMessage(11).click();
                break;
        }

    }

    @Then("^I go to the ([^\"]*) web$")
    public void websPreguntasFrecuentes(String sel) throws InterruptedException {
        waitMethod();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() -1));
        Thread.sleep(1500);
        switch (sel) {
            case "informacion general":
                driver.findElement(chp.getEstudiosInformatica()).equals("Estudios de Informática");
                break;
            case "normativa":
                driver.findElement(chp.getNormativa()).equals("NORMATIVA");
                break;
            case "correo electronico":
                driver.findElement(chp.getCorreoElectronico()).equals("Correo electrónico");
                break;
            case "cuenta usuario":
                driver.findElement(chp.getCuentaUsuario()).equals("Cuentas y contraseñas de usuario");
                break;
            case "curso cero ADE":
                break;
            case "panorama universitario":
                driver.findElement(chp.getPanoramaUniversitario()).equals("Escuela Politécnica Superior de la Universidad de Alcalá");
                break;
            case "asignaturas":
                driver.findElement(chp.getAsignaturas()).equals("Asignaturas");
                break;
            case "horario":
                driver.findElement(chp.getHorarios()).equals("Horarios");
                break;
            case "practicas":
                driver.findElement(chp.getPracticas()).equals("Prácticas externas");
                break;
            case "tfg":
                driver.findElement(chp.getTfg()).equals("Trabajo fin de grado");
                break;
            case "grupos investigacion":
                driver.findElement(chp.getGruposInvestigacion()).equals("Grupos de investigación");
                break;
            case "biblioteca":
                driver.findElement(chp.getBiblioteca()).equals("Conoce la Biblioteca");
                break;
        }
        driver.close();
        waitMethod();
        driver.switchTo().window(tabs.get(0));
        driver.close();
    }

    /*
     ******* TRAMITES ADMINISTRATIVOS *******
    */
    @Then("^I click on the tramites administrativos button$")
    public void tramitesAdministrativos() {
        getButton(3,2).click();
    }

    @And("^I search until I find my destiny for tramites in ([^\"]*)$")
    public void findingTramites(String sel) {
        switch (sel) {
            case "calendario academico":
                getButton(5,2).click();
                waitMethod();
                getLinkMessage(7, 1).click();
                break;
            case "solicitudes":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 3).click();
                waitMethod();
                getButton(9,1).click();
                waitMethod();
                getButton(11,1).click();
                waitMethod();
                getSingleLinkMessage(13).click();
                break;
            case "evau":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 3).click();
                waitMethod();
                getButton(9,2).click();
                waitMethod();
                getButton(11,1).click();
                waitMethod();
                getSingleLinkMessage(13).click();
                break;
            case "mas25":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 3).click();
                waitMethod();
                getButton(9,2).click();
                waitMethod();
                getButton(11,2).click();
                waitMethod();
                getSingleLinkMessage(13).click();
                break;
            case "mas40":
                getButton(5,3).click();
                waitMethod();
                getButton(7, 3).click();
                waitMethod();
                getButton(9,2).click();
                waitMethod();
                getButton(11,3).click();
                waitMethod();
                getButton(13,1).click();
                waitMethod();
                getSingleLinkMessage(15).click();
                break;
        }

    }

    @Then("^I go to the ([^\"]*) web for tramites$")
    public void webTramites(String sel) throws InterruptedException {
        waitMethod();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() -1));
        Thread.sleep(1500);
        switch (sel) {
            case "calendario academico":
                break;
            case "solicitudes":
                driver.findElement(chp.getSolicitudesGenerales()).equals("Solicitudes e Impresos");
                break;
            case "evau":
                driver.findElement(chp.getEvau()).equals("Evaluación para el Acceso a la Universidad");
                break;
            case "mas25":
                driver.findElement(chp.getMas25()).equals("Mayores de 25 años - sin estudios o solo estudios básicos");
                break;
            case "mas40":
                driver.findElement(chp.getMas40()).equals("Mayores de 40 años - sin estudios o solo estudios básicos");
                break;
        }
        driver.close();
        waitMethod();
        driver.switchTo().window(tabs.get(0));
        driver.close();
    }

    /*
     ******* CONVALIDACIONES *******
     */

    @Then("^I click on the convalidaciones button$")
    public void convalidaciones() {
        getButton(3,3).click();
        waitMethod();
        getButton(5,2).click();
    }

    @And("^I search until I find my destiny for convalidaciones in ([^\"]*)$")
    public void findingConvalidaciones(String sel) {
        switch (sel) {
            case "reconocimiento creditos":
                getButton(7,1).click();
                waitMethod();
                getSingleLinkMessage(9).click();
                break;
            case "nivel idioma":
                getButton(7,2).click();
                waitMethod();
                getSingleLinkMessage(9).click();
                break;
            case "traslado expediente":
                getButton(7,3).click();
                waitMethod();
                getButton(9, 1).click();
                waitMethod();
                getSingleLinkMessage(11).click();
                break;
        }

    }

    @Then("^I go to the ([^\"]*) web for convalidaciones$")
    public void webConvalidaciones(String sel) throws InterruptedException {
        waitMethod();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() -1));
        Thread.sleep(1500);
        switch (sel) {
            case "reconocimiento creditos":
                driver.findElement(chp.getReconocimientoCreditos()).equals("Reconocimiento de créditos");
                break;
            case "nivel idioma":
                driver.findElement(chp.getNivelIdioma()).equals("Acreditación del nivel de idioma");
                break;
            case "traslado expediente":
                driver.findElement(chp.getTrasladoExpedietnte()).equals("Expediente administrativo");
                break;
        }
        driver.close();
        waitMethod();
        driver.switchTo().window(tabs.get(0));
        driver.close();
    }

    /*
     *******  REDES *******
     */
    @Then("^I click on the redes button$")
    public void redes() {
        getButton(3,3).click();
        waitMethod();
        getButton(5,3).click();
        waitMethod();
        getButton(7,1).click();
    }
    @And("^I search until I find my destiny for redes in ([^\"]*)$")
    public void findingRedes(String sel) {
        switch (sel) {
            case "vpn":
                getButton(9,1).click();
                waitMethod();
                getSingleLinkMessage(11).click();
                break;
            case "contrasenas":
                getButton(9,3).click();
                waitMethod();
                getButton(11,1).click();
                waitMethod();
                getSingleLinkMessage(13).click();
                break;
        }
    }

    @Then("^I go to the ([^\"]*) web for redes")
    public void webRedes(String sel) throws InterruptedException {
        waitMethod();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() -1));
        Thread.sleep(1500);
        switch (sel) {
            case "vpn":
                driver.findElement(chp.getVPN()).equals("Acceso remoto (Red Privada Virtual)");
                break;
            case "contrasenas":
                driver.findElement(chp.getContrasenas()).equals("Cuentas y contraseñas de usuario");
                break;
        }
        driver.close();
        waitMethod();
        driver.switchTo().window(tabs.get(0));
        driver.close();
    }


    /*
     ******* LOCALIZACIONES *******
     */
    @Then("^I click on the localizaciones button")
    public void comoMoverme() {
        getButton(3,3).click();
        waitMethod();
        getButton(5,3).click();
        waitMethod();
        getButton(7,2).click();
    }

    @And("^I search until I find my destiny for como moverme$")
    public void findingDelegacion() {
        getButton(9,2).click();
    }

    @Then("^I receive the como moverme response message$")
    public void messageDelegacion(){
        driver.findElement(chp.getMensaje()).toString().substring(0, 30).equals("El objeto de este procedimiento");
        getMessage(11).toString().substring(0,60).equals("¡Es muy fácil orientarse en la Escuela Politécnica Superior!");
        driver.close();
    }


    @And("^I search until I find my destiny for delegacion$")
    public void findingComoMoverme() {
        getButton(9,3).click();
        waitMethod();
        getButton(11,2).click();
        waitMethod();
        getSingleLinkMessage(13).click();
    }

    @Then("^I receive the delegacion response message$")
    public void messageComoMoverme() throws InterruptedException {
        waitMethod();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size() -1));
        Thread.sleep(1500);
        driver.findElement(chp.getDelegacion()).equals("Delegación de alumnos");
        driver.close();
        waitMethod();
        driver.switchTo().window(tabs.get(0));
        driver.close();
    }


}
