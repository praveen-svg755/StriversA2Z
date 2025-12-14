package com.arrays.medium;

public class Rotate_Matrix_by_90_degrees {

    static int[][] rotateMatrix1(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[m][n];
        for(int i=0 ; i<m ; i++){
            for (int j = 0 ; j<n ; j++){
                ans[j][(n-1)-i] = matrix[i][j];
            }
        }
        return ans;
    }



    //swap array
    static void swap(int[] array , int a , int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }



    //reverse
    static void reverse(int[] arr){
        int i =0 , j = arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotateMatrix2(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0 ; i<n ; i++){
            for (int j = i+1 ; j<n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0 ; i<n ; i++){
            reverse(matrix[i]);
        }
        for(int i=0 ; i<m ; i++){
            for (int j = 0 ; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        int[][]  matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = rotateMatrix1(matrix);
        rotateMatrix2(matrix);

        System.out.println();
        for(int i=0 ; i<matrix.length ; i++){
            for (int j = 0 ; j<matrix[0].length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
}
