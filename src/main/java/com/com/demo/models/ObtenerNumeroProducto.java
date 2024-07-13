package com.com.demo.models;

public class ObtenerNumeroProducto {

    private static int contadorProductos = 0;

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void incrementarContador(){
        contadorProductos++;
    }

    public static void reniciarContador(){
        contadorProductos = 0;
    }
}
