package com.Prashant.Copy;

class Car implements Cloneable {
    private String name; // Only Shallow Copy will happen
    private float price;
    public Car() {

    }
    public Car(String name, float price) {
        this.name = name;
        this.price = price;
    }

    void deepCopy(Car other) {
        this.name = other.name; // Shallow Copy
        this.price = other.price; // Deep Copy
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone(); // like deepCopy() or deep/shallow cloning
    }
    void display() {
        System.out.println(name + "-" + price);
    }
}
