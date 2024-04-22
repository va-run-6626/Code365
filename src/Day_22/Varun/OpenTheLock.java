package Day_22.Varun;
import java.util.*;
public class OpenTheLock {
    static class Pair{
        public String key;
        public  Integer value;
        public Pair(String key, Integer value){
            this.key = key;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        String[] deadEnds = {"0201","0101","0102","1212","2002"};
        String target = "0202";

        int numberOfTurns = findTurns(deadEnds,target);
        System.out.println(numberOfTurns);
    }

    private static int findTurns(String[] deadEnds, String target) {
        Set<String> dead = new HashSet<>();
        for(String i : deadEnds){
            dead.add(i);
        }
        if(dead.contains("0000")) return -1;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair("0000",0));
        Set<String> vis = new HashSet<>();
        vis.add("0000");
        while (!queue.isEmpty()){
            Pair out = queue.poll();
            String currCombo = out.key;
            int moves = out.value;

            if(currCombo.equals(target)) return moves;
            for(int i = 0; i < 4; i++){
                for(int dx : new int[]{-1,1}){
                    int dig = (currCombo.charAt(i) - '0'+dx+10)%10;
                    String newCombo = currCombo.substring(0,i)+dig+currCombo.substring(i+1);
                    if(!vis.contains(newCombo) && !dead.contains(newCombo)){
                        vis.add(newCombo);
                        queue.offer(new Pair(newCombo,moves+1));
                    }
                }
            }
        }
        return -1;
    }
}
