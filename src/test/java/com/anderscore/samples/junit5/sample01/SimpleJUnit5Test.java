package com.anderscore.samples.junit5.sample01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleJUnit5Test {

    @Test
    public void testAdding() {
        assertEquals(4, 1 + 2, "Erwartet: 1 + 2 = 4");
    }
}
