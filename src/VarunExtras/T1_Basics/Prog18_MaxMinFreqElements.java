package VarunExtras.T1_Basics;

import java.util.*;

public class Prog18_MaxMinFreqElements {
    public static void main(String[] args) {
        int[] v = {11,13,3,14,17,3,7,9,1,11,9,15,5,2,2,3};
        System.out.println(Arrays.toString(solve(v)));
    }

    private static int[] solve(int[] v) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : v){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int maxFreq = 0, minFreq = v.length;
        int maxEle = 0, minEle = (int)1e9;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }else if(count == maxFreq){
                maxEle = Math.min(maxEle,element);
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }else if(count == minFreq){
                minEle = Math.min(minEle,element);
            }
        }

        return new int[]{maxEle,minEle};
    }
}
