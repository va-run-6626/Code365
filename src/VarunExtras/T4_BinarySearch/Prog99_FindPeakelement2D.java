package VarunExtras.T4_BinarySearch;

import java.util.Arrays;

public class Prog99_FindPeakelement2D {
    public static void main(String[] args) {
        int[][] mat = {
                {41,8,2,48,18},
                {16,15,9,7,44},
                {48,35,6,38,28},
                {3,2,14,15,33},
                {39,36,13,46,42}
        };
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }

    private static int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int rs = 0;
        int re = n-1;
        while(rs <= re){
            int rm = rs + (re - rs)/2;
            int max = Integer.MIN_VALUE;
            int mi = -1;
            for(int i = 0; i < m; i++){
                if(max < mat[rm][i]){
                    max = mat[rm][i];
                    mi = i;
                }
            }
            int top = rm == 0 ? -1 : mat[rm-1][mi];
            int bottom = rm == n-1 ? -1 : mat[rm+1][mi];

            if(max > top && max > bottom) return new int[]{rm,mi};
            else if(top > max) re = rm -1;
            else rs = rm +1;
        }
        return new int[]{-1,-1};
    }
}
