package Java;

//import java.util.ArrayList;
//import java.util.Scanner;
// java.util.Arrays;

public class Hello {
    static class ABC {
        int p=8;
        ABC(int temp) {
            System.out.println(temp);
            System.out.println("ABC instance Initialized");
        }
        void poly(){ // Automatic virtualization of function in Java
            System.out.println("Base func called");
        }
    };
    static class XYZ extends ABC {
        int check;
        int some=2;
        private static int sth=2;
        XYZ(int temp) { 
            super(99); // declare only within a child constructor
            System.out.println(p);
            check=temp;
            System.out.println("XYZ instance Initialized");
        }
        static int count;
        //public static int count=sth*8;
        static {
            count=sth*8;
        } 
        // static int count=9; cannot initialize a static member inside class
        static void counter() { 
            
        // Outside definition of static function is not required 
        // b/c anyway a function is defined outside the class in Method Segment in memory in C++
            count++;
            // cout<<some; static function cannot access non-satic variable
        }
        void someth() {
            
            System.out.println(some); // non static function can have both static and non static member
            System.out.println(count); // non static function can have both static and non static member
        }  
        @Override // annotation used to check something
        void poly(){
            System.out.println("Child func called");
        }
    };    
    int num=0;
    public static void main(String[] args) {
        //XYZ x=new XYZ(9);
        ABC a=new XYZ(9); // Upcasting
        System.out.println(a);
        a.poly();
        // System.out.println(x.check);
        //XYZ xy=new XYZ();
        //XYZ x=new XYZ();
        //XYZ.count++;
        //x.count++;
        //System.out.println(++XYZ.count);
        // System.out.println("Hello");
        // //System.out.println("Args = " + args);
        // System.out.println(args.length);
        // ArrayList<String> result=new ArrayList<String>();
        // result.add("abc");
        //Scanner input = new Scanner(System.in);
        //System.out.println(input.nextLine());
        //String n = "13";
        //int m=(int)89089.9089;
        //int m=97;
        //char ch=98;
        //byte b=9;
        //b=9 * 7;

        // int[] arr={6,7,8};
        // int num=2;
        // //int num=9;
        // String str = new String("example");
        // char[] ch={'h','a','r','m'};
        // random(arr, num, str, ch);
        // System.out.println(Arrays.toString(arr)+" "+num+" "+str+" "+Arrays.toString(ch));
        // {
        //     num=num+1;
        // }
        // String a="Abc";
        // String b="Abc";

        //StringBuilder string = new StringBuilder(b);
        //string.setCharAt(0, 'a');

    //     System.out.println(a + b);
    //     System.out.println('a' + 3);
    //     System.out.println(new int[]{2,4,6});
    //     System.out.println(new ArrayList<Integer>(5));
    //     varargs(2,3, 5,6 ,7 ,8);
    // }
    // static void random(int[] arr, int n, String str, char[] c){
    //     arr[0]=9;
    //     c[1]='e';
    //     str=str+'o';
    //     System.out.println(Arrays.toString(arr)+" "+n+" "+str+" "+Arrays.toString(c));
    // }
    // static void varargs(int a, int b, int ...c) {
    //     System.out.println(a+" "+b+" "+Arrays.toString(c));
    }
}
