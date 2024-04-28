package Day_20.Bhavuk;

public class MaximumSubarray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // Example array
        int maxSubArraySum = solution.maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSubArraySum);
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

}
