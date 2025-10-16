package com.basic.recursion;

public class Check_if_a_string_is_palindrome_or_not {
    public static boolean palidrome(char[] name ,int i,int n){
        //base condition
        if(i>=n/2) return true;

        if(name[i] != name[n-1-i]) return false;
        return palidrome(name,i+1,n);
    }
    public static void main(String[] args) {
        String name = "MADAM";
        System.out.println(palidrome(name.toCharArray(),0,5));
    }
}
