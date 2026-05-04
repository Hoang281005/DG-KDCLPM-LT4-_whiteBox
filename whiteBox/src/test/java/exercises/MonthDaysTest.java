package test.java.exercises;

import org.junit.jupiter.api.Test;

import exercises.MonthDays;

import static org.junit.jupiter.api.Assertions.*;

public class MonthDaysTest {

    @Test
    void testFebruary() {
        assertEquals(29, MonthDays.getDays(2, 2024));
        assertEquals(28, MonthDays.getDays(2, 2023));
    }

    @Test
    void testInvalidMonth() {
        assertThrows(IllegalArgumentException.class,
                () -> MonthDays.getDays(13, 2023));
    }
}