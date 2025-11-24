package com.sorting.easy;

public class Insertion {
    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        int n = array.length;

        insertionSort(array , n);

    }

    public static void insertionSort(int[] array , int n){
        int j;
        for(int i=0 ; i<n ; i++){
            j = i;
            while(j>0 && array[j-1] > array[j]){
                 int temp = array[j];
                 array[j] = array[j-1];
                 array[j-1] = temp;
                 j--;
            }
        }
        for (int i : array){
            System.out.print(" "+i);
        }

    }
}
