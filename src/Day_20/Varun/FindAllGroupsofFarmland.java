package Day_20.Varun;
import java.util.*;
public class FindAllGroupsofFarmland {
    public static void main(String[] args) {
        int[][] land = {
                {1,1,0,0,0,1},{1,1,0,0,0,0}
        };
        int[][] ans = new Solution().findFarmland(land);
        System.out.print("[ ");
        for(int[] i : ans){
            System.out.print(Arrays.toString(i)+", ");
        }
        System.out.print("]");
    }
}
class Solution {
    class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int[][] findFarmland(int[][] land) {
        int row = land.length;
        int col = land[0].length;

        boolean[][] vis = new boolean[row][col];
        ArrayList<int[]> list = new ArrayList<>();

        int[] xDir = {0,-1,0,1};
        int[] yDir = {-1,0,1,0};

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(land[i][j] == 0) continue;
                if(!vis[i][j]){
                    int tr = i;
                    int tc = j;
                    int br = i;
                    int bc = j;
                    Queue<Pair> queue = new LinkedList<>();
                    queue.add(new Pair(i,j));
                    vis[i][j] = true;
                    while(!queue.isEmpty()){
                        Pair out = queue.poll();
                        br = out.x;
                        bc = out.y;
                        for(int k = 0; k < 4; k++){
                            int r = br + xDir[k];
                            int c = bc + yDir[k];
                            if((r >= 0 && r < row) && (c >= 0 && c < col)&& (!vis[r][c]) && land[r][c] == 1){
                                queue.add(new Pair(r,c));
                                vis[r][c] = true;
                            }
                        }
                    }
                    int[] inAns = new int[4];
                    inAns[0] = tr;
                    inAns[1] = tc;
                    inAns[2] = br;
                    inAns[3] = bc;
                    list.add(inAns);
                }
            }
        }
        int[][] ans = new int[list.size()][];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
