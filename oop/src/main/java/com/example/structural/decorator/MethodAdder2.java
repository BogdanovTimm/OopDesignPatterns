package com.example.structural.decorator;

public class MethodAdder2 extends AbstractMethodAdder {
    public MethodAdder2(CommonInterface baseOrModified) {
        super(baseOrModified);
    }

    @Override
    public void modifiableMethod() {
        super.modifiableMethod();
        this.newPart2();
    }

    public void newPart2() {
        System.out.println("New part 2 is called");
    }
}