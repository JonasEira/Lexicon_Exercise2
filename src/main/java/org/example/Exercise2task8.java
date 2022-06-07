package org.example;

public class Exercise2task8 {
    private int[] numArray;

    public Exercise2task8(){
        this.numArray = new int[] {
                20, 20, 40, 20,
                30, 40, 50, 60,
                50
        };
        System.out.println("\nOur array is at first: ");
        this.printArray(this.numArray);
        int[] result = removeDuplicates(this.numArray);
        System.out.println("\nAfter removing duplicates: ");
        this.printArray(result);

    }

    public static int[] removeDuplicates(int[] arr){
        int position = 0;
        int[] newArray = new int[arr.length];
        for(int n = 0; n < arr.length; n++){
            boolean exists = false;
            for(int j = 0; j < newArray.length; j++){
                if(arr[n] == newArray[j]){
                    exists = true;
                }
            }
            if(!exists){
                newArray[position++] = arr[n];
            }
        }
        int length = 0;
        while(newArray[length] != 0){
            length++;
        }
        int[] result = new int[length];
        for(int n = 0; n < length; n++){
            result[n] = newArray[n];
        }
        return result;
    }

    public void printArray(int[] arr){
        for(int n = 0; n < arr.length; n++){
            System.out.print(arr[n] + " ");
        }
    }
}
