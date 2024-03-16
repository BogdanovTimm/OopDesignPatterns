package com.example.behavioral.chainofresponsibility;

public class IfElseAsClass2 extends IfElseAsClassAbstract {
    
    public IfElseAsClass2(IfElseAsClassAbstract checker) {
        super(checker);
    }

    @Override
    public void check(int intToCheck) {
        System.out.println("Checker 2 is checking...");
        if (intToCheck > 5) {
            System.out.println("Check is done within Checker 2");
        } else {
            super.check(intToCheck);
        }
    }
}
