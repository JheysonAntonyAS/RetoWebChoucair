package com.com.demo.utils;

import java.util.concurrent.ThreadLocalRandom;

public class GenerarXpathAleatorio {

    public static Integer generarXPathProductoAleatorio() {
        int minIndex = 1; // El índice mínimo de los productos
        int maxIndex = 6; // El índice máximo de los productos

        // Generar un número aleatorio entre minIndex y maxIndex
        return ThreadLocalRandom.current().nextInt(minIndex, maxIndex + 1);
    }
}
