package VarunExtras.T4_BinarySearch;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Prog93_MinimizeMaxDistanceToGasStation {
    static class Pair{
        double len;
        int idx;
        public Pair(double len ,int idx){
            this.len = len;
            this.idx = idx;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 6;
        System.out.println(MinimiseMaxDistance1(arr,k));
        System.out.println(MinimiseMaxDistance2(arr,k));
    }

    private static double MinimiseMaxDistance2(int[] arr, int k) {
        int n = arr.length;
        double low = 0;
        double high = 0;
        for(int i = 0; i < n-1; i++){
            high = Math.max(high,arr[i+1]-arr[i]);
        }
        double diff = 1e-6;
        while(high - low > diff){
            double mid = (low + high)/(2.0);
            int cnt = numberOfGasStations(mid,arr);
            if(cnt > k){
                low = mid;
            }else{
                high = mid;
            }
        }
        return high;
    }

    private static int numberOfGasStations(double mid, int[] arr) {
        int cnt = 0;
        for(int i = 1; i < arr.length; i++){
            int numBtw = (int)((arr[i] - arr[i-1])/mid);
            if((arr[i] - arr[i-1])/mid == numBtw * mid){
                numBtw--;
            }
            cnt += numBtw;
        }
        return cnt;
    }

    private static double MinimiseMaxDistance1(int[] arr, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> Double.compare(b.len ,a.len));
        int[] place = new int[arr.length-1];
        Arrays.fill(place,0);
        for(int i = 0; i < arr.length-1; i++){
            pq.add(new Pair(arr[i+1] - arr[i],i));
        }
        for(int i = 0; i < k; i++){
            Pair out = pq.poll();
            int idx = out.idx;
            place[idx]++;
            double len = arr[idx+1] - arr[idx];
            double secLen = len / (double) (place[idx] +1);
            pq.add(new Pair(secLen,idx));
        }
        return pq.peek().len;
    }
}
