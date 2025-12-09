package com.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders_in_an_Array_problem {

    static void leaders(int[] arr){
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=n-1 ; i>=0 ; i--){
            if(max<arr[i]){
                max = arr[i];
                leaders.add(max);
            }
        }

        Collections.reverse(leaders);

        for (int i : leaders){
            System.out.print(i+ " ");
        }



    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        leaders(arr);
    }
}
