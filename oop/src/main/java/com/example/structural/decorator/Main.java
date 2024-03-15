package com.example.structural.decorator;

public class Main {
    public static void main(String[] args) {
        CommonInterface baseClass = new BaseClass();
        CommonInterface modifiedBaseClass = new MethodAdder1(baseClass);
        CommonInterface evenMoreModifiedBaseClass = new MethodAdder2(modifiedBaseClass);
        evenMoreModifiedBaseClass.modifiableMethod();
    }
}
