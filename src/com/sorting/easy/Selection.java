package com.sorting.easy;

public class Selection {
    public static void main(String[] args) {
        int[] array = {13,46,24,52,20,9};
        int n = array.length;

        selectingSort(array , n);
        for (int i : array){
            System.out.print(" "+i);
        }
    }

    public static void selectingSort(int[] array , int n){
        int minIndex = 0 ;

        for(int i=0 ; i<n ; i++){
              minIndex = i;
            for(int j=i ; j<n ; j++){
                if(array[minIndex] > array[j]){
                      minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
