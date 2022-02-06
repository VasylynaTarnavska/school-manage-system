package model;

import java.util.Arrays;
import Exception.NotElementListException;

public class MyList <T> {

    private T[] arr;

    private Integer capacity;

    private Integer size;

    public MyList() {
        this.capacity = 10;
        this.arr = (T[]) new Object[10];
        this.size = 0;
    }

    @Override
    public String toString() {
        String t = "[ ";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                t += arr[i].toString();
            }
            if (i<arr.length-1 &&arr[i+1] != null){
                t += ", ";
            }
        }
        t+=" ]";
        return t;

    }


    public void add (T t){
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==null){
//                arr[i]=t;
//                size+=1;
//                return;
//            }
        if (size>=capacity){
            capacity=(capacity*3)/2+1;
            this.arr = copyAllArgsFromArrayToNewArray(this.arr);
        }
        arr[size]=t;
        size++;
    }

    public void add(int index, T t){
        if(index>=size){
            throw new NotElementListException("List dont have this element");
        }
        arr[index]=t;
    }

    private T[] copyAllArgsFromArrayToNewArray(T[] oldArray){
        T[]newArray=(T[])new Object[this.capacity];
        for (int i = 0; i <this.arr.length ; i++) {
            newArray[i]=this.arr[i];
        }
        return newArray;
    }

    public T get(int index){
        if(index>size-1) {
            throw new NotElementListException("List dont have this element");
        }
            return arr[index];
    }

    public boolean contains(T t){
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(t)){
                return true;
            }
        }
        return false;
    }

    public void remove (int i){
        if(i>size-1) {
            throw new NotElementListException("List dont have this element");
        }
        size-=1;
        T[]newArray=(T[])new Object[this.capacity];
        for (int j = 0; j < i-1; j++) {
            newArray[j]=arr[j];
        }
        for (int j = i; j <size-1 ; j++) {
            newArray[j]=arr[j+1];
        }
        this.arr=newArray;
    }


}
