package VarunExtras.T3_Arrays;

public class Prog41_LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestSubarrayWithSumK(nums,k));
    }
    public static int longestSubarrayWithSumK(int[] arr, long k){
        int n = arr.length;
        int maxLength = 0;

        int start = 0;
        int end = -1;
        long currSum = 0;

        while(start < n){
            while((end+1 < n)&&(currSum + arr[end+1] <= k)){
                currSum += arr[end+1];
                end++;
            }
            if(currSum == k){
                maxLength = Math.max(maxLength,end-start+1);
            }
            currSum -= arr[start];
            start++;
        }
        return maxLength;
    }
}
