package com.Prashant.Custom;

import java.util.Arrays;

class CustomArray<T> { // Use Wildcards to limit the parameterized datatype
    private Object[] arr;
    private int currentSize;
    private int size;
    private static final int defaultSize=1;

    CustomArray() {
        currentSize=defaultSize;
        arr=new Object[currentSize];
        size= arr.length;
        arr[0]=-1;
    }
    CustomArray(Object[] temp) {
        currentSize= temp.length+1;
        arr=new Object[currentSize];
        size= temp.length+1;
        System.arraycopy(temp, 0, arr, 0, temp.length);
        arr[size-1]=-1;
        // Auto Garbage Collection
    }


    void show() {
        System.out.print("[ ");
        for(int i=0;i<size-1;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    Object get(int pos) {
        if (pos>size-2 && pos>=0) {
            System.out.println("Error: OutOfBounds");
            System.exit(100);
        }
        return arr[pos];
    }

    void set(int pos, T value) {
        if (pos>size-2 && pos>=0) {
            System.out.println("Error: OutOfBounds");
            System.exit(100);
        }
        arr[pos]=value;
    }
    int size() {
        return size-1;
    }
    void insert(int pos, T  value) {
        if (pos>size-1 && pos>=0) {
            System.out.println("Error: OutOfBounds");
            System.exit(100);
        }
        if(size==currentSize) {
            Object[] temp=arr;
            arr=new Object[2*currentSize];
            System.arraycopy(temp, 0, arr, 0, temp.length);
            currentSize*=2;
            // Auto Garbage collection
        }
        for(int i=size-1; i>=pos;i--) {
            arr[i+1]=arr[i];
        }
        arr[pos] = value;
        size++;
    }

    T remove(int pos) {
        if (pos>size-2 && pos>=0) {
            System.out.println("Error: OutOfBounds");
            System.exit(100);
        }
        if(size==currentSize/2) {
            Object[] temp=new Object[currentSize/2+1];
            System.arraycopy(arr, 0, temp, 0, temp.length);
            arr=temp;
            currentSize/=2;
            // Auto Garbage collection
        }
        T removed=(T)arr[pos];
        for(int i=pos; i<size;i++) {
            //System.out.println("c "+i);
            arr[i]=arr[i+1];
        }
        arr[pos+1]=0;
        size--;
        return removed;
    }
    void push(T value) {
        insert(size-1,value);
    }
    T pop() {
        return remove(size-2);
    }
    @Override // overriding toString() of Object Class
    public String toString() {
        return "CustomArray{" +
                "arr=" + Arrays.toString(arr) +
                ", currentSize=" + currentSize +
                ", size=" + size +
                '}';
    }
}
