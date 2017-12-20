package com.anderscore.samples.junit5.sample10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

public class Test05JUnit5Testname {

    @Test
    void testEins(TestInfo info) {
        assertEquals("testEins(TestInfo)", info.getDisplayName());
    }

    @Test
    @DisplayName("2. Test")
    void testZwei(TestInfo info) {
        assertEquals("2. Test", info.getDisplayName());
        assertEquals("testZwei", info.getTestMethod().get().getName());
        assertEquals(Test05JUnit5Testname.class, info.getTestClass().get());
    }
}
