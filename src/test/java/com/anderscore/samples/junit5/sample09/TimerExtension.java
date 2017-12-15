package com.anderscore.samples.junit5.sample09;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TimerExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {
    private long start;

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        start = System.currentTimeMillis();
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("Test " + extensionContext.getDisplayName()
                + " needed " + (System.currentTimeMillis() - start) + " ms.");
    }
}
