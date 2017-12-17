package com.anderscore.samples.junit5.sample09;

import org.junit.jupiter.api.extension.*;

import java.util.stream.Stream;

public class AllExtensions implements AfterAllCallback, AfterEachCallback, AfterTestExecutionCallback,
        BeforeAllCallback, BeforeEachCallback, BeforeTestExecutionCallback, ExecutionCondition, ParameterResolver,
        TestExecutionExceptionHandler, TestInstancePostProcessor, TestTemplateInvocationContextProvider {
    @Override
    public void afterAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("AfterAllCallback.afterAll");
    }

    @Override
    public void afterEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("AfterEachCallback.afterEach");
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("AfterTestExecutionCallback.afterTestExecution");
    }

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        System.out.println("BeforeAllCallback.beforeAll");
    }

    @Override
    public void beforeEach(ExtensionContext extensionContext) throws Exception {
        System.out.println("BeforeEachCallback.beforeEach");
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        System.out.println("BeforeTestExecutionCallback.beforeTestExecution");
    }

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext extensionContext) {
        System.out.println("ExecutionCondition.evaluateExecutionCondition: " + extensionContext.getDisplayName());
        return ConditionEvaluationResult.enabled("execute tests");
    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        System.out.println("ParameterResolver.supportsParameter");
        return false;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        System.out.println("ParameterResolver.resolveParameter");
        return null;
    }

    @Override
    public void handleTestExecutionException(ExtensionContext extensionContext, Throwable throwable) throws Throwable {
        System.out.println("TestExecutionExceptionHandler.handleTestExecutionException: " + throwable);
    }

    @Override
    public void postProcessTestInstance(Object o, ExtensionContext extensionContext) throws Exception {
        System.out.println("TestInstancePostProcessor.postProcessTestInstance");
    }

    @Override
    public boolean supportsTestTemplate(ExtensionContext extensionContext) {
        System.out.println("TestTemplateInvocationContextProvider.supportsTestTemplate");
        return false;
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext extensionContext) {
        System.out.println("TestTemplateInvocationContextProvider.provideTestTemplateInvocationContexts");
        return null;
    }
}
