package Day_15.Bhavuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    String[] strs = {"eat","tea","tan","ate","nat","bat"};
    List<List<String>> arr = new Solution().groupAnagrams(strs);

}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> hm = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            if(hm.containsKey(sortedStr)){
                ans.get(hm.get(sortedStr)).add(str);
            }else{
                hm.put(sortedStr,ans.size());
                ans.add(new ArrayList<>(Arrays.asList(str)));
            }
        }
        return ans;

    }
}