package com.anderscore.samples.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Beispiel für Jupiter Annotationen")
public class Sample02JUnit5Test {
    private static int a;
    private int b;

    @BeforeAll
    static void setUpClass() {
        a = 2;
    }

    @BeforeEach
    void setUp() {
        b = 3;
    }

    @Test
    @Tag("fast")
    @DisplayName("Der spannende Test")
    void testSomething() {
        assertEquals(5, a + b, "Falsches Ergebnis");
        ArithmeticException ex =
                assertThrows(ArithmeticException.class, () -> {
                    int c = a / 0;
                });
        assertEquals("/ by zero", ex.getMessage());
    }

    @Disabled
    @Test
    void testNothing() {
    }
}
