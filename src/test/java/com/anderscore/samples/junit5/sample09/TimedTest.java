package com.anderscore.samples.junit5.sample09;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TimerExtension.class)
public class TimedTest {

    @Test
    void test() throws InterruptedException {
        Thread.sleep(100);
    }
}
