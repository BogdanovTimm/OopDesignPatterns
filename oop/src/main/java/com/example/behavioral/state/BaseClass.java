package com.example.behavioral.state;

public class BaseClass {
    State state = new State();

    void method1() {
        state.method1();
    }
}
