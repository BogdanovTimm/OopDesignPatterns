package com.example;

import com.example.behavioural.abstract_factory.Class1Interface;
import com.example.behavioural.abstract_factory.Class2Interface;
import com.example.behavioural.abstract_factory.FactoryInterface;
import com.example.behavioural.abstract_factory.group1.FactoryForGroup1;
import com.example.behavioural.abstract_factory.group2.FactoryForGroup2;

public class AbstractFactory {
    public static void main(String[] args) {
        FactoryInterface factoryForEitherGroup;
        // Choosing Factory in a RunTime
        if (args.length > 0) {
            factoryForEitherGroup = new FactoryForGroup1();
        } else {
            factoryForEitherGroup = new FactoryForGroup2();
        }
        Class1Interface class1FromEitherGroup = factoryForEitherGroup.createClass1();
        Class2Interface class2FromEitherGroup = factoryForEitherGroup.createClass2();
        class1FromEitherGroup.class1Method();
        class2FromEitherGroup.class2Method();
    }
}