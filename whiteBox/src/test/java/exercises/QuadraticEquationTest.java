package test.java.exercises;

import org.junit.jupiter.api.Test;

import exercises.QuadraticEquation;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTest {

    @Test
    void testCases() {
        assertEquals("No solution", QuadraticEquation.solve(1, 2, 5));
        assertEquals("One solution", QuadraticEquation.solve(1, -2, 1));
        assertEquals("Two solutions", QuadraticEquation.solve(1, -3, 2));
        assertEquals("Not quadratic", QuadraticEquation.solve(0, 2, 1));
    }
}
