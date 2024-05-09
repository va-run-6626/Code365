package VarunExtras.T3_Arrays;

import java.util.*;

public class Prog52_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 0;
        for(int i : nums){
            if(!set.contains(i-1)){
                int cnt = 1;
                int ele = i;
                while(set.contains(ele+1)){
                    ele++;
                    cnt++;
                }
                max = Math.max(max,cnt);
            }
        }
        return max;
    }
}
