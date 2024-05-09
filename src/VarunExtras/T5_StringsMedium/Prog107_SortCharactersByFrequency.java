package VarunExtras.T5_StringsMedium;
import java.util.*;

public class Prog107_SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(new Solution().frequencySort(s));
    }
}
class Solution {
    class Pair{
        char ch;
        int fq;
        public Pair(char ch, int fq){
            this.ch = ch;
            this.fq = fq;
        }
    }
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.fq - a.fq);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair out = pq.poll();
            char ch = out.ch;
            int fq = out.fq;
            while(fq > 0){
                sb.append(ch);
                fq--;
            }
        }
        return sb.toString();
    }
}