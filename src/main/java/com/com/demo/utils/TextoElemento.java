package com.com.demo.utils;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextoElemento implements Question<String> {

    private final Target target;

    public TextoElemento(Target target) {
        this.target = target;
    }

    public static TextoElemento of(Target target) {
        return new TextoElemento(target);
    }

    @Override
    public String answeredBy(net.serenitybdd.screenplay.Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement element = target.resolveFor(actor);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("return arguments[0].textContent.trim();", element);
    }
}

