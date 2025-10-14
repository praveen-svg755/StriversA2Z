package com.basic.maths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Print_all_Divisors {
    public static void printDivisors(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1 ; i*i<=n ; i++){
            if(n%i == 0){
                list.add(i);
                if((n/i) != i) list.add(n/i);
            }
        }
        Collections.sort(list);
        list.forEach(System.out::println);
    }
    public static void main(String[] args) {
        printDivisors(36);
    }
}
