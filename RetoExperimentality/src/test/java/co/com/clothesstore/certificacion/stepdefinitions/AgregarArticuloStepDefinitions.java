package co.com.clothesstore.certificacion.stepdefinitions;

import co.com.clothesstore.certificacion.questions.ValidarArticuloAgregado;
import co.com.clothesstore.certificacion.tasks.AgregarArticulo;
import co.com.clothesstore.certificacion.utils.MiDriver;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarArticuloStepDefinitions {

    @Before
    public void configuracionInicial() {
        setTheStage(new Cast());
        theActorCalled("Andres");
    }

    @Dado("^que el usuario este en la pagina principal de CLOTHESSTORE$")
    public void queElUsuarioEsteEnLaPaginaPrincipalDeCLOTHESSTORE() {
        theActorInTheSpotlight()
                .can(BrowseTheWeb.with(MiDriver.web().enLaPagina("https://jagoqui-clothesstore-latam.netlify.app/#/home")));
    }

    @Cuando("^el agrega un articulo de (.*) en el carrito$")
    public void elAgregaUnArticuloEnElCarrito(String seccion) {
        theActorInTheSpotlight().attemptsTo(AgregarArticulo.de(seccion));
    }

    @Entonces("^el visualizara el articulo agregado en el carrito exitosamente$")
    public void elVisualizaraElArticuloAgregadoEnElCarritoExitosamente() {
        theActorInTheSpotlight().should(seeThat(ValidarArticuloAgregado.enElCarrito()));
    }
}
