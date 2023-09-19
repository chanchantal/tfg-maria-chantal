package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ChatbotPage{
    private ChromeDriver driver;
    private final By web ;
    private final By botonBot ;
    private final By escribir ;
    private final By enter ;
    private final By mensaje ;
    private By estudiosInformatica; //escenario preguntas frecuentes - grados
    private By normativa; //escenario preguntas frecuentes - normativa
    private By correoElectronico; //escenario preguntas frecuentes - correo electronico
    private By cuentaUsuario; //escenario preguntas frecuentes - cuenta usuario
    private By panoramaUniversitario; //escenario preguntas frecuentes - panorama universitario
    private By asignaturas; //escenario preguntas frecuentes - asignaturas
    private By horarios; //escenario preguntas frecuentes - horarios
    private By practicas; //escenario preguntas frecuentes - practicas externas
    private By tfg; //escenario preguntas frecuentes - tfg
    private By gruposInvestigacion; //escenario preguntas frecuentes - tfg
    private By biblioteca; //escenario preguntas frecuentes - tfg
    private By solicitudesGenerales; //escenario tramites administrativos - solicitudes
    private By evau; //escenario tramites administrativos - evau
    private By mas25; //escenario tramites administrativos - admision mayores 25 años
    private By mas40; //escenario tramites administrativos - admision mayores 40 años
    private By reconocimientoCreditos; //escenario convalidaciones - reconocimiento de creditos
    private By nivelIdioma; //escenario convalidaciones - nivel idioma
    private By trasladoExpedietnte; //escenario convalidaciones - traslado o reapertura del expediente
    private By VPN; //escenario redes - vpn
    private By contrasenas; //escenario redes - contraseñas de usuario
    private By delegacion; //escenario localizaciones - delegacion de alumnos


    public ChatbotPage() {
        this.web = By.xpath("/html/body/h1");
        this.botonBot = By.xpath("//*[@id=\"cai-webchat-div\"]/div/div[1]");
        this.escribir = By.xpath("//*[@id=\"cai-webchat-div\"]/div/div[2]/div[3]/textarea");
        this.enter = By.xpath("//*[@id=\"cai-webchat-div\"]/div/div[2]/div[3]/div/div");
        this.mensaje = By.xpath("//*[@id=\"cai-webchat-div\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/div");
        this.estudiosInformatica = By.id("castellano");
        this.normativa = By.xpath("/html/body/div[2]/div/div[2]/h2");
        this.correoElectronico = By.xpath("//*[@id=\"wrapper-container\"]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div/article[1]/div/header/h2");
        this.cuentaUsuario = By.id("wrapper-container");
        this.panoramaUniversitario = By.id("title");
        this.asignaturas = By.xpath("/html/body/div[2]/div/div[2]/h2");
        this.horarios = By.xpath("/html/body/div[2]/div/div[2]/h2");
        this.practicas = By.xpath("/html/body/div[2]/div/div[2]/h2");
        this.tfg = By.xpath("/html/body/div[2]/div/div[2]/h2");
        this.gruposInvestigacion = By.xpath("/html/body/div[2]/div/div[2]/h2");
        this.biblioteca = By.id("slick-slide00");
        this.solicitudesGenerales = By.id("wrapper-container");
        this.evau = By.id("wrapper-container");
        this.mas25 = By.id("wrapper-container");
        this.mas40 = By.id("wrapper-container");
        this.reconocimientoCreditos = By.id("reconocimiento-de-creditos");
        this.nivelIdioma = By.id("acreditacion-del-nivel-de-idioma");
        this.trasladoExpedietnte = By.id("traslado-reapertura-expediente-administrativo");
        this.VPN = By.id("wrapper-container");
        this.contrasenas = By.id("wrapper-container");
        this.delegacion = By.xpath("/html/body/div[2]/div/div[2]/h2");
    }

    public ChromeDriver getDriver() {
        return driver;
    }
    public By getWeb() {
        return web;
    }
    public By getBotonBot() {
        return botonBot;
    }
    public By getEscribir() {
        return escribir;
    }
    public By getEnter() {
        return enter;
    }
    public By getMensaje() {
        return mensaje;
    }
    public By getEstudiosInformatica() {
        return estudiosInformatica;
    }
    public By getNormativa() {
        return normativa;
    }
    public By getCorreoElectronico() {
        return correoElectronico;
    }
    public By getCuentaUsuario() {
        return cuentaUsuario;
    }
    public By getPanoramaUniversitario() {
        return panoramaUniversitario;
    }
    public By getAsignaturas() {
        return asignaturas;
    }
    public By getHorarios() {
        return horarios;
    }
    public By getPracticas() {
        return practicas;
    }
    public By getTfg() {
        return tfg;
    }

    public By getGruposInvestigacion() {
        return gruposInvestigacion;
    }

    public By getBiblioteca() {
        return biblioteca;
    }
    public By getSolicitudesGenerales() {
        return solicitudesGenerales;
    }
    public By getEvau() {
        return evau;
    }
    public By getMas25() {
        return mas25;
    }

    public By getMas40() {
        return mas40;
    }

    public By getReconocimientoCreditos() {
        return reconocimientoCreditos;
    }

    public By getNivelIdioma() {
        return nivelIdioma;
    }

    public By getTrasladoExpedietnte() {
        return trasladoExpedietnte;
    }

    public By getVPN() {
        return VPN;
    }

    public By getContrasenas() {
        return contrasenas;
    }

    public By getDelegacion() {
        return delegacion;
    }
}