package com.anderscore.samples.junit5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sample01SimpleJUnit4Test {

    @Test
    public void testAdding() {
        assertEquals("Erwartet: 1 + 2 = 4", 4, 1 + 2);
    }
}
