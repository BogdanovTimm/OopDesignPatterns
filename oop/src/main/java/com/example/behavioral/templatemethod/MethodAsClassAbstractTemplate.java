package com.example.behavioral.templatemethod;

public abstract class MethodAsClassAbstractTemplate {

    // final ensures that no child datatypes can change desired function behavior
    public final void mainMethod() {
        commonMethodPart();
        commonMethodPart2();
        uniqueMethodPart1();
        uniqueMethodPart2();
    }

    protected abstract void uniqueMethodPart1();

    protected abstract void uniqueMethodPart2();

    private void commonMethodPart() {
        System.out.println("Common part 1 is running...");
    }

    private void commonMethodPart2() {
        System.out.println("Common part 2 is running...");
    }

}
