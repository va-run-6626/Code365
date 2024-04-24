package Day_24.Varun;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        int n = 5;
        int num = findNthNum(n);
        System.out.println(num);
    }

    private static int findNthNum(int n) {
        int T0 = 0;
        int T1 = 1;
        int T2 = 1;
        int ans = 0;
        if(n <= 1) return n;
        if(n == 2) return 1;
        for(int i = 3; i <= n; i++){
            ans = T0 + T1 + T2;
            T0 = T1;
            T1 = T2;
            T2 = ans;
        }
        return ans;
    }
}
