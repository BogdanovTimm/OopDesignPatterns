package com.example.behavioral.chainofresponsibility;

public abstract class IfElseAsClassAbstract {
    private IfElseAsClassAbstract nextChecker;
    
    public IfElseAsClassAbstract(IfElseAsClassAbstract checker) {
        this.nextChecker = checker;
    }

    public void check(int intToCheck) {
        if (nextChecker != null) {
            nextChecker.check(intToCheck);
        } else {
            System.out.println("All checks failed");
        }
    }
}
