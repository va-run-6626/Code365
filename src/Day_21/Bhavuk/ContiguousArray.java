package Day_21.Bhavuk;
import java.util.HashMap;
public class ContiguousArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 1, 0, 1};
        System.out.println("Maximum length of contiguous subarray with equal number of 0s and 1s: " + solution.findMaxLength(nums));
    }
}
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }

        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(0,-1);
        int curr = 0;
        int maxl = 0;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
            if(hashmap.containsKey(sum)){
                curr = i-hashmap.get(sum);
                maxl = Math.max(maxl,curr);
            }else{
                hashmap.put(sum,i);
            }
        }
        return maxl;
    }
}
