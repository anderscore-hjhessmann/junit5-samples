package com.anderscore.samples.junit5.sample12;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTestDemo {

    @RepeatedTest(3)
    void test3Times(RepetitionInfo info) {
        System.out.printf("Test läuft zum %d. von %d Mal%n",
                info.getCurrentRepetition(),
                info.getTotalRepetitions());
    }

    @DisplayName("Wiederholung")
    @RepeatedTest(value=2,
            name="{currentRepetition}. {displayName} von {totalRepetitions}")
    void testName() {
    }
}
