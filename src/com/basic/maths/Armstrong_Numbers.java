package com.basic.maths;

public class Armstrong_Numbers {
    public static boolean isAmstrong(int num){
        int dup = num;
        int res = 0;
        while(num > 0){
            int last = num % 10;
            res = res + last * last * last;
            num /= 10;
        }
        return (res == dup) ? true : false ;
    }
    public static void main(String[] args) {
        System.out.println(isAmstrong(153));   // true
        System.out.println(isAmstrong(370));   // true
        System.out.println(isAmstrong(190));   // false
        System.out.println(isAmstrong(9474));  // false
    }
}
