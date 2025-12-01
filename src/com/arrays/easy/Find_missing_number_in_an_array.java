package com.arrays.easy;

public class Find_missing_number_in_an_array {
    public static void main(String[] args) {
          int[] array = {1,2,4,5};
          int n = 5;
          int xor1 = 0 , xor2 = 0;
          for(int i=0 ; i<n-1 ; i++){
              xor1 ^=array[i];
              xor2 ^= (i+1);
          }
          xor2 ^=n;

          System.out.println(xor1 ^ xor2);
    }
}
