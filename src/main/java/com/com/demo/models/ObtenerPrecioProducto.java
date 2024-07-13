package com.com.demo.models;

public class ObtenerPrecioProducto {

    private static double capturarPrecio;

    public static double getCapturarPrecio(){
        return capturarPrecio;
    }

    public static void setCapturarPrecio(double precio){
        capturarPrecio = precio;
    }
}
