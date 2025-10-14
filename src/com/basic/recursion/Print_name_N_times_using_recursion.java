package com.basic.recursion;

public class Print_name_N_times_using_recursion {

    public static void recu(String name , int n){
        if(n<=0) return;
        System.out.println(name);
        recu(name,n-1);
    }
    public static void main(String[] args) {
        recu("Praveen",10);
    }
}
