package com.basic.recursion;

public class Print_N_to_1_using_recursion {

    public static void recr(int n){
        if(n<=0) return ;
        System.out.println(n);
        recr(n-1);
    }
    public static void main(String[] args) {
        recr(10);
    }
}
