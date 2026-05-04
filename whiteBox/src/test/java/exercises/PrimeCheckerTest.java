package test.java.exercises;

import org.junit.jupiter.api.Test;

import exercises.PrimeChecker;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeCheckerTest {

    @Test
    void testPrime() {
        assertTrue(PrimeChecker.isPrime(7));
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(10));
    }
}
