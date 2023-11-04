package com.Prashant.Interface.Inherit;

interface B extends A{
    @Override
    void fun(); // overrides the fun() in Class A
    void funB();
    default void funC() { // default func is treated as if it is defined in the child class
        System.out.println("This is default definition of funC() in interface B");
    }
    default void funD() {
        System.out.println("This is default definition of funD() in interface B");
    }

//    default void funE() {
//    // two default functions implemented from two different interfaces is treated
//    // will the error, B/c the class will confused which one to implement.
//    // In this , a new overriding function needs to be defined in the class
//        System.out.println("This is default definition of funE() in interface B");
//    }
}
