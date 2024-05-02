package VarunExtras.T4_BinarySearch;

public class Prog86_FindtheSmallestDivisorGivenaThreshold {
    public static void main(String[] args) {
        int[] nums = {200,100,14};
        int th = 10;
        int ans = smallestDivisor(nums,th);
        System.out.println(ans);
    }

    private static int smallestDivisor(int[] nums, int th) {
        int n = nums.length;
        if(n > th) return -1;
        int s = 1;
        int e = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            e = Math.max(e,nums[i]);
        }
        while(s <= e){
            int m = s + (e - s)/2;
            int isTh = findTh(m, nums);
            if(isTh <= th){
                e = m -1;
            }else{
                s = m +1;
            }
        }
        return s;
    }

    private static int findTh(int m, int[] nums) {
        int currTh = 0;
        for(int i : nums){
            currTh += Math.ceil((double)i/(double)m);
        }
        return currTh;
    }
}
