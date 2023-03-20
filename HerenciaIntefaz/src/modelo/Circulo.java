package modelo;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return this.radio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }
}
