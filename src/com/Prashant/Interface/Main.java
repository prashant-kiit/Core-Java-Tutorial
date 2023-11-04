package com.Prashant.Interface;

public class Main {
    public static void main(String[] args) {
        Child child=new Child();
        child.walk();
        child.run();

        Base base=new Child();
        base.run();
        base.walk();

        //Base base=new Base(); // Like abstract class, interfaces cannot have instances
        Base.fly(); // must call the Base's fly()

        System.out.println(Child.number); // access Child's number over Parent's number
        System.out.println(child.number); // access Child's number over Parent's number
        System.out.println(Base.number); // normal behaviour as C++; accesses Parent's number
        System.out.println(base.number); // normal behaviour as C++; accesses Parent's number
    }
}
