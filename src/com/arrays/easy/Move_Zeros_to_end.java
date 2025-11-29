package com.arrays.easy;

public class Move_Zeros_to_end {

    static void moveZeros(int[] arr , int n){
        int index = -1;
        for (int i=0 ; i<n ; i++){
            if(arr[i] == 0){
                index = i;
                break;
            }
        }
        if (index == -1) return;

        for(int i = index+1 ; i<n ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        moveZeros(arr,arr.length);

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
