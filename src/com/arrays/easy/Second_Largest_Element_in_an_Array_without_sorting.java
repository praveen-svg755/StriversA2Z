package com.arrays.easy;

public class Second_Largest_Element_in_an_Array_without_sorting {

    static int secondLarge(int[] arr,int n){
        int first = arr[0],second = Integer.MIN_VALUE;

        for(int i=1 ; i<n ; i++){
            if(n<2) return -1;

            if(first < arr[i]){
                second = first;
                first = arr[i];
            } else if (first != arr[i] && second < arr[i]) {
                second = arr[i];
            }

        }
        return (second == Integer.MIN_VALUE) ? -1 : second ;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,5,1,3,0};
        System.out.println(secondLarge(arr,arr.length));
    }
}
