package co.com.clothesstore.certificacion.questions;

import co.com.clothesstore.certificacion.userinterfaces.ClothesStorePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarArticuloEliminado implements Question<String> {

    public static ValidarArticuloEliminado delCarrito() {
        return new ValidarArticuloEliminado();
    }

    @Subject("Validar articulo eliminado del carrito")
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ClothesStorePage.CARRITO_VACIADO).viewedBy(actor).asString().trim();
    }
}
