package com.Prashant.Interface;

interface Base {
    int number=12345; // public static final variable of interface
    void walk(); // public abstract function of interface
    void run();

    static void fly() {
        System.out.println("I am flying in Base");
    } // will Hide the Child's fly()
}
