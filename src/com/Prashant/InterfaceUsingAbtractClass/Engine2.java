package com.Prashant.InterfaceUsingAbtractClass;

public abstract class Engine2 {
    static final int curSpeed2=0; // can be accessed by Class and value is fixed
    public abstract int speedUp2(int inc); // accessible by world
    public abstract int speedDown2(int dec); // accessible by world
}
