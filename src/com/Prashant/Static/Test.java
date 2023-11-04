package com.Prashant.Static;

import com.Prashant.Access.Child;

import java.util.ArrayList;

// import is like declaration whereas access specifiers decide accessibility
public class Test extends Child{
    public static void main(String[] args) {
        Child ch=new Child();
        System.out.println(ch.getNum());
        //int n=ch.no; // protected is not accessible from a subclass of different package
        Test t=new Test();
        System.out.println(t.no); // This is normal inheritance
        ArrayList er=new ArrayList<>();
    }
}