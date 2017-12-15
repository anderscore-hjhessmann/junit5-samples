package com.anderscore.samples.junit5.sample08;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Für alle X")
public class NestedTest {
    int a;

    @Nested
    @DisplayName("wenn Y1")
    class Sub1 {
        int b;

        @DisplayName("dann muss A")
        @Test
        void test1() {
            b++;
            a += b;
            assertAll(() -> assertEquals(1, a),
                    () -> assertEquals(1, b));
        }

        @DisplayName("und B")
        @Test
        void test2() {
            b++;
            a += b;
            assertAll(() -> assertEquals(1, a),
                    () -> assertEquals(1, b));
        }
    }

    @Nested
    @DisplayName("wenn Y2")
    class Sub2 {
        @DisplayName("dann muss C")
        @Test
        void test1() {
        }

        @DisplayName("und D")
        @Test
        void test2() {
        }
    }
}
