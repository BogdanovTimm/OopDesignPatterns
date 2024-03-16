package com.example.behavioral.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        IfElseAsClassAbstract checker2 = new IfElseAsClass2(null);
        IfElseAsClassAbstract checker1Checker2 = new IfElseAsClass1(checker2);
        checker2.check(4);
        checker1Checker2.check(4);
    }
}
