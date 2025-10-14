package com.basic.patterns;

public class Pattern7 {
    public static void main(String[] args){
        int rows = 5;
        int cols = rows*2 - 1;
        for(int i=0 ; i<rows ; i++){
            for(int spaces=0 ; spaces<i ; spaces++){
                System.out.print(" ");
            }
            for(int j=0 ; j<cols-i*2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
