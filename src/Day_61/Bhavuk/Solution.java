package Day_61.Bhavuk;

class Solution {
    public int[] singleNumber(int[] nums) {
        int pre = 0;
        for(int i : nums){
            pre ^= i;
        }
        int lowestRight = pre & (-pre);
        int[] res = new int[2];
        for(int i : nums){
            if((lowestRight & i) == 0){
                res[0] ^= i;
            }else{
                res[1] ^= i;
            }
        }
        return res;
    }
}