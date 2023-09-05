package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * Unit test for simple App.
 */

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default

public class AppTest {
    private int x = 0;

    @Test
    void testAssertEqual() {
        // Assertions.assertEquals(actual value, expected value);
        assertEquals(5, App.add(2, 3));
        assertEquals(6, App.add(3, 3));
        assertEquals(12, App.add(2, 10));
        x++;
        assertEquals(1, x);
    }

    @Test
    void testAssertNotEqual() {
        assertNotEquals(4, App.add(1, 2));
        x++;
        assertEquals(1, x);
    }

    @Test
    void testAssertTrue() {
        assertTrue(12 == App.add(7, 5));
    }

    @Test
    void testAssertFalse() {
        assertFalse(13 == App.add(7, 5));
    }

    @Test
    void testAssertNull(){
        String str = null;
        assertNull(str);
    }

    @Test
    void testAssertNotNull(){
        Student student = new Student();
        assertNotNull(student.getSubjects());
    }

    public static void main(String[] args) {
        AppTest t1 = new AppTest();
        t1.testAssertEqual();
        AppTest t2 = new AppTest();
        t2.testAssertNotEqual();

    }
}
