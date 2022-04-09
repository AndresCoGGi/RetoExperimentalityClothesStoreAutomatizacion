package co.com.clothesstore.certificacion.questions;

import co.com.clothesstore.certificacion.userinterfaces.ClothesStorePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarTotalAPagar implements Question<String> {

    public static ValidarTotalAPagar deLosProductosAgregados() {
        return new ValidarTotalAPagar();
    }

    @Subject("{0} validar total a pagar de los productos agregados al carrito")
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ClothesStorePage.TOTAL_A_PAGAR).viewedBy(actor).asString();
    }
}
