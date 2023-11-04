package com.Prashant.Access;

import com.Prashant.Object.ObjectDB; // ObjectDB is importable b/c it is declared to be public
// if not public import was not possible

public class Main extends Child2 {

    public static void main(String[] args) {
        Child2 c=new Child2();
        System.out.println(c.getNum());
        ObjectDB xyx=new ObjectDB();
        xyx.start("String");
    }
}
