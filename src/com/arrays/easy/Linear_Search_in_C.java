package com.arrays.easy;

public class Linear_Search_in_C {

    static int search(int[] arr , int key){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int index = search(arr,4);

        System.out.println(
                (index != -1)
                        ? "Element found "+(index+1)
                        : "Element notFound at "
        );



    }
}
