package VarunExtras.T3_Arrays;

import java.util.Arrays;

public class Prog50_NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        System.out.println(Arrays.toString(nums));
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 1) return;
        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1])i--;
        if(i>=0){
            int j = nums.length-1;
            while(nums[i] >= nums[j])j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums,i++,j--);
        }
    }
}
