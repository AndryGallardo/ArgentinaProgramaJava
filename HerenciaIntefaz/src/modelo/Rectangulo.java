package modelo;

public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return (2*base) + (2*altura);
    }

    @Override
    public String toString() {
        return "[tipo = " + getTipo() + ",base = " + base + ",altura = "  + altura + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Rectangulo)) {
            return false;
        }
        boolean esIgual = false;
        if(((Rectangulo) obj).altura == this.altura && ((Rectangulo) obj).base == this.base) {
            esIgual = true;
        }
        return esIgual;
    }
}
