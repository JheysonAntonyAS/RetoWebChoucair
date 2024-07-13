package com.com.demo.utils;

import java.util.concurrent.ThreadLocalRandom;

public class GenerarCantidadProductos {

    public static int generarNumeroAleatorioDeClicks() {
        int minClicks = 1; // El número mínimo de clics
        int maxClicks = 10; // El número máximo de clics
        // Generar un número aleatorio entre minClicks y maxClicks
        return ThreadLocalRandom.current().nextInt(minClicks, maxClicks + 1);
    }
}
