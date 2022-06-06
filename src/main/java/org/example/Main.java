package org.example;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[]{
                1, 2, 4, 3
        };
        for (int n = 0; n < testArray.length; n++) {
            System.out.println(testArray[n]);
        }

        MyTestClass1 test1 = new MyTestClass1();
        SortAnArrayClass sortArr = new SortAnArrayClass();
        sortArr.sortArray();
        for(String s : sortArr.myStringArray){
            System.out.println(s);
        }
    }
}