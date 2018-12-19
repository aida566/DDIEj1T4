package com.example.dam.ddiej1t4;

public class NameNormalizer {

    public String firstLetterUppercase(String cadena){

        String[] palabras = cadena.split(" ");

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < palabras.length; i++) {

            sb.append(Character.toUpperCase(palabras[i].charAt(0))).append(palabras[i].substring(1)).append(" ");
        }

        return sb.toString().trim();
    }
}
