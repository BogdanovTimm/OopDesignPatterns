package com.example.structural.adapter.newcode;

import com.example.structural.adapter.oldcode.FinalOld1;
import com.example.structural.adapter.oldcode.FinalOld2;

public class WrapperForFinalOld2 implements WrapperInterface {
    FinalOld2 old = new FinalOld2();

    @Override
    public void newMethod1() {
        System.out.println("[New Method 1] for [Final Old 1] is running...");
        old.finalMethod();
        System.out.println("Something new is added");
    }

    @Override
    public void newMethod2() {
        System.out.println("[New Method 2] for [Final Old 1] is running...");
        old.finalMethod();
        System.out.println("Something new 2 is added");
    }
}
