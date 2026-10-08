import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

    @Test
    void testSuma() {
        Calculadora c = new Calculadora();
        assertEquals(8, c.suma(5, 3));
    }

    @Test
    void testResta() {
        Calculadora c = new Calculadora();
        assertEquals(2, c.resta(5, 3));
    }

    @Test
    void testMultiplica() {
        Calculadora c = new Calculadora();
        assertEquals(15, c.multiplica(5, 3));
    }

    @Test
    void testDivide() {
        Calculadora c = new Calculadora();
        assertEquals(2, c.divide(6, 3));
    }

    @Test
    void testDivideEntreCero() {
        Calculadora c = new Calculadora();
        assertEquals(-1, c.divide(10, 0));
    }
}
