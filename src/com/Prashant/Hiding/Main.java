package com.Prashant.Hiding;

public class Main {
    public static void main(String[] args) {
        Parent parent=new Child();
        parent.foo(); // gives "This is Child" // This gives "This is Parent" if parent class foo()
        // is not overridden by the child class foo().
        Parent.fun(); // gives "This is Parent"
        Child child=new Child();
        Child.fun();
    }
}
