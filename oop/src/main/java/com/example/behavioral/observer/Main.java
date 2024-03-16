package com.example.behavioral.observer;

import com.example.behavioral.observer.classtowatch.ClassToWatch1;
import com.example.behavioral.observer.classtowatch.ClassToWatchInterface;
import com.example.behavioral.observer.subscriber.Subscriber1;
import com.example.behavioral.observer.subscriber.Subscriber2;
import com.example.behavioral.observer.subscriber.SubscriberInterface;

public class Main {
    public static void main(String[] args) {
        ClassToWatchInterface classToWatchFor = new ClassToWatch1();
        SubscriberInterface subscriber1 = new Subscriber1(classToWatchFor);
        SubscriberInterface subscriber2 = new Subscriber2(classToWatchFor);
        classToWatchFor.notifyAllSubscribers();
    }
}