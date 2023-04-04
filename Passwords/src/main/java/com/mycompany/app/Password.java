package com.mycompany.app;

import java.util.concurrent.ThreadLocalRandom;

public class Password {
    private int longitud;
    private String contrasenia;

    public Password() {
        this.longitud = 8;
    }

    public Password(int longitud) {
        this.longitud = longitud;
    }

    public boolean esFuerte() {
        boolean esFuerte = false;
        int cantidadMayusculas = 0;
        int cantidadNumeros = 0;
        int cantidadMinusculas = 0;
        for(Character caracter : this.contrasenia.toCharArray()) {
            if(Character.isUpperCase(caracter)) {
                cantidadMayusculas++;
            }

            if(Character.isLowerCase(caracter)) {
                cantidadMinusculas++;
            }

            if(Character.isDigit(caracter)) {
                cantidadNumeros++;
            }
        }

        if(cantidadMayusculas > 2 && cantidadMinusculas > 1 && cantidadNumeros > 5){
            esFuerte = true;
        }
        return esFuerte;
    }

    public void generaPassword() {
        this.contrasenia = cadenaAleatoria(this.longitud);
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String cadenaAleatoria(int longitud) {
        // El banco de caracteres
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        // La cadena donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    public int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt retorna en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
