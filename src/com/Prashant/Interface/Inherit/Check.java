package com.Prashant.Interface.Inherit;

public class Check implements B, A, C {
    @Override
    public void fun() {
        System.out.println("This function is important");
    }
    @Override
    public void funB() {
        System.out.println("This funB() in Check Class");
    }

    @Override
    public void funD() {
        System.out.println("This is overridden definition of funD() in Class Check");
    }

    void foo1() { // This has nothing to dod with Static function of Class A(Base)
        System.out.println("Static method with Definition in Class Check");
    }
}
