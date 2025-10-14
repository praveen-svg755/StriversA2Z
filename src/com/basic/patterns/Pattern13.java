package com.basic.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i+1 ; j++){
                System.out.print((k++)+" ");
            }
            System.out.println();
        }
    }
}
