package stepDefinitions;

import appiumDriver.AppiumAndroidDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.BusquedaRapida;

import java.io.IOException;

public class YtStepDefinitions {
    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^que el usuario se encuentra en la app YouTube$")
    public void queElUsuarioSeEncuentraEnLaAppYouTube() {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(AppiumAndroidDriver.appium().on()));
    }

    @Cuando("^desee ver videos$")
    public void deseeVerVideos() {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaRapida.on());
    }

    @Entonces("^usara la barra de busqueda para encontrar el contenido deseado$")
    public void usaraLaBarraDeBusquedaParaEncontrarElContenidoDeseado() {
    }

}
