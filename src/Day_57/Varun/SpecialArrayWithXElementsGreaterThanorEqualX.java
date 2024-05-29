package Day_57.Varun;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanorEqualX {
    public static void main(String[] args) {
        int[] nums = {0,0};
        int x1 = new Solution1().specialArray(nums);
        System.out.println(x1);
        int x2 = new Solution2().specialArray(nums);
        System.out.println(x2);
    }
}
class Solution1 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length;
        while(s <= e){
            int mid = s + (e - s)/2;
            int ans = cnt(nums, mid);
            if(ans == mid) return mid;
            else if(ans > mid) s = mid +1;
            else e = mid-1;
        }
        return -1;
    }
    private int cnt(int[] nums, int mid){
        int cnt = 0;
        for(int i : nums){
            if(i >= mid) cnt++;
        }
        return cnt;
    }
}
class Solution2 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        int e = nums.length;
        while(s <= e){
            int mid = s + (e - s)/2;
            int ans = cntNums(mid, nums);
            if(ans == -1) return ans;
            if(ans == mid) return ans;
            else if(ans > mid) s = mid +1;
            else e = mid -1;
        }
        return -1;
    }
    private int cntNums(int target, int[] nums){
        int ans = 0;
        int s = 0;
        int e = nums.length-1;
        int potAns = -1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(nums[mid] >= target){
                potAns = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        if(potAns == -1) return potAns;
        return nums.length - potAns;
    }
}