package com.com.demo.stepdefinitions;

import com.com.demo.models.ObtenerCantidadProducto;
import com.com.demo.models.ObtenerNumeroProducto;
import com.com.demo.models.ObtenerPrecioProducto;
import com.com.demo.models.ObtenerTexto;
import com.com.demo.tasks.HoverOver;
import com.com.demo.ui.PageAudifonos;
import com.com.demo.ui.PageHome;
import com.com.demo.ui.PageCheckout;
import com.com.demo.utils.GenerarCantidadProductos;
import com.com.demo.utils.TextoElemento;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.com.demo.utils.GlobalData.ACTOR;
import static com.com.demo.utils.GlobalData.URLEXITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidacionUnoStepDefinitions {

    @Given("El usuario ingresa a la pagina")
    public void elUsuarioIngresaALaPagina() {

        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(URLEXITO));
    }

    @When("elige una categoria y subcategoria")
    public void eligeUnaCategoriaYSubcategoria() {
        theActorInTheSpotlight().attemptsTo(

                JavaScriptClick.on(PageHome.MENU),
                // Mueve el cursor al menú para mostrar las opciones

                // Espera un momento para asegurar que las opciones se han cargado
                WaitUntil.the(PageHome.CATEGORIA, isVisible()).forNoMoreThan(5).seconds(),
                HoverOver.element(PageHome.CATEGORIA),

                // Espera un momento para asegurar que las subcategorías se han cargado
                WaitUntil.the(PageHome.SUBCATEGORIA, isVisible()).forNoMoreThan(5).seconds(),

                // Haz clic en la subcategoría
                JavaScriptClick.on(PageHome.SUBCATEGORIA)
        );
    }

    @When("elige un producto al azar")
    public void eligeUnProductoAlAzar() {

        theActorInTheSpotlight().attemptsTo(
                JavaScriptClick.on(PageAudifonos.AGREGAR),
                WaitUntil.the(PageAudifonos.AGREGAR, isVisible()).forNoMoreThan(10).seconds()
        );

        ObtenerNumeroProducto.incrementarContador();

        String textoProducto = theActorInTheSpotlight().asksFor(Text.of(PageAudifonos.TEXTO).asString());
        ObtenerTexto.setCapturarTexto(textoProducto);
    }

    @When("agrega una cantidad aleatoria entre uno y diez")
    public void agregaUnaCantidadAleatoriaEntreUnoYDiez() {
        String precioProducto = theActorInTheSpotlight().asksFor(TextoElemento.of(PageAudifonos.PRECIO_PRODUCTO));

        String precioLimpio = precioProducto.replaceAll("[^\\d.]", "");

        double precioProductoDouble = Double.parseDouble(precioLimpio);

        int numeroDeClicks = GenerarCantidadProductos.generarNumeroAleatorioDeClicks();
        // Genera el número aleatorio de clics
        for (int i = 0; i < numeroDeClicks; i++) {
            theActorInTheSpotlight().attemptsTo(
                    // Espera hasta que el producto sea visible
                    JavaScriptClick.on(PageAudifonos.SUMAR));
        }

        double calcularPrecio = (precioProductoDouble * numeroDeClicks) + precioProductoDouble;
        ObtenerPrecioProducto.setCapturarPrecio(calcularPrecio);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // obtener la cantidad de producto
        String cantidadProducto = theActorInTheSpotlight().asksFor(Text.of(PageAudifonos.CANTIDAD_PRODUCTO).asString());
        ObtenerCantidadProducto.setcapturarProducto(cantidadProducto);

        theActorInTheSpotlight().attemptsTo(
                JavaScriptClick.on(PageAudifonos.CARRITO_COMPRAS)
        );
    }

    @Then("validara que el nombre del producto debe ser el mismo que muestra el carro")
    public void validaraQueElNombreDelProductoDebeSerElMismoQueMuestraElCarro() {

        String textoOtroElemento = theActorInTheSpotlight().asksFor(Text.of(PageCheckout.TEXTOCARRO).asString());
        assert (textoOtroElemento).equals(ObtenerTexto.getCapturarTexto());

    }


}
