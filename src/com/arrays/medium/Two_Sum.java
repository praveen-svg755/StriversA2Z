package com.arrays.medium;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    //brute
    static int[] twoSum1(int[] arr , int target){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if((arr[i]+arr[j]) == target){

                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    //better
    static int[] twoSum2(int[] arr , int target){
        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            int x = 0;
            x = target-arr[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }else{
                map.put(arr[i],i);
            }
        }

        return new int[]{0,0};
    }

    //optimal
    static boolean twoSum3(int[] arr , int target){
        int n = arr.length;
        Arrays.sort(arr);
        int i = 0 , j = n-1;
        while(i<j){
            if(arr[i]+arr[j] > target) j--;
            else if(arr[i]+arr[j] < target) i++;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;

        System.out.println(Arrays.toString(twoSum1(arr,target)));
        System.out.println(Arrays.toString(twoSum2(arr,target)));
        System.out.println(twoSum3(arr,target));

    }
}
