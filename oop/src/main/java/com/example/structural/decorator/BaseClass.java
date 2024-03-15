package com.example.structural.decorator;

public class BaseClass implements CommonInterface {
    @Override
    public void modifiableMethod() {
        System.out.println("Common part called");
    }
}
