package Day_38.Bhavuk;
import java.util.*;
public class Solution {
    class Pair{
        public int score;
        public int idx;
        public Pair(int score, int idx){
            this.score = score;
            this.idx = idx;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.score - a.score);
        for(int i = 0; i < score.length; i++){
            pq.add(new Pair(score[i], i));
        }
        int i = 1;
        while(i <= score.length){
            Pair out = pq.poll();
            if(i == 1){
                ans[out.idx] = "Gold Medal";
            }else if(i == 2){
                ans[out.idx] = "Silver Medal";
            }else if(i == 3){
                ans[out.idx] = "Bronze Medal";
            }else{
                ans[out.idx] = Integer.toString(i);
            }
            i++;
        }
        return ans;
    }
}