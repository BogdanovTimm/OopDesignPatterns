package com.example.behavioral.command;

public class Main {
    public static void main(String[] args) {
        ActualDoer actualDoer = new ActualDoer();
        Action1 action1 = new Action1(actualDoer);
        Action2 action2 = new Action2(actualDoer);
        ListOfActions listOfActions = new ListOfActions();
        listOfActions.addAction(action1);
        listOfActions.addAction(action2);
        listOfActions.runAllActions();
    }
}
