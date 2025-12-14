package com.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class Print_the_matrix_in_spiral_manner {

    private static void printSpiral(int[][] matrix,int m , int n){
        List<Integer> ans = new ArrayList<>();
        //Right->bottom->left->top
        int left = 0 , right = m-1 , top = 0 , bottom = n-1;

        while (top<=bottom && left<=right){
            //right
            for(int i=left ; i<=right ; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //bottom
            for(int i = top ; i<=bottom ; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //left
            if(left<right) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //top
            if (top < bottom) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        for (int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int m = matrix.length;
        int n = matrix[0].length;

        printSpiral(matrix,m,n);

    }
}
