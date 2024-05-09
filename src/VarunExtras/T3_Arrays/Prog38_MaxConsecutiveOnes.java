package VarunExtras.T3_Arrays;

public class Prog38_MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currMax = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                currMax = 0;
            }else{
                currMax += nums[i];
            }

            if(currMax > max){
                max = currMax;
            }
        }
        return max;
    }
}
