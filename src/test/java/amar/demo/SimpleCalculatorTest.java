package amar.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    public void testAddition() {
        assertEquals(15.0, calculator.addition(10.0, 5.0), "L'addition ne fonctionne pas correctement");
    }

    @Test
    public void testSoustraction() {
        assertEquals(5.0, calculator.soustraction(10.0, 5.0), "La soustraction ne fonctionne pas correctement");
    }

    @Test
    public void testMultiplication() {
        assertEquals(50.0, calculator.multiplication(10.0, 5.0), "La multiplication ne fonctionne pas correctement");
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.division(10.0, 5.0), "La division ne fonctionne pas correctement");
    }
}
