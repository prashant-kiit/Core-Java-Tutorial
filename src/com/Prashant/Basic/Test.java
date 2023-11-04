package Java;

class B {    
    int x;
    B(int temp) {
        x=temp;
    }
};
// Java Main Class
class Test {
    //static B b3;
    public static void main(String[] args) {
        B b1=new B(8);
        B b2=new B(10);
        //b3.x=9;
        System.out.println(b1.x);
        System.out.println(b2.x);
    }
};

