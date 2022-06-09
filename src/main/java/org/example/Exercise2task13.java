package org.example;

public class Exercise2task13 {
    private int[] arr;
    private final int length = 342;
    private int[] emptyArr;

    // Adding random numbers of 0 - 1000 to a 342 length int vector
    public Exercise2task13() {
        this.arr = new int[this.length];
        for(int n = 0; n < arr.length; n++){
            arr[n] = (int)(Math.random()*1000.0d);
        }
        this.emptyArr = new int[this.length];
    }

    // This array will sort
    public int[] sortArray(){
        int evenPointer = this.emptyArr.length - 1;
        for(int n = 0; n < this.arr.length; n++){
            if(this.arr[n] % 2 == 0){
                this.emptyArr[evenPointer--] = this.arr[n];
            }
        }
        int oddPointer = 0;
        for(int n = 0; n < this.arr.length; n++){
            if(this.arr[n]%2 == 1){
                this.emptyArr[oddPointer++] = this.arr[n];
            }
        }
        return this.emptyArr;
    }
}
