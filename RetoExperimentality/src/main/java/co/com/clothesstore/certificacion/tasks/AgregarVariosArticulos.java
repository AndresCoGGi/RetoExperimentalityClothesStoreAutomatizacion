package co.com.clothesstore.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class AgregarVariosArticulos implements Task {

    private List<String> categoriasList;

    public AgregarVariosArticulos(List<String> categoriasList) {
        this.categoriasList = categoriasList;
    }

    public static AgregarVariosArticulos alCarrito(List<String> categoriasList) {
        return Tasks.instrumented(AgregarVariosArticulos.class, categoriasList);
    }

    @Step("{0} agregar varios articulos al carrito")
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (String categoria : categoriasList) {
            actor.attemptsTo(AgregarArticulo.de(categoria));
        }
    }
}
