package Day_61.Varun;

import java.util.Arrays;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] ans = new Solution().singleNumber(nums);
        System.out.println(Arrays.toString(ans));
    }
}
class Solution {
    public int[] singleNumber(int[] nums) {
        int pre = 0;
        for(int i : nums){
            pre ^= i;
        }
        int lowestBit = pre & (-pre);
        int[] res = new int[2];
        for(int i : nums){
            if((lowestBit & i) == 0){
                res[0] ^= i;
            }else{
                res[1] ^= i;
            }
        }
        return res;
    }
}