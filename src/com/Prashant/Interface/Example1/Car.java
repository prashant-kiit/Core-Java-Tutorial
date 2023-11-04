package com.Prashant.Interface.Example1;

class Car implements Vintage, Modern{
    public void start() {
        System.out.println("Vintage Starts");
    }
    public void stop() {
        System.out.println("Modern Stops");
    }
}
