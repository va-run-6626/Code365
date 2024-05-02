package VarunExtras.T3_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog60_FourSum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = solve(arr,target);
        for(List<Integer> a : ans) {
            System.out.println(a);
        }
    }

    private static List<List<Integer>> solve(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                for(int j = i+1; j < nums.length; j++){
                    if(j == i+1 || (j > i+1 && nums[j] != nums[j-1])){
                        int left = j+1;
                        int right = nums.length-1;
                        while(left < right){
                            long sum = nums[i];
                            sum += nums[j];
                            sum += nums[left];
                            sum += nums[right];
                            if(sum == target){
                                List<Integer> list = new ArrayList<>();
                                list.add(nums[i]);
                                list.add(nums[j]);
                                list.add(nums[left]);
                                list.add(nums[right]);
                                ans.add(list);
                                while(left < right && nums[left] == nums[left+1]){
                                    left++;
                                }
                                while(left < right && nums[right] == nums[right-1]){
                                    right--;
                                }
                                left++;
                                right--;
                            }else if(sum > target){
                                right--;
                            }else{
                                left++;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
