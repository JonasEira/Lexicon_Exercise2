package org.example;

import java.util.Arrays;

public class Exercise2task4 {
    private String[] strArr;

    public Exercise2task4(String[] strArr){
        this.setStrArr(strArr);
    }

    public void copyArray(String[] arr){
        this.strArr = Arrays.copyOf(arr, arr.length);

    }

    public void manualDeepCopy(String[] arr){
        if(arr.length > 0){
            strArr = new String[arr.length];
        }
        for (int n = 0; n < arr.length; n++){
            strArr[n] = arr[n];
        }
    }


    public String[] getStrArr() {
        return strArr;
    }

    public void setStrArr(String[] strArr) {
        this.strArr = strArr;
    }
}

