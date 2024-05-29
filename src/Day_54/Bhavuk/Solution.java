package Day_54.Bhavuk;

class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] cnt = new int[26];
        int[] letterCnt = new int[26];

        for(char ch : letters){
            cnt[ch - 'a']++;
        }
        int ans = 0;
        ans = backtrack(words, score, cnt, letterCnt, 0, 0, ans);
        return ans;
    }
    private int backtrack(String[] words, int[] score, int[] cnt, int[] letterCnt, int pos, int temp, int ans){
        for(int i = 0; i < 26; i++){
            if(letterCnt[i] > cnt[i]) return ans;
        }
        ans = Math.max(ans, temp);
        for(int i = pos; i < words.length; i++){
            for(char c : words[i].toCharArray()){
                letterCnt[c-'a']++;
                temp += score[c - 'a'];
            }
            ans = backtrack(words, score, cnt, letterCnt, i+1, temp, ans);
            for(char c : words[i].toCharArray()){
                letterCnt[c-'a']--;
                temp -= score[c - 'a'];
            }
        }
        return ans;
    }
}