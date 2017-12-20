package com.anderscore.samples.junit5.sample10;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

public class Test05JUnit4Testname {
    @Rule
    public TestName name = new TestName();

    @Test
    public void testEins() {
        assertEquals("testEins", name.getMethodName());
    }

    @Test
    public void testZwei() {
        assertEquals("testZwei", name.getMethodName());
    }
}
