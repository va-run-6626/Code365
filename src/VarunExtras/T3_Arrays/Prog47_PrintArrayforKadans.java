package VarunExtras.T3_Arrays;

public class Prog47_PrintArrayforKadans {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] range = maxSubarray(nums, nums.length);
        System.out.print("[ ");
        for(int i = range[0]; i < range[1]; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[range[1]]+"]");
    }

    private static int[] maxSubarray(int[] nums, int n) {
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;
        for(int i = 0; i < n; i++){
            if(sum == 0) start = i;
            sum += nums[i];

            if(sum > maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return new int[]{ansStart,ansEnd};
    }
}
