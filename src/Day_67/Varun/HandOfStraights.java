package Day_67.Varun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HandOfStraights {
    public static void main(String[] args) {
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        boolean ans = new Solution().isNStraightHand(hand,groupSize);
        System.out.println(ans);
    }
}
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : hand){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int ptr = 0;
        while(ptr < hand.length){
            int num = hand[ptr];
            if(map.containsKey(num)){
                for(int i = 1; i < groupSize; i++){
                    int temp = num +i;
                    if(map.containsKey(temp)){
                        map.put(temp,map.getOrDefault(temp,0)-1);
                        if(map.get(temp) == 0){
                            map.remove(temp);
                        }
                    }else{
                        return false;
                    }
                }
                map.put(num, map.getOrDefault(num, 0)-1);
                if(map.get(num) == 0){
                    map.remove(num);
                }
            }else{
                ptr++;
            }
        }
        return map.isEmpty();
    }
}