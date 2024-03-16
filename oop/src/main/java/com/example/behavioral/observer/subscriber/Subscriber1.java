package com.example.behavioral.observer.subscriber;

import com.example.behavioral.observer.classtowatch.ClassToWatchInterface;

public class Subscriber1 implements SubscriberInterface {
    public Subscriber1(ClassToWatchInterface classToWatchFor) {
        classToWatchFor.subscribe(this);
    }

    @Override
    public void classWasChanged() {
        System.out.println("Subscriber 1 was notified");
    }
}
