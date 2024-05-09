package VarunExtras.T1_Basics;

public class Prog6_PrintingDivisors {
    public static void main(String[] args) {
        int n = 36;
        solve(n);
    }

    private static void solve(int n) {
        for(int i = 1; i < Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println(i);
                if(i != n/i)
                    System.out.println(n/i);
            }
        }
    }
}
