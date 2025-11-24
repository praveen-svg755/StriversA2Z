package com.sorting.hard;

public class Recursive_Insertion_Sort {

    static void insertSort(int[] arr , int i , int n){

        if (i == n ) return;

        int j = i;
        while (j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertSort(arr,i+1 , n);

    }

    public static void main(String[] args) {
        int[] arr = {90,76,34,11,5,9,14,1,8,6};
        insertSort(arr,0,arr.length);
        System.out.println("Recursive Insertion Sort");
        for (int k : arr){
            System.out.print(k+" ");
        }
    }
}
