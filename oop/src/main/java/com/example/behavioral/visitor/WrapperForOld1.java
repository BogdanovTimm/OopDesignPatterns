package com.example.behavioral.visitor;

public class WrapperForOld1 implements WrapperInterface {

    Old1 old = new Old1();

    @Override
    public void runGivenNewMethod(NewMethodInterface newMethod) {
        newMethod.runIn(this);
    }
}
