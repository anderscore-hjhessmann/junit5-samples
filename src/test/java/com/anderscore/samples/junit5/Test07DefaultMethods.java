package com.anderscore.samples.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test07DefaultMethods implements LoggingInterface {

    @Test
    public void testA() {
        assertEquals(3, 1 + 2);
    }

    @Test
    public void testB() {
        assertEquals(4, 1 + 2);
    }
}
