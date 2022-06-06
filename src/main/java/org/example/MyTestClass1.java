package org.example;

public class MyTestClass1 {
    public MyTestClass1(){
        int[] testArray = new int[]{
                1,5,3,4,2
        };
        int num = 4;
        System.out.println("The number " + num + " has index " + indexOf(num, testArray));
    }
    public static int indexOf(int number, int[] array){
        for(int n = 0; n < array.length; n++){
            if(number == array[n]){
                return n;
            }
        }
        return -1;
    }
}
