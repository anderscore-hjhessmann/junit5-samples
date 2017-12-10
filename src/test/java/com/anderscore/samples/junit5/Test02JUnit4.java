package com.anderscore.samples.junit5;

import org.junit.*;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class Test02JUnit4 {

    private static int a;
    private int b;

    @BeforeClass
    public static void setUpClass() {
        a = 2;
    }

    @Before
    public void setUp() {
        b = 3;
    }

    @Category(FastTests.class)
    @Test(expected = ArithmeticException.class)
    public void testSomething() {
        assertEquals("Falsches Ergebnis", 5, a + b);
        int c = a / 0;
    }

    @Ignore
    @Test
    public void testNothing() {
    }
}
