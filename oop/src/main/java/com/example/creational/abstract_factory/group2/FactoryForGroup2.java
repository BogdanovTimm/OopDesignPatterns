package com.example.creational.abstract_factory.group2;

import com.example.creational.abstract_factory.Class1Interface;
import com.example.creational.abstract_factory.Class2Interface;
import com.example.creational.abstract_factory.FactoryInterface;

public class FactoryForGroup2 implements FactoryInterface {
    @Override
    public Class1Interface createClass1() {
        Class1Interface class1 = new Group2Class1();
        return class1;
    }

    @Override
    public Class2Interface createClass2() {
        Class2Interface class2 = new Group2Class2();
        return class2;
    }
}
