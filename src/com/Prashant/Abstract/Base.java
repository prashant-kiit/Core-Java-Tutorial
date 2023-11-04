package com.Prashant.Abstract;

abstract class Base { // abstract class cannot be final b/c final will prevent inheritance
    // and without inheritance abstract method inside it will not be strictly overridden
    int checker=999;
    static int checker2=908;
    Base() {
        //This constructor cannot be used b/c new ClassName() / instantiation is not allowed
        // for abstract class
    }
    static void random() {
        System.out.println("This is Base's random()");
    }// Overloading of static func // Hiding the Child random()

    static void random(int num, int num2) {
        System.out.println("This is Base's random(int, int)" + (num + num2));
    } // Overloading of static func
    void random(int num) {
        System.out.println("This is Base's random(int)");
    }// Overloading of static func
    abstract int getNum(); // like pure virtual function of C++
    // static abstract int getNum(); is illegal b/c Base.getNum() will call the fun , which is
    // contradictory of fun's abstract nature
}
