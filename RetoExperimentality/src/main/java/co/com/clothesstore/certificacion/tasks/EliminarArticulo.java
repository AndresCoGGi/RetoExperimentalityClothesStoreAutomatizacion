package co.com.clothesstore.certificacion.tasks;

import co.com.clothesstore.certificacion.userinterfaces.ClothesStorePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EliminarArticulo implements Task {

    public static EliminarArticulo delCarrito() {
        return Tasks.instrumented(EliminarArticulo.class);
    }

    @Step("{0} elimina articulo")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ClothesStorePage.REMOVER_ITEM_BUTTON),
                WaitUntil.the(ClothesStorePage.CONFIRMAR_ELIMINACION, isVisible()),
                Click.on(ClothesStorePage.CONFIRMAR_ELIMINACION));
    }
}
