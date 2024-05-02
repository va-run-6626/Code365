package VarunExtras.T3_Arrays;

public class Prog46_KadansAlgo {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(nums));
    }

    private static int maxSubarray(int[] nums) {
        int currMax = Integer.MIN_VALUE;
        int maxTillNow = 0;
        for(int i = 0; i < nums.length; i++){
            maxTillNow += nums[i];
            if(currMax < maxTillNow){
                currMax = maxTillNow;
            }
            if(maxTillNow < 0){
                currMax  = Math.max(currMax,0);
                maxTillNow = 0;
            }
        }
        return currMax;
    }
}
