package com.anderscore.samples.junit5.sample11;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestInstanceDemo {
    private int a;

    @BeforeAll
    void beforeAll() {
        a = 1;
    }

    @Test
    void test1() {
        a++;
    }

    @Test
    void test2() {
        a++;
    }

    @AfterAll
    void afterAll() {
        assertEquals(3, a, "Wert von a");
    }
}
