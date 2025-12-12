package com.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence_in_an_Array {

    static int longestConsecutive(int[] arr){
        int n = arr.length;
        int longest = 1;
        Set<Integer> set  = new HashSet<>();

        for(int i=0 ; i<n ; i++){
            set.add(arr[i]);
        }
        for(int ite : set){
            if(!set.contains(ite-1)){
                int cnt = 1;
                int x = ite;
                while (set.contains(x+1)){
                    x = x+1;
                    cnt++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
       int[] nums = {100, 4, 200, 1, 3, 2};

       System.out.print(longestConsecutive(nums));
    }
}
