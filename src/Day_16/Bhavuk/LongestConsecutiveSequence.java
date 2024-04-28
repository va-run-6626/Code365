package Day_16.Bhavuk;
import java.util.HashSet;
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int res = new Solution().longestConsecutive(nums);
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int maxStreak = 0;
        for(int i : nums){
            hashSet.add(i);
        }
        int count = 0;
        for(int value : nums ){
            int prevSeq = value-1;
            int nextSeq = value+1;
            int streak = 1;
            while(hashSet.remove(prevSeq--)){
                streak++;
            }
            while(hashSet.remove(nextSeq++)){
                streak++;
            }
            if(maxStreak<streak){
                maxStreak = streak;
            }
        }
        return maxStreak;
    }
}