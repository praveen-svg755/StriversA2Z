package com.arrays.easy;
import java.lang.*;

import static java.lang.Math.max;


public class Maximum_Consecutive_One {

    static int countOnes(int[] arr, int n){
        int count = 0;
        int maxCount = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] == 1) count++;
            if(arr[i] == 0) count = 0;
            maxCount = max(maxCount,count);
        }
        return maxCount;
    };
    public static void main(String[] args) {
        int[] prices = {1, 1, 0, 1, 1, 1};
        int count = countOnes(prices,prices.length);
        System.out.println(count);
    }
}
