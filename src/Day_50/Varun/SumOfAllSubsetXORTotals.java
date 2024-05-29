package Day_50.Varun;

public class SumOfAllSubsetXORTotals {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8};
        int ans = new Solution().subsetXORSum(nums);
        System.out.println(ans);
    }
}
class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
    public int helper(int[] nums, int idx, int currXor){
        if(idx == nums.length) return currXor;
        int inc = helper(nums, idx+1, currXor ^ nums[idx]);
        int exe = helper(nums, idx+1, currXor);
        return inc+exe;
    }
}