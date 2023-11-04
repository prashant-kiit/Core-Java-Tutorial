package com.Prashant.Static;
class B {
    int x;
    public B(int x) {
        this.x=x;
    }

    public B() {

    }
}
public class Main {
    static B b3=new B(); // Default
    private static int pqr=56;
    private int pqr2=489;
    static int pqr3=789;
    static class Subclass {
        private int x=90;
        void display() {
            System.out.println(pqr);
            //System.out.println(pqr2); Error: static can access only static
            System.out.println(pqr3);
        }
    }
    public static void main(String[] args) {
        Subclass s=new Subclass();
        System.out.println(s.x);
        // Unlike C++, in Java Outer class can access private and protected members of inner class
        // And Inner class can also access private and protected of outer class
        // Static inner class can only access static member of outer class
        B b1=new B(8);
        b3.x=9; // b3 identifiable
        System.out.println(b1.x);
        System.out.println("b3.x="+b3.x);
        Main.Subclass inner=new Main.Subclass();
        inner.display();
    }
}
