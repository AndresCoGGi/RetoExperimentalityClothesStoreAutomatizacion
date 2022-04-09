package co.com.clothesstore.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ClothesStorePage {

    public static final Target SECCION = Target.the("Seccion")
            .locatedBy("//span[text()='{0}']");
    public static final Target AGREGAR_CARRITO = Target.the("Producto")
            .locatedBy("(//button[contains(text(),'Add to Cart')])[1]");
    public static final Target CARRITO_COMPRAS = Target.the("Carrito de compras")
            .locatedBy("//img[@id='cart-icon']");
    public static final Target REMOVER_ITEM_BUTTON = Target.the("Remover item button")
            .locatedBy("//button[@title='Remover item']");
    public static final Target CONFIRMAR_ELIMINACION = Target.the("Confirmar eliminación")
            .locatedBy("//button[contains(text(),'eliminar!')]");
    public static final Target CARRITO_VACIADO = Target.the("Carrito vaciado")
            .locatedBy("//h2[@id='swal2-title']");
    public static final Target PRECIOS_DE_ARTICULOS = Target.the("Precios de articulos")
            .locatedBy("//div[@class='subtotal']");
    public static final Target TOTAL_A_PAGAR = Target.the("Total a pagar")
            .locatedBy("//div[@id='basket-total']");

}
