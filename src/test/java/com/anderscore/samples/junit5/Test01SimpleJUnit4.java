package com.anderscore.samples.junit5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test01SimpleJUnit4 {

    @Test
    public void testAdding() {
        assertEquals("Erwartet: 1 + 2 = 4", 4, 1 + 2);
    }
}
