package com.example.behavioral.chainofresponsibility;

public class IfElseAsClass1 extends IfElseAsClassAbstract {

    public IfElseAsClass1(IfElseAsClassAbstract checker) {
        super(checker);
    }

    @Override
    public void check(int intToCheck) {
        System.out.println("Checker 1 is checking...");
        if (intToCheck < 5) {
            System.out.println("Check is done within Checker 1");
        } else {
            super.check(intToCheck);
        }
    }
}
