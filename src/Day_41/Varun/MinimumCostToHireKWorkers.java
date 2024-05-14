package Day_41.Varun;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumCostToHireKWorkers {
    public static void main(String[] args) {
        int[]quality = {10,20,5};
        int[]wage = {70,50,30};
        int k = 2;

        double cost = new Solution().minCostToHireWorkers(quality,wage,k);
        System.out.println(cost);
    }
}
class Solution{
    class Worker{
        int qual;
        int wage;
        public Worker(int qual, int wage){
            this.qual = qual;
            this.wage = wage;
        }
    }
    public double minCostToHireWorkers(int[] quality, int[] wage, int k){
        int n = quality.length;
        Worker[] workers = new Worker[n];
        for(int i = 0; i < n; i++){
            workers[i] = new Worker(quality[i], wage[i]);
        }
        Arrays.sort(workers, (a,b) -> Double.compare((double) a.wage / a.qual , (double) b.wage / b.qual));
        double minCost = Double.MAX_VALUE;
        int workQual = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(Worker worker : workers){
            workQual += worker.qual;
            pq.offer(worker.qual);
            if(pq.size() > k){
                workQual -= pq.poll();
            }
            if(pq.size() == k){
                minCost = Math.min(minCost, workQual * ((double)worker.wage / worker.qual));
            }
        }
        return minCost;
    }
}
