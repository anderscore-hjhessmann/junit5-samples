package com.anderscore.samples.junit5.sample14;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicTestSample {
    private int a;

    @TestFactory
    Stream<DynamicTest> testDynamic() {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> DynamicTest.dynamicTest("Check " + i, () -> {
                    a++;
                    assertEquals(i, a, "Wert zurueckgesetzt");
                }));
    }
}
