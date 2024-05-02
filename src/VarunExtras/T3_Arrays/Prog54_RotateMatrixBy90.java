package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog54_RotateMatrixBy90 {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int[] a : mat){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
        rotate(mat);
        for(int[] a : mat){
            System.out.println(Arrays.toString(a));
        }
    }

    private static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0, k = matrix[0].length-1; j <= matrix.length/2 && k >= matrix.length/2; j++, k--){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;            }
        }
    }
}
