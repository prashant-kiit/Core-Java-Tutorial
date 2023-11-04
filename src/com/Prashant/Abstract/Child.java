package com.Prashant.Abstract;

class Child extends Base{
    @Override
    int getNum() {
        int num2=12;
        System.out.println("This is Child's getNum()");
        return num2*num2;
    }
    static void random() {
        System.out.println("This is Child's random()");
    }
}
