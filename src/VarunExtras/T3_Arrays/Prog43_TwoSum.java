package VarunExtras.T3_Arrays;

import java.util.*;

public class Prog43_TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int tar = 9;
        System.out.println(Arrays.toString(twoSum(arr,tar)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
