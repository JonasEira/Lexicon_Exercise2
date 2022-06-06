package org.example;

public class Exercise2task5 {
    private String[][] array;

    public Exercise2task5(){
        this.setArray(new String[2][2]);

    }

    public void populateDefault(){
        this.array[0][0] = "France";
        this.array[0][1] = "Paris";
        this.array[1][0] = "Germany";
        this.array[1][1] = "Berlin";
    }

    public String[][] getArray() {
        return array;
    }

    public void setArray(String[][] array) {
        this.array = array;
    }
}
