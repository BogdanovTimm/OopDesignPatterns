package com.example.behavioural.abstract_method;

public abstract class AbstractParent {

    public static AbstractParent create(Class<? extends AbstractParent> givenClass) {
        if (givenClass.equals(ChildClass1.class)) {
            return new ChildClass1();
        } else if (givenClass.equals(ChildClass2.class)) {
            return new ChildClass2();
        } else {
            return null;
        }
    }

    public abstract void commmonMethod();
}
