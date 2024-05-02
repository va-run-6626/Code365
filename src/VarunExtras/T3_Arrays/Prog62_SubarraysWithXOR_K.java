package VarunExtras.T3_Arrays;

import java.util.*;

public class Prog62_SubarraysWithXOR_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        int k = 2;
        System.out.println(subarrayWithXorK(arr,k));
    }

    private static int subarrayWithXorK(int[] arr, int k) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int xr = 0;
        int cnt = 0;
        map.put(xr,1);
        for(int i = 0; i < n; i++){
            xr ^= arr[i];
            int x = xr ^ k;
            cnt += map.getOrDefault(x,0);
            map.put(xr,map.getOrDefault(xr,0)+1);
        }
        return cnt;
    }
}
