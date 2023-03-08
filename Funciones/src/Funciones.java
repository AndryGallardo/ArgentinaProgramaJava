import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {

        /* Una tienda en línea desea desarrollar un programa que les permita calcular el precio total de una orden de compra.
         Cada orden de compra contiene una lista de productos con su respectivo precio unitario y cantidad.
         Desarrolla un programa en Java que reciba como entrada una lista de productos con su precio unitario y cantidad,
         calcule el precio total de la orden y lo muestre en pantalla. */

        String[] productos = new String[4];
        float preciosUnitarios[] = new float[4];
        int cantidades[] = new int[4];

        Scanner scanner = new Scanner(System.in);
        for(int indice = 0; indice < 4; indice++) {
            mostrarMensaje("Ingrese el nombre del producto Nª " + (indice + 1) + ": ");
            productos[indice] = scanner.next();

            mostrarMensaje("Ingrese la cantidad de " + productos[indice] + ": ");
            cantidades[indice] = scanner.nextInt();

            mostrarMensaje("Ingrese el precio de " + productos[indice] + ": ");
            preciosUnitarios[indice] = scanner.nextFloat();

            mostrarMensaje("");
        }

        double precioTotal = calcularPrecioTotal(productos, preciosUnitarios, cantidades);
        mostrarMensaje("El precio total de la orden es: $" + precioTotal);
    }

     static double calcularPrecioTotal(String[] productos, float[] preciosUnitarios, int[] cantidades) {
        double precioTotal = 0;
        for (int i = 0; i < productos.length; i++) {
            // precioTotal = precioTotal + (preciosUnitarios[i] * cantidades[i]); Esto es igual a la linea debajo
            precioTotal += preciosUnitarios[i] * cantidades[i];
        }
        mostrarMensaje("Se completo el calculo del precio total\n");
        return precioTotal;
    }

    private static void mostrarMensaje(String mensaje) {
        System.out.printf(mensaje);
    }
}
