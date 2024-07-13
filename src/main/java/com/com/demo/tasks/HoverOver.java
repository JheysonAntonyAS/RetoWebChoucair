package com.com.demo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.targets.Target;

public class HoverOver implements Task {

    private final Target target;

    public HoverOver(Target target) {
        this.target = target;
    }

    public static Performable element(Target target) {
        return Task.where("{0} hovers over " + target,
                MoveMouse.to(target)
        );
    }

    @Override
    public <T extends Actor> void performAs(T t) {

    }
}