package com.basic.maths;

public class GCD {
    public static int gcd(int a , int b){
        while(a!=0 && b != 0){
            if(a>b) a = a%b;
            else b = b%a;
        }
        return (a!=0)? a : b ;
    }
    public static void main(String[] args) {
        System.out.println(gcd(9,12));
    }
}
