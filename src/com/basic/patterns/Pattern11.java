package com.basic.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0 ; i<n ; i++){
            int start = 0;
            if(i % 2 == 0) start = 1;
            for(int j=0 ; j<i+1 ; j++){
                System.out.print(start+" ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
}
