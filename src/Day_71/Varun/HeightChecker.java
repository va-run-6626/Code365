package Day_71.Varun;
import java.util.*;
public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int ans = new Solution().heightChecker(heights);
        System.out.println(ans);
    }
}
class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            exp[i] = heights[i];
        }
        Arrays.sort(exp);
        int cnt = 0;
        for(int i = 0; i < exp.length; i++){
            if(heights[i] != exp[i]) cnt++;
        }
        return cnt;
    }
}