package Day_51.Varun;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new Solution().subsets(arr);
        System.out.println(ans);
    }
}
class Solution{
    public List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        helper(arr,0,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int[] arr,int idx, List<List<Integer>> ans, List<Integer> curr){
        if(idx == arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        helper(arr,idx+1,ans,curr);
        curr.add(arr[idx]);
        helper(arr,idx+1,ans,curr);
        curr.remove(curr.size()-1);
    }
}
