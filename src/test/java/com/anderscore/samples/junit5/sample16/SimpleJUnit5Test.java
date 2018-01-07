package com.anderscore.samples.junit5.sample16;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(JUnitPlatform.class)
public class SimpleJUnit5Test {

    @Test
    public void testAdding() {
        assertEquals(2, 1 + 1);
    }
}
