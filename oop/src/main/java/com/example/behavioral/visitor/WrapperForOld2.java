package com.example.behavioral.visitor;

public class WrapperForOld2 implements WrapperInterface {

    Old2 old = new Old2();

    @Override
    public void runGivenNewMethod(NewMethodInterface newMethod) {
        newMethod.runIn(this);
    }
}
