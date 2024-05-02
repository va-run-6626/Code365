package VarunExtras.T3_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog59_ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = solve(arr, arr.length);
        for(List<Integer> a : ans){
            System.out.println(a);
        }

    }
    private static List<List<Integer>> solve(int[] nums, int n) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n-1; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int target = 0 - nums[i];
                int left = i+1;
                int right = nums.length-1;
                while(left < right){
                    if(target == nums[left] + nums[right]){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
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
                    }else if(nums[left] + nums[right] > target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}
