package com.arrays.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Find_The_Majority_Element_that_occurs_more {

    //brute force
    static int majorityElement1(int[] arr){
        int n = arr.length;
        for(int i=0 ;  i <n ; i++){
            int freq = 0;
            for(int j=0 ; j<n ; j++){
                if(arr[i] == arr[j]) freq++;
                if(freq >n/2) return arr[i];
            }
        }
        return -1;
    }

    //better
    static int majorityElement2(int[] arr){
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            if(!map.containsKey(arr[i])){
                //add
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int maxvalue = Collections.max(map.values());
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
    }

    //optimal solution
    static int majorityElement3(int[] arr){
        int n = arr.length;
        int ele = 0,cnt = 0;
        for(int i=0 ; i<n ; i++){
            if(cnt == 0){
                cnt++;
                ele = arr[i];
            }else if(ele == arr[i]){
                cnt++;
            }else {
                cnt--;
            }
        }

        int cnt1 = 0;
        for(int i : arr){
            if(i == ele) cnt1++;
        }

        if(cnt1 > n/2) return ele;
        else return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 1, 2, 1, 2};
        System.out.println(majorityElement1(nums));
        System.out.println(majorityElement2(nums));
        System.out.println(majorityElement3(nums));

    }
}
