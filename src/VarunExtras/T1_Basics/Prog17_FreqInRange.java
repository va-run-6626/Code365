package VarunExtras.T1_Basics;

import java.util.*;

public class Prog17_FreqInRange {
    public static void main(String[] args) {
        int n = 10;
        int x = 14;
        int[] nums = {11 ,14, 8, 3, 12, 14, 1, 7, 4 ,3 };
        int[] freq = solve(n,x,nums);
        System.out.println(Arrays.toString(freq));
    }

    private static int[] solve(int n, int x, int[] nums) {
        int[] arr= new int[n];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey()-1 < n)
                arr[entry.getKey()-1] = entry.getValue();
        }
        return arr;
    }
}
