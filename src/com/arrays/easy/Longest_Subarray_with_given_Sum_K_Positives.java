package com.arrays.easy;
import java.lang.Math.*;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;

public class Longest_Subarray_with_given_Sum_K_Positives {

    //brute
    static int longestSum1(int arr[], int k){
        int n= arr.length;
        int maxLen = 0;

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                int sum = 0;
                for(int l = i ; l<=j ; l++){
                    sum += arr[l];
                }
                if (sum == k){
                    maxLen = max(maxLen,j-i+1);
                }

            }
        }
        return maxLen;
    }

    //better
    static int longestSum2(int[] arr , int k){
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int maxLen = 0;
        int prefix = 0;
        for(int i=0 ; i<n ; i++){
            int x = 0;
            prefix += arr[i];
            if(!map.containsKey(prefix))
                  map.put(prefix,i);
            if(prefix == k){
                maxLen = max(maxLen,map.get(prefix)+1);
            }
            x = prefix - k;

            if(map.containsKey(x)){
                maxLen = max(maxLen,i-map.get(x));
            }
        }
        return maxLen;
    }

    //optimal
    static int longestSum3(int[] arr , int k){
        int n = arr.length;
        int maxLen = 0;
        int sum = 0;
        int i = 0,j = 0;
        while(i<n){
            while (j<n && sum<=k){
                sum += arr[j];
                if(sum == k){
                    maxLen = max(maxLen,j-i+1);
                }
                j++;
            }
            sum -= arr[i];
            i++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int[] arr1 = {2,0,0,3};
        System.out.println(longestSum1(arr,3));
        System.out.println(longestSum2(arr,3));
        System.out.println(longestSum3(arr,3));

    }
}
