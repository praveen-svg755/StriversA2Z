package com.arrays.easy;

public class Check_if_the_array_is_sorted {

    static boolean isSorted(int[] arr , int n){
        //O(n) TC
        boolean flag = false;
        for(int i=1 ; i<n ; i++){
            if(arr[i-1] < arr[i]){
                flag = true;
            }else{
                return false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(isSorted(arr,arr.length));
    }
}
