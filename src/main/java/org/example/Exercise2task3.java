package org.example;

import java.util.Arrays;

public class Exercise2task3 {
    public String[] myStringArray;

    public Exercise2task3(){
        myStringArray = new String[]{
                "Ett",
                "Två",
                "Tre"
        };
        this.sortArray();
    }



    public void sortArray(){
        Arrays.sort(this.myStringArray);
    }


}
