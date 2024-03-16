package com.example.structural.adapter.newcode;

public class Main {
    public static void main(String[] args) {
        WrapperInterface wrapperForFinalOld1 = new WrapperForFinalOld1();
        WrapperInterface wrapperForFinalOld2 = new WrapperForFinalOld2();
        wrapperForFinalOld1.newMethod1();
        wrapperForFinalOld2.newMethod1();
    }
}
