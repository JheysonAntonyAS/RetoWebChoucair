package com.com.demo.models;

public class ObtenerTexto {

    private static String capturarTexto;

    public static String getCapturarTexto(){
        return capturarTexto;
    }

    public static void setCapturarTexto(String text){
        capturarTexto = text;
    }
}
