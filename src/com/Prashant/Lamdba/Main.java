package com.Prashant.Lamdba;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.forEach((element)-> System.out.println(element + 100));
        // Till same as C++

        // where Class Operation_Child implements Operation {
        // @sumAsAlias
        // int operation(int a, int b) {
        // return a+b;
        // }
        // @prodAsAlias
        // int operation(int a, int b) {
        // return a*b;
        // }
        // }

        Operation sum= (a,b)->a+b; // Operation sum=new Operation_Child();
        Operation prod= (a,b)->a*b; // Operation prod=new Operation_Child();

        System.out.println(sum.operation(1,3)); // System.out.println(sum.operation(2,3));
        System.out.println(prod.operation(5,7)); // System.out.println(prod.operation(2,3));
    }
}
