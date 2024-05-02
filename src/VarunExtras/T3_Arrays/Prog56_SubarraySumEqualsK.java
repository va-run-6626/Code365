package VarunExtras.T3_Arrays;

import java.util.*;

public class Prog56_SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr,k));
    }

    private static int subarraySum(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        int pre = 0;
        int cnt = 0;
        map.put(0,1);
        for(int i = 0; i < n; i++){
            pre += arr[i];
            int remove = pre - k;
            cnt += map.getOrDefault(remove,0);
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return cnt;
    }
}
