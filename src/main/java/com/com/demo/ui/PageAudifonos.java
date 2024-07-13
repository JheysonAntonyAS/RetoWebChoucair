package com.com.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static com.com.demo.utils.GenerarXpathAleatorio.generarXPathProductoAleatorio;

public class PageAudifonos {

    private static final int randomNumber = generarXPathProductoAleatorio();

    public static Target AGREGAR = Target.the("Elegir un producto al azar").located(By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + randomNumber + "]/article/div[2]/div/button"));
    public static Target SUMAR = Target.the("Sumar varios productos").located(By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + randomNumber + "]/article/div[2]/div/div[3]/button[2]"));
    public static Target TEXTO = Target.the("Ver el texto del elemento").located(By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + randomNumber +"]/article/div[1]/a/div[1]/p"));
    public static Target CARRITO_COMPRAS = Target.the("Ir al carro de compras").located(By.xpath("//*[@id=\"__next\"]/header/section/div/div[2]/div[2]/button/span"));
    public static Target PRECIO_PRODUCTO = Target.the("Ver el precio del producto").located(By.xpath("//*[@id=\"__next\"]/main/section[4]/div/div[2]/div[2]/div[2]/ul/li[" + randomNumber + "]/article/div[1]/a/div[2]/div/div[2]/p"));
    public static Target CANTIDAD_PRODUCTO = Target.the("Ver la cantidad de los productos").located(By.xpath("//*[@id=\"__next\"]/header/section/div/div[2]/div[2]/button/div/div[2]"));



}
