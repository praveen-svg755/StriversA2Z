package com.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class Rearrange_Array_Elements_by_Sign {

    static void rearrange(int[] arr){
        int posIndex = 0;
        int negIndex = 1;
        int[] ans = new int[arr.length];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] > 0){
                ans[posIndex] = arr[i];
                posIndex +=2;
            }else if(arr[i] < 0 ){
                ans[negIndex] = arr[i];
                negIndex +=2;
            }else return;
        }
        for (int i: ans){
            System.out.print(i+" ");
        }
    }

    static void followUp(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int posIndex = 0 , negIndex = 0;
        int n =arr.length;
        for(int i=0 ; i<n ; i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }else {
                neg.add(arr[i]);
            }
        }
        if(pos.size() > neg.size()){
            for(int i=0 ; i<neg.size() ; i++){
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);
            }
            int idx = neg.size()*2;
            for (int i = neg.size() ; i<pos.size() ; i++){
                arr[idx++] = pos.get(i);
            }

        }else {
            for (int i=0 ; i<pos.size() ; i++){
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);
            }
            int idx = pos.size()*2;
            for (int i = pos.size() ; i<neg.size() ; i++){
                arr[idx++] = neg.get(i);
            }
        }
        for (int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5,-8,-9};
       // rearrange(arr);
        followUp(arr);
    }
}
