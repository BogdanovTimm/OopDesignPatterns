package com.example.behavioral.command;

public class Action1 implements ActionInterface {
    private ActualDoer current_requester;

    public Action1(ActualDoer given_requester_instance) {
        this.current_requester = given_requester_instance;
    }

    @Override
    public void doAction() {
        current_requester.function1();
    }
}
