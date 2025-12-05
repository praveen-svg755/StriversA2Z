package com.arrays.medium;

public class Stock_Buy_and_Sell {

    static int stock1(int[] price){
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

    static int stock2(int[] price){
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0 ; i<price.length ; i++){
            if(price[i] < min){
                min = price[i];
            }else {
                maxProfit = Math.max(maxProfit,price[i]-min);
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(stock1(prices));
        System.out.println(stock2(prices));
    }
}
