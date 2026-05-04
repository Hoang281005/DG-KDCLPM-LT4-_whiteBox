package test.java.exercises;

import org.junit.jupiter.api.Test;

import exercises.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    void testPerimeter() {
        assertEquals(14, Rectangle.perimeter(3, 4));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class,
                () -> Rectangle.perimeter(-1, 2));
    }
}