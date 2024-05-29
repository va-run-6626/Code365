package Day_55.Varun;

import java.util.*;

public class WordBreakII {
    public static void main(String[] args) {
        String str = "catsanddog";
        List<String> wordDict = new ArrayList<>(Arrays.asList("cat","cats","and","sand","dog"));
        List<String> ans = new Solution().wordBreak(str, wordDict);
        System.out.println(ans);
    }
}
class Solution{
    public List<String> wordBreak(String str, List<String> wordDict){
        Set<String> set = new HashSet<>(wordDict);
        return helper(str, 0, set);
    }

    private List<String> helper(String str, int s, Set<String> set) {
        List<String> valid = new ArrayList<>();
        if(s == str.length()){
            valid.add("");
        }
        for(int e = s+1; e <= str.length(); e++){
            String pre = str.substring(s, e);
            if(set.contains(pre)){
                List<String> suffixes = helper(str,e,set);
                for(String suffix : suffixes){
                    valid.add(pre + (suffix.equals("") ? "" : " ") + suffix);
                }
            }
        }
        return valid;
    }
}