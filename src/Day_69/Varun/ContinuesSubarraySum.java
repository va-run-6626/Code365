package Day_69.Varun;
import java.util.*;

public class ContinuesSubarraySum {
    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        boolean ans = new Solution().checkSubarraySum(nums,k);
        System.out.println(ans);
    }
}
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> remMap = new HashMap<>();
        int cumSum = 0;

        remMap.put(0,-1);
        for(int i = 0; i < n; i++){
            cumSum += nums[i];
            int rem = k == 0 ? cumSum : cumSum % k;

            if(remMap.containsKey(rem)){
                if(i - remMap.get(rem) > 1) return true;
            }else{
                remMap.put(rem,i);
            }
        }
        return false;
    }
}