package com.tienda.ejercicio.tiendaejercicio.util;

import java.util.Date;

public class Utils {
    private static String generateId(){
        return java.util.UUID.randomUUID().toString();
    }

    public static Date getDateSystem(){
        return new Date();
    }


    private static String token;

    public static String getToken() {
        return token;
    }

    public static void setToken(String token) {
        Utils.token = token;
    }
}
