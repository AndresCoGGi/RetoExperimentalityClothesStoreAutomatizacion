package co.com.clothesstore.certificacion.stepdefinitions;

import co.com.clothesstore.certificacion.questions.ValidarArticuloEliminado;
import co.com.clothesstore.certificacion.tasks.AgregarArticulo;
import co.com.clothesstore.certificacion.tasks.EliminarArticulo;
import co.com.clothesstore.certificacion.utils.MiDriver;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class EliminarArticuloStepDefinitions {

    @Dado("^que el usuario tiene un producto agregado en el carrito de compras$")
    public void queElUsuarioTieneUnProductoAgregadoEnElCarritoDeCompras() {
        theActorInTheSpotlight()
                .can(BrowseTheWeb.with(MiDriver.web().enLaPagina("https://jagoqui-clothesstore-latam.netlify.app/#/home")));
        theActorInTheSpotlight().wasAbleTo(AgregarArticulo.de("Hombre"));
    }

    @Cuando("^el elimina el articulo$")
    public void elEliminaElArticulo() {
        theActorInTheSpotlight().attemptsTo(EliminarArticulo.delCarrito());

    }

    @Entonces("^el visualizara una ventana con un mensaje (.*)$")
    public void elVisualizaraUnaVentanaConUnMensaje(String mensajeEsperado) {
        theActorInTheSpotlight().should(seeThat(ValidarArticuloEliminado.delCarrito(), is(mensajeEsperado)));
    }
}
