package Day_58.Varun;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GetEqualSubstringsWithinBudget {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int ans = new Solution().equalSubstring(s,t,maxCost);
        System.out.println(ans);
    }
}
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int ans = 0;
        int l = 0;
        int win = 0;
        for(int r = 0; r < n; r++){
            win += Math.abs(s.charAt(r) - t.charAt(l));
            while(win > maxCost){
                win -= Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            ans = Math.max(ans, r - l +1);
        }
        return ans;
    }
}