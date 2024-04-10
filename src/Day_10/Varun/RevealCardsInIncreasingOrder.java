package Day_10.Varun;
import java.util.*;
public class RevealCardsInIncreasingOrder {
    public static void main(String[] args) {
        int[] nums = {17,13,11,2,3,5,7};
        nums = new Solution1().deckRevealedIncreasing(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution1 {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0;i < deck.length; i++){
            queue.add(i);
        }
        int[] res = new int[deck.length];
        for(int card : deck){
            int idx = queue.poll();
            res[idx] = card;
            if(!queue.isEmpty()){
                queue.add(queue.poll());
            }
        }
        return res;
    }
}