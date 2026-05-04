package test.java.exercises;

import org.junit.jupiter.api.Test;

import exercises.SumCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {

    @Test
    void testSum() {
        assertEquals(2, SumCalculator.sumAlternating(3));
        assertEquals(-2, SumCalculator.sumAlternating(4));
    }
}
