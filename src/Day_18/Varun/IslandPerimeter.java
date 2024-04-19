package Day_18.Varun;

public class IslandPerimeter {
    public static void main(String[] args) {
        int[][] grid = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}
        };
        int perimeter = findPerimeter(grid);
        System.out.println(perimeter);
    }

    private static int findPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[] xDir = {0,-1,0,1};
        int[] yDir = {-1,0,1,0};
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    ans += 4;
                    for(int k = 0; k < 4; k++){
                        int r = i + xDir[k];
                        int c = j + yDir[k];
                        if(isValid(r,c,row,col,grid)) ans--;
                    }
                }
            }
        }
        return ans;
    }

    private static boolean isValid(int r, int c, int row, int col, int[][] grid) {
        if(r >= 0 && r < row && c >= 0 && c < col && grid[r][c] == 1)return true;
        return false;
    }
}
