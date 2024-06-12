package Day_73.Bhavuk;

class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        int k = -1;
        for(int j : nums){
            count[j]++;
        }

        for(int i = 0; i<3; i++){
            while(count[i]!=0){
                nums[++k] = i;
                count[i]--;
            }
        }

    }
}