package modelo;

public class FiguraGeometrica {
    protected String tipo;

    public FiguraGeometrica(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPerimetro() {
        return 0;
    }

    public double calcularArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "[tipo = " + getTipo() + "]";
    }
}
