package com.atguigu04.example.exer5;
import java.lang.Math;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArray arr = new MyArray();
        int[] arrDemo = new int[10];
        for(int i = 0; i < 10; i++ ) {
            arrDemo[i] = (int)(Math.random() * 10);
            System.out.print(arrDemo[i]);
        }
        System.out.println("\n");
        System.out.println("----------分界线--------");
        arr.setMyArray(arrDemo);
        System.out.println(arr.getMax());
//        System.out.println(arr.getMyArray());
        int[] arrReve = arr.reverse();
        for(int i = 0; i < 10; i++) {
            System.out.print(arrReve[i]);
        }
    }
}
