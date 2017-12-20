package com.anderscore.samples.junit5.sample13;

import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTestDemo {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testSimple(int v, TestReporter reporter) {
        reporter.publishEntry("key", "Wert: " + v);
    }

    @ParameterizedTest
    @CsvSource({"blub, 4", "bla, 3", "'Hallo Welt!', 11", "'', 0"})
    void testStringLength1(String s, int expectedLength) {
        assertEquals(expectedLength, s.length(), () -> "Länge von " + s);
    }

    @ParameterizedTest()
    @MethodSource("stringLengthProvider")
    void testStringLength2(String s, int expectedLength) {
        assertEquals(expectedLength, s.length(), () -> "Länge von " + s);
    }

    static Stream<Arguments> stringLengthProvider() {
        return Stream.of(
                Arguments.of("foo", 3),
                Arguments.of("blub", 4)
        );
    }
}
