package Day_49.Varun;

public class FindTheMaximumSumOfNodeValues {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int k = 3;
        int[][] edges = {
                {0,1},{0,2}
        };

        long ans = new Solution().maximumValueSum(nums,k,edges);
        System.out.println(ans);
    }
}
class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long total = 0;
        for (int num : nums) {
            total += num;
        }

        long totalDiff = 0;
        long diff;
        int positiveCount = 0;
        long minAbsDiff = Long.MAX_VALUE;
        for (int num : nums) {
            diff = (num ^ k) - num;

            if (diff > 0) {
                totalDiff += diff;
                positiveCount++;
            }
            minAbsDiff = Math.min(minAbsDiff, Math.abs(diff));
        }
        if (positiveCount % 2 == 1) {
            totalDiff -= minAbsDiff;
        }
        return total + totalDiff;
    }
}
