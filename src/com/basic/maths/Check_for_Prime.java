package com.basic.maths;


public class Check_for_Prime {
    public static boolean isPrime(int n){
        int count = 0;
        if ( n <= 1) return false;
        if ( n == 2) return true;
        if (n%2 == 0) return  false;
        for(int i = 3 ; i*i<=n ; i+=2){
            if(n%i == 0){
                count++;
            }
        }
       return count == 0  ;
    }
    public static void main(String[] args) {
       System.out.println(isPrime(3));

    }
}
