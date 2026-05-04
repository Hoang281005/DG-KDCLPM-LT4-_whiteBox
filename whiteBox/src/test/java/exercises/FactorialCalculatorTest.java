package test.java.exercises;

import org.junit.jupiter.api.Test;

import exercises.FactorialCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    void testFactorial() {
        assertEquals(6, FactorialCalculator.factorial(3));
    }

    @Test
    void testSumFactorial() {
        assertEquals(9, FactorialCalculator.sumFactorial(3));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialCalculator.factorial(-1));
    }
}
