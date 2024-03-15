package com.example.structural.decorator;

public class MethodAdder1 extends AbstractMethodAdder {
    public MethodAdder1(CommonInterface baseOrModified) {
        super(baseOrModified);
    }


    @Override
    public void modifiableMethod() {
        super.modifiableMethod();
        this.newPart1();
    }

    public void newPart1() {
        System.out.println("New part is called");
    }
}