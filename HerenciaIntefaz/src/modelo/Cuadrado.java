package modelo;

public class Cuadrado implements Figura, Saludo {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {

        return 4*lado;
    }

    @Override
    public String saludar(String mensaje) {
        return "Cuadrado dice " + mensaje;
    }
}
