package com.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class Union_of_Two_Sorted_Arrays {

    static List<Integer> findUnion(int[] arr1, int[] arr2,int m , int n){
          List<Integer> union = new ArrayList<>();
          int i=0, j=0;
          while(i<m && j<n){
              if(arr1[i] <= arr2[j]){
                  if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                      union.add(arr1[i]);
                  }
                  i++;
              } else if(arr1[i] > arr2[j]) {
                  if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                      union.add(arr2[j]);
                  }
                  j++;
              }else {

              }
          }
          while (i<m){
              if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                  union.add(arr1[i]);
              }
              i++;
          }
          while (j<n){
              if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                  union.add(arr2[j]);
              }
              j++;
          }
          return union;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

         List<Integer> union = findUnion(arr1,arr2,arr1.length,arr2.length);

         for (int res : union){
             System.out.print(res+" ");
         }

    }
}
