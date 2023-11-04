package com.Prashant.InterfaceUsingAbtractClass;

class Audi extends Engine//, Engine2 // any class cannot be inherited multiply
{
    @Override
    public int speedUp(int inc){return curSpeed+inc;}

    @Override
    public int speedDown(int dec){return curSpeed-dec;}

    @Override
    public int speedUp2(int inc) {
        return 0;
    }

    @Override
    public int speedDown2(int dec) {
        return 0;
    }
}
