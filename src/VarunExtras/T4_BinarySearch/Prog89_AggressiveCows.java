package VarunExtras.T4_BinarySearch;

import java.util.Arrays;

public class Prog89_AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {0 ,3 ,4 ,7 ,10 ,9};
        int cows = 4;
        System.out.println(aggressiveCows(arr,cows));
    }

    private static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int s = 1;
        int e = stalls[n-1] - stalls[0];
        while(s <= e){
            int m = s + (e - s)/2;
            if(canPlace(stalls, k, m)){
                s = m +1;
            }else{
                e = m -1;
            }
        }
        return e;
    }
    public static boolean canPlace(int[] stalls, int cows, int distance){
        int n = stalls.length;
        int cnt = 1;
        int prevPos = stalls[0];
        for(int i = 1; i < n; i++){
            if(stalls[i] - prevPos >= distance){
                cnt++;
                prevPos = stalls[i];
            }
            if(cnt >= cows) return true;
        }
        return cnt >= cows;
    }
}
