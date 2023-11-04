package com.Prashant.Copy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car audi=new Car("Audi", 100);
        audi.display();
        Car maruti=new Car();

        maruti.deepCopy(audi); // deep/shallow cloning
        maruti.display();
        System.out.println(audi == maruti); // false

        maruti=audi; // shallow cloning
        maruti.display();
        System.out.println(audi == maruti); // true

        maruti= (Car) audi.clone(); // cloning (deep/shallow cloning)
        maruti.display();
        System.out.println(audi == maruti); // false
    }
}
