package com.example.behavioral.observer.classtowatch;

import com.example.behavioral.observer.subscriber.SubscriberInterface;

public interface ClassToWatchInterface {
    void subscribe(SubscriberInterface subscriber);
    void notifyAllSubscribers();
}
