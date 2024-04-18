package Day_18.Bhavuk;

public class BinarySubarray {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        int res = new Solution().numSubarraysWithSum(nums,goal);
        System.out.println(res);
    }
}
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalCount = 0;
        int sum = 0;
        int prefixSum[] = new int[nums.length + 1];
        prefixSum[0] = 1;

        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                totalCount += prefixSum[sum - goal];
            }
            prefixSum[sum]++;
        }

        return totalCount;
    }
}