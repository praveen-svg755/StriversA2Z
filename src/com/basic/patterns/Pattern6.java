package com.basic.patterns;

public class Pattern6 {
    public static void main(String[] args){
        int rows = 5;
        int cols = rows*2 - 1;
        for(int i=0 ; i<rows ; i++){
            for(int spaces=0 ; spaces<rows-i-1 ; spaces++){
                System.out.print(" ");
            }
            for(int j=0 ; j<2*i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
