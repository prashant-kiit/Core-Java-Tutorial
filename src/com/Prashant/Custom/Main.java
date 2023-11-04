package com.Prashant.Custom;


public class Main {
    public static void main(String[] args) {
        CustomArray<Integer> l=new CustomArray<Integer>();
        l.show();
        CustomArray<Integer> list = new CustomArray<Integer>(new Object[]{2, 3, 4});
        list.show();
        System.out.println(list.size());
        list.insert(0,0);
        list.insert(1, 1);
        list.show();
        for (int i=5; i<19; i++) {
            list.push(i);
        }
        System.out.println(list);
        for (int i=0; i<5; i++) {
            list.pop();
        }
        System.out.println(list);
        System.out.println(list.remove(3));
        list.show();
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        list.set(1,456);
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        list.set(0,9456);
        System.out.println(list.get(0));
        list.insert(8, 15);
        list.show();
        System.out.println(list.pop());
        list.show();
        CustomArray<String> list2 = new CustomArray<String>(new Object[]{"Prashant", "Kumar", "Singh"});
        list2.show();
    }
}
