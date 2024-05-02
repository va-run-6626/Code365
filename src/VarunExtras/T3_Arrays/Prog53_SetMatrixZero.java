package VarunExtras.T3_Arrays;

import java.util.*;

public class Prog53_SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        for(int[] a : matrix){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
        setZeros(matrix);
        for(int[] a : matrix){
            System.out.println(Arrays.toString(a));
        }
    }

    private static void setZeros(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int colZ = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }else{
                        colZ = 0;
                    }
                }
            }
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        }
        if(colZ == 0){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }

    //code for ArrayList
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        int colZero = 1;
        for(int i = 0; i < matrix.size(); i++){
            for(int j = 0; j < matrix.get(0).size(); j++){
                if(matrix.get(i).get(j) == 0){
                    matrix.get(i).set(0, 0);
                    if(j == 0){
                        colZero = 0;
                    }else{
                        matrix.get(0).set(j,0);
                    }
                }
            }
        }
        for(int i = 1; i < matrix.size(); i++){
            for(int j = 1; j < matrix.get(0).size(); j++){
                if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0){
                    matrix.get(i).set(j,0);
                }
            }
        }
        if(matrix.get(0).get(0) == 0){
            for(int i = 0; i < matrix.get(0).size(); i++){
                matrix.get(0).set(i,0);
            }
        }
        if(colZero == 0){
            for(int i = 0; i < matrix.size(); i++){
                matrix.get(i).set(0,0);
            }
        }
        return matrix;
    }
}
