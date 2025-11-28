package com.sorting.hard;

public class Quick_Sort {

    static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low+1 , j = high;
        while(i<=j){
            while(i<=high && arr[i]<=pivot) i++;
            while(j>=low && arr[j]>pivot) j--;
           if(i<j){
               int temp = arr[i];
               arr[i] =arr[j];
               arr[j] = temp;
           }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void qs(int[] arr, int low, int high){
        if(low<=high){
        int partitionIndex = partition(arr,low,high);
          //left
          qs(arr,low,partitionIndex-1);
          //right
          qs(arr,partitionIndex+1,high);
         }
    }

    public static void main(String[] args) {
        int[] arr = {9,4,7,3,1};
        qs(arr,0,arr.length-1);
        System.out.println("Quick Sort");
        for (int k : arr){
            System.out.print(k+" ");
        }
    }
}
