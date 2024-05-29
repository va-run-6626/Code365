package Day_50.Bhavuk;

class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    public int helper(int[] nums, int idx, int currXor) {
        if (idx == nums.length) return currXor;
        int inc = helper(nums, idx + 1, currXor ^ nums[idx]);
        int exc = helper(nums, idx + 1, currXor);
        return inc + exc;
    }
}