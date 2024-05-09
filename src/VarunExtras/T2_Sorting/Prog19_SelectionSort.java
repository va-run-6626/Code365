package VarunExtras.T2_Sorting;

import java.util.Arrays;

public class Prog19_SelectionSort {
    public static void main(String[] args) {
        int[] nums  = {1,5,3,5,6,8,3,5,8};
        System.out.println(Arrays.toString(nums));
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void sort(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int last = nums.length-i-1;
            int maxIndex = max(nums,0,last);
            swap(nums,last,maxIndex);
        }
    }
    private static int max(int[] nums,int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }
    private static void swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
