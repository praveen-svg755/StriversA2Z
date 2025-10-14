package com.basic.recursion;

public class Print_1_to_N_using_recursion {

    public static void recr(int i,int n){
        if (i>n) return ;
        System.out.println(i);
        recr(i+1,n);
    }
    public static void main(String[] args) {
          recr(1,10);
    }
}
