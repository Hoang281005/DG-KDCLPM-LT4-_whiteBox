package test.java.exercises;

import org.junit.jupiter.api.Test;

import exercises.GCDCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class GCDCalculatorTest {

    @Test
    void testGCD() {
        assertEquals(6, GCDCalculator.gcd(12, 18));
        assertEquals(5, GCDCalculator.gcd(5, 0));
    }
}