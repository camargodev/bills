package com.camargo.orghub.bills;

public class ClassUnderTest {

    private final DependencyUnderTest dependencyUnderTest;

    public ClassUnderTest(DependencyUnderTest dependencyUnderTest) {
        this.dependencyUnderTest = dependencyUnderTest;
    }

    public String stringify(int x) {
        return String.valueOf(dependencyUnderTest.doubleAmount(x));

    }


}
