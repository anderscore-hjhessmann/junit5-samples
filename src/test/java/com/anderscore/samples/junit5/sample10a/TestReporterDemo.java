package com.anderscore.samples.junit5.sample10a;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

public class TestReporterDemo {

    @Test
    void test(TestReporter reporter) {
        reporter.publishEntry("hallo-key", "Hallo Welt!");
    }
}
