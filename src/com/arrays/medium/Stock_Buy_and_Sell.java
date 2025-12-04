package com.arrays.medium;

public class Stock_Buy_and_Sell {

    static int stock(int[] price){
        int n = price.length;
        int lowCost = Integer.MAX_VALUE;
        int k = 0;
        for(int i=0 ; i<n ; i++){
            if(lowCost > price[i]){
                lowCost = price[i];
                k = i;
            }
        }

        int maxCost = 0;
        for(int i=k ; i<n ; i++){
            if(maxCost < price[i]){
                maxCost = price[i];
            }
        }

        return maxCost-lowCost;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(stock(prices));
    }
}
