package Day_78.Bhavuk;
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int ans = 0;
        List<int[]> jobs = new ArrayList<>();

        for (int i = 0; i < difficulty.length; i++) {
            jobs.add(new int[]{difficulty[i], profit[i]});
        }

        Collections.sort(jobs, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(worker);

        for (int i = 0, j = 0, maxProfit = 0; i < worker.length; i++) {
            while (j < jobs.size() && jobs.get(j)[0] <= worker[i]) {
                maxProfit = Math.max(maxProfit, jobs.get(j)[1]);
                j++;
            }
            ans += maxProfit;
        }

        return ans;
    }
}