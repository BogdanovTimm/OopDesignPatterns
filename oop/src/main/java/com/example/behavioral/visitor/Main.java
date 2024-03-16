package com.example.behavioral.visitor;

public class Main {

    public static void main(String[] args) {
        WrapperForOld1 wrapperForOld1 = new WrapperForOld1();
        WrapperForOld2 wrapperForOld2 = new WrapperForOld2();

        NewMethodInterface newMethod1 = new NewMethodAsClass1();
        newMethod1.runIn(wrapperForOld1);
        newMethod1.runIn(wrapperForOld2);

        NewMethodInterface newMethod2 = new NewMethodAsClass2();
        newMethod2.runIn(wrapperForOld1);
        newMethod2.runIn(wrapperForOld2);
    }
}
