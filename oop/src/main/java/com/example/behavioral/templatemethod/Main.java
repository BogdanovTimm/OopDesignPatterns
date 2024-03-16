package com.example.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        MethodAsClassAbstractTemplate methodAsClass1 = new MethodAsClass1();
        MethodAsClassAbstractTemplate methodAsClass2 = new MethodAsClass2();
        methodAsClass1.mainMethod();
        methodAsClass2.mainMethod();
    }
}
