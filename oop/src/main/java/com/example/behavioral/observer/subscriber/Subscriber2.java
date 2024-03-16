package com.example.behavioral.observer.subscriber;

import com.example.behavioral.observer.classtowatch.ClassToWatchInterface;

public class Subscriber2 implements SubscriberInterface {
    public Subscriber2(ClassToWatchInterface classToWatchFor) {
        classToWatchFor.subscribe(this);
    }

    @Override
    public void classWasChanged() {
        System.out.println("Subscriber 2 was notified");
    }
}
