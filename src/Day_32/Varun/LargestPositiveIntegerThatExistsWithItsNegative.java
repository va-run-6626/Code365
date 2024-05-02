package Day_32.Varun;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-7,1};
        int ans = new Solution().findMaxK(nums);
        System.out.println(ans);
    }
    static class Solution {
        public int findMaxK(int[] nums) {
            int[] sum = new int[1001];
            int max = -1;
            for (int n : nums) {
                int index = n > 0 ? n : -n;
                if (sum[index] != n) {
                    sum[index] += n;
                }

                if (sum[index] == 0) {
                    max = max > index ? max : index;
                }
            }
            return max;
        }
    }
}
