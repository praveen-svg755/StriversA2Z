package com.basic.patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0 ; i<n ; i++){
           for(int j=0 ; j<i+1 ; j++){
               System.out.print("*");
           }
           System.out.println();
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
