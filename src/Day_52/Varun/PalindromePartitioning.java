package Day_52.Varun;

import java.util.List;
import java.util.ArrayList;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aab";
        List<List<String >> ans = new Solution().partition(s);
        System.out.println(ans);
    }
}
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(s, 0, new ArrayList<>(), ans);
        return ans;
    }
    private void helper(String s, int sidx, List<String> path, List<List<String>> ans){
        if(sidx == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int end = sidx+1; end <= s.length(); end++){
            if(isPalindrome(s,sidx,end-1)){
                path.add(s.substring(sidx,end));
                helper(s,end,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}