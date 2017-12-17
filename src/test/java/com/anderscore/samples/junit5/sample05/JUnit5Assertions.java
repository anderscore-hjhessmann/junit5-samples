package com.anderscore.samples.junit5.sample05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

public class JUnit5Assertions {

    @Test
    public void testTimeout() {
        assertTimeout(ofSeconds(2), () -> Thread.sleep(3000));
    }

    @Test
    public void testTimeout2() {
        assertTimeoutPreemptively(ofMillis(500), () -> Thread.sleep(30000));
    }

    @Test
    public void testAssertAll() {
        String firstName = "Little";
        String lastName = "Joe";
        assertAll("Person",
                () -> assertEquals("John", firstName),
                () -> assertEquals("Doe", lastName)
        );
    }

    @Test
    public void testAssertStream() {
        assertAll(Arrays.asList("blah", "blub", "boah", "umpf").stream()
                .map(s -> () -> assertTrue(s.startsWith("bl"), () -> s + " does not start with 'bl'")));
    }
}
