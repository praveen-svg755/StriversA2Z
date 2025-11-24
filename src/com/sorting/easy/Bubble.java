package com.sorting.easy;

public class Bubble {
    public static void bubbleSort(int[] arr, int n){
        //comparison
        for (int i=0 ; i<n ; i++){
            boolean flag = false;
            for(int j=1 ; j<n-i ; j++){
                if(arr[j-1]> arr[j]){
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }

    }
    public static void main(String[] args) {
        int[] arr = {90,76,34,11,5,9,14,1,8,6};
        bubbleSort(arr,arr.length);
        for (int k : arr){
            System.out.print(k+" ");
        }
    }
}
