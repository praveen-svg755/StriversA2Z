package com.arrays.easy;

public class Left_rotate_an_array_by_D_places {

    static void swap(int[] arr , int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void rotateArray(int[] arr , int left , int right){
        while(left<right){
            swap(arr , left,right);
            left++;
            right--;
        }
    }

    static void leftRotate(int[] arr , int k){
        int n = arr.length;
        k = k%n;
        rotateArray(arr,0,k);
        rotateArray(arr,k+1, n-1);
        rotateArray(arr,0,n-1);
    }

    static void rightRotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        rotateArray(arr,0,n-1);
        rotateArray(arr,0, k);
        rotateArray(arr,k+1,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;

        //leftRotate(arr,k);
       rightRotate(arr,k);

        for (int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
