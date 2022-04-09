package co.com.clothesstore.certificacion.tasks;

import co.com.clothesstore.certificacion.userinterfaces.ClothesStorePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarArticulo implements Task {

    private String seccion;

    public AgregarArticulo(String seccion) {
        this.seccion = seccion;
    }

    public static AgregarArticulo de(String seccion) {
        return Tasks.instrumented(AgregarArticulo.class, seccion);
    }

    @Step("{0} agregar articulo de #genero")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ClothesStorePage.SECCION.of(seccion)),
                WaitUntil.the(ClothesStorePage.AGREGAR_CARRITO, isVisible()),
                Scroll.to(ClothesStorePage.AGREGAR_CARRITO).andAlignToBottom(),
                Click.on(ClothesStorePage.AGREGAR_CARRITO),
                Click.on(ClothesStorePage.CARRITO_COMPRAS));
    }
}
