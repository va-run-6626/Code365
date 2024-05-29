package Day_51.Bhavuk;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(nums, 0, list, new ArrayList<>());
        return list;
    }

    private void helper(int[] nums, int idx, List<List<Integer>> list, List<Integer> currList) {
        if (idx == nums.length) {
            list.add(new ArrayList<>(currList)); // Add the current subset to the list
            return;
        }

        // Case 1: Do not include the current element
        helper(nums, idx + 1, list, currList);

        // Case 2: Include the current element
        currList.add(nums[idx]);
        helper(nums, idx + 1, list, currList);

        // Backtrack: remove the current element before the function returns to previous state
        currList.remove(currList.size() - 1);
    }
}