package VarunExtras.T1_Basics;

public class Prog16_FibonacciNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fun(n));
    }

    private static int fun(int n) {
        if(n <= 1) return n;
        int last = fun(n-1);
        int first = fun(n-2);
        return last + first;
    }
}
