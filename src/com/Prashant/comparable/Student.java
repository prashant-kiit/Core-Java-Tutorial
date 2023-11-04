package com.Prashant.comparable;

import org.jetbrains.annotations.NotNull;

class Student implements Comparable<Student>{
    final float percentage;
    final float percentile;
    Student(float percentage, float percentile) {
        this.percentage = percentage;
        this.percentile = percentile;
    }
    void getDetails() {
        System.out.println("Percentage="+percentage);
        System.out.println("Percentile="+percentile);
    }
    //Method 2:
    @Override
    public int compareTo(@NotNull Student o) {
        return (int)(this.percentage-o.percentage);
    }

    @Override
    public String toString() {
        return "Student{" +
                "percentage=" + percentage +
                ", percentile=" + percentile +
                '}';
    }
}
