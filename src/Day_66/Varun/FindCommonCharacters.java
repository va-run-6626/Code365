package Day_66.Varun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> ans = new Solution().commonCharacters(words);
        System.out.println(ans);
    }
}
class Solution{
    public List<String> commonCharacters(String[] words){
        int[] minFreq = new int[26];
        Arrays.fill(minFreq,Integer.MAX_VALUE);
        for(String s : words){
            int[] chars = new int[26];
            for(char c : s.toCharArray()){
                chars[c - 'a']++;
            }
            for(int i = 0; i < 26; i++){
                minFreq[i] = Math.min(minFreq[i], chars[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            while(minFreq[i] > 0){
                ans.add(Character.toString((char)(i + 'a')));
                minFreq[i]--;
            }
        }
        return ans;
    }
}
