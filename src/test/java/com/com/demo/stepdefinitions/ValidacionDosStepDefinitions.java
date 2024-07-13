package com.com.demo.stepdefinitions;

import com.com.demo.models.ObtenerPrecioProducto;
import com.com.demo.ui.PageCheckout;
import com.com.demo.utils.TextoElemento;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidacionDosStepDefinitions {

    @Then("validara que el total de los precios de los productos agregados deberá ser igual que en el carrito")
    public void validaraQueElTotalDeLosPreciosDeLosProductosAgregadosDeberáSerIgualQueEnElCarrito() {

        String precioProductoCarro = theActorInTheSpotlight().asksFor(TextoElemento.of(PageCheckout.PRECIO_PRODUCTO_CARRO));

        String precioLimpioCarro = precioProductoCarro.replaceAll("[^\\d.]", "");

        double precioProductoCarroDouble = Double.parseDouble(precioLimpioCarro);

        double precioCapturado = ObtenerPrecioProducto.getCapturarPrecio();
        // Comparar utilizando un epsilon pequeño para manejar errores de redondeo
        double epsilon = 0.001;
        Ensure.that(Math.abs(precioProductoCarroDouble - precioCapturado)).isLessThanOrEqualTo(epsilon);
    }


}
