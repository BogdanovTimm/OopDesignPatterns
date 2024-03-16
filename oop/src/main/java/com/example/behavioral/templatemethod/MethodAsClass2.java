package com.example.behavioral.templatemethod;

public class MethodAsClass2 extends MethodAsClassAbstractTemplate {

    @Override
    protected void uniqueMethodPart1() {
        System.out.println("Unique part 1 is running from [Method As Class 2]");

    }

    @Override
    protected void uniqueMethodPart2() {
        System.out.println("Unique part 2 is running from [Method As Class 2]");
    }
}
