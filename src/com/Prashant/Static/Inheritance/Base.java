package com.Prashant.Static.Inheritance;

class Base {
    static void fun() {
        System.out.println("This is fun() in Class Base");
    }
    static void fun1() { // Illegal combination of modifiers: 'abstract' and 'static'
        System.out.println("This is fun1() in Class Base");
    }
}
