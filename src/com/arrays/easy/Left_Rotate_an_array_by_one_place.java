package com.arrays.easy;

public class Left_Rotate_an_array_by_one_place {

    static void leftRotate(int[] arr , int n){
        int firstEle = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = firstEle;
    }

    static void rightRotate(int[] arr , int n){
        int lastEle = arr[n-1];
        for (int i=n-2 ; i>=0 ; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = lastEle;
    }

    public static void main(String[] args) {
        int[]  nums = {1, 2, 3, 4, 5};

        rightRotate(nums,nums.length);
        for(int i=0 ; i<nums.length ; i++)
           System.out.print(" "+nums[i]);


    }
}
