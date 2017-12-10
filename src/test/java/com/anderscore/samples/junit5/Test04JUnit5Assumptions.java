package com.anderscore.samples.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class Test04JUnit5Assumptions {

    @Test
    public void testShouldBeIgnored() {
        assumeTrue(1 + 1 == 3, "Keine abwechslungsreiche Arithmetik");
        assertEquals(6, 2 + 2);
    }

    @Test
    public void testAssumeThat() {
        assumingThat(() -> 1 + 1 == 2,
                () -> assertEquals(4, 2 + 2));
    }
}
