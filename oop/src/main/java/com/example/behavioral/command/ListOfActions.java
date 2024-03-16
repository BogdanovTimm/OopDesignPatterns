package com.example.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class ListOfActions {
    private List<ActionInterface> listOfActions = new ArrayList<>();

    public void addAction(ActionInterface action) {
        listOfActions.add(action);
    }

    public void runAllActions() {
        for (ActionInterface currentAction : listOfActions) {
            currentAction.doAction();
        }
        listOfActions.clear();
    }
}
