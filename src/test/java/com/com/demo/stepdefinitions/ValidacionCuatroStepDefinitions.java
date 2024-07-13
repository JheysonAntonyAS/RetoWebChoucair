package com.com.demo.stepdefinitions;

import com.com.demo.models.ObtenerNumeroProducto;
import com.com.demo.ui.PageCheckout;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidacionCuatroStepDefinitions {

    @Then("el número de productos agregados debe ser igual que en el carrito")
    public void elNúmeroDeProductosAgregadosDebeSerIgualQueEnElCarrito() {
        String numProductoCarrito = theActorInTheSpotlight().asksFor(Text.of(PageCheckout.NUMERO_PRODUCTO_TOTAL).asString());
        // Extraer solo el número de la cadena
        String numProductoCarritoSoloNumero = numProductoCarrito.replaceAll("[^\\d]", "");
        int numProductoCarritoInt = Integer.parseInt(numProductoCarritoSoloNumero);
        // Obtener el número de productos seleccionados al azar
        int numProductosSeleccionados = ObtenerNumeroProducto.getContadorProductos();
        // Comparar ambos valores
        assert numProductosSeleccionados == numProductoCarritoInt : "El número de productos no coincide";
    }
}
