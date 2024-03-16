package com.example.behavioral.visitor;

public class NewMethodAsClass1 implements NewMethodInterface {
    @Override
    public void runIn(WrapperForOld1 wrapperForOld1) {
        System.out.println("[New method 1] for [Old 1] is running...");
    }

    @Override
    public void runIn(WrapperForOld2 wrapperForOld2) {
        System.out.println("[New method 1] for [Old 2] is running...");

    }

}
