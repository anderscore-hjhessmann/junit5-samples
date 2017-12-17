package com.anderscore.samples.junit5.sample13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import static org.junit.jupiter.api.Assertions.assertSame;

public class Test06TestInfo {
    private TestInfo classInfo;

    Test06TestInfo(TestInfo info) {
        System.out.println("Constructor: " + info);
        this.classInfo = info;
    }

    @Test
    void testName(TestInfo info, TestReporter reporter) {
        System.out.println("Methode: " + info);
        reporter.publishEntry("msg", info.getTestClass()
                + "." + info.getTestMethod()
                + " (" + info.getDisplayName() + ")");
        assertSame(classInfo, info, "Different info");
    }
}
