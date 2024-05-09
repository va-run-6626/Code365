package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog55_SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix ={
                {31 ,48, 20, 22, 60},
                {11, 24, 48, 49, 48},
                {5, 31, 51, 12, 35},
                {15, 36, 58, 35, 46}

        };
        int[] ans = spiralMatrix(matrix);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] spiralMatrix(int [][]mat) {
        int size = mat.length * mat[0].length;
        int[] ans = new int[size];
        int idx = 0;
        int top = 0;
        int bottom = mat.length-1;
        int left = 0;
        int right = mat[0].length-1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                ans[idx++] = mat[top][i];
            }
            top++;
            for(int i = top; i <= bottom; i++){
                ans[idx++] = mat[i][right];
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ans[idx++] = mat[bottom][i];
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ans[idx++] = mat[i][left];
                }
                left++;
            }
        }
        return ans;
    }
}
