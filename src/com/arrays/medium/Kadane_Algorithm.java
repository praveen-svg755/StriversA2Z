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

    //optimal
    static int kadanes3(int[] arr){
        int n = arr.length;
        int maxSum =Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0 ; i<n ; i++){
              sum += arr[i];
              maxSum = Math.max(maxSum,sum);
              if(sum <0){
                  sum =0;
              }

        }
        return maxSum;
    }

    static void kadanes4(int[] arr){
        int n = arr.length;
        int maxSum =Integer.MIN_VALUE;
        int sum = 0;
        int tempstart = 0 ,start = -1 , end = -1;
        for(int i=0 ; i<n ; i++){

            if (sum == 0) tempstart = i;

            sum += arr[i];
            if(sum>maxSum){
                maxSum = sum;
                start = tempstart;
                end = i;
            }
            if(sum <0){
                sum =0;
            }

        }
        System.out.println(start);
        System.out.println(end);
        for (int i=start; i<end ; i++){
          System.out.print(arr[i]+" ");
       }
    }

    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println(kadanes1(nums));
        System.out.println(kadanes2(nums));
        System.out.println(kadanes3(nums));
        kadanes4(nums);
    }
}
