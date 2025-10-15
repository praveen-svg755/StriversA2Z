package com.basic.recursion;

public class Factorial_of_N_numbers {

    public static int fact(int n){
        if(n<=1) return 1;

        return n*fact(n-1);

    }
    public static void main(String[] args) {
        int n = fact(5);
        System.out.println(n);
    }
}
