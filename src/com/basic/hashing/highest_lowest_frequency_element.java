package com.basic.hashing;

import java.util.HashMap;
import java.util.Map;

public class highest_lowest_frequency_element {

    public static void count(int[] arr){
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);

        int minFreq = n , minEle = 0 ;
        int maxFreq = 0 , maxEle = 0 ;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }

        }
        System.out.println("Mix Element "+ minEle);
        System.out.println("Max Element "+ maxEle);

    }


    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        count(arr);
    }
}
