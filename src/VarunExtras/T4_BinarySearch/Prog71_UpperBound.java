package VarunExtras.T4_BinarySearch;

public class Prog71_UpperBound {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 6;
        System.out.println(upperBound(nums,nums.length,target));
    }

    private static int upperBound(int[] nums, int n, int target) {
        int s = 0;
        int e = n-1;
        int ans = n;
        while(s <= e){
            int m = s + (e - s)/2;
            if(nums[m] > target){
                ans = m;
                e = m -1;
            }else{
                s = m +1;
            }
        }
        return ans;
    }
}
