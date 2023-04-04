package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ejemplo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        int tamanioArray = scanner.nextInt();

        System.out.print("Logitud de los passwords: ");
        int longitud = scanner.nextInt();

        Password[] passwords = new Password[tamanioArray];
        boolean[] passwordsFuertes = new boolean[tamanioArray];
        for(int indice = 0; indice < passwords.length; indice++) {
            Password nuevoPassword = new Password(longitud);
            nuevoPassword.generaPassword();
            passwords[indice] = nuevoPassword;
            passwordsFuertes[indice] = nuevoPassword.esFuerte();
            System.out.println(indice + " " + nuevoPassword.getContrasenia() + "  " + passwordsFuertes[indice]);
        }
    }

}
