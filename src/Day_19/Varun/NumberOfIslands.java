package Day_19.Varun;

import Day_0_GenericClasses.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] grid = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        int noIsland = findIsland(grid);
        System.out.println(noIsland);
    }

    private static int findIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] vis = new boolean[row][col];

        Queue<Pair> queue = new LinkedList<>();
        int[] xDir = {0, -1, 0, 1};
        int[] yDir = {-1, 0, 1, 0};
        int cnt = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0) continue;
                if (vis[i][j] == false) {
                    queue.add(new Pair(i, j));
                    vis[i][j] = true;
                    while (!queue.isEmpty()) {
                        Pair p = queue.poll();
                        int R = p.x;
                        int C = p.y;
                        for (int k = 0; k < 4; k++) {
                            int r = R + xDir[k];
                            int c = C + yDir[k];
                            if ((r >= 0 && r <= row - 1) && (c >= 0 && c <= col - 1) && (!vis[r][c]) && grid[r][c] == 1) {
                                queue.add(new Pair(r, c));
                                vis[r][c] = true;
                            }
                        }
                    }
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
