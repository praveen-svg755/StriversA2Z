package com.basic.recursion;

public class Sum_of_first_N_numbers {
    public static void recr(int n,int sum){
       if(n<1){
           System.out.println(sum);
           return;
       }
       recr(n-1,sum+n);
    }
    public static void main(String[] args) {
        recr(3,0);
    }
}
