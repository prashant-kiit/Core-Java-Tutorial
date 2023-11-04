package com.Prashant.Abstract;

public class Main {
    public static void main(String[] args) {
        Child child=new Child(); // Static func main() can access class since it is global
        System.out.println(child.getNum()); // overrider func will be bound
        //Base base=new Base(); //'Base' is abstract; cannot be instantiated but anonymous class can be formed
        Base b=new Base() { // Anonymous Class is a child of its Parent Class i.e. Class Base here
            // Base b= new AnonymousClassChild();
            @Override
            int getNum() {
                System.out.println("Anonymous Class getNum()");
                return 0;
            }

            @Override
            void random(int num) {
                System.out.println("Anonymous Class random(int)");
                super.random(num);
            }
        };
        b.getNum();
        b.random();
        System.out.println(Base.checker2);
        Base.random(); // calls in Parent class
        Base base=new Child();
        System.out.println(base.checker); // calls in Parent class
        base.random(); // calls in Parent class
        base.random(8, 9); // calls in Parent Class
        base.random(5); // calls in Parent class
        base.getNum(); // calls in Child class
    }
}
