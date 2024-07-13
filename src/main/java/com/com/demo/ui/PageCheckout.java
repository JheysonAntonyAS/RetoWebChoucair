package com.com.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageCheckout {


    public static Target TEXTOCARRO = Target.the("ver el texto del carrito de compras").located(By.xpath("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[1]/div/div[2]/div/div/div[4]/span"));
    public static Target PRECIO_PRODUCTO_CARRO = Target.the("Ver el precio del producto total").located(By.xpath("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[1]/div/div[2]/div/div/div[5]/div/span"));
    public static Target CANTIDAD_PRODUCTO_TOTAL = Target.the("Ver la cantidad de los productos total").located(By.xpath("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[1]/div/div[2]/div/div/div[6]/div/div/div/div/span[1]"));
    public static Target NUMERO_PRODUCTO_TOTAL = Target.the("Ver el numero de los productos total").located(By.xpath("//*[@id=\"render-store.custom.checkout-io\"]/div/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div[1]/div/div[3]"));

}












