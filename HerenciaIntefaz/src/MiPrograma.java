import modelo.Circulo;
import modelo.Cuadrado;
import modelo.FiguraGeometrica;
import modelo.Rectangulo;


public class MiPrograma {

    public static void main(String[] args) {

        FiguraGeometrica figuraGeometrica1 = new Rectangulo(5, 10);
        FiguraGeometrica figuraGeometrica2 = new Circulo(7);
        FiguraGeometrica fig = new FiguraGeometrica("Una Figura");

        FiguraGeometrica rec = new Rectangulo(5,10);

        Cuadrado cuadrado = new Cuadrado(5);

        System.out.println(figuraGeometrica1.getTipo() + " - Área: " + figuraGeometrica1.calcularArea());
        System.out.println(figuraGeometrica2.getTipo() + " - Área: " + figuraGeometrica2.calcularArea());
        System.out.println(fig.getTipo() + " - Área: " + fig.calcularArea());

        System.out.println("Valor del metodo toString de la clase FiguraGeometrica: " + figuraGeometrica1.toString());
        System.out.println("Valor del metodo toString de la clase FiguraGeometrica: " + figuraGeometrica2.toString());
        System.out.println("Valor del metodo toString de la clase FiguraGeometrica: " + fig.toString());

        System.out.println("El objeto figuraGeometrica1 es igual a figuraGeometrica2 ? " + figuraGeometrica1.equals(rec));

        System.out.println(cuadrado.saludar("Hola"));
    }
}
