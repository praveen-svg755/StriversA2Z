package com.basic.patterns;

public class Pattern3 {
    public static void main(String[] args){
        int rows = 5;
        int cols = 5;
        for(int i=0 ; i<rows ; i++){
            for(int j=0 ; j<i+1 ; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
