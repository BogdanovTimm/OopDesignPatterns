package com.example.behavioral.observer.classtowatch;

import java.util.List;

import com.example.behavioral.observer.subscriber.SubscriberInterface;

import java.util.ArrayList;

public class ClassToWatch2 implements ClassToWatchInterface {
    List<SubscriberInterface> listOfSubscribers = new ArrayList<>();

    @Override
    public void subscribe(SubscriberInterface subscriber) {
        listOfSubscribers.add(subscriber);
    }

    @Override
    public void notifyAllSubscribers() {
        for (SubscriberInterface currentSubscriber : listOfSubscribers) {
            currentSubscriber.classWasChanged();
        }
    }
}
