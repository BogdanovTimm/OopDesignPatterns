package com.example.behavioural.abstract_method;

public class Main {
    public static void main(String[] args) {
        AbstractParent class1OrClass2 = AbstractParent.create(ChildClass1.class);
        AbstractParent class2OrClass1 = AbstractParent.create(ChildClass2.class);
        class1OrClass2.commmonMethod();
        class2OrClass1.commmonMethod();
    }
}
