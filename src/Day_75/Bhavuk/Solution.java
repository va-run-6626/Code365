package Day_75.Bhavuk;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        int newValue = 0;
        int total = 0;
        Arrays.sort(nums);
        for(int i =1; i<nums.length; i++){
            if(nums[i]<=nums[i-1]){
                newValue = nums[i-1]+1;
                total += newValue-nums[i];
                nums[i] = newValue;
            }
        }
        return total;

    }
}