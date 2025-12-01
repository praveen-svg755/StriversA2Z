package com.arrays.easy;

public class Find_the_number_that_appears_once {

    static int appearOnes(int[] arr){
        int xor = 0;
        for(int i=0 ; i<arr.length ; i++){
            xor ^= arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(appearOnes(arr));
    }
}
