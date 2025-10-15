package com.basic.patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-i ; j++){
                System.out.print(Character.toChars(j+65));
            }
            System.out.println();
        }
    }
}
