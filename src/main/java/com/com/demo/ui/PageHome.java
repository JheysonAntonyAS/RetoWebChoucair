package com.com.demo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageHome {

    public static Target MENU = Target.the("El menu de opciones").located(By.xpath("//*[@id=\"__next\"]/header/section/div/div[1]/button/div"));
    public static Target CATEGORIA = Target.the("Elegir la categoria").located(By.xpath("//*[@id=\"__next\"]/header/aside/ul/section[2]/div/li[3]/div"));
    public static Target SUBCATEGORIA = Target.the("Elegir la subcategoria").located(By.xpath("//*[@id=\"column-1\"]/li[2]/ul/li[4]/a"));
    public static Target PRUEBA;
}
