package com.basic.recursion;

public class Reverse_an_array {
    static void swap(int a , int b , int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void reverse(int left , int[] arr , int right){
        //base condition
        if(left >= right ) return;

        swap(left,right,arr);
        reverse(left+1,arr,right-1);

    }

    public static void main(String[] args) {
        int[]  arr = {21,32,43,55,89,29};
        int n = arr.length-1;
        reverse(0,arr,n);
        for (int item : arr){
            System.out.print(item+" ");
        }
    }
}
