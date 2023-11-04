package com.Prashant.Test;

public class Test1 {
    public static void main(String[] args) {
        float[] a2=new float[5];
        for(int i=0; i<6;i++) { // Error: Out of length
            a2[i]=i+1;
        }
        for(int i=0; i<7;i++) { // Error: Out of length
            System.out.println(a2[i]);
        }
    }
    //Compare with C++ test5.cpp
}
