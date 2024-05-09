package VarunExtras.T4_BinarySearch;

public class Prog70_LowerBound {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,7};
        int target = 6;
        System.out.println(lowerBound(nums,nums.length,target));
    }

    private static int lowerBound(int[] nums, int n, int target) {
        int s = 0;
        int e = n-1;
        int ans = n;
        while(s <= e){
            int m = s + (e - s)/2;
            if(nums[m] >= target){
                ans = m;
                e = m -1;
            }else{
                s = m +1;
            }
        }
        return ans;
    }
}
