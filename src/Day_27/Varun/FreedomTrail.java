package Day_27.Varun;
import java.util.*;
public class FreedomTrail {
    public static void main(String[] args) {
        String ring = "godding";
        String key = "gd";

        int minSteps = findMinSteps(ring,key);
        System.out.println(minSteps);
    }

    private static int findMinSteps(String ring, String key) {
        char[] r = ring.toCharArray();
        List<Integer>[] positions = new List[26];
        for(int i = 0; i < r.length; i++){
            int c = r[i] - 'a';
            if(positions[c] == null)positions[c] = new ArrayList<>();
            positions[c].add(i);
        }
        int[][] dp = new int[key.length()][r.length];
        return helper(0,0,positions,key.toCharArray(),r,dp);
    }

    private static int helper(int idx, int pos, List<Integer>[] positions, char[] key, char[] ring, int[][] dp) {
        if(idx == key.length) return 0;
        if(dp[idx][pos] > 0) return dp[idx][pos];

        char target = key[idx];
        List<Integer> possiblePositions = positions[target - 'a'];
        int minSteps = Integer.MAX_VALUE;
        for(int nextPos : possiblePositions){
            int steps = Math.min(Math.abs(nextPos - pos), ring.length - Math.abs(nextPos - pos));
            int totalSteps = steps + helper(idx+1, nextPos, positions,key,ring,dp);
            minSteps = Math.min(minSteps,totalSteps);
        }
        return dp[idx][pos] = minSteps+1;
    }

}
