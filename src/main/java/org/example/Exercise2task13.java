package org.example;

public class Exercise2task13 {
    private int[] arr;
    private final int length = 342;
    private int[] emptyArr;

    // Adding random numbers of 0 - 1000 to a 342 length int vector
    public Exercise2task13() {
        this.arr = new int[this.length];
        for(int n = 0; n < arr.length; n++){
            arr[n] = (int)(Math.random()*1000.0d)
        }
        this.emptyArr = new int[this.length]
    }

    public int[] sortArray(){

    }
}
