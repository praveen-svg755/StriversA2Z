package com.sorting.hard;

import java.util.ArrayList;
import java.util.List;

class Solution{
    //create function for merge 2 arrays
    void mergeSort(int[] arr , int low , int mid , int high){
        //create temp list
        int left = low, right = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
            if (arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        }
        //add left remaining elements
        while(left<=mid){
            temp.add(arr[left++]);
        }

        //add right remaining elements
        while(right<=high){
            temp.add(arr[right++]);
        }

        //copy temp to origingal array
        for(int i=low ;i<=high ; i++){
            arr[i] = temp.get(i-low);
        }
    }

   void recSort(int[] arr, int low , int high){
        if(low>=high) return;
       int mid = (low+high)/2;
       recSort(arr,low,mid);
       recSort(arr,mid+1, high);
       mergeSort(arr,low,mid,high);
    }

}

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {90,76,34,11,5,9,14,1,8,6};
        Solution sol = new Solution();
        sol.recSort(arr,0,arr.length-1);

        //print
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
