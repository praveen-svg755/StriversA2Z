package com.basic.maths;

public class Count_digits {
    public static void main(String[] args) {
        int dig = 93203;
        int count = 0;
        while(dig > 0){
             int last = dig%10;
             count++;
             dig /=10;
        }
        System.out.println(count);
    }
}
