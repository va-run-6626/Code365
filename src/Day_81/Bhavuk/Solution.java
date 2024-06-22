package Day_81.Bhavuk;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums,k-1); // we get exactly count of k odd nos
    }
    public int atmost(int[] nums, int k){
        int start = 0;
        int ans = 0;
        int count = 0;
        for(  int end = 0; end<nums.length; end++){
            if(nums[end]%2!=0) count++;
            while(start<=end && count>k){
                if(nums[start]%2!=0){
                    count--;
                }
                start++;
            }
            ans+=(end-start+1);
        }
        return ans;
    }
}