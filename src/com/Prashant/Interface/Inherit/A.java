package com.Prashant.Interface.Inherit;

interface A {
    void fun();

    static void foo1() { // Unlike Default function, consider Static function to in Interface only
        // Even interface's methods are abstract, but they can be static.
        // This is unlike the abstract methods of abstract class.
        System.out.println("Static method with Definition in Interface A");
    }
}
