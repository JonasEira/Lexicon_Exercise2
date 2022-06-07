package org.example;

public class Exercise2task7 {
    private int[] numArray;

    public Exercise2task7(){
        this.numArray = new int[] {
                1, 2, 4, 7, 9, 12
        };
    }

    public void printUneven(){
        for(int num : this.numArray){
            if(num%2 == 0){
                System.out.print(num + " ");
            }
        }
    }
}
