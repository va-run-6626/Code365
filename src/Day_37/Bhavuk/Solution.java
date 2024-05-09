package Day_37.Bhavuk;

public class Solution {
    public int countDigitOne(int n)
    {
        int ans = 0;
        for (int i = 1; i <= n; i *= 10)
        {
            int div = i * 10;
            int q = n/div;
            int rem =  n%div;
            ans +=  q*i;
            if (rem >= i){
                ans += Math.min(rem - i + 1, i);
            }
        }
        return ans;
    }
}