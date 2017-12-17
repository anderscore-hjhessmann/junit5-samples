package com.anderscore.samples.junit5.sample04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public interface LoggingInterface {

    @BeforeEach
    default void logBefore(TestInfo info) {
        System.out.println("Starte " + info.getDisplayName());
    }

    @AfterEach
    default void logAfter(TestInfo info) {
        System.out.println(info.getDisplayName() + " ist fertig");
    }
}
