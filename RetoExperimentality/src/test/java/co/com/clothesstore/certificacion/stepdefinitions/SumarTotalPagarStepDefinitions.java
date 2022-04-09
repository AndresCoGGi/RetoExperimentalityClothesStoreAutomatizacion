package co.com.clothesstore.certificacion.stepdefinitions;

import co.com.clothesstore.certificacion.questions.ValidarTotalAPagar;
import co.com.clothesstore.certificacion.tasks.AgregarVariosArticulos;
import co.com.clothesstore.certificacion.tasks.SumarTotalAPagar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class SumarTotalPagarStepDefinitions {

    @Cuando("^el agrega varios productos de diferentes categorias$")
    public void elAgregaVariosProductosDeDiferentesCategorias(List<String> categoriasList) {
        theActorInTheSpotlight().attemptsTo(AgregarVariosArticulos.alCarrito(categoriasList),
                SumarTotalAPagar.delCarrito());

    }

    @Entonces("^el visualizara el total a pagar correctamente$")
    public void elVisualizaraElTotalAPagarCorrectamente() {
        String totalPagar = theActorInTheSpotlight().recall("SUMATORIA_TOTAL");
        theActorInTheSpotlight().should(seeThat(ValidarTotalAPagar.deLosProductosAgregados(), is(totalPagar)));
    }
}
