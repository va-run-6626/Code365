package Day_25.Varun;

public class LongestIdealSubsequence {
    public static void main(String[] args) {
        String s = "acfgbd";
        int k = 2;
        int ans = solve(s,k);
        System.out.println(ans);
    }

    private static int solve(String s, int k) {
        int[] dp = new int[26];
        int ans = 1;
        for(int i = 0; i < s.length(); i++){
            int ele = s.charAt(i) - 'a';
            for(int j = ele; j >= 0 && j >= ele - k; j--){
                dp[ele] = Math.max(dp[ele], dp[j]+1);
            }
            for(int j = ele+1; j <= 26 && j <= ele+2; j++){
                dp[ele] = Math.max(dp[ele], dp[j]+1);
            }
            ans = Math.max(ans,dp[ele]);
        }
        return ans;
    }
}
