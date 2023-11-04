package com.Prashant.InterfaceUsingAbtractClass;

public class Driver {
    public static void main(String[] args) {
        Audi audi=new Audi();
        System.out.println(Engine.curSpeed);
        System.out.println(audi.speedUp(100));
        System.out.println(audi.speedDown(20));
    }

}
