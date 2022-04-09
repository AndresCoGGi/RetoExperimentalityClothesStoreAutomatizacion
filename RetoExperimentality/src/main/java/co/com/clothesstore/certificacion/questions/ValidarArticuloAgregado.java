package co.com.clothesstore.certificacion.questions;

import co.com.clothesstore.certificacion.userinterfaces.ClothesStorePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

public class ValidarArticuloAgregado implements Question<Boolean> {

    public static ValidarArticuloAgregado enElCarrito() {
        return new ValidarArticuloAgregado();
    }

    @Subject("Validar articulo agregado al carrito de compras")
    @Override
    public Boolean answeredBy(Actor actor) {
        return ClothesStorePage.REMOVER_ITEM_BUTTON.resolveFor(actor).isVisible();
    }
}
