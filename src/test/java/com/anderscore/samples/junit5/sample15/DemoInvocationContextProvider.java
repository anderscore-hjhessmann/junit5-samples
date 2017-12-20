package com.anderscore.samples.junit5.sample15;

import org.junit.jupiter.api.extension.Extension;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContext;
import org.junit.jupiter.api.extension.TestTemplateInvocationContextProvider;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoInvocationContextProvider implements TestTemplateInvocationContextProvider{

    @Override
    public boolean supportsTestTemplate(ExtensionContext context) {
        return true;
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
        return IntStream.rangeClosed(1, 3).mapToObj(i -> new TestTemplateInvocationContext() {
            @Override
            public String getDisplayName(int invocationIndex) {
                return "Wiederholung " + invocationIndex;
            }

            @Override
            public List<Extension> getAdditionalExtensions() {
                return Collections.emptyList();
            }
        });
    }
}
