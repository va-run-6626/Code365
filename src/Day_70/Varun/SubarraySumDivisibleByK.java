package Day_70.Varun;
import java.util.*;

public class SubarraySumDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        int ans = new Solution().subarraysDivByK(nums,k);
        System.out.println(ans);

    }
}
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int cnt = 0;
        int pre = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i : nums){
            pre += i;
            int mod = pre % k;
            if(mod < 0) mod += k;
            if(map.containsKey(mod)){
                cnt += map.get(mod);
                map.put(mod, map.get(mod)+1);
            }else{
                map.put(mod, 1);
            }
        }
        return cnt;
    }
}