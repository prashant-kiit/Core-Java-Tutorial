package com.Prashant.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student salman=new Student(89.7f,9.8f);
        Student srk=new Student(98.9f,8.9f);
        Student sanjay=new Student(79.7f,5.8f);
        Student ranbir=new Student(81.9f,8.3f);
        salman.getDetails();
        srk.getDetails();
        sanjay.getDetails();
        ranbir.getDetails();
        Student[] list={salman, srk, sanjay, ranbir}; // static initialization of list array
        System.out.println(Arrays.toString(list));
        //Method 1:
        Arrays.sort(list, new Comparator<>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.percentage- o2.percentage);
            }
        });
        System.out.println(Arrays.toString(list));
        //Method 2:
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        if (salman.compareTo(srk) > 0) {
            System.out.println("Salman Wins");
        }
        else {
            System.out.println("SRK Wins");
        }
    }

}
