package com.example.structural.decorator;

public abstract class AbstractMethodAdder implements CommonInterface {
    protected CommonInterface baseOrModified;

    public AbstractMethodAdder(CommonInterface baseOrModified) {
        this.baseOrModified = baseOrModified;
    }

    @Override
    public void modifiableMethod() {
        this.baseOrModified.modifiableMethod();
    }
}
