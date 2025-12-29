package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class appTest {

    @Test
    public void testAdd() {
        assertEquals(15, app.add(10, 5));
    }
}
