package Day_66.Bhavuk;

import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);
        for(String s : words){
            int[] chars = new int[26];
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                chars[ch - 'a']++;
            }
            for(int i = 0; i < 26; i++){
                minFreq[i] = Math.min(minFreq[i], chars[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            while(minFreq[i] > 0){
                res.add(Character.toString((char)(i + 'a')));
                minFreq[i]--;
            }
        }
        return res;
    }
}