package com.Prashant.Static.Inheritance;

public class Main {
    public static void main(String[] args) {
        Base b=new Base();
        Child c=new Child();
        Base bc=new Child();
        b.fun();
        c.fun(); // Static method can be inherited
        bc.fun();
        b.fun1();
        c.fun1();
        bc.fun1(); // Method Hiding
    }
}
