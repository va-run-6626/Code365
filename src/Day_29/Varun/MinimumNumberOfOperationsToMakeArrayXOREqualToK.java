package Day_29.Varun;

public class MinimumNumberOfOperationsToMakeArrayXOREqualToK {
    public static void main(String[] args) {
        int[] nums = {2,0,2,0};
        int k = 0;
        int steps = new Solution().minOperations(nums, k);
        System.out.println(steps);
    }
    static class Solution{
        private int minOperations(int[] nums, int k){
            int finXor = 0;
            for(int i : nums){
                finXor ^= i;
            }
            int cnt = 0;
            while(k > 0 || finXor > 0){
                if((k % 2) != (finXor % 2)){
                    cnt++;
                }
                k /= 2;
                finXor /= 2;
            }
            return cnt;
        }
    }
}
