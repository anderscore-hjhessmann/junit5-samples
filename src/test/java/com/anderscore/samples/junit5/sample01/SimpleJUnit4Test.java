package com.anderscore.samples.junit5.sample01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleJUnit4Test {

    @Test
    public void testAdding() {
        assertEquals("Erwartet: 1 + 2 = 4", 4, 1 + 2);
    }
}
