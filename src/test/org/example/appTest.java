package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class appTest {

    @Test
    void testAdd() {
        assertEquals(15, app.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, app.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, app.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, app.divide(10, 5));
    }
}
