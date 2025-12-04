package com.arrays.medium;

public class Kadane_Algorithm {

    //brute
    static int kadanes1(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            for(int j = i ; j<n ; j++){
                int sum = 0;
                for(int k = i ; k<=j ; k++){
                    sum+=arr[k];
                }
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }

    //better
    static int kadanes2(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            int sum = 0;
            for(int j = i ; j<n ; j++){
                sum += arr[j];
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 3, 5, -2, 7, -4};

        System.out.println(kadanes1(nums));
        System.out.println(kadanes2(nums));
    }
}
