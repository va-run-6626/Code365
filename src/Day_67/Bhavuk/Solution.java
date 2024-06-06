package Day_67.Bhavuk;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Queue<Integer> queue = new PriorityQueue<>();
        if(hand.length % groupSize !=0) return false;
        for(int a : hand){
            queue.add(a);
        }

        while(!queue.isEmpty()){
            int smallestElement = queue.poll();
            for(int i = 1; i<groupSize; i++){
                if(queue.remove(smallestElement+i)) continue;
                else return false;
            }
        }
        return true;
    }
}