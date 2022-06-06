package org.example;

public class Main {
    public static void main(String[] args) {
        int[] testArray = new int[]{
                1, 2, 4, 3
        };
        for (int n = 0; n < testArray.length; n++) {
            System.out.println(testArray[n]);
        }

        Exercise2task2 test1 = new Exercise2task2();
        Exercise2task3 sortArr = new Exercise2task3();
        sortArr.sortArray();
        for(String s : sortArr.myStringArray){
            System.out.println(s);
        }

        Exercise2task4 test4 = new Exercise2task4(new String[] { "test1", "test2"});
        test4.manualDeepCopy(new String[] {"test4", "test5"});
        for(int n = 0; n < test4.getStrArr().length; n++){
            System.out.println(test4.getStrArr()[n]);
        }
    }
}