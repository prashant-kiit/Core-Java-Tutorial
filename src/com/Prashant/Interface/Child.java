package com.Prashant.Interface;

class Child implements Base{
    static int number=12345;
    @Override
    public void walk() {
        System.out.println("I am walking");
    }

    @Override
    public void run() {
        System.out.println("I am running");
    }
    static void fly() {
        System.out.println("I am flying in Child");
    }
}
