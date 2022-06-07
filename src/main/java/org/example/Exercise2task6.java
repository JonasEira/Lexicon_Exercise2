package org.example;

public class Exercise2task6 {
    private final int[] values;

    public Exercise2task6(int[] ints){
        this.values = ints;
    }

    public double average() {
        double sum = 0.0d;
        for(int n = 0; n < values.length; n++){
            sum += values[n];
        }
        return sum / (double)values.length;
    }
}
