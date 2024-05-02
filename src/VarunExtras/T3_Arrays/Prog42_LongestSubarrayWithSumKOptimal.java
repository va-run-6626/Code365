package VarunExtras.T3_Arrays;
import java.util.*;

public class Prog42_LongestSubarrayWithSumKOptimal {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 0, 1};
        int k = 4;
        System.out.println(longestSubarrayWithSumK(nums,k));
    }

    private static int longestSubarrayWithSumK(int[] nums, int k) {
        Map<Long,Integer> map = new HashMap<>();
        long preSum = 0;
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            preSum += nums[i];
            if(preSum == k){
                len = Math.max(len, i+1);
            }
            long rem = preSum - k;
            if(map.containsKey(rem)){
                len = Math.max(len,i-map.get(rem));
            }
            if(!map.containsKey(preSum)){
                map.put(preSum, i);
            }
        }
        return len;
    }

}
