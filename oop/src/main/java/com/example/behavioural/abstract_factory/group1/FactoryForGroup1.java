package com.example.behavioural.abstract_factory.group1;

import com.example.behavioural.abstract_factory.Class1Interface;
import com.example.behavioural.abstract_factory.Class2Interface;
import com.example.behavioural.abstract_factory.FactoryInterface;

public class FactoryForGroup1 implements FactoryInterface {

    @Override
    public Class1Interface createClass1() {
        Class1Interface class1 = new Group1Class1();
        return class1;
    }

    @Override
    public Class2Interface createClass2() {
        Class2Interface class2 = new Group1Class2();
        return class2;
    }
    
}
