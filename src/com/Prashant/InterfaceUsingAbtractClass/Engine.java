package com.Prashant.InterfaceUsingAbtractClass;
// Like an Interface
abstract class Engine extends Engine2{
    public static final int curSpeed=0; // can be accessed by Class and value is fixed
    public abstract int speedUp(int inc); // accessible by world
    public abstract int speedDown(int dec); // accessible by world
}
