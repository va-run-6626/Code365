package Day_54.Varun;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumScoreWordsFormedByLetters {
    public static void main(String[] args) {
        String[] words = {"dog","cat","dad","good"};
        char[] letters = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};

        int maxScore = new Solution().maxScoreWords(words,letters,score);
        System.out.println(maxScore);
    }
}
class Solution{
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] cnt = new int[26];
        int[] lettercnt = new int[26];
        for(char ch : letters){
            cnt[ch -'a']++;
        }
        int ans = 0;
        ans = backtrack(words, score, cnt, lettercnt, 0,0,ans);
        return ans;
    }

    private int backtrack(String[] words, int[] score, int[] cnt, int[] lettercnt, int pos, int temp, int ans) {
        for(int i = 0; i < 26; i++){
            if(lettercnt[i] > cnt[i]) return ans;
        }
        ans = Math.max(ans, temp);
        for(int i = pos; i < words.length; i++){
            for(char ch : words[i].toCharArray()){
                lettercnt[ch-'a']++;
                temp += score[ch - 'a'];
            }

            ans = backtrack(words, score, cnt, lettercnt, i+1, temp, ans);

            for(char ch : words[i].toCharArray()){
                lettercnt[ch-'a']--;
                temp -= score[ch - 'a'];
            }
        }
        return ans;
    }

}
