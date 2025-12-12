package com.arrays.medium;

import java.util.ArrayList;
import java.util.List;



public class Set_Matrix_Zero {

    //mark row
    static void markRow(int i,int[][] matrix){
        for(int j=0 ; j<matrix[0].length ; j++){
            matrix[i][j] = -1;
        }
    }

    //mark col
    static void markCol(int j, int[][] matrix){
        for (int i=0 ; i<matrix.length ; i++){
            matrix[i][j] = -1;
        }
    }


    static void setZero1(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(matrix[i][j] == 0){
                    markRow(i,matrix);
                    markCol(j,matrix);
                }
            }
        }

        // convert all -1 to 0's
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                   if(matrix[i][j] == -1){
                       matrix[i][j] = 0;
                   }
            }
        }
    }

    //better
    static void setZero2(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                 if(row[i] == 1 || col[j] == 1){
                     matrix[i][j] = 0;
                 }
            }
        }


    }

    //optimal
    static void setZero3(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        //row[i] -> matrix[i][...]
        //col[j] -> matrix[...][j]


        //step 1
        int col0 = 1;
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                       if(matrix[i][j] == 0){
                           matrix[i][0] = 0;
                           if(j!=0)
                               matrix[0][j] = 0;
                           else
                               col0 = 0;
                       }
                }
            }
        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j<n ; j++){
                if(matrix[i][j] != 0){
                    if(matrix[0][j] == 0 || matrix[i][0] == 0)
                        matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0 )
            for (int j=0 ; j<n ; j++)
                matrix[0][j] = 0;

        if(col0 ==0)
            for (int i=0 ; i<m ; i++)
                matrix[i][0] = 0;
        }

    public static void main(String[] args) {
        int[][] matrix={{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
       // setZero1(matrix);
      //  setZero2(matrix);
        setZero3(matrix);
        for (int i=0 ; i<matrix.length ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
