package com.arrays.easy;

public class Largest_Element_in_an_Array {

    static int getMax(int[] arr,int n){
        int max = arr[0];
        for(int i=1 ; i<n ; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println(getMax(arr,arr.length));

    }
}
