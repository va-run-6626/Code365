package Day_73.Varun;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        Solution solution = new Solution();
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }
}
class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int h = nums.length -1;
        int m = 0;
        while(m <= h){
            switch(nums[m]){
                case 0:{
                    swap(nums,m,l);
                    m++;
                    l++;
                    break;
                }
                case 1:{
                    m++;
                    break;
                }
                case 2:{
                    swap(nums,m,h);
                    h--;
                }
            }
        }
    }
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}