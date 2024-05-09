package VarunExtras.T4_BinarySearch;

import java.util.Arrays;

public class Prog73_FloorAndCeil {
    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 8, 8, 10};
        int target = 5;
        System.out.println(Arrays.toString(solve(nums,target,nums.length)));
    }

    private static int[] solve(int[] nums, int target, int length) {
        int fIdx = bs(nums,target,length,true);
        int floor = fIdx == -1 ? -1 : nums[fIdx];
        if(floor == target){
            return new int[]{floor,floor};
        }
        int cIdx = bs(nums,target,length,false);
        int ceil = cIdx == length ? -1 : nums[cIdx];
        return new int[]{floor,ceil};
    }

    private static int bs(int[] nums, int target,int n, boolean isFloor) {
        int s = 0;
        int e = n-1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        if(isFloor){
            return e;
        }else{
            return s;
        }
    }
}
