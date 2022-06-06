package org.example;

import java.util.Collection;
import java.util.Arrays;

public class SortAnArrayClass {
    public String[] myStringArray;

    public SortAnArrayClass(){
        myStringArray = new String[]{
                "Ett",
                "Två",
                "Tre"
        };
        this.sortArray();
    }

    public void setMyStringArray(String[] arr){
        this.myStringArray = Arrays.copyOf(arr, arr.length);

    }

    public void sortArray(){
        Arrays.sort(this.myStringArray);
    }


}
