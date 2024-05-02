package VarunExtras.T3_Arrays;

import java.util.HashMap;
import java.util.Map;

public class Prog61_LongestSubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 0, 1};
        System.out.println(longestSubarrayWithSumZero(nums));
    }
    private static int longestSubarrayWithSumZero(int[] nums) {
        Map<Long,Integer> map = new HashMap<>();
        long preSum = 0;
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            preSum += nums[i];
            if(preSum == 0){
                len = Math.max(len, i+1);
            }
            if(map.containsKey(preSum)){
                len = Math.max(len,i-map.get(preSum));
            }
            if(!map.containsKey(preSum)){
                map.put(preSum, i);
            }
        }
        return len;
    }
}
