package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog57_PascalTriangle {
    public static void main(String[] args) {
        int num = 5;
        int[][] pascal = solve(num);
        for(int[] a : pascal){
            System.out.println(Arrays.toString(a));
        }
    }

    private static int[][] solve(int n) {
        int[][] ans = new int[n][];
        int[] res, pre = null;
        for(int i = 0; i < n; i++){
            res = new int[i+1];
            int resPtr = 0;
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    res[resPtr++] = 1;
                }else{
                    res[resPtr++] = pre[j-1] + pre[j];
                }
            }
            ans[i] = res;
            pre = res;
        }
        return ans;
    }
}
