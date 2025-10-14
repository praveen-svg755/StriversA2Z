package com.basic.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int rows = 4;

        for(int i=0 ; i< rows ; i++){
           //numbers
            for(int j = 1; j<=i+1 ; j++){
                System.out.print(j);
            }

            //spaces
            for(int spaces = 0; spaces< (rows*2 - i*2-2); spaces++){
                System.out.print(" ");
            }

            //numbers
            for(int k = i+1; k>=1 ; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
