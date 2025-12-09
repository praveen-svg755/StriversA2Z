package com.arrays.medium;

public class Next_Permutation {

    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr,int low , int high){
          while(low<=high){
              swap(arr , low , high);
              low++;
              high--;
          }
    }

    static void nextPermutation(int[] arr){
        int n = arr.length;
        int idx = -1;

        for(int i = n-2 ; i>=0 ; i--){
            if(arr[i]<arr[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            reverse(arr,0,n-1);
            return;
        }

        for(int i=arr.length-1 ; i>idx ; i--){
            if(arr[i]>arr[idx]){
                swap(arr , i , idx);
                break;
            }
        }
        reverse(arr,idx+1,n-1);

       for (int i=0 ; i<n ; i++){
           System.out.print(arr[i]+" ");
       }

    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0};
        nextPermutation(arr);
    }
}
