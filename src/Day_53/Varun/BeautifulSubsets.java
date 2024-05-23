package Day_53.Varun;
import java.util.*;

public class BeautifulSubsets {
    public static void main(String[] args) {
        int[] nums = {2,4,6};
        int k = 2;

        int ans = new Solution().beautifulSubsets(nums,k);
        System.out.println(ans);
    }
}
class Solution{
    public int beautifulSubsets(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int ans = dfs(nums, 0, k, map);
        return ans -1;
    }
    private int dfs(int[] nums, int idx, int k, Map<Integer, Integer> map){
        if(idx == nums.length)return 1;

        int taken = 0;
        if(!map.containsKey(nums[idx] - k) && !map.containsKey(nums[idx]+k)){
            map.put(nums[idx], map.getOrDefault(nums[idx],0)+1);
            taken = dfs(nums, idx+1,k,map);
            map.put(nums[idx], map.get(nums[idx])-1);
            if(map.get(nums[idx]) == 0)map.remove(nums[idx]);
        }

        int notTaken = dfs(nums, idx+1, k, map);

        return taken + notTaken;
    }
}
