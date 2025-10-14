package com.basic.maths;

public class Check_Palindrome {
    public static  boolean isPalindrome(int n){
        int original = n;
        int rev = 0;
        while(n>0){
            rev = rev *10 + n % 10;
            n /= 10;
        }
        return (original == rev ) ? true : false ;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(12242));
    }
}
