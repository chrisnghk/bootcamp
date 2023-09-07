package com.hkjava.bootcamp;

import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

/**
 * Unit test for simple App.
 */

// @TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestInstance(TestInstance.Lifecycle.PER_METHOD) // default

public class AssertTest {
    private int x = 0;

    @Test
    @DisplayName("AssertEquals Test")
    void testAssertEqual() {
        // Assertions.assertEquals(actual value, expected value);
        assertEquals(5, App.add(2, 3));
        assertEquals(6, App.add(3, 3));
        assertEquals(12, App.add(2, 10));
        x++;
        assertEquals(1, x);
    }

    @Test
    @DisplayName("AssertNot Equals Test")
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
    void testAssertNull() {
        String str = null;
        assertNull(str);
    }

    @Test
    void testAssertNotNull() {
        Student student = new Student();
        assertNotNull(student.getSubjects());
    }

    @Test
    void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> {
            App.divide(10, 0);
        });

        assertDoesNotThrow(() -> {
            App.divide(10, 5);
        });
    }


    @Test
    void testAssertNotTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(50);
        });
    }

    @Test
    void testCombine() {
        assertAll( //
                () -> assertTrue(10 > 3), //
                () -> assertEquals(10, App.add(4, 6)), //
                () -> assertNull(null)); //
    };

    @Test
    void testSame() {
        String s1 = new String("Junit");
        String s2 = new String("Junit");
        assertNotSame(s1, s2); // test object reference
        assertEquals(s1, s2);

        String s3 = "JUnit";
        String s4 = "JUnit";
        assertSame(s3, s4);
        assertEquals(s3, s4);

    }



    public static void main(String[] args) {
        AssertTest t1 = new AssertTest();
        t1.testAssertEqual();
        AssertTest t2 = new AssertTest();
        t2.testAssertNotEqual();

    }
}
