package com.Prashant.Interface.Inherit;

interface C {
    default void funE() { // default func is treated as if it is defined in the child class
        System.out.println("This is default definition of funE() in interface A");
    }
}
