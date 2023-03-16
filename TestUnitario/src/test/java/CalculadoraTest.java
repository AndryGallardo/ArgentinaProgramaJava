import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculadoraTest {

    @BeforeEach
    void antesDeCada() {
        System.out.println("Este código se ejecuta antes de cada método anotado con @Test");
    }

    @Test
    void sumaTest() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void restaTest() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.resta(2, 3);
        assertEquals(-1, resultado);
    }
}