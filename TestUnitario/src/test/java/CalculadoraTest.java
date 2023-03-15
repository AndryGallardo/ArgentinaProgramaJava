import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculadoraTest {

    @Test
    void sumaTest() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }
}