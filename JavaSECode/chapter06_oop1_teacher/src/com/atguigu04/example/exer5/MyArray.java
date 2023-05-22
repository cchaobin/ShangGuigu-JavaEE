package com.atguigu04.example.exer5;

public class MyArray {
    private int[] myArray;

    public MyArray(){
        myArray = new int[]{};
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public int[] getMyArray(){
        return myArray;
    }

    public int getMax() {
        int max = myArray[0];
        for(int i = 0; i < myArray.length; i++ ){
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        return max;
    }

    public int[] reverse() {
        int temp;
        for(int i = 0; i < myArray.length / 2; i++) {
            temp = myArray[i];
            myArray[i] = myArray[myArray.length - i - 1];
            myArray[myArray.length - i - 1] = temp;
        }
        return myArray;
    }
}
