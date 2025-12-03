package com.arrays.medium;

public class Sort_an_array_of_0s_1s_and_2s {

    static void sortOfArray1(int[] arr){

        int n = arr.length;
        int cnt0 = 0 , cnt1 = 0 ,cnt2 = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] == 0) cnt0++;
            else if(arr[i] == 1) cnt1++;
            else if(arr[2] == 2) cnt2++;
            else return;
        }
        int index = 0;
        while(index<cnt0){
            arr[index++] = 0;
        }

        while(index<cnt1+cnt0){
            arr[index++] = 1;
        }

        while(index<cnt2+cnt1+cnt0){
            arr[index++] = 2;
        }
    }

    //optimal
    static void sortOfArray2(int[] arr){
        int n = arr.length;
        int low = 0,mid = 0, high = n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] =arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums  = {1, 0, 2, 1, 0};
        sortOfArray2(nums);
        for (int i: nums){
            System.out.print(i+" ");
        }

    }
}
