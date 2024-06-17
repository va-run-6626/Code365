package Day_53.Bhavuk;
import java.util.*;
class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // Starting the DFS traversal from index 0
        int ans = dfs(nums, 0, k, map);
        // Subtract 1 to exclude the empty subset
        return ans - 1;
    }

    public int dfs(int[] nums, int idx, int k, Map<Integer, Integer> map) {
        // Base case: If we have processed all elements
        if (idx == nums.length) return 1;

        int taken = 0;
        // Check if the current element can be taken
        if (!map.containsKey(nums[idx] - k) && !map.containsKey(nums[idx] + k)) {
            // Include the current element
            map.put(nums[idx], map.getOrDefault(nums[idx], 0) + 1);
            taken = dfs(nums, idx + 1, k, map);
            // Backtrack: Remove the current element
            map.put(nums[idx], map.get(nums[idx]) - 1);
            if (map.get(nums[idx]) == 0) map.remove(nums[idx]);
        }

        // Exclude the current element
        int notTaken = dfs(nums, idx + 1, k, map);

        // Total beautiful subsets from this state
        return taken + notTaken;
    }
}