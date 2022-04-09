package co.com.clothesstore.certificacion.tasks;

import co.com.clothesstore.certificacion.userinterfaces.ClothesStorePage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class SumarTotalAPagar implements Task {

    public static SumarTotalAPagar delCarrito() {
        return Tasks.instrumented(SumarTotalAPagar.class);
    }

    @Step("{0} sumar total a pagar")
    @Override
    public <T extends Actor> void performAs(T actor) {
        int sumatoriaTotal = 0;
        List<String> listaPrecios = Text.of(ClothesStorePage.PRECIOS_DE_ARTICULOS).viewedBy(actor).asList();
        for (int i = 0; i < listaPrecios.size(); i++) {
            String precioArticulo = listaPrecios
                    .get(i).replace("$ ", "").replace(".", "");
            sumatoriaTotal = sumatoriaTotal + Integer.parseInt(precioArticulo);
        }
        actor.remember("SUMATORIA_TOTAL", String.valueOf(sumatoriaTotal));
    }
}
