package com.anderscore.samples.junit5.sample09;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(AllExtensions.class)
public class TestExtensionPoints {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Test: beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Test: beforeEach()");
    }

    @Test
    void mainTest() {
        System.out.println("Test: mainTest()");
    }

    @Test
    void failTest() {
        System.out.println("Test: failTest()");
        assertEquals(3, 1 + 1);
    }

    @AfterEach
    void afterEach() {
        System.out.println("Test: afterEach()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test: afterAll()");
    }
}
