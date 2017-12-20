package com.anderscore.samples.junit5.sample15;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(DemoInvocationContextProvider.class)
public class TestTemplateDemo {

    @TestTemplate
    public void test() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test2() {
        assertEquals(3, 1 + 1);
    }
}
