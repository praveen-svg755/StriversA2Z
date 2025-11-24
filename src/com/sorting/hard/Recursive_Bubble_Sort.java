package com.sorting.hard;

public class Recursive_Bubble_Sort {

    static void bubbleSort(int[] arr , int n){
        if(n == 1) return;
        for(int j=1 ; j<n ; j++){
            if(arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        bubbleSort(arr,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {90,76,34,11,5,9,14,1,8,6};
        bubbleSort(arr,arr.length);
        System.out.println("Recursive Bubble Sort");
        for (int k : arr){
            System.out.print(k+" ");
        }
    }
}
