package com.com.demo.stepdefinitions;

import com.com.demo.models.ObtenerCantidadProducto;
import com.com.demo.ui.PageCheckout;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidacionTresStepDefinitions {

    @Then("validara que las cantidades de los productos agregados deberá ser igual que en el carrito")
    public void validaraQueLasCantidadesDeLosProductosAgregadosDeberáSerIgualQueEnElCarrito() {

        String cantidadTotal = theActorInTheSpotlight().asksFor(Text.of(PageCheckout.CANTIDAD_PRODUCTO_TOTAL).asString());

        String depurarCantidadTotal = cantidadTotal;
        String depurarCantidadProducto = ObtenerCantidadProducto.getcapturarProducto();

        assert (cantidadTotal).equals(ObtenerCantidadProducto.getcapturarProducto());
    }
}
