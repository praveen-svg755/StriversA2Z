package com.arrays.easy;

public class Remove_duplicates_from_Sorted_array {

    static int remove(int[] arr , int n){
           int index = 0;
           for(int i=1 ; i<n ; i++){
               if(arr[index] != arr[i]){
                   arr[++index] = arr[i];
               }
           }
           return index+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,3,6,7,8,8};
        int newSize =  remove(arr,arr.length);
        for (int i=0  ; i< newSize ; i++){
            System.out.println(arr[i]);
        }
    }
}
